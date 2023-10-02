package stepDefinition.apiStepDefinition.costing;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.FileReaderHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import repository.dbModel.costing.CostingDbModel;
import repository.dbModel.query.Costing.CostingQuery;
import repository.remoteRepo.requestRepo.costing.CostingAddRequestModel;
import repository.remoteRepo.responseRepo.costing.CostingAddResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import static core.Helper.FilePathHelper.costingAdd;
import static core.urlDefine.apiURL.base_url;

public class CosPostInitialCostingAddStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;

    CostingAddRequestModel costingAddRequestModel = new CostingAddRequestModel();

    Response postCostApiResponse;
    String url;

    @Given("costing add cost base api will be provided")
    public void costingAddCostBaseApiWillBeProvided() {
        url = base_url + "initial-costing/" ;
    }

    @When("user will hit get costing api queryparameters {string}")
    public void userWillHitGetCostingApiQueryparametersQp(String add) {

        url = url + add;

        System.out.println(url);

    }

    @And("user will get data according to the costing parameters")
    public void userWillGetDataAccordingToTheCostingParameters() throws NoSuchAlgorithmException, KeyManagementException {

        JSONObject requestBody = new FileReaderHelper().readJsonFile(costingAdd);
        costingAddRequestModel = new Gson().fromJson(requestBody.toJSONString(), CostingAddRequestModel.class);

    }

    @And("user will pass body parameters {string} and {string} and {string} and {string} and {string} and {string}")
    public void userWillPassBodyParametersIdAndFabricUnitCostAndTotalCostAndMoqAndBaseSizeAndInitialCostingId
            (String idd, String fabricUnitCost, String totalCost, String moq, String baseSize, String initialCostingId) throws NoSuchAlgorithmException, KeyManagementException {


        costingAddRequestModel.setId(Long.valueOf(idd));
        costingAddRequestModel.setFabricUnitCost(Double.valueOf(fabricUnitCost));
        costingAddRequestModel.setTotalCost(Double.valueOf(totalCost));
        costingAddRequestModel.setMoq(Integer.valueOf(moq));
        costingAddRequestModel.setBaseSize(baseSize);
        costingAddRequestModel.setInitialCostingId(Long.valueOf(initialCostingId));


        requestCostModel = gson.toJson(costingAddRequestModel);
        System.out.println("this is request model: >>>>" + requestCostModel);
    }

    @And("user will get costing variant data according to id")
    public void userWillGetCostingVariantDataAccordingToId() throws NoSuchAlgorithmException, KeyManagementException {

        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postCostApiResponse.body().asString());

    }

    @Then("data will be saved to db")
    public void dataWillBeSavedToDb() throws SQLException, ClassNotFoundException {


        CostingAddResponseModel costingAddResponseModel = gson.fromJson(postCostApiResponse.getBody().asString(), CostingAddResponseModel.class);
        int payload_id = costingAddResponseModel.getPayload().getId();

        System.out.println("TEST PAYLOAD ID: " + payload_id);

        CostingQuery costingQuery = new CostingQuery();
        CostingDbModel costingDbModel = costingQuery.costingAdd(payload_id);

        System.out.println("TEST Fabric Cost Unit: " + costingAddResponseModel.getPayload().getMoq());

        System.out.println("Database Output: " + costingDbModel.getMoq());


        try {
            Assert.assertEquals(costingDbModel.getMoq(), costingAddResponseModel.getPayload().getMoq());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }
}

