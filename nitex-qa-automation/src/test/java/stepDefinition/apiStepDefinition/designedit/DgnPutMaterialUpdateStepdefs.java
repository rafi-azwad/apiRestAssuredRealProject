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
import repository.remoteRepo.requestRepo.designedit.DgnPutMaterialUpdateRequestModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;

import static core.Helper.FilePathHelper.dgnPutMaterialUpdate;
import static core.urlDefine.apiURL.base_url;

public class DgnPutMaterialUpdateStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;

    DgnPutMaterialUpdateRequestModel dgnPutMaterialUpdateRequestModel;
    Response postCostApiResponse;
    String url;

    @Given("design material update put api will be provided")
    public void designMaterialUpdatePutApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit material update put api url with {string} and {string} and {string}")
    public void userWillHitMaterialUpdatePutApiUrlWithAndAnd(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;
    }


    @And("user will hit material update put api body {string} and {string} and {string} and {string} and {string} and {string}")
    public void userWillHitMaterialUpdatePutApiBodyAndAndAndAndAnd(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {

        JSONObject requestBody = new FileReaderHelper().readJsonFile(dgnPutMaterialUpdate);
        dgnPutMaterialUpdateRequestModel = new Gson().fromJson(requestBody.toJSONString(), DgnPutMaterialUpdateRequestModel.class);
        dgnPutMaterialUpdateRequestModel.setId(Integer.parseInt(arg0));
        dgnPutMaterialUpdateRequestModel.setLibraryId(Integer.parseInt(arg1));
        dgnPutMaterialUpdateRequestModel.setReferenceNumber(arg2);
        dgnPutMaterialUpdateRequestModel.setName(arg3);
        dgnPutMaterialUpdateRequestModel.setMaterialType(arg4);
        dgnPutMaterialUpdateRequestModel.setCompositionDetails(arg5);
        dgnPutMaterialUpdateRequestModel.setTagResponseList(Collections.emptyList());
        dgnPutMaterialUpdateRequestModel.setFixedTagResponseList(Collections.emptyList());

    }

    @And("user will also material update put body with {string} and {string} and {string} and {string}")
    public void userWillAlsoMaterialUpdatePutBodyWithAndAndAnd(String arg0, String arg1, String arg2, String arg3) {

        dgnPutMaterialUpdateRequestModel.getColorResponseList().get(0).setId(Integer.parseInt(arg0));
        dgnPutMaterialUpdateRequestModel.getColorResponseList().get(0).setCode(arg1);
        dgnPutMaterialUpdateRequestModel.getColorResponseList().get(0).setHexCode(arg2);
        dgnPutMaterialUpdateRequestModel.getColorResponseList().get(0).setName(arg3);

    }

    @And("user will also add material update put body with {string} and {string} and {string}")
    public void userWillAlsoAddMaterialUpdatePutBodyWithAndAnd(String arg0, String arg1, String arg2) throws NoSuchAlgorithmException, KeyManagementException {

        dgnPutMaterialUpdateRequestModel.getColorResponseList().get(0).setPantoneColorId(Integer.parseInt(arg0));
        dgnPutMaterialUpdateRequestModel.getColorResponseList().get(0).setColorType(arg1);
        dgnPutMaterialUpdateRequestModel.getColorResponseList().get(0).setRepresentedBy(arg2);

        requestCostModel = gson.toJson(dgnPutMaterialUpdateRequestModel);

        postCostApiResponse = ApiCallHelper.putCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postCostApiResponse.body().asString());

    }

    @Then("dgn material update put api will be verified with DB")
    public void dgnMaterialUpdatePutApiWillBeVerifiedWithDB() {


        try {
            Assert.assertEquals(postCostApiResponse.statusCode(),200);

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }


}
