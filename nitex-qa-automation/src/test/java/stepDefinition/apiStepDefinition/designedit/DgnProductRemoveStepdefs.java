package stepDefinition.apiStepDefinition.designedit;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.FileReaderHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import repository.remoteRepo.requestRepo.designedit.DgnProductRemoveRequestModel;
import repository.remoteRepo.responseRepo.designedit.DgnProductRemoveResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;

import static core.Helper.FilePathHelper.dgnProductRemove;
import static core.urlDefine.apiURL.base_url;

public class DgnProductRemoveStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;

    DgnProductRemoveRequestModel dgnProductRemoveRequestModel;
    Response postCostApiResponse;
    String url;

    int x=0;

    @Given("design product remove api will be provided")
    public void designProductRemoveApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit remove api with {string} and {string} and {string}")
    public void userWillHitRemoveApiWithAndAnd(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;
    }

    @And("user will pass remove design api {string} and {string}")
    public void userWillPassRemoveDesignApiAnd(String arg0, String arg1) throws NoSuchAlgorithmException, KeyManagementException {

        JSONObject requestBody = new FileReaderHelper().readJsonFile(dgnProductRemove);
        dgnProductRemoveRequestModel = new Gson().fromJson(requestBody.toJSONString(), DgnProductRemoveRequestModel.class);

        int inCostingConvert = Integer.parseInt(arg1);
        dgnProductRemoveRequestModel.setId(arg0);
        dgnProductRemoveRequestModel.setProductIds(Collections.singletonList(inCostingConvert));

        requestCostModel = gson.toJson(dgnProductRemoveRequestModel);

        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postCostApiResponse.body().asString());


    }

    @Then("user will verify remove api with DB")
    public void userWillVerifyRemoveApiWithDB() {

        DgnProductRemoveResponseModel dgnProductRemoveResponseModel = gson.fromJson(postCostApiResponse.getBody().asString(), DgnProductRemoveResponseModel.class);
        int Id = dgnProductRemoveResponseModel.getId();
        String msg = dgnProductRemoveResponseModel.getMessage();
        Boolean yesno = dgnProductRemoveResponseModel.isSuccess();

        System.out.println("This is ID ====>>> " + Id);
        System.out.println("This is Message ====>>> " + msg);
        System.out.println("This is YesNo ====>>> " + yesno);

        x = Integer.parseInt(dgnProductRemoveRequestModel.getId());

        try {
            Assert.assertEquals(Id,x);
            Assert.assertEquals(msg,"Design removed from collection successfully");

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");


    }
}
