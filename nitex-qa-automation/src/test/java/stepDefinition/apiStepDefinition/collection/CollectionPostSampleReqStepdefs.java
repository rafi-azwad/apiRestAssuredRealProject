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
import repository.remoteRepo.requestRepo.collection.CollectionPostSampleReqRequestModel;
import repository.remoteRepo.responseRepo.collection.CollectionPostSampleReqResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import static core.Helper.FilePathHelper.collectionPostSampleReq;
import static core.urlDefine.apiURL.base_url;

public class CollectionPostSampleReqStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;
    Response postCostApiResponse;
    String url;

    private static boolean isSucc;
    private static String message;

    CollectionPostSampleReqRequestModel collectionPostSampleReqRequestModel;

    @Given("collection post sample request url will be given")
    public void collectionPostSampleRequestUrlWillBeGiven() {
        url = base_url;
    }

    @When("collection will post sample request api url endpoints {string}, {string}, {string}, {string}")
    public void collectionWillPostSampleRequestApiUrlEndpoints(String arg0, String arg1, String arg2, String arg3) {

        url = url + arg0 + arg1 + arg2 + arg3;

        JSONObject requestBody = new FileReaderHelper().readJsonFile(collectionPostSampleReq);
        collectionPostSampleReqRequestModel = new Gson().fromJson(requestBody.toJSONString(), CollectionPostSampleReqRequestModel.class);

    }

    @And("collection will post sample request api url body {string}, {string}, {string} and {string}")
    public void collectionWillPostSampleRequestApiUrlBodyAnd(String arg0, String arg1, String arg2, String arg3) throws NoSuchAlgorithmException, KeyManagementException {

        collectionPostSampleReqRequestModel.setDevelopmentSample(false);
        collectionPostSampleReqRequestModel.getAddSampleRequestList().get(0).setProductId(Integer.parseInt(arg1));
        collectionPostSampleReqRequestModel.getAddSampleRequestList().get(0).setRequiredDate(arg2);
        collectionPostSampleReqRequestModel.getAddSampleRequestList().get(0).setOperationalUnitId(Integer.parseInt(arg3));

        requestCostModel = gson.toJson(collectionPostSampleReqRequestModel);

        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postCostApiResponse.body().asString());

    }

    @Then("post sample request data will be fetched and verified with db")
    public void postSampleRequestDataWillBeFetchedAndVerifiedWithDb() {


        CollectionPostSampleReqResponseModel CollectionPostSampleReqResponseModel = gson.fromJson(postCostApiResponse.getBody().asString(), CollectionPostSampleReqResponseModel.class);
        int collection_id = CollectionPostSampleReqResponseModel.getId();
        message = CollectionPostSampleReqResponseModel.getMessage();
        isSucc = CollectionPostSampleReqResponseModel.isSuccess();

        System.out.println("This is collection ID: " + collection_id);
        System.out.println("This is message: " + message);
        System.out.println("This is is success: " + isSucc);


        try {

            Assert.assertEquals(message,"Sample request successfully");
            Assert.assertEquals(isSucc,true);


        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }
}
