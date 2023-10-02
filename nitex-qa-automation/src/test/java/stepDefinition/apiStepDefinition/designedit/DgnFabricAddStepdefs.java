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
import repository.remoteRepo.requestRepo.designedit.DesignFabricAddRequestModel;
import repository.remoteRepo.responseRepo.designedit.DgnFabricAddResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import static core.Helper.FilePathHelper.designFabricAdd;
import static core.urlDefine.apiURL.base_url;

public class DgnFabricAddStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;

    DesignFabricAddRequestModel designFabricAddRequestModel;
    Response postCostApiResponse;
    String url;


    @Given("design fabric add api will be provided")
    public void designFabricAddApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit fabric api url with {string} and {string} and {string}")
    public void userWillHitFabricApiUrlWithAndAnd(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;

    }

    @And("user will hit group fabric api body {string} and {string} and {string} and {string}")
    public void userWillHitGroupFabricApiBodyAndAndAnd(String arg0, String arg1, String arg2, String arg3) {

        JSONObject requestBody = new FileReaderHelper().readJsonFile(designFabricAdd);
        designFabricAddRequestModel = new Gson().fromJson(requestBody.toJSONString(), DesignFabricAddRequestModel.class);

        designFabricAddRequestModel.setMaterialType(arg0);
        designFabricAddRequestModel.setProductId(Integer.parseInt(arg1));
        designFabricAddRequestModel.setFabricType(arg2);
        designFabricAddRequestModel.setGsm(arg3);
    }

    @And("user will also fabric add and {string} and {string} and {string}")
    public void userWillAlsoFabricAddAndAndAnd(String arg0, String faPaIdList, String arg2) throws NoSuchAlgorithmException, KeyManagementException {

        designFabricAddRequestModel.setConstruction(Integer.parseInt(arg0));
        designFabricAddRequestModel.setFabricCompositionPartIdList(faPaIdList);
        designFabricAddRequestModel.setDeleteExistingId(Integer.parseInt(arg2));

        requestCostModel = gson.toJson(designFabricAddRequestModel);

        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postCostApiResponse.body().asString());
    }

    @Then("dgn fabric add will be verified with DB")
    public void dgnFabricAddWillBeVerifiedWithDB() {

        DgnFabricAddResponseModel dgnFabricAddResponseModel  = gson.fromJson(postCostApiResponse.getBody().asString(), DgnFabricAddResponseModel.class);

        String msg =  dgnFabricAddResponseModel.getMessage();
        int iD = dgnFabricAddResponseModel.getId();

        System.out.println("this is message===>" + msg);
        System.out.println("this is ID===>" + iD);

        try {
            //  Assert.assertEquals(dgnproductId,designDbModel.getProduct_Id());
            Assert.assertEquals(msg,"Fabric added successfully");

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }

}
