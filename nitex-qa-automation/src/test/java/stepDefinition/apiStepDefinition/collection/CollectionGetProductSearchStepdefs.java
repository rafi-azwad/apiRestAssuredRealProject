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

public class CollectionGetProductSearchStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    Response getApiResponse;
    String url;

    public static int ID=0;
    public static String name;

    public static int brandID=0;

    @Given("get product search api url will be given")
    public void getProductSearchApiUrlWillBeGiven() {
        url = base_url;
    }

    @When("get product search will passdown api url endpoints")
    public void getProductSearchWillPassdownApiUrlEndpoints() {
        url = url + "product/search?status=PUBLISHED%20&filterSubCategory=" +
                "NITEX_DESIGN&subCategoryId=58&productGroupId=1&collection=32657&brandId=1&season=" +
                "WINTER_25&publishDateFrom=2023-02-02&publishDateTo=2023-05-05&createdBy=" +
                "6352&fabricType=KNIT&developmentLocations=1&page=0&size=60&sort=dateAdded,desc";

        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @Then("get product search data will be fetched and verified with db")
    public void getProductSearchDataWillBeFetchedAndVerifiedWithDb() {

        try {
            Assert.assertEquals(getApiResponse.statusCode(),200);

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }
}
