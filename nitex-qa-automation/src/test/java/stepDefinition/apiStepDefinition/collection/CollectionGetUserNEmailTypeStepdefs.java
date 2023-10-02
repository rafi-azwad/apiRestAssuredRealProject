package stepDefinition.apiStepDefinition.collection;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import repository.dbModel.collection.CollectionDbModel;
import repository.dbModel.query.Collection.CollectionQuery;
import repository.remoteRepo.responseRepo.collection.CollectionGetUserNEmailTypeResponseModel;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static core.urlDefine.apiURL.base_url;

public class CollectionGetUserNEmailTypeStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    Response getApiResponse;
    String url;

    public int ID=0;
    public String name;
    public String designation;


    @Given("get emailNuser api url will be given")
    public void getEmailNuserApiUrlWillBeGiven() {
        url = base_url;
    }

    @When("get emailNuser will passdown api url endpoints {string} and {string} and {string} and {string}")
    public void getEmailNuserWillPassdownApiUrlEndpointsAndAndAnd(String arg0, String arg1, String arg2, String arg3) {
        url = base_url + arg0 + arg1 + arg2 + arg3;

        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());

        CollectionGetUserNEmailTypeResponseModel[] collectionGetUserNEmailTypeResponseModel = gson.fromJson(getApiResponse.getBody().asString(), CollectionGetUserNEmailTypeResponseModel[].class);
        List<CollectionGetUserNEmailTypeResponseModel> collectionList = Arrays.asList(collectionGetUserNEmailTypeResponseModel);


        ID = collectionList.get(1).getId();
        name = collectionList.get(1).getName();
        designation = collectionList.get(1).getDesignation();

        System.out.println("This is APi ID: " + ID);
        System.out.println("This is APi Name: " + name);
        System.out.println("This is APi Name: " + designation);


    }

    @Then("get emailNuser data will be fetched and verified with db")
    public void getEmailNuserDataWillBeFetchedAndVerifiedWithDb() throws SQLException, ClassNotFoundException {

        CollectionQuery collectionQuery = new CollectionQuery();
        CollectionDbModel collectionDbModel = collectionQuery.getcollectionEmainNUserType(ID);

        System.out.println("This is DB Name: " + collectionDbModel.getName());
        System.out.println("This is DB Designation: " + collectionDbModel.getDesignation());

        try {
            Assert.assertEquals(name,collectionDbModel.getName());
            Assert.assertEquals(designation,collectionDbModel.getDesignation());


        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
