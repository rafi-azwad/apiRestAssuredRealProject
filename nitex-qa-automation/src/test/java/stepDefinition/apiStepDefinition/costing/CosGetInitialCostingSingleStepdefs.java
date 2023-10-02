package stepDefinition.apiStepDefinition.costing;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import repository.dbModel.costing.CostingDbModel;
import repository.dbModel.query.Costing.CostingQuery;
import repository.remoteRepo.responseRepo.costing.Costing_Init_Collection_ResponseModel;

import java.sql.SQLException;

import static core.urlDefine.apiURL.costing_run_url;

public class CosGetInitialCostingSingleStepdefs {


    private Gson gson = new Gson();
    private String requestModel;
    //  CreateCollectionRequestModel createCollectionRequestModel;

    Response getApiResponse;
    String url;

    @Given("costing initial collection api will be provided")
    public void costingInitialCollectionApiWillBeProvided() {
        url = costing_run_url;

    }

    @When("user will hit init api {string} and {string} and {string}")
    public void userWillHitInitApiQAndQAndQ(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;
        //System.out.println(url);

        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);

       // System.out.println(getApiResponse.body().asString());

    }

    @Then("user will get initial collection data according to id data will be saved to db")
    public void userWillGetInitialCollectionDataAccordingToIdDataWillBeSavedToDb() throws SQLException, ClassNotFoundException {

        Costing_Init_Collection_ResponseModel costingInitCollectionResponseModels = gson.fromJson(getApiResponse.getBody().asString(), Costing_Init_Collection_ResponseModel.class);

        System.out.println("Initial Cost ID : " + costingInitCollectionResponseModels.getData().get(0).getId());
        System.out.println("Initial Cost Name : " +  costingInitCollectionResponseModels.getData().get(0).getName());
        System.out.println("Initial Cost Details : " + costingInitCollectionResponseModels.getData().get(0).getFabricDetails());

        int databaseID = costingInitCollectionResponseModels.getData().get(0).getId();

        CostingQuery costingQuery = new CostingQuery();
        CostingDbModel costingDbModel = costingQuery.costing_Init_Collection(databaseID);


        System.out.println("Database Brand Name: "+ costingDbModel.getName());
        System.out.println("Database Brand Ref: "+ costingDbModel.getRef_number());


        try {
            Assert.assertEquals(costingDbModel.getName(), costingInitCollectionResponseModels.getData().get(0).getName());
            Assert.assertEquals(costingDbModel.getRef_number(), costingInitCollectionResponseModels.getData().get(0).getReferenceNumber());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }


    }
