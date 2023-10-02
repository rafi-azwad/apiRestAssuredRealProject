package stepDefinition.apiStepDefinition.collection;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import repository.remoteRepo.responseRepo.collection.CollectionPostLikeResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import static core.urlDefine.apiURL.base_url;

public class CollectionPostLikeStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;
    Response postCostApiResponse;
    String url;

    public static String message;
    public static boolean status;



    @Given("collection post like url will be given")
    public void collectionPostLikeUrlWillBeGiven() {
        url = base_url;
    }

    @When("collection will post like api url endpoints {string} and {string} and {string}")
    public void collectionWillPostLikeApiUrlEndpointsAndAnd(String arg0, String arg1, String arg2) throws NoSuchAlgorithmException, KeyManagementException {
        url = url + arg0 + arg1 + arg2;


        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),"",url);
        System.out.println(postCostApiResponse.body().asString());

        CollectionPostLikeResponseModel collectionPostLikeResponseModel = gson.fromJson(postCostApiResponse.getBody().asString(), CollectionPostLikeResponseModel.class);

         message = collectionPostLikeResponseModel.getMessage();
         status = collectionPostLikeResponseModel.isSuccess();

        System.out.println("================>" + message);
        System.out.println("================>" + status);

    }

    @Then("post like data will be fetched and verified with db")
    public void postLikeDataWillBeFetchedAndVerifiedWithDb() {

        try {
            Assert.assertEquals(message,"Successfully added to favourite");
            Assert.assertEquals(status,true);

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
