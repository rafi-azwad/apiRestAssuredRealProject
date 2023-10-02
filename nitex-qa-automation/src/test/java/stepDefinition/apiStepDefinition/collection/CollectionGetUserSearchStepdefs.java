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
import repository.remoteRepo.responseRepo.collection.CollectionGetUserSearchResponseModel;

import java.sql.SQLException;

import static core.urlDefine.apiURL.base_url;

public class CollectionGetUserSearchStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    Response getApiResponse;
    String url;

    public int ID=0;
    public String name;
    public String email;

    @Given("get user search api url will be given")
    public void getUserSearchApiUrlWillBeGiven() {
        url = base_url;
    }

    @When("get user search will passdown api url endpoints {string} and {string} and {string}")
    public void getUserSearchWillPassdownApiUrlEndpointsAndAnd(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;
    }

    @And("get user search will also passdown api url endpoints {string} and {string}")
    public void getUserSearchWillAlsoPassdownApiUrlEndpointsAnd(String arg0, String arg1) {

        url = url + arg0 + arg1;
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());

        CollectionGetUserSearchResponseModel collectionGetUserSearchResponseModel = gson.fromJson(getApiResponse.getBody().asString(), CollectionGetUserSearchResponseModel.class);
      //  List<CollectionGetUserNEmailTypeResponseModel> collectionList = Arrays.asList(collectionGetUserNEmailTypeResponseModel);
        ID = collectionGetUserSearchResponseModel.getData().get(0).getId();
        name = collectionGetUserSearchResponseModel.getData().get(0).getName();
        email = collectionGetUserSearchResponseModel.getData().get(0).getEmail();

        System.out.println("Api ID: " + ID);
        System.out.println("Api Name: " + name);
        System.out.println("Api Designation: " + email);
    }

    @Then("get user search will be fetched and verified with db")
    public void getUserSearchWillBeFetchedAndVerifiedWithDb() throws SQLException, ClassNotFoundException {


        CollectionQuery collectionQuery = new CollectionQuery();
        CollectionDbModel collectionDbModel = collectionQuery.getcollectionEmainNUserType(ID);

        String db_name = collectionDbModel.getName();
        String email = collectionDbModel.getEmail();

        System.out.println("DB Name: " + name);
        System.out.println("DB Designation: " + email);

        try {
            Assert.assertEquals(name,collectionDbModel.getName());
            Assert.assertEquals(email,collectionDbModel.getEmail());


        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
