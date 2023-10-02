package stepDefinition.apiStepDefinition.sample;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import repository.remoteRepo.responseRepo.sample.SamplePostMeasurementResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import static core.urlDefine.apiURL.base_url;

public class SamplePostMeasurementStepdefs {

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



    @Given("design sample post measurement api will be provided")
    public void designSamplePostMeasurementApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit the sample post measurement api url with {string}, {string}, {string} and {string}")
    public void userWillHitTheSamplePostMeasurementApiUrlWithAnd(String arg0, String arg1, String arg2, String arg3) throws NoSuchAlgorithmException, KeyManagementException {

        url = url + arg0 + arg1 + arg2 + arg3;

        postApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),"",url);
        System.out.println(postApiResponse.body().asString());

    }

    @And("user will receive post measurement data according to the api")
    public void userWillReceivePostMeasurementDataAccordingToTheApi() {

        SamplePostMeasurementResponseModel samplePostMeasurementResponseModel = gson.fromJson(postApiResponse.getBody().asString(), SamplePostMeasurementResponseModel.class);

        String message = samplePostMeasurementResponseModel.getMessage();
        status = samplePostMeasurementResponseModel.isSuccess();

        System.out.println("================>" + message);
        System.out.println("================>" + status);

    }

    @Then("sample post measurement api will be verified with DB")
    public void samplePostMeasurementApiWillBeVerifiedWithDB() {

        try {

            Assert.assertEquals(status,true);

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }
}
