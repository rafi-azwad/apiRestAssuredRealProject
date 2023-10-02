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
import repository.remoteRepo.requestRepo.designedit.DgnPresentationLinkRequestModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;

import static core.Helper.FilePathHelper.dgnPresentationLink;
import static core.urlDefine.apiURL.base_url;

public class DgnDownloadLinkStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;

    DgnPresentationLinkRequestModel dgnPresentationLinkRequestModel;
    Response postCostApiResponse;
    String url;

    @Given("design download link api will be provided")
    public void designDownloadLinkApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit post download api {string} and {string} and {string}")
    public void userWillHitPostDownloadApiAndAnd(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;
        System.out.println(url);
    }

    @And("user will hit download api with body {string} and {string} and {string}")
    public void userWillHitDownloadApiWithBodyAndAnd(String arg0, String arg1, String arg2) throws NoSuchAlgorithmException, KeyManagementException {

        JSONObject requestBody = new FileReaderHelper().readJsonFile(dgnPresentationLink);
        dgnPresentationLinkRequestModel = new Gson().fromJson(requestBody.toJSONString(), DgnPresentationLinkRequestModel.class);

        int inCostingConvert = Integer.parseInt(arg2);

        dgnPresentationLinkRequestModel.setCollectionId(arg0);
        dgnPresentationLinkRequestModel.setPresentationTemplate(arg1);
        dgnPresentationLinkRequestModel.setProductIdList(Collections.singletonList(inCostingConvert));

        requestCostModel = gson.toJson(dgnPresentationLinkRequestModel);

        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postCostApiResponse.body().asString());
    }

    @Then("download will be verified")
    public void downloadWillBeVerified() {

        try {
            Assert.assertEquals(postCostApiResponse.statusCode(),200);

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }
}
