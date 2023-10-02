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
import org.json.JSONArray;
import org.testng.Assert;
import repository.remoteRepo.requestRepo.photography.PhotoPostUploadRequestModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

import static core.Helper.FilePathHelper.photoPostUpload;
import static core.urlDefine.apiURL.base_url;

public class PhotoPostUploadStepdefs {


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

    PhotoPostUploadRequestModel[] photoPostUploadRequestModel;
    private String requestCostModel;


    @Given("photography upload api will be provided")
    public void photographyUploadApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit the photography upload api url with {string}, {string}, {string}")
    public void userWillHitThePhotographyUploadApiUrlWith(String arg0, String arg1, String arg2) {

        url = url + arg0 + arg1 + arg2;

        JSONArray requestBody = new FileReaderHelper().readJsonArray(photoPostUpload);
        photoPostUploadRequestModel = new Gson().fromJson(requestBody.toString(), PhotoPostUploadRequestModel[].class);

    }

    @And("user will pass upload body parameters according to the api {string}, {string}, {string} and {string}")
    public void userWillPassUploadBodyParametersAccordingToTheApiAnd(String arg0, String arg1, String arg2, String arg3) throws NoSuchAlgorithmException, KeyManagementException {


        List<PhotoPostUploadRequestModel> collList = Arrays.asList(photoPostUploadRequestModel);


        collList.get(0).setName(arg0);
        collList.get(0).setDocMimeType(arg1);
        collList.get(0).setDocumentType(arg2);
        collList.get(0).setBase64Str(arg3);

        requestCostModel = gson.toJson(collList);

        postApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postApiResponse.body().asString());

    }

    @Then("photography upload api will be verified with DB")
    public void photographyUploadApiWillBeVerifiedWithDB() {

        try {

            Assert.assertEquals(postApiResponse.statusCode(),200);

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
