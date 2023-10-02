package stepDefinition.apiStepDefinition.collection;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.FileReaderHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import repository.dbModel.collection.CollectionDbModel;
import repository.dbModel.query.Collection.CollectionQuery;
import repository.remoteRepo.responseRepo.collection.CollectionGetSampleDevResponseModel;

import java.sql.SQLException;

import static core.Helper.FilePathHelper.member_id;
import static core.urlDefine.apiURL.base_url;

public class CollectionGetSampleDevStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    Response getApiResponse;
    String url;

    public static int ID=0;
    public static String name;
    public static String market;
    public static String category;

    public static String api_ref;

    public static int brandID=0;

    @Given("get sample dev api url will be given")
    public void getSampleDevApiUrlWillBeGiven() {
        url = base_url;    }

    @When("get sample dev will passdown api url endpoints {string} and {string} and {string}")
    public void getSampleDevWillPassdownApiUrlEndpointsAndAnd(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;

    }

    @And("get sample dev will also passdown api url endpoints {string} and {string} and {string}")
    public void getSampleDevWillAlsoPassdownApiUrlEndpointsAndAnd(String arg0, String arg1, String arg2) {

        FileReaderHelper file = new FileReaderHelper();
        String id =file.readFile(member_id);
        int member = Integer.parseInt(id);



        url = url + member + "/" + arg1;
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());

        CollectionGetSampleDevResponseModel collectionGetSampleDevResponseModel = gson.fromJson(getApiResponse.getBody().asString(), CollectionGetSampleDevResponseModel.class);
        //List<CollectionGetSingleMemberResponseModel> memberList = Arrays.asList(collectionGetSingleMemberResponseModel);
        ID = collectionGetSampleDevResponseModel.getSampleItems().get(0).getProductId();
        market = collectionGetSampleDevResponseModel.getSampleItems().get(0).getMarket();
        category = collectionGetSampleDevResponseModel.getSampleItems().get(0).getCategory();
        api_ref = collectionGetSampleDevResponseModel.getSampleItems().get(0).getReferenceNumber();

        System.out.println("Response Name: " + ID);
        System.out.println("Response market: " + market);
        System.out.println("Response category: " + category);
        System.out.println("Response api_ref: " + api_ref);


    }

    @Then("get sample dev will be fetched and verified")
    public void getSampleDevWillBeFetchedAndVerified() throws SQLException, ClassNotFoundException {


        CollectionQuery collectionQuery = new CollectionQuery();
        CollectionDbModel collectionDbModel = collectionQuery.getcollectionProducts(ID);

        String ref = collectionDbModel.getRef();

        System.out.println("Response Name: " + ref);


        try {
            Assert.assertEquals(api_ref,ref);

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
