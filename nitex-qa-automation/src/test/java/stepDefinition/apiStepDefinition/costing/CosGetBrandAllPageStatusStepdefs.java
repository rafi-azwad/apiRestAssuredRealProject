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
import repository.remoteRepo.responseRepo.costing.CostingFetchResponseModel;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static core.urlDefine.apiURL.costing_run_url;

public class CosGetBrandAllPageStatusStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    //  CreateCollectionRequestModel createCollectionRequestModel;

    Response getApiResponse;
    String url;


    @Given("costing add cost brand all pages status api will be provided")
    public void costingAddCostBrandAllPagesStatusApiWillBeProvided() {

        url = costing_run_url + "brand" + "/all/" + "all-page";

    }

    @When("user will hit get costing api statusparam {string}")
    public void userWillHitGetCostingApiStatusparam(String arg0) {

        url = url + arg0;
        System.out.println(url);
    }

    @And("user will get data according to the costing brand status parameters")
    public void userWillGetDataAccordingToTheCostingBrandStatusParameters() {


        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
          System.out.println(getApiResponse.body().asString());

    }

    @Then("user will get costing brand all pageaccording to id")
    public void userWillGetCostingBrandAllPageaccordingToId() throws SQLException, ClassNotFoundException {

        CostingFetchResponseModel[] costingFetchResponseModel = gson.fromJson(getApiResponse.getBody().asString(), CostingFetchResponseModel[].class);

        List<CostingFetchResponseModel> costingFetchResponseModelList = Arrays.asList(costingFetchResponseModel);
        System.out.println("This is ID --- " + costingFetchResponseModelList.get(0).getId());
        System.out.println("This is Status --- " + costingFetchResponseModelList.get(0).getName());
        System.out.println("This is Description --- " + costingFetchResponseModelList.get(0).getStatus());


        int databaseID = costingFetchResponseModelList.get(0).getId();

        CostingQuery costingQuery = new CostingQuery();
        CostingDbModel costingDbModel = costingQuery.costingReq(databaseID);

        System.out.println("Database Brand Name: "+ costingDbModel.getName());

        Assert.assertEquals(costingDbModel.getName(),costingFetchResponseModelList.get(0).getName());


          /* for (CostingFetchResponseModel xx : costingFetchResponseModelList) {
            if (xx.getId() == 5652){
                System.out.println("Single ID " + ": " + xx.getId());

                System.out.println("ID: "+xx.getId()+ " Name: " + xx.getName());
                System.out.println("noOfChild: "+xx.getNoOfChild()+ " Status: " + costingFetchResponseModel[0].getStatus());

                break;  // Exit the loop once the desired index is found
            }*/


    }
}
