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
import repository.remoteRepo.requestRepo.costing.CostingProcessAllRequestModel;
import repository.remoteRepo.responseRepo.costing.CostingProcessAllResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import static core.Helper.FilePathHelper.costingAllProcess;
import static core.urlDefine.apiURL.base_url;

public class CosPostProcessCostStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;

    CostingProcessAllRequestModel costingProcessAllRequestModel;

    Response postCostApiResponse;
    String url;

    @Given("costing process all base api will be provided")
    public void costingProcessAllBaseApiWillBeProvided() {

        url = base_url;
        
    }

    @When("user will hit get add api queryparameters {string} and {string}")
    public void userWillHitGetAddApiQueryparametersQpAndQp(String arg0, String arg1) {

        url = url + arg0 + arg1;

        System.out.println(url);

    }


    @And("user will pass api body parameters for process api {string} and {string}")
    public void userWillPassApiBodyParametersForProcessApiQpAndQp(String arg3, String arg4) {


        JSONObject requestBody = new FileReaderHelper().readJsonFile(costingAllProcess);
        costingProcessAllRequestModel = new Gson().fromJson(requestBody.toJSONString(), CostingProcessAllRequestModel.class);

        int inCostingConvert = Integer.parseInt(arg4);

        costingProcessAllRequestModel.setAllCostsAsString(arg3);
        costingProcessAllRequestModel.setInitialCostingId(inCostingConvert);

        requestCostModel = gson.toJson(costingProcessAllRequestModel);

    }

    @And("user will get data according to the process from all cost api")
    public void userWillGetDataAccordingToTheProcessFromAllCostApi() throws NoSuchAlgorithmException, KeyManagementException {
        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postCostApiResponse.body().asString());
    }

    @Then("user will get process data according to id and data will be validated")
    public void userWillGetProcessDataAccordingToIdAndDataWillBeValidated() throws SQLException, ClassNotFoundException {

        CostingProcessAllResponseModel costingProcessAllResponseModel = gson.fromJson(postCostApiResponse.getBody().asString(), CostingProcessAllResponseModel.class);
        String remarks = costingProcessAllResponseModel.getPayload().getRemarks();
        int id = costingProcessAllResponseModel.getPayload().getId();

        System.out.println("Api Response Remarks: " + remarks);

        CostingQuery costingQuery = new CostingQuery();
        CostingDbModel costingDbModel = costingQuery.costingProcessAllCost(id);

        System.out.println("From DB: " +  costingDbModel.getRemarks());

        try {
            Assert.assertEquals(costingDbModel.getRemarks(),remarks);

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");



    }


}
