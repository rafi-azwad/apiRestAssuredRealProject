package stepDefinition.apiStepDefinition.costing;

import com.fasterxml.jackson.core.JsonProcessingException;
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
import repository.remoteRepo.requestRepo.costing.PostCostingRmksRequestModel;
import repository.remoteRepo.responseRepo.costing.CostingPostRemarksUpdateReponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import static core.Helper.FilePathHelper.costingRemarksUpdateJsonPath;
import static core.urlDefine.apiURL.base_url;

public class CosPostUpdateRemarksStepDefs {

    private Gson gson = new Gson();
    private String requestCostModel;
    PostCostingRmksRequestModel postCostingRmksRequestModel;

    Response postCostApiResponse;
    String url;

    @Given("costing base api url will be given")
    public void costingBaseApiUrlWillBeGiven() {

        url = base_url + "initial-costing" + "/update-remarks";

    }

    @When("user will pass {string} and {string}")
    public void userWillPassRemarksAndInitalcost(String remarks, String inCosting) {


        JSONObject requestBody = new FileReaderHelper().readJsonFile(costingRemarksUpdateJsonPath);
        postCostingRmksRequestModel = new Gson().fromJson(requestBody.toJSONString(), PostCostingRmksRequestModel.class);

        int inCostingConvert = Integer.parseInt(inCosting);
        postCostingRmksRequestModel.setRemarks(remarks);
        postCostingRmksRequestModel.setInitialCostingId(inCostingConvert);

        requestCostModel = gson.toJson(postCostingRmksRequestModel);
    }

    @And("user will call the costing update api")
    public void userWillCallTheCostingUpdateApi() throws NoSuchAlgorithmException, KeyManagementException, JsonProcessingException {



        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
       System.out.println(postCostApiResponse.body().asString());


    }

    @Then("costing remarks will be updated and saved in db")
    public void costingRemarksWillBeUpdatedAndSavedInDb() throws SQLException, ClassNotFoundException {

        CostingPostRemarksUpdateReponseModel costingPostRemarksUpdateReponseModel = gson.fromJson(postCostApiResponse.getBody().asString(), CostingPostRemarksUpdateReponseModel.class);
        int payload_id = costingPostRemarksUpdateReponseModel.getPayload().getId();

        System.out.println("TEST PAYLOAD ID: " + payload_id);
       // CostingPostRemarksUpdateReponseModel.PayloadBean actualPayload = costingPostRemarksUpdateReponseModel.getPayload();
       // System.out.println(Assert.assertEquals(actualPayload.getId(),payload_id));
        int api_payload_id = costingPostRemarksUpdateReponseModel.getPayload().getId();

        //Assert.assertEquals(api_payload_id,payload_id);
        CostingQuery costingQuery = new CostingQuery();
        CostingDbModel costingDbModel = costingQuery.costingRemarks(payload_id);


        System.out.println("Database Output: " + costingDbModel.getRemarks());


     //   Assert.assertEquals(costingDbModel.getRemarks(),costingPostRemarksUpdateReponseModel.getPayload().getRemarks());


        try {
            Assert.assertEquals(costingDbModel.getRemarks(),costingPostRemarksUpdateReponseModel.getPayload().getRemarks());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal  test");



    }


}
