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
import repository.remoteRepo.responseRepo.costing.CosGetQuoteReqSingleResponseModel;

import java.sql.SQLException;

import static core.urlDefine.apiURL.costing_run_url;

public class CosGetQuoteReqSingleStepdefs {

    private Gson gson = new Gson();
    private String requestModel;


    Response getApiResponse;
    String url;


    @Given("costing add cost quote Req Single api will be provided")
    public void costingAddCostQuoteReqSingleApiWillBeProvided() {

        url = costing_run_url + "quote/" + "request/all?page=0&size=15&status=PENDING,RUNNING&sort=modifiedAt,desc&";

    }

    @When("user will hit get costing quote Req Single api all {string} and {string} and {string}")
    public void userWillHitGetCostingQuoteReqSingleApiAllAndAnd(String arg0, String arg1, String arg2) {

        url = url + arg0 + arg1 + arg2;
        System.out.println(url);
    }

    @And("user will get data according to the quote Req Single")
    public void userWillGetDataAccordingToTheQuoteReqSingle() {
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @Then("user will get costing quote Req Single as id")
    public void userWillGetCostingQuoteReqSingleAsId() throws SQLException, ClassNotFoundException {

        CosGetQuoteReqSingleResponseModel cosGetQuoteReqSingleResponseModel = gson.fromJson(getApiResponse.getBody().asString(), CosGetQuoteReqSingleResponseModel.class);

        System.out.println("This is ID --- " + cosGetQuoteReqSingleResponseModel.getData().get(0).getId());
        System.out.println("This is CollectionID --- " + cosGetQuoteReqSingleResponseModel.getData().get(0).getCollectionId());
        System.out.println("This is Requested By --- " + cosGetQuoteReqSingleResponseModel.getData().get(0).getRequestedBy());


        int databaseID = cosGetQuoteReqSingleResponseModel.getData().get(0).getId();

        CostingQuery costingQuery = new CostingQuery();
        CostingDbModel costingDbModel = costingQuery.costingQuoteReq(databaseID);


        System.out.println("Database Ref Num: "+ costingDbModel.getRef_number());
        System.out.println("Database Req By: "+ costingDbModel.getReq_by());

        int getReqby = Integer.parseInt(costingDbModel.getReq_by());



        try {
            Assert.assertEquals(costingDbModel.getRef_number(),cosGetQuoteReqSingleResponseModel.getData().get(0).getReferenceNumber());
            Assert.assertEquals(getReqby,cosGetQuoteReqSingleResponseModel.getData().get(0).getRequestedById());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");


    }
}
