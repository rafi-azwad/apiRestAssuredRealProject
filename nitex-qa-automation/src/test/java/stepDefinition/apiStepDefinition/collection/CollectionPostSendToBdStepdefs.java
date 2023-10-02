package stepDefinition.apiStepDefinition.collection;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import repository.remoteRepo.responseRepo.collection.CollectionPostSendToBdResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import static core.urlDefine.apiURL.base_url;

public class CollectionPostSendToBdStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;
    Response postCostApiResponse;
    String url;

    private static boolean isSucc;
    private static String message;


    @Given("collection post send url will be given")
    public void collectionPostSendUrlWillBeGiven() {
        url = base_url;
    }

    @When("collection will post like api url endpoints and body {string}, {string} and {string}")
    public void collectionWillPostLikeApiUrlEndpointsAndBodyAnd(String arg0, String arg1, String arg2) throws NoSuchAlgorithmException, KeyManagementException {
        url = url + arg0 + arg1;

        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),arg2,url);
        System.out.println(postCostApiResponse.body().asString());

    }

    @Then("post send data will be verified with db")
    public void postSendDataWillBeVerifiedWithDb() {

        CollectionPostSendToBdResponseModel collectionPostSendToBdResponseModel = gson.fromJson(postCostApiResponse.getBody().asString(), CollectionPostSendToBdResponseModel.class);

        String message = collectionPostSendToBdResponseModel.getMessage();
        boolean status = collectionPostSendToBdResponseModel.isSuccess();

        System.out.println("================>" + message);
        System.out.println("================>" + status);


        try {

            Assert.assertEquals(status,true);
            Assert.assertEquals(message,"Sent");

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }
}
