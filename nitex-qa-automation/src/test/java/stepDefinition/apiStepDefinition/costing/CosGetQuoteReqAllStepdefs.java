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
import repository.remoteRepo.responseRepo.costing.CosGetQuoteReqAllResponseModel;

import java.sql.SQLException;

import static core.urlDefine.apiURL.costing_run_url;

public class CosGetQuoteReqAllStepdefs {

    private Gson gson = new Gson();
    private String requestModel;


    Response getApiResponse;
    String url;



    @Given("costing add cost quote Req all api will be provided")
    public void costingAddCostQuoteReqAllApiWillBeProvided() {

        url = costing_run_url + "quote/" + "request/all?page=0&size=15&status=PENDING,RUNNING";
    }

    @When("user will hit get costing quote Req all api all {string}")
    public void userWillHitGetCostingQuoteReqAllApiAll(String arg0) {
        System.out.println(url);
    }

    @And("user will get data according to the quote Req all")
    public void userWillGetDataAccordingToTheQuoteReqAll() {
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @Then("user will get costing quote Req all as id")
    public void userWillGetCostingQuoteReqAllAsId() throws SQLException, ClassNotFoundException {

        CosGetQuoteReqAllResponseModel cosGetQuoteReqAllResponseModel = gson.fromJson(getApiResponse.getBody().asString(), CosGetQuoteReqAllResponseModel.class);

        System.out.println("This is ID --- " + cosGetQuoteReqAllResponseModel.getData().get(0).getId());
        System.out.println("This is CollectionID --- " + cosGetQuoteReqAllResponseModel.getData().get(0).getCollectionId());
        System.out.println("This is Requested By --- " + cosGetQuoteReqAllResponseModel.getData().get(0).getRequestedBy());
        System.out.println("This is Ref Num --- " + cosGetQuoteReqAllResponseModel.getData().get(0).getReferenceNumber());
        System.out.println("This is Created By ID --- " + cosGetQuoteReqAllResponseModel.getData().get(0).getRequestedById());



        int databaseID = cosGetQuoteReqAllResponseModel.getData().get(0).getId();

        CostingQuery costingQuery = new CostingQuery();
        CostingDbModel costingDbModel = costingQuery.costingQuoteReq(databaseID);

        System.out.println("Database Ref Num: "+ costingDbModel.getRef_number());
        System.out.println("Database Req By: "+ costingDbModel.getReq_by());

        int getReqby = Integer.parseInt(costingDbModel.getReq_by());



        try {
            Assert.assertEquals(costingDbModel.getRef_number(),cosGetQuoteReqAllResponseModel.getData().get(0).getReferenceNumber());
            Assert.assertEquals(getReqby,cosGetQuoteReqAllResponseModel.getData().get(0).getRequestedById());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
