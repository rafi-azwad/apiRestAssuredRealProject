package stepDefinition.apiStepDefinition.costing;

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
import repository.remoteRepo.responseRepo.costing.CosGetQuoteSearchResponseModel;

import java.sql.SQLException;

import static core.urlDefine.apiURL.costing_run_url;

public class CosGetQuoteSearchStepdefs {

    private Gson gson = new Gson();
    private String requestModel;


    Response getApiResponse;
    String url;

    @Given("costing add cost quote Req Search api will be provided")
    public void costingAddCostQuoteReqSearchApiWillBeProvided() {

        url = costing_run_url + "collection/";

    }

    @When("user will hit get costing quote Req Search api all {string} and {string} and {string}")
    public void userWillHitGetCostingQuoteReqSearchApiAllAndAnd(String arg0, String arg1, String arg2) {

        url = url + arg0 + arg1 + arg2;
        System.out.println(url);
    }

    @And("user will get data according to the quote Req Search")
    public void userWillGetDataAccordingToTheQuoteReqSearch() {
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @Then("user will get costing quote Req Search as id")
    public void userWillGetCostingQuoteReqSearchAsId() throws SQLException, ClassNotFoundException {


        CosGetQuoteSearchResponseModel cosGetQuoteSearchResponseModel = gson.fromJson(getApiResponse.getBody().asString(), CosGetQuoteSearchResponseModel.class);

        System.out.println("This is ID --- " + cosGetQuoteSearchResponseModel.getData().get(0).getId());
        System.out.println("This is Name --- " + cosGetQuoteSearchResponseModel.getData().get(0).getName());


        int databaseID = cosGetQuoteSearchResponseModel.getData().get(0).getId();

        CollectionQuery collectionQuery = new CollectionQuery();
        CollectionDbModel collectionDbModel = collectionQuery.getCollectionTableInfo(databaseID);


        System.out.println("Database Name: "+ collectionDbModel.getName());

        try {
            Assert.assertEquals(collectionDbModel.getName(),cosGetQuoteSearchResponseModel.getData().get(0).getName());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }
}
