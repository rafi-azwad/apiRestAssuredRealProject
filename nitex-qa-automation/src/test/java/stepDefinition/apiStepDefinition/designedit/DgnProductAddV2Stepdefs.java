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
import repository.remoteRepo.requestRepo.designedit.DgnProductAddV2ReqestModel;
import repository.remoteRepo.responseRepo.designedit.DgnProductAddV2ResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import static core.Helper.FilePathHelper.dgnProductAddV2;
import static core.urlDefine.apiURL.base_url;

public class DgnProductAddV2Stepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;

    DgnProductAddV2ReqestModel dgnProductAddV2ReqestModel;

    Response postCostApiResponse;
    String url;

    @Given("design add v product api will be provided")
    public void designAddVProductApiWillBeProvided() {

        url = base_url;
    }

    @When("user will hit post design api v {string}")
    public void userWillHitPostDesignApiV(String arg0) {

        url = base_url +  "product/v2/" + arg0;
    }

    @And("user will hit v api with body {string} and {string} and {string}")
    public void userWillHitVApiWithBodyAndAnd(String arg0, String arg1, String arg2) {

        JSONObject requestBody = new FileReaderHelper().readJsonFile(dgnProductAddV2);
        dgnProductAddV2ReqestModel = new Gson().fromJson(requestBody.toJSONString(), DgnProductAddV2ReqestModel.class);


        int inCostingConvert = Integer.parseInt(arg0);

        dgnProductAddV2ReqestModel.getDocumentDTOList().get(0).setDocumentId(inCostingConvert);
        dgnProductAddV2ReqestModel.getDocumentDTOList().get(0).setFront(false);

        dgnProductAddV2ReqestModel.getDocumentDTOList().get(1).setDocumentId(inCostingConvert + 1);
        dgnProductAddV2ReqestModel.getDocumentDTOList().get(1).setFront(true);

        dgnProductAddV2ReqestModel.getDocumentDTOList().get(2).setDocumentId(inCostingConvert + 2);
        dgnProductAddV2ReqestModel.getDocumentDTOList().get(2).setFront(false);


    }

    @And("user will also hit v api with body {string} and {string} and {string} and {string}")
    public void userWillAlsoHitVApiWithBodyAndAndAnd(String arg0, String arg1, String arg2, String arg3) throws NoSuchAlgorithmException, KeyManagementException {
        dgnProductAddV2ReqestModel.setProductSubCategoryId(Integer.parseInt(arg0));
        dgnProductAddV2ReqestModel.setName(arg1);
        dgnProductAddV2ReqestModel.setProductGroupId(arg2);
        dgnProductAddV2ReqestModel.setCollectionId(arg3);

        requestCostModel = gson.toJson(dgnProductAddV2ReqestModel);
        System.out.println(requestCostModel);



        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postCostApiResponse.body().asString());

    }

    @Then("user will get design product v and verified with DB")
    public void userWillGetDesignProductVAndVerifiedWithDB() {
        DgnProductAddV2ResponseModel dgnProductAddV2ResponseModel = gson.fromJson(postCostApiResponse.getBody().asString(), DgnProductAddV2ResponseModel.class);
        System.out.println("Success Message===> " + dgnProductAddV2ResponseModel.getMessage());

        ////////

        try {
            Assert.assertEquals(dgnProductAddV2ResponseModel.getMessage(), "Style uploaded");

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }
}
