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
import org.json.JSONArray;
import org.testng.Assert;
import repository.remoteRepo.requestRepo.collection.CollectionPostBulkReqRequestModel;
import repository.remoteRepo.responseRepo.collection.CollectionPostBulkReqResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

import static core.Helper.FilePathHelper.*;
import static core.urlDefine.apiURL.base_url;

public class CollectionPostBulkReqStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;
    Response postCostApiResponse;
    String url;

    public static String message;
    public static boolean status;

   // CollectionPostBulkReqRequestModel collectionPostBulkReqRequestModel;

    @Given("collection post bulk req url will be given")
    public void collectionPostBulkReqUrlWillBeGiven() {
        url = base_url;
    }

    @When("collection will post bulk req api url endpoints {string}, {string}, {string}")
    public void collectionWillPostBulkReqApiUrlEndpoints(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;
    }

    @And("user will provide {string} and {string} as body parameters")
    public void userWillProvideAndAsBodyParameters(String arg0, String arg1) throws NoSuchAlgorithmException, KeyManagementException {

        JSONArray requestBody = new FileReaderHelper().readJsonArray(collectionPostBulkReq);
        System.out.println("Let's Print JSON ARRAY======>>> " + requestBody);
        CollectionPostBulkReqRequestModel[] collectionPostBulkReqRequestModel = new Gson().fromJson(requestBody.toString(), CollectionPostBulkReqRequestModel[].class);

        List<CollectionPostBulkReqRequestModel> collList = Arrays.asList(collectionPostBulkReqRequestModel);

        collList.get(0).setProductId(Integer.parseInt(arg0));
        collList.get(0).setRequiredDate(arg1);

        requestCostModel = gson.toJson(collList);

        System.out.println("=============================>" + requestCostModel);

        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postCostApiResponse.body().asString());
    }

    @Then("post bulk req data will be fetched and verified with db")
    public void postBulkReqDataWillBeFetchedAndVerifiedWithDb() {

        CollectionPostBulkReqResponseModel collectionPostBulkReqResponseModel = gson.fromJson(postCostApiResponse.getBody().asString(), CollectionPostBulkReqResponseModel.class);

        String msg = collectionPostBulkReqResponseModel.getMessage();
        boolean status = collectionPostBulkReqResponseModel.isSuccess();

        try {

            Assert.assertEquals(msg,"Costing request sent successfully");
            Assert.assertEquals(status,true);


        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }
}
