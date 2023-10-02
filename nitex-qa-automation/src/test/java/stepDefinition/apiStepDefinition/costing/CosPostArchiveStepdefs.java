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
import repository.remoteRepo.responseRepo.costing.CostingArchiveResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import static core.urlDefine.apiURL.base_url;

public class CosPostArchiveStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;

    CostingAddRequestModel costingAddRequestModel = new CostingAddRequestModel();

    Response postCostApiResponse;
    String url;


    @Given("costing archive api will be provided")
    public void costingArchiveApiWillBeProvided() {
        url = base_url + "quote/";
    }

    @When("user will hit archive api {string} and {string}")
    public void userWillHitArchiveApiQpAndQp(String arg0, String arg1) {

        url = url + arg0 + arg1;

        System.out.println(url);
    }

    @And("user will get data according to the archive parameters")
    public void userWillGetDataAccordingToTheArchiveParameters() throws NoSuchAlgorithmException, KeyManagementException {
        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),"",url);
        System.out.println(postCostApiResponse.body().asString());
    }

    @Then("user will get archive data according to id data will be saved to db")
    public void userWillGetArchiveDataAccordingToIdDataWillBeSavedToDb() {

        CostingArchiveResponseModel costingArchiveResponseModel = gson.fromJson(postCostApiResponse.getBody().asString(), CostingArchiveResponseModel.class);

        System.out.println("Fetch Data from APi response: " + costingArchiveResponseModel.getMessage());


    }
}
