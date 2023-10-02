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
import org.json.JSONArray;
import org.testng.Assert;
import repository.remoteRepo.requestRepo.sample.SamplePutReqItemActivityRequestModel;
import repository.remoteRepo.responseRepo.sample.SamplePostReqCompleteActivityResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

import static core.Helper.FilePathHelper.samplePutReqItemActivity;
import static core.urlDefine.apiURL.base_url;

public class SamplePutReqItemActivityStepdefs {


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

    SamplePutReqItemActivityRequestModel[] samplePutReqItemActivityRequestModel;



    @Given("design sample put req item activity api will be provided")
    public void designSamplePutReqItemActivityApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit the sample put req item activity api url with {string}, {string}, {string} and {string}")
    public void userWillHitTheSamplePutReqItemActivityApiUrlWithAnd(String arg0, String arg1, String arg2, String arg3) {


        url = url + arg0 + arg1 + arg2 + arg3;

        JSONArray requestBody = new FileReaderHelper().readJsonArray(samplePutReqItemActivity);
        samplePutReqItemActivityRequestModel = new Gson().fromJson(requestBody.toString(), SamplePutReqItemActivityRequestModel[].class);

    }

    @And("user will provide sample put req item activity body {string}, {string}, {string}, {string} and {string}")
    public void userWillProvideSamplePutReqItemActivityBodyAnd(String arg0, String arg1, String arg2, String arg3, String arg4) throws NoSuchAlgorithmException, KeyManagementException {


        /////////////////////////
        List<SamplePutReqItemActivityRequestModel> collList = Arrays.asList(samplePutReqItemActivityRequestModel);

        collList.get(0).getSampleActivityDTO().setActivityType(arg0);
        collList.get(0).getSampleActivityDTO().setAssignedTo(Integer.parseInt(arg1));
        collList.get(0).getSampleActivityDTO().setAssignedName(arg2);
        collList.get(0).getSampleActivityDTO().setRequiredDate(arg3);
        collList.get(0).setSampleItemId(Integer.parseInt(arg4));


        requestCostModel = gson.toJson(collList);

        postApiResponse = ApiCallHelper.putCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postApiResponse.body().asString());


    }

    @And("user will receive put req item activity data according to the api")
    public void userWillReceivePutReqItemActivityDataAccordingToTheApi() {


        SamplePostReqCompleteActivityResponseModel samplePostReqCompleteActivityResponseModel = gson.fromJson(postApiResponse.getBody().asString(), SamplePostReqCompleteActivityResponseModel.class);

        message = samplePostReqCompleteActivityResponseModel.getMessage();
        status = samplePostReqCompleteActivityResponseModel.isSuccess();

        System.out.println("================>" + message);
        System.out.println("================>" + status);

    }

    @Then("sample put req item activity api will be verified with DB")
    public void samplePutReqItemActivityApiWillBeVerifiedWithDB() {

        try {

            Assert.assertEquals(status,true);
            Assert.assertEquals(message,"Sample Activity update successfully.");

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }
}
