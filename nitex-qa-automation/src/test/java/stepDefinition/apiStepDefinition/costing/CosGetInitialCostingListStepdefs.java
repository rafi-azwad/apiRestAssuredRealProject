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
import repository.remoteRepo.responseRepo.costing.CosGetInitialCostingListResponseModel;

import java.sql.SQLException;

import static core.urlDefine.apiURL.costing_run_url;

public class CosGetInitialCostingListStepdefs {

    private Gson gson = new Gson();
    private String requestModel;


    Response getApiResponse;
    String url;

    @Given("costing add cost list api will be provided")
    public void costingAddCostListApiWillBeProvided() {
        url = costing_run_url + "initial-costing/all?page=0&size=15&status=REQUESTED";

    }

    @When("user will hit initial costing list api all {string}")
    public void userWillHitInitialCostingListApiAll(String arg0) {
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @And("user will get data according to the initialcosting list")
    public void userWillGetDataAccordingToTheInitialcostingList() throws SQLException, ClassNotFoundException {


        CosGetInitialCostingListResponseModel cosGetInitialCosDesignCountResponseModle = gson.fromJson(getApiResponse.getBody().asString(), CosGetInitialCostingListResponseModel.class);

        System.out.println("This is Name --- " + cosGetInitialCosDesignCountResponseModle.getData().get(0).getName());
        System.out.println("This is Owner Name --- " + cosGetInitialCosDesignCountResponseModle.getData().get(0).getOwnerName());

        int databaseID = cosGetInitialCosDesignCountResponseModle.getData().get(0).getId();

        CollectionQuery collectionQuery = new CollectionQuery();
        CollectionDbModel collectionDbModel = collectionQuery.getCollectionTableInfo(databaseID);


        System.out.println("Database TechPackName: "+ collectionDbModel.getName());
        System.out.println("Database OwnerName: "+ collectionDbModel.getOwnerName());


        ////////////////////////
        try {
            Assert.assertEquals(collectionDbModel.getName(),cosGetInitialCosDesignCountResponseModle.getData().get(0).getName());
            Assert.assertEquals(collectionDbModel.getOwnerName(),cosGetInitialCosDesignCountResponseModle.getData().get(0).getOwnerName());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");


    }

    @Then("user will get costing list as id")
    public void userWillGetCostingListAsId() {


    }
}
