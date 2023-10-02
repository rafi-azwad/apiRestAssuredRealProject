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
import repository.remoteRepo.requestRepo.designedit.DgnProMesSizeCatRequestModel;
import repository.remoteRepo.responseRepo.designedit.DgnProMesSizeCatResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import static core.Helper.FilePathHelper.*;
import static core.urlDefine.apiURL.base_url;

public class DgnProMesSizeCatStepdefs {


    private Gson gson = new Gson();
    private String requestCostModel;

    DgnProMesSizeCatRequestModel dgnProMesSizeCatRequestModel;

    Response postCostApiResponse;
    String url;

    int payLoad_Id = 0;


    @Given("design measurement size cat api will be provided")
    public void designMeasurementSizeCatApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit measurement size cat api {string} and {string} and {string}")
    public void userWillHitMeasurementSizeCatApiAndAnd(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;
    }

    @And("user will hit measurement size cat api with body {string} and {string} and {string} and {string} and {string}")
    public void userWillHitMeasurementSizeCatApiWithBodyAndAndAndAnd(String arg0, String arg1, String arg2, String arg3, String arg4) throws NoSuchAlgorithmException, KeyManagementException {
        JSONObject requestBody = new FileReaderHelper().readJsonFile(dgnProMeasurementSizeCat);
        dgnProMesSizeCatRequestModel = new Gson().fromJson(requestBody.toJSONString(), DgnProMesSizeCatRequestModel.class);


        FileReaderHelper file = new FileReaderHelper();
        String id =file.readFile(idDesignReaderPath);
        payLoad_Id = Integer.parseInt(id);


        dgnProMesSizeCatRequestModel.setName(arg0);
        dgnProMesSizeCatRequestModel.getSizeMappingList().get(0).setStandardSize(arg1);
        dgnProMesSizeCatRequestModel.getSizeMappingList().get(0).setStandardSizeLabel(arg2);
        dgnProMesSizeCatRequestModel.getSizeMappingList().get(0).setMappingSize(arg3);
        dgnProMesSizeCatRequestModel.setProductId(String.valueOf(payLoad_Id));


        requestCostModel = gson.toJson(dgnProMesSizeCatRequestModel);
        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postCostApiResponse.body().asString());

    }

    @Then("measurement size cat api will be verified with DB")
    public void measurementSizeCatApiWillBeVerifiedWithDB() {

        DgnProMesSizeCatResponseModel dgnProMesSizeCatResponseModel  = gson.fromJson(postCostApiResponse.getBody().asString(), DgnProMesSizeCatResponseModel.class);

        try {
            Assert.assertEquals(dgnProMesSizeCatResponseModel.isSuccess(),true);
            Assert.assertEquals(dgnProMesSizeCatResponseModel.getMessage(),"New size category saved successfully");


        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");


    }

    }
