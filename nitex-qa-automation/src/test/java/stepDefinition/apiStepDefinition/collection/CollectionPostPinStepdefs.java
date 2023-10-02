package stepDefinition.apiStepDefinition.collection;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import repository.remoteRepo.responseRepo.collection.CollectionPostPinResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import static core.urlDefine.apiURL.base_url;

public class CollectionPostPinStepdefs {
    private Gson gson = new Gson();
    private String requestCostModel;
    Response postCostApiResponse;
    String url;

    @Given("collection post pin url will be given")
    public void collectionPostPinUrlWillBeGiven() {
        url = base_url;
    }

    @When("collection will post pin api url endpoints {string} and {string} and {string}")
    public void collectionWillPostPinApiUrlEndpointsAndAnd(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;
    }

    @Then("post pin data will be fetched and verified with db")
    public void postPinDataWillBeFetchedAndVerifiedWithDb() throws NoSuchAlgorithmException, KeyManagementException {

        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),"",url);
        System.out.println(postCostApiResponse.body().asString());

        CollectionPostPinResponseModel collectionPostPinResponseModel = gson.fromJson(postCostApiResponse.getBody().asString(), CollectionPostPinResponseModel.class);

        String message = collectionPostPinResponseModel.getMessage();
        boolean status = collectionPostPinResponseModel.isSuccess();

        System.out.println("================>" + message);
        System.out.println("================>" + status);

        try {

            Assert.assertEquals(status,true);

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");


    }
}
