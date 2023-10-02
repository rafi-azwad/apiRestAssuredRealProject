package stepDefinition.apiStepDefinition.costing;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import repository.remoteRepo.responseRepo.costing.CosGetInitialCosDesignCountResponseModle;

import static core.urlDefine.apiURL.costing_run_url;

public class CosGetInitialCosDesignCountStepdefs { // DB Mapping not done

    private Gson gson = new Gson();
    private String requestModel;


    Response getApiResponse;
    String url;


    @Given("costing initial collection design api will be provided")
    public void costingInitialCollectionDesignApiWillBeProvided() {

        url = costing_run_url + "initial-costing/design-count?page=0&size=15&status=REQUESTED";

    }

    @When("user will hit init design api {string} and {string} and {string}")
    public void userWillHitInitDesignApiAndAnd(String arg0, String arg1, String arg2) {


        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
          System.out.println(getApiResponse.body().asString());

    }

    @Then("user will get initial collection design according to id will be saved to db")
    public void userWillGetInitialCollectionDesignAccordingToIdWillBeSavedToDb() {

        CosGetInitialCosDesignCountResponseModle cosGetInitialCosDesignCountResponseModle = gson.fromJson(getApiResponse.getBody().asString(), CosGetInitialCosDesignCountResponseModle.class);

        System.out.println("This is noOfDesign --- " + cosGetInitialCosDesignCountResponseModle.getNoOfDesign());
        System.out.println("This is quotedCount --- " + cosGetInitialCosDesignCountResponseModle.getQuotedCount());

    }
}
