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
import repository.remoteRepo.requestRepo.collection.CollectionPostQuoteReqRequestModel;
import repository.remoteRepo.responseRepo.collection.CollectionPostQuoteReqResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import static core.Helper.FilePathHelper.collectionPostQuoteReq;
import static core.urlDefine.apiURL.base_url;

public class CollectionPostQuoteReqStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;
    Response postCostApiResponse;
    String url;

    private static boolean isSucc;
    private static String message;

    CollectionPostQuoteReqRequestModel collectionPostQuoteReqRequestModel;


    @Given("collection post quote request url will be given")
    public void collectionPostQuoteRequestUrlWillBeGiven() {
        url = base_url;
    }

    @When("collection will post quote request api url endpoints {string},{string}")
    public void collectionWillPostQuoteRequestApiUrlEndpoints(String arg0, String arg1) throws NoSuchAlgorithmException, KeyManagementException {
        url = url + arg0 + arg1;

        JSONObject requestBody = new FileReaderHelper().readJsonFile(collectionPostQuoteReq);
        collectionPostQuoteReqRequestModel = new Gson().fromJson(requestBody.toJSONString(), CollectionPostQuoteReqRequestModel.class);

    }

    @And("collection will post quote request api body {string},{string},{string}")
    public void collectionWillPostQuoteRequestApiBody(String arg0, String arg1, String arg2) throws NoSuchAlgorithmException, KeyManagementException {

        collectionPostQuoteReqRequestModel.getQuoteItemRequest().get(0).setProductId(Integer.parseInt(arg0));
        collectionPostQuoteReqRequestModel.getQuoteItemRequest().get(0).setRequiredDate(arg1);
        collectionPostQuoteReqRequestModel.getQuoteItemRequest().get(0).setQuantity(arg2);
        requestCostModel = gson.toJson(collectionPostQuoteReqRequestModel);

        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postCostApiResponse.body().asString());

    }

    @Then("post quote request data will be fetched and verified with db")
    public void postQuoteRequestDataWillBeFetchedAndVerifiedWithDb() {

        CollectionPostQuoteReqResponseModel collectionPostShareResponseModel = gson.fromJson(postCostApiResponse.getBody().asString(), CollectionPostQuoteReqResponseModel.class);
        int collection_id = collectionPostShareResponseModel.getId();
        message = collectionPostShareResponseModel.getMessage();
        isSucc = collectionPostShareResponseModel.isSuccess();

        System.out.println("This is collection ID: " + collection_id);
        System.out.println("This is message: " + message);
        System.out.println("This is is success: " + isSucc);


        try {

            Assert.assertEquals(message,"Quote request successfully");
            Assert.assertEquals(isSucc,true);


        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
