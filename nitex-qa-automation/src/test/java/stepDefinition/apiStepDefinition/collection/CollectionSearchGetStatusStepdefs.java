package stepDefinition.apiStepDefinition.collection;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import repository.dbModel.collection.CollectionDbModel;
import repository.dbModel.query.Collection.CollectionQuery;
import repository.remoteRepo.responseRepo.collection.CollectionGetStatusResponseModel;

import java.sql.SQLException;

import static core.urlDefine.apiURL.base_url;

public class CollectionSearchGetStatusStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    Response getApiResponse;
    String url;

    public static int ID=0;
    public static String c_name;

    public static int brandID=0;



    @Given("get status api url will be given")
    public void getStatusApiUrlWillBeGiven() {
        url = base_url;
    }

    @When("get status will passdown api url endpoints {string} and {string} and {string} and {string}")
    public void getStatusWillPassdownApiUrlEndpointsAndAndAnd(String arg0, String arg1, String arg2, String arg3) {
        url = url + arg0 + arg1 + arg2 + arg3;
    }

    @And("get status will also pass api url endpoints {string} and {string} and {string} and {string} and {string}")
    public void getStatusWillAlsoPassApiUrlEndpointsAndAndAndAnd(String arg0, String arg1, String arg2, String arg3, String arg4) {
        url = url + arg0 + arg1 + arg2 + arg3 + arg4;

        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());

        CollectionGetStatusResponseModel collectionGetStatusResponseModel = gson.fromJson(getApiResponse.getBody().asString(), CollectionGetStatusResponseModel.class);
        ID = collectionGetStatusResponseModel.getData().get(0).getId();
        c_name = collectionGetStatusResponseModel.getData().get(0).getName();
        brandID = collectionGetStatusResponseModel.getData().get(0).getBrandId();

        System.out.println("This is ID: " + ID);
        System.out.println("This is Name: " + c_name);
        System.out.println("This is BrandID: " + brandID);
    }

    @Then("get status data will be fetched and verified with db")
    public void getStatusDataWillBeFetchedAndVerifiedWithDb() throws SQLException, ClassNotFoundException {

        CollectionQuery collectionQuery = new CollectionQuery();
        CollectionDbModel collectionDbModel = collectionQuery.getCollectionSearchStatus(ID);

        String dbownerName = collectionDbModel.getName();
        int dbbrandID = collectionDbModel.getBrand_id();

        System.out.println("Database OwnerName: " + dbownerName);
        System.out.println("Database BrandID: " + dbbrandID);

        try {
            Assert.assertEquals(c_name,dbownerName);
            Assert.assertEquals(brandID,dbbrandID);

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
