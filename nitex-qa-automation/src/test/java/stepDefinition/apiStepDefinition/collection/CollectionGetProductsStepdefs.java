package stepDefinition.apiStepDefinition.collection;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.FileReaderHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import repository.dbModel.collection.CollectionDbModel;
import repository.dbModel.query.Collection.CollectionQuery;
import repository.remoteRepo.responseRepo.collection.CollectionGetProductsRequestModel;

import java.sql.SQLException;

import static core.Helper.FilePathHelper.member_id;
import static core.urlDefine.apiURL.base_url;

public class CollectionGetProductsStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    Response getApiResponse;
    String url;

    public static int ID=0;
    public static String name;

    public static int brandID=0;

    @Given("get products api url will be given")
    public void getProductsApiUrlWillBeGiven() {
        url = base_url;
    }

    @When("get products will passdown api url endpoints {string} and {string} and {string}")
    public void getProductsWillPassdownApiUrlEndpointsAndAnd(String arg0, String arg1, String arg2) {


        FileReaderHelper file = new FileReaderHelper();
        String id =file.readFile(member_id);
        int member = Integer.parseInt(id);

        url = url + arg0 + arg1 + member;
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @Then("get products data will be fetched and verified with db")
    public void getProductsDataWillBeFetchedAndVerifiedWithDb() throws SQLException, ClassNotFoundException {

        CollectionGetProductsRequestModel collectionGetProductsRequestModel = gson.fromJson(getApiResponse.getBody().asString(), CollectionGetProductsRequestModel.class);
        //List<CollectionGetSingleMemberResponseModel> memberList = Arrays.asList(collectionGetSingleMemberResponseModel);
        ID = collectionGetProductsRequestModel.getData().get(0).getId();
        name = collectionGetProductsRequestModel.getData().get(0).getName();
        String api_cons = collectionGetProductsRequestModel.getData().get(0).getConstruction();
        String ref = collectionGetProductsRequestModel.getData().get(0).getReferenceNumber();

        System.out.println("Response Name: " + name);
        System.out.println("Response ID: " + ID);
        System.out.println("Response Construction: " + api_cons);
        System.out.println("Response Ref: " + ref);


        CollectionQuery collectionQuery = new CollectionQuery();
        CollectionDbModel collectionDbModel = collectionQuery.getcollectionProducts(ID);

        String name_db = collectionDbModel.getName();
        String ref_db = collectionDbModel.getRef();

        System.out.println("Response Name: " + name_db);
        System.out.println("Response ID: " + ref);

        try {
            Assert.assertEquals(name,name_db);
            Assert.assertEquals(ref,ref_db);

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
