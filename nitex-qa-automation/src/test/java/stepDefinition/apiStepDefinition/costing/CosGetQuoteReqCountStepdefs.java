package stepDefinition.apiStepDefinition.costing;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static core.urlDefine.apiURL.costing_run_url;

public class CosGetQuoteReqCountStepdefs { /////// DB Mapping Not Done Yet


    private Gson gson = new Gson();
    private String requestModel;


    Response getApiResponse;
    String url;

    @Given("costing add cost quote Req count api will be provided")
    public void costingAddCostQuoteReqCountApiWillBeProvided() {

        url = costing_run_url + "quote/" + "request/count?page=0&size=15&status=PENDING,RUNNING";
    }

    @When("user will hit get costing quote Req count api all {string}")
    public void userWillHitGetCostingQuoteReqCountApiAll(String arg0) {

        System.out.println(url);
    }

    @And("user will get data according to the quote Req count")
    public void userWillGetDataAccordingToTheQuoteReqCount() {

        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @Then("user will get costing quote Req count as id")
    public void userWillGetCostingQuoteReqCountAsId() {
    }
}
