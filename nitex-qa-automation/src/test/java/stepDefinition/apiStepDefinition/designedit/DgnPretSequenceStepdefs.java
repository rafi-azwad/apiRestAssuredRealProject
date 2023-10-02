package stepDefinition.apiStepDefinition.designedit;

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
import repository.remoteRepo.requestRepo.designedit.DgnPretSequenceRequestModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;

import static core.Helper.FilePathHelper.dgnSequence;
import static core.urlDefine.apiURL.base_url;

public class DgnPretSequenceStepdefs {


    private Gson gson = new Gson();
    private String requestCostModel;

    DgnPretSequenceRequestModel dgnPretSequenceRequestModel;
    Response postCostApiResponse;
    String url;


    @Given("design sequence link api will be provided")
    public void designSequenceLinkApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit post sequence api {string} and {string} and {string}")
    public void userWillHitPostSequenceApiAndAnd(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;
        System.out.println(url);
    }

    @And("user will hit sequence api with body {string} and {string} and {string}")
    public void userWillHitSequenceApiWithBodyAndAnd(String arg0, String arg1, String arg2) throws NoSuchAlgorithmException, KeyManagementException {

        JSONObject requestBody = new FileReaderHelper().readJsonFile(dgnSequence);
        dgnPretSequenceRequestModel = new Gson().fromJson(requestBody.toJSONString(), DgnPretSequenceRequestModel.class);

        int inCostingConvert1 = Integer.parseInt(arg1);
        int inCostingConvert2 = Integer.parseInt(arg2);

        dgnPretSequenceRequestModel.setCollectionId(arg0);

        dgnPretSequenceRequestModel.setOrderedProductIds(Collections.singletonList(arg1));

        //dgnPretSequenceRequestModel.setOrderedProductIds(Collections.singletonList(String.valueOf(inCostingConvert1)));

        requestCostModel = gson.toJson(dgnPretSequenceRequestModel);

        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postCostApiResponse.body().asString());


    }

    @Then("sequence will be verified")
    public void sequenceWillBeVerified() {


        try {
            Assert.assertEquals(postCostApiResponse.statusCode(),200);

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }
}
