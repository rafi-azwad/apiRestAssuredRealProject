package stepDefinition.apiStepDefinition.sample;

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
import repository.remoteRepo.requestRepo.sample.SamplePostReqCompleteActivityRequestModel;
import repository.remoteRepo.responseRepo.sample.SamplePostReqCompleteActivityResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import static core.Helper.FilePathHelper.samplePostReqCompleteActivity;
import static core.urlDefine.apiURL.base_url;

public class SamplePostReqCompleteActivityStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    Response getApiResponse;
    String url;

    public static int ID=0;
    public static int c_ID=0;

    public static String collection_name;
    public static String ref_no;

    public static String brand;
    public static String email;

    Response postApiResponse;

    public boolean status;
    private String requestCostModel;

    public String message;

    SamplePostReqCompleteActivityRequestModel samplePostReqCompleteActivityRequestModel;


    @Given("design sample post req complete activity api will be provided")
    public void designSamplePostReqCompleteActivityApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit the sample post req complete activity api url with {string}, {string}, {string} and {string}")
    public void userWillHitTheSamplePostReqCompleteActivityApiUrlWithAnd(String arg0, String arg1, String arg2, String arg3) throws NoSuchAlgorithmException, KeyManagementException {

        url = url + arg0 + arg1 + arg2 + arg3;

        JSONObject requestBody = new FileReaderHelper().readJsonFile(samplePostReqCompleteActivity);
        samplePostReqCompleteActivityRequestModel = new Gson().fromJson(requestBody.toJSONString(), SamplePostReqCompleteActivityRequestModel.class);
    }

    @And("user will provide sample req activity body {string} and {string}")
    public void userWillProvideSampleReqActivityBodyAnd(String arg0, String arg1) {

        samplePostReqCompleteActivityRequestModel.setSampleActivityType(arg0);
        samplePostReqCompleteActivityRequestModel.setSampleItemId(Integer.parseInt(arg1));
    }

    @And("user will receive post req complete activity data according to the api")
    public void userWillReceivePostReqCompleteActivityDataAccordingToTheApi() throws NoSuchAlgorithmException, KeyManagementException {


        requestCostModel = gson.toJson(samplePostReqCompleteActivityRequestModel);

        postApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postApiResponse.body().asString());

        SamplePostReqCompleteActivityResponseModel samplePostReqCompleteActivityResponseModel = gson.fromJson(postApiResponse.getBody().asString(), SamplePostReqCompleteActivityResponseModel.class);

        message = samplePostReqCompleteActivityResponseModel.getMessage();
        status = samplePostReqCompleteActivityResponseModel.isSuccess();

        System.out.println("================>" + message);
        System.out.println("================>" + status);


    }

    @Then("sample post req complete activity api will be verified with DB")
    public void samplePostReqCompleteActivityApiWillBeVerifiedWithDB() {

        try {

            Assert.assertEquals(status,true);
            Assert.assertEquals(message,"Sample Activity complete successfully.");

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }


}
