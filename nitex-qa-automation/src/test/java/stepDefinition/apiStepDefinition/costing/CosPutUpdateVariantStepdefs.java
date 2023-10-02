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
import repository.remoteRepo.requestRepo.costing.CostingPutUpdateRequestModel;
import repository.remoteRepo.responseRepo.costing.CosPutUpdateVariantResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import static core.Helper.FilePathHelper.costingPutUpdateVariant;
import static core.urlDefine.apiURL.base_url;

public class CosPutUpdateVariantStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;
    CostingPutUpdateRequestModel costingPutUpdateRequestModel;

    Response postCostApiResponse;
    String url;

    public String xyz;

    public int inCostingConvertt;

    @Given("costing base put api url will be given")
    public void costingBasePutApiUrlWillBeGiven() {
        url = base_url + "quote/";
    }

    @When("user will pass {string} and {string} and {string} and {string}")
    public void userWillPassAndAndAnd(String arg0, String arg1, String itemId, String variant) {

        //CostingPutUpdateRequestModel

        url = url + arg0 + arg1;

        JSONObject requestBody = new FileReaderHelper().readJsonFile(costingPutUpdateVariant);
        costingPutUpdateRequestModel = new Gson().fromJson(requestBody.toJSONString(), CostingPutUpdateRequestModel.class);

        xyz = variant;
         inCostingConvertt = Integer.parseInt(itemId);
        costingPutUpdateRequestModel.setItemId(inCostingConvertt);
        costingPutUpdateRequestModel.setVariant(variant);

        requestCostModel = gson.toJson(costingPutUpdateRequestModel);



    }

    @And("user will call the costing put api")
    public void userWillCallTheCostingPutApi() throws NoSuchAlgorithmException, KeyManagementException {

        postCostApiResponse = ApiCallHelper.putCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postCostApiResponse.body().asString());

    }

    @Then("costing variant will be updated and saved in db")
    public void costingVariantWillBeUpdatedAndSavedInDb() throws SQLException, ClassNotFoundException {

        CosPutUpdateVariantResponseModel cosPutUpdateVariantResponseModel = gson.fromJson(postCostApiResponse.getBody().asString(), CosPutUpdateVariantResponseModel.class);
        String  message = cosPutUpdateVariantResponseModel.getMessage();
        Boolean  success = cosPutUpdateVariantResponseModel.isSuccess();

        System.out.println("Message: " + message);
        System.out.println("Success: " + success);


        System.out.println(" ------------>" + inCostingConvertt);

        //Assert.assertEquals(api_payload_id,payload_id);
        CostingQuery costingQuery = new CostingQuery();
        CostingDbModel costingDbModel = costingQuery.costingQuoteItem(inCostingConvertt);


        System.out.println("Database variant: " + costingDbModel.getVariation());


        try {
            Assert.assertEquals(costingDbModel.getVariation(),xyz);

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal  test");




    }
}
