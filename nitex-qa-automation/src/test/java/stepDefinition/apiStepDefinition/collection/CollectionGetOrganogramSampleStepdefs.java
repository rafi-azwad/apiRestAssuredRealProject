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
import repository.remoteRepo.responseRepo.collection.CollectionGetOrganogramSampleResponseModel;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static core.urlDefine.apiURL.base_url;

public class CollectionGetOrganogramSampleStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    Response getApiResponse;
    String url;

    public static int ID=0;
    public static String name;
    public static String type;


    @Given("get organogram api url will be given")
    public void getOrganogramApiUrlWillBeGiven() {
        url = base_url;
    }

    @When("get organogram will passdown api url endpoints {string} and {string} and {string}")
    public void getOrganogramWillPassdownApiUrlEndpointsAndAnd(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());

        CollectionGetOrganogramSampleResponseModel[] collectionGetOrganogramSampleResponseModels = gson.fromJson(getApiResponse.getBody().asString(), CollectionGetOrganogramSampleResponseModel[].class);
        List<CollectionGetOrganogramSampleResponseModel> organoList = Arrays.asList(collectionGetOrganogramSampleResponseModels);

        ID = organoList.get(0).getId();
        name = organoList.get(0).getName();
        type = organoList.get(0).getType();


        System.out.println("Response ID: " + ID);
        System.out.println("Response Name: " + name);
        System.out.println("Response Name: " + type);


    }

    @Then("get organogram data will be fetched and verified with db")
    public void getOrganogramDataWillBeFetchedAndVerifiedWithDb() throws SQLException, ClassNotFoundException {

        CollectionQuery collectionQuery = new CollectionQuery();
        CollectionDbModel collectionDbModel = collectionQuery.getOpsUnit(ID);

        String name_db = collectionDbModel.getName();

        System.out.println("Response Name: " + name_db);

        try {
            Assert.assertEquals(name_db,name);

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
