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
import repository.remoteRepo.responseRepo.costing.CosGetBrandAllPageResponseModel;

import java.sql.SQLException;

import static core.urlDefine.apiURL.costing_run_url;

public class CosGetBrandAllPageStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    //  CreateCollectionRequestModel createCollectionRequestModel;

    Response getApiResponse;
    String url;

    @Given("costing add cost brand all pages api will be provided")
    public void costingAddCostBrandAllPagesApiWillBeProvided() {
        url = costing_run_url + "brand" + "/all?" + "page";
    }

    @When("user will hit get costing api all {string}")
    public void userWillHitGetCostingApiAll(String arg0) {

        url = url + arg0;
        System.out.println(url);
    }

    @And("user will get data according to the costing brand parameters")
    public void userWillGetDataAccordingToTheCostingBrandParameters() {

        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @Then("user will get costing brand all pagedata as id")
    public void userWillGetCostingBrandAllPagedataAsId() throws SQLException, ClassNotFoundException {

        CosGetBrandAllPageResponseModel cosGetBrandAllPageResponseModel = gson.fromJson(getApiResponse.getBody().asString(), CosGetBrandAllPageResponseModel.class);

        System.out.println("This is ID --- " + cosGetBrandAllPageResponseModel.getData().get(0).getId());
        System.out.println("This is Name --- " + cosGetBrandAllPageResponseModel.getData().get(0).getName());
        System.out.println("This is Status --- " + cosGetBrandAllPageResponseModel.getData().get(0).getStatus());



        int databaseID = cosGetBrandAllPageResponseModel.getData().get(0).getId();

        CostingQuery costingQuery = new CostingQuery();
        CostingDbModel costingDbModel = costingQuery.costingReq(databaseID);

        System.out.println("Database Brand Name: "+ costingDbModel.getName());


        try {
            Assert.assertEquals(costingDbModel.getName(),cosGetBrandAllPageResponseModel.getData().get(0).getName());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
