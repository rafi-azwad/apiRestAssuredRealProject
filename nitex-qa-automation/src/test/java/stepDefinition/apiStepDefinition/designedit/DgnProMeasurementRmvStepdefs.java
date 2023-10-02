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
import repository.remoteRepo.requestRepo.designedit.DgnProMeasurementRmvRequestModel;
import repository.remoteRepo.responseRepo.designedit.DgnProMeasurementRmvResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import static core.Helper.FilePathHelper.dgnProMeasurementRmv;
import static core.Helper.FilePathHelper.idDesignReaderPath;
import static core.urlDefine.apiURL.base_url;

public class DgnProMeasurementRmvStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;

    private String payLoad_Id;

    DgnProMeasurementRmvRequestModel dgnProMeasurementRmvRequestModel;

    Response postCostApiResponse;
    String url;

    @Given("design measurement api will be provided")
    public void designMeasurementApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit measurement api {string} and {string} and {string}")
    public void userWillHitMeasurementApiAndAnd(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;

    }

    @And("user will hit measurement api with body {string} and {string} and {string}")
    public void userWillHitMeasurementApiWithBodyAndAnd(String arg0, String arg1, String arg2) throws NoSuchAlgorithmException, KeyManagementException {
        JSONObject requestBody = new FileReaderHelper().readJsonFile(dgnProMeasurementRmv);
        dgnProMeasurementRmvRequestModel = new Gson().fromJson(requestBody.toJSONString(), DgnProMeasurementRmvRequestModel.class);

        FileReaderHelper file = new FileReaderHelper();
        String id =file.readFile(idDesignReaderPath);
        payLoad_Id = id;


        dgnProMeasurementRmvRequestModel.setMeasurementUnit(arg0);
        dgnProMeasurementRmvRequestModel.setPointOfMeasurementId(Integer.parseInt(arg1));
        dgnProMeasurementRmvRequestModel.setProductId(payLoad_Id);


        requestCostModel = gson.toJson(dgnProMeasurementRmvRequestModel);
        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postCostApiResponse.body().asString());


    }

    @Then("measurement remove api will be verified with DB")
    public void measurementRemoveApiWillBeVerifiedWithDB() {

        DgnProMeasurementRmvResponseModel dgnProMeasurementRmvResponseModel  = gson.fromJson(postCostApiResponse.getBody().asString(), DgnProMeasurementRmvResponseModel.class);

        boolean a = dgnProMeasurementRmvResponseModel.getExtraFlag().isIsArtBoardCreated();
        boolean b = dgnProMeasurementRmvResponseModel.getExtraFlag().isIsMeasurementCompleted();
        boolean c = dgnProMeasurementRmvResponseModel.getExtraFlag().isIsSupplierDeveloped();

        try {
            Assert.assertEquals(a,true);
            Assert.assertEquals(b,true);


        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");


    }

}
