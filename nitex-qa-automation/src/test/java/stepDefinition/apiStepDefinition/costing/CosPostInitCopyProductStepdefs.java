package stepDefinition.apiStepDefinition.costing;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import repository.remoteRepo.responseRepo.costing.CostingPostCopyResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import static core.urlDefine.apiURL.base_url;

public class CosPostInitCopyProductStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;

    Response postCostApiResponse;
    String url;

    @Given("costing copy base api will be provided")
    public void costingCopyBaseApiWillBeProvided() {

        url = base_url;


    }

    @When("user will hit get copy api queryparameters {string} and {string} and {string} and {string}")
    public void userWillHitGetCopyApiQueryparametersQpAndQpAndQpAndQp(String arg0, String arg1, String arg2, String arg3) {

        url = url + arg0 + arg1 + arg2 + arg1 + arg3;

        System.out.println(url);

    }

    @And("user will get data according to the copy parameters")
    public void userWillGetDataAccordingToTheCopyParameters() throws NoSuchAlgorithmException, KeyManagementException {

        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),"",url);
        System.out.println(postCostApiResponse.body().asString());

    }

    @Then("user will get costing copy data data according to id")
    public void userWillGetCostingCopyDataDataAccordingToId() {

        CostingPostCopyResponseModel postCostingCopyResponseModel = gson.fromJson(postCostApiResponse.getBody().asString(), CostingPostCopyResponseModel.class);

        System.out.println("Fetch Data from APi response: " + postCostingCopyResponseModel.getMessage());



    }





}
