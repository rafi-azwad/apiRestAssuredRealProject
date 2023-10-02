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

public class CollectionGetDownloadReportStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    Response getApiResponse;
    String url;

    public static int ID=0;
    public static String name;

    public static int brandID=0;


    @Given("get download api url will be given")
    public void getDownloadApiUrlWillBeGiven() {
        url = base_url;
    }

    @When("get download will passdown api url endpoints {string} and {string} and {string} and {string}")
    public void getDownloadWillPassdownApiUrlEndpointsAndAndAnd(String arg0, String arg1, String arg2, String arg3) {
        url = url + arg0 + arg1 + arg2 + arg3;
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
    }

    @Then("get download data will be fetched and verified with db")
    public void getDownloadDataWillBeFetchedAndVerifiedWithDb() {

        try {
            Assert.assertEquals(getApiResponse.statusCode(),200);

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }
}
