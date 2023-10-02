package stepDefinition.apiStepDefinition.costing;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import repository.remoteRepo.requestRepo.costing.CostingAddRequestModel;
import repository.remoteRepo.responseRepo.costing.CostingQtyWiseSendResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import static core.urlDefine.apiURL.base_url;

public class CosPostQtyWiseSendStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;

    CostingAddRequestModel costingAddRequestModel = new CostingAddRequestModel();

    Response postCostApiResponse;
    String url;

    @Given("costing qty wise api will be provided")
    public void costingQtyWiseApiWillBeProvided() {

        url = base_url;
    }

    @When("user will hit qty wise api {string} and {string} and {string}")
    public void userWillHitQtyWiseApiQpAndQpAndQp(String arg0, String arg1, String arg2) {

        url = url + arg0 + arg1 + arg2;

        System.out.println(url);

    }

    @And("user will get data according to the qty wise parameters")
    public void userWillGetDataAccordingToTheQtyWiseParameters() throws NoSuchAlgorithmException, KeyManagementException {
        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),"",url);
        System.out.println(postCostApiResponse.body().asString());
    }

    @Then("user will get costing variant data according to id data will be saved to db")
    public void userWillGetCostingVariantDataAccordingToIdDataWillBeSavedToDb() {

        CostingQtyWiseSendResponseModel costingQtyWiseSendResponseModel = gson.fromJson(postCostApiResponse.getBody().asString(), CostingQtyWiseSendResponseModel.class);

        System.out.println("Fetch Data from APi response: " + costingQtyWiseSendResponseModel.getMessage());


    }
}
