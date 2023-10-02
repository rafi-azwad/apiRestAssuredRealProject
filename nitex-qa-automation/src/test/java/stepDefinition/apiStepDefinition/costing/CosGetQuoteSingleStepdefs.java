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
import repository.dbModel.costing.CostingDbModel;
import repository.dbModel.query.Costing.CostingQuery;
import repository.remoteRepo.responseRepo.costing.CosGetQuantityWiseResponseModel;

import java.sql.SQLException;

import static core.urlDefine.apiURL.costing_run_url;

public class CosGetQuoteSingleStepdefs {

    private Gson gson = new Gson();
    private String requestModel;


    Response getApiResponse;
    String url;

    @Given("costing add cost quote single api will be provided")
    public void costingAddCostQuoteSingleApiWillBeProvided() {

        url = costing_run_url + "quote/";
    }

    @When("user will hit get costing quote api all {string}")
    public void userWillHitGetCostingQuoteApiAll(String arg0) {
        url = url + arg0;
        System.out.println(url);
    }

    @And("user will get data according to the quote sngle")
    public void userWillGetDataAccordingToTheQuoteSngle() {

        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @Then("user will get costing quote as id")
    public void userWillGetCostingQuoteAsId() throws SQLException, ClassNotFoundException {

        CosGetQuantityWiseResponseModel cosGetQuoteSingleResponseModel = gson.fromJson(getApiResponse.getBody().asString(), CosGetQuantityWiseResponseModel.class);

        System.out.println("This is ID --- " + cosGetQuoteSingleResponseModel.getQuoteItemResponseList().get(0).getId());
        System.out.println("This is Product ID --- " + cosGetQuoteSingleResponseModel.getQuoteItemResponseList().get(0).getProductId());
        System.out.println("This is Market --- " + cosGetQuoteSingleResponseModel.getQuoteItemResponseList().get(0).getMarket());
        System.out.println("This is Category --- " + cosGetQuoteSingleResponseModel.getQuoteItemResponseList().get(0).getCategory());
        System.out.println("This is Ref --- " + cosGetQuoteSingleResponseModel.getQuoteItemResponseList().get(0).getProductRefNo());
        System.out.println("This is Name --- " + cosGetQuoteSingleResponseModel.getQuoteItemResponseList().get(0).getProductTitle());

        int databaseID = cosGetQuoteSingleResponseModel.getQuoteItemResponseList().get(0).getProductId();

        CostingQuery costingQuery = new CostingQuery();

        CostingDbModel costingDbModel = costingQuery.costingQuote(databaseID);

        System.out.println("Database Brand Name: "+ costingDbModel.getName());
        System.out.println("Database Brand Ref: "+ costingDbModel.getRef_number());


        try {
            Assert.assertEquals(costingDbModel.getName(),cosGetQuoteSingleResponseModel.getQuoteItemResponseList().get(0).getProductTitle());
            Assert.assertEquals(costingDbModel.getRef_number(),cosGetQuoteSingleResponseModel.getQuoteItemResponseList().get(0).getProductRefNo());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");


    }
}
