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
import repository.remoteRepo.responseRepo.collection.CollectionGetSubCategoryResponseModel;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static core.urlDefine.apiURL.base_url;

public class CollectionGetSubCategoryStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    Response getApiResponse;
    String url;

    public static int ID=0;
    public static String name;

    public static int brandID=0;


    @Given("get subcategory api url will be given")
    public void getSubcategoryApiUrlWillBeGiven() {
        url = base_url;
    }

    @When("get subcategory will passdown api url endpoints {string} and {string} and {string}")
    public void getSubcategoryWillPassdownApiUrlEndpointsAndAnd(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());

        CollectionGetSubCategoryResponseModel[] collectionGetSingleMemberResponseModel = gson.fromJson(getApiResponse.getBody().asString(), CollectionGetSubCategoryResponseModel[].class);
        List<CollectionGetSubCategoryResponseModel> catList = Arrays.asList(collectionGetSingleMemberResponseModel);

        ID = catList.get(1).getId();
        name = catList.get(1).getName();

        System.out.println("Response Name: " + name);
        System.out.println("Response ID: " + ID);
    }

    @Then("get subcategory data will be fetched and verified with db")
    public void getSubcategoryDataWillBeFetchedAndVerifiedWithDb() throws SQLException, ClassNotFoundException {

        CollectionQuery collectionQuery = new CollectionQuery();
        CollectionDbModel collectionDbModel = collectionQuery.getSubCategory(ID);

        String db_name = collectionDbModel.getName();

        System.out.println("DB Name: " + db_name);

        try {
            Assert.assertEquals(name,db_name);

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");


    }
}
