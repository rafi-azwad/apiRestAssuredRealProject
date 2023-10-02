package stepDefinition.apiStepDefinition.collection;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import repository.remoteRepo.responseRepo.collection.CollectionFilterCatResponseModel;

import java.util.Arrays;
import java.util.List;

import static core.urlDefine.apiURL.base_url;

public class CollectionFilterCatStepdefs {


    private Gson gson = new Gson();
    private String requestModel;
    Response getApiResponse;
    String url;

    @Given("filter category api url will be given")
    public void filterCategoryApiUrlWillBeGiven() {
        url = base_url;
    }

    @When("filter category will pass api url endpoints {string} and {string}")
    public void filterCategoryWillPassApiUrlEndpointsAnd(String arg0, String arg1) {
        url = base_url + arg0 + arg1;
    }

    @Then("filter category data will be fetched and verified with db")
    public void filterCategoryDataWillBeFetchedAndVerifiedWithDb() {

        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());

        CollectionFilterCatResponseModel[] collectionFilterCatResponseModel = gson.fromJson(getApiResponse.getBody().asString(), CollectionFilterCatResponseModel[].class);
        List<CollectionFilterCatResponseModel> collections = Arrays.asList(collectionFilterCatResponseModel);

        String name = collections.get(0).getName();
        String cons = collections.get(0).getConstant();

        System.out.println("This is name: " + name);
        System.out.println("This is constant: " + cons);

        try {
            Assert.assertEquals(getApiResponse.statusCode(),200);

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }

}

