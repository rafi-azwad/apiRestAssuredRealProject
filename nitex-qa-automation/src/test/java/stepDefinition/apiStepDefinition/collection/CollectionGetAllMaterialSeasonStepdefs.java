package stepDefinition.apiStepDefinition.collection;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;

import static core.urlDefine.apiURL.base_url;

public class CollectionGetAllMaterialSeasonStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    Response getApiResponse;
    String url;

    public int ID=0;
    public String name;
    public String email;

    @Given("get all material season api url will be given")
    public void getAllMaterialSeasonApiUrlWillBeGiven() {
        url = base_url;
    }

    @When("get all material season will passdown api url endpoints {string} and {string} and {string}")
    public void getAllMaterialSeasonWillPassdownApiUrlEndpointsAndAnd(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @Then("get all material season will be fetched and verified")
    public void getAllMaterialSeasonWillBeFetchedAndVerified() {

        try {
            Assert.assertEquals(getApiResponse.statusCode(),200);

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
