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
import repository.remoteRepo.responseRepo.costing.CostingAddVariantResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import static core.urlDefine.apiURL.base_url;

public class CosPostAddVariantStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;

    Response postCostApiResponse;
    String url;

    @Given("costing add variant base api will be provided")
    public void costingAddVariantBaseApiWillBeProvided() {

        url = base_url;

    }

    @When("user will hit get add api queryparameters {string} and {string} and {string} and {string}")
    public void userWillHitGetAddApiQueryparametersQpAndQpAndQpAndQp(String arg0, String arg1, String arg2, String arg3) {

        url = url + arg0 + arg1 + arg2 + arg1 + arg3;

        System.out.println(url);
    }

    @And("user will get data according to the addv parameters")
    public void userWillGetDataAccordingToTheAddvParameters() throws NoSuchAlgorithmException, KeyManagementException {

        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),"",url);
        System.out.println(postCostApiResponse.body().asString());

    }

    @Then("user will get costing add variant data according to id")
    public void userWillGetCostingAddVariantDataAccordingToId() throws SQLException, ClassNotFoundException {


        CostingAddVariantResponseModel costingAddVariantResponseModel = gson.fromJson(postCostApiResponse.getBody().asString(), CostingAddVariantResponseModel.class);

        System.out.println("Fetch Data from APi response: " + costingAddVariantResponseModel.getPayload().getProductId());

        int api_product_id = costingAddVariantResponseModel.getPayload().getProductId();
        String api_ref_no = costingAddVariantResponseModel.getPayload().getProductRefNo();

        CostingQuery costingQuery = new CostingQuery();

        CostingDbModel costingDbModel = costingQuery.costingAddVariant(api_product_id);

        System.out.println("Database Output: " + costingDbModel.getRef_number());
        System.out.println("APi Output: " + costingAddVariantResponseModel.getPayload().getProductRefNo());

        try {
            Assert.assertEquals(costingDbModel.getRef_number(),costingAddVariantResponseModel.getPayload().getProductRefNo());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");



    }
}
