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
import repository.dbModel.designedit.DesignDbModel;
import repository.dbModel.query.DesignEdit.DesignQuery;
import repository.remoteRepo.requestRepo.designedit.DgnProDevComNewRequestModel;
import repository.remoteRepo.responseRepo.designedit.DgnProDevComNewResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import static core.Helper.FilePathHelper.dgnProDevComNew;
import static core.urlDefine.apiURL.base_url;

public class DgnProDevComNewStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;

    DgnProDevComNewRequestModel dgnProDevComNewRequestModel;

    Response postCostApiResponse;
    String url;
    public Integer xyz = 0;

    @Given("design product dev api will be provided")
    public void designProductDevApiWillBeProvided() {

        url = base_url;
    }

    @When("user will hit post product dev api {string} and {string} and {string} and {string}")
    public void userWillHitPostProductDevApiAndAndAnd(String arg0, String arg1, String arg2, String arg3) {
        url = url + arg0 + arg1 + arg2 + arg3;
    }

    @And("user will hit pro api with body {string} and {string} and {string}")
    public void userWillHitProApiWithBodyAndAnd(String arg0, String arg1, String arg2) {
        JSONObject requestBody = new FileReaderHelper().readJsonFile(dgnProDevComNew);
        dgnProDevComNewRequestModel = new Gson().fromJson(requestBody.toJSONString(), DgnProDevComNewRequestModel.class);

        int inCostingConvert = Integer.parseInt(arg1);
        dgnProDevComNewRequestModel.setText(arg0);
        dgnProDevComNewRequestModel.setArtBoardId(Integer.parseInt(arg1));
        dgnProDevComNewRequestModel.setPostPositionNo(Integer.parseInt(arg2));

        xyz = Integer.valueOf(arg1);
    }

    @And("user will also hit pro api with body {string} and {string} and {string} and {string}")
    public void userWillAlsoHitProApiWithBodyAndAndAnd(String arg0, String arg1, String arg2, String arg3) throws NoSuchAlgorithmException, KeyManagementException {

        dgnProDevComNewRequestModel.setProductId(arg0);
        dgnProDevComNewRequestModel.setPostType(arg1);
        dgnProDevComNewRequestModel.getRecipientList().get(0).setRecipientType(arg2);
        dgnProDevComNewRequestModel.getRecipientList().get(1).setRecipientType(arg3);
        requestCostModel = gson.toJson(dgnProDevComNewRequestModel);


        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
       // System.out.println(postCostApiResponse.body().asString());


    }

    @Then("this api will be verified with db")
    public void thisApiWillBeVerifiedWithDb() throws SQLException, ClassNotFoundException {

        DgnProDevComNewResponseModel dgnProDevComNewResponseModel = gson.fromJson(postCostApiResponse.getBody().asString(), DgnProDevComNewResponseModel.class);

        String a = dgnProDevComNewResponseModel.getMessage();
        String b = dgnProDevComNewResponseModel.getPayload().getRecipients().get(0).getRecipientType();
        String c = dgnProDevComNewResponseModel.getPayload().getRecipients().get(1).getRecipientType();
        String d = dgnProDevComNewResponseModel.getPayload().getArtBoardName();


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        DesignQuery designQuery = new DesignQuery();
        DesignDbModel designDbModel = designQuery.getProduct(xyz);

        System.out.println("Database Artboard: " + designDbModel.getArtBoardName());

        ///


        try {
            Assert.assertEquals(a,"Post added successfully");
            Assert.assertEquals(d,designDbModel.getArtBoardName());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
