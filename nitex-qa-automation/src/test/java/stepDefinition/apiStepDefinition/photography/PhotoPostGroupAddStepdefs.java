package stepDefinition.apiStepDefinition.photography;

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
import repository.remoteRepo.requestRepo.photography.PhotoPostGroupAddRequestModel;
import repository.remoteRepo.responseRepo.photography.PhotoPostGroupAddResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import static core.Helper.FilePathHelper.photoPostGroupAdd;
import static core.urlDefine.apiURL.base_url;

public class PhotoPostGroupAddStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    Response getApiResponse;
    String url;

    public static int ID=0;
    public static int c_ID=0;

    public static String collection_name;
    public static String message;

    public static String brand;
    public static String email;

    Response postApiResponse;

    public boolean status;

    PhotoPostGroupAddRequestModel photoPostGroupAddRequestModel;
    private String requestCostModel;


    @Given("photography group add api will be provided")
    public void photographyGroupAddApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit the photography group add api url with {string}, {string}, {string}")
    public void userWillHitThePhotographyGroupAddApiUrlWith(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;

        JSONObject requestBody = new FileReaderHelper().readJsonFile(photoPostGroupAdd);
        photoPostGroupAddRequestModel = new Gson().fromJson(requestBody.toJSONString(), PhotoPostGroupAddRequestModel.class);

    }

    @And("user will pass body photography group add according to the api {string}, {string}, {string}, {string}")
    public void userWillPassBodyPhotographyGroupAddAccordingToTheApi(String arg0, String arg1, String arg2, String arg3) {

        photoPostGroupAddRequestModel.setName(arg0);
        photoPostGroupAddRequestModel.setDocMimeType(arg1);
        photoPostGroupAddRequestModel.setDocumentGroup(arg2);
        photoPostGroupAddRequestModel.setDocumentType(arg3);

    }

    @And("user will also pass body photography group add according to the api {string}, {string}, {string}")
    public void userWillAlsoPassBodyPhotographyGroupAddAccordingToTheApi(String arg0, String arg1, String arg2) throws NoSuchAlgorithmException, KeyManagementException {

        photoPostGroupAddRequestModel.setBase64Str(arg0);
        photoPostGroupAddRequestModel.setProductId(arg1);
        photoPostGroupAddRequestModel.setSize(Integer.parseInt(arg2));

        requestCostModel = gson.toJson(photoPostGroupAddRequestModel);

        postApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postApiResponse.body().asString());


        PhotoPostGroupAddResponseModel postGroupAddResponseModel = gson.fromJson(postApiResponse.getBody().asString(), PhotoPostGroupAddResponseModel.class);

        message = postGroupAddResponseModel.getMessage();
        status = postGroupAddResponseModel.isSuccess();

        System.out.println("================>" + message);
        System.out.println("================>" + status);

    }

    @Then("photography group add api will be verified with DB")
    public void photographyGroupAddApiWillBeVerifiedWithDB() {

        try {

            Assert.assertEquals(status,true);
            Assert.assertEquals(message,"Document Added successfully to product");

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }
}
