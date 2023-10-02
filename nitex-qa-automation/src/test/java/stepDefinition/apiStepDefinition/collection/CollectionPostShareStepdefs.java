package stepDefinition.apiStepDefinition.collection;

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
import repository.remoteRepo.requestRepo.collection.CollectionPostShareRequestModel;
import repository.remoteRepo.responseRepo.collection.CollectionPostShareResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;

import static core.Helper.FilePathHelper.collectionShare;
import static core.urlDefine.apiURL.collection_base_url;

public class CollectionPostShareStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    CollectionPostShareRequestModel collectionPostShareRequestModel;

    Response postApiResponse;
    String url;

    public static String message;
    public static boolean isSucc;

    @Given("base share api url will be provided")
    public void baseShareApiUrlWillBeProvided() {
        url =  collection_base_url + "share";

    }

    @When("User will input {string} , {string}")
    public void userWillInput(String arg0, String arg1) throws NoSuchAlgorithmException, KeyManagementException {

        JSONObject requestBody = new FileReaderHelper().readJsonFile(collectionShare);
        collectionPostShareRequestModel = new Gson().fromJson(requestBody.toJSONString(),CollectionPostShareRequestModel.class);
        collectionPostShareRequestModel.setCollectionId(arg0);

        int userID = Integer.parseInt(arg1);
        collectionPostShareRequestModel.setUserIds(Collections.singletonList(userID));
        requestModel = gson.toJson(collectionPostShareRequestModel);

        postApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestModel,url);
        System.out.println(postApiResponse.body().asString());

    }

    @And("user will call the share api")
    public void userWillCallTheShareApi() {

        CollectionPostShareResponseModel collectionPostShareResponseModel = gson.fromJson(postApiResponse.getBody().asString(), CollectionPostShareResponseModel.class);
        int collection_id = collectionPostShareResponseModel.getId();
        message = collectionPostShareResponseModel.getMessage();
        isSucc = collectionPostShareResponseModel.isSuccess();

        System.out.println("This is collection ID: " + collection_id);
        System.out.println("This is message: " + message);
        System.out.println("This is is success: " + isSucc);


    }

    @Then("it will be shared and saved in db")
    public void itWillBeSharedAndSavedInDb() {


        try {

            Assert.assertEquals(message,"Collection shared successfully");
            Assert.assertEquals(isSucc,true);


        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
