package stepDefinition.apiStepDefinition.collection;

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
import repository.remoteRepo.requestRepo.collection.CollectionPostPersonalSetRequestModel;
import repository.remoteRepo.responseRepo.collection.CollectionPostPersonalSetResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import static core.Helper.FilePathHelper.collectionPostPersonalSet;
import static core.urlDefine.apiURL.base_url;

public class CollectionPostPersonalSetStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;
    Response postCostApiResponse;
    String url;

    CollectionPostPersonalSetRequestModel collectionPostPersonalSetRequestModel;


    @Given("base personal setting set url will be provided")
    public void basePersonalSettingSetUrlWillBeProvided() {
        url = base_url;
    }

    @When("user will input base endPoint {string}, {string}")
    public void userWillInputBaseEndPoint(String arg0, String arg1) {
        url = url + arg0 + arg1;
    }

    @And("user will input body {string} , {string}")
    public void userWillInputBody(String arg0, String arg1) throws NoSuchAlgorithmException, KeyManagementException {

        JSONObject requestBody = new FileReaderHelper().readJsonFile(collectionPostPersonalSet);
        collectionPostPersonalSetRequestModel = new Gson().fromJson(requestBody.toJSONString(), CollectionPostPersonalSetRequestModel.class);
        collectionPostPersonalSetRequestModel.setKey(arg0);
        collectionPostPersonalSetRequestModel.setValue(arg1);

        requestCostModel = gson.toJson(collectionPostPersonalSetRequestModel);

        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postCostApiResponse.body().asString());

    }

    @Then("personal setting set and saved in db")
    public void personalSettingSetAndSavedInDb() {

        CollectionPostPersonalSetResponseModel collectionPostPersonalSetResponseModel = gson.fromJson(postCostApiResponse.getBody().asString(), CollectionPostPersonalSetResponseModel.class);
        int collection_id = collectionPostPersonalSetResponseModel.getId();
        String msg = collectionPostPersonalSetResponseModel.getMessage();
        boolean isStatus = collectionPostPersonalSetResponseModel.isSuccess();


        try {

            Assert.assertEquals(msg,"Personal setting added successfully");
            Assert.assertEquals(isStatus,true);


        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }
}
