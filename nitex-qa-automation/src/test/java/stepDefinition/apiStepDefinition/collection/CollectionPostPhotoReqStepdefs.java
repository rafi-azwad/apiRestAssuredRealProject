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
import repository.remoteRepo.requestRepo.collection.CollectionPostPhotoReqRequestModel;
import repository.remoteRepo.responseRepo.collection.CollectionPostBulkReqResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

import static core.Helper.FilePathHelper.collectionPostPhotoReq;
import static core.urlDefine.apiURL.base_url;

public class CollectionPostPhotoReqStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;
    Response postCostApiResponse;
    String url;



    @Given("collection post photo req url will be given")
    public void collectionPostPhotoReqUrlWillBeGiven() {
        url = base_url;
    }

    @When("collection will post photo req api url endpoints {string}, {string}")
    public void collectionWillPostPhotoReqApiUrlEndpoints(String arg0, String arg1) {
        url = url + arg0 + arg1;
    }

    @And("collection will also post body with {string}, {string}")
    public void collectionWillAlsoPostBodyWith(String arg0, String arg1) throws NoSuchAlgorithmException, KeyManagementException {

        JSONArray requestBody = new FileReaderHelper().readJsonArray(collectionPostPhotoReq);

        CollectionPostPhotoReqRequestModel[] collectionPostPhotoReqRequestModel = new Gson().fromJson(requestBody.toString(), CollectionPostPhotoReqRequestModel[].class);


        List<CollectionPostPhotoReqRequestModel> collList = Arrays.asList(collectionPostPhotoReqRequestModel);

        collList.get(0).setProductId(Integer.parseInt(arg0));
        collList.get(0).setRequiredDate(arg1);

        requestCostModel = gson.toJson(collList);

        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postCostApiResponse.body().asString());

    }

    @Then("post photo req data will be fetched and verified with db")
    public void postPhotoReqDataWillBeFetchedAndVerifiedWithDb() {

        CollectionPostBulkReqResponseModel collectionPostBulkReqResponseModel = gson.fromJson(postCostApiResponse.getBody().asString(), CollectionPostBulkReqResponseModel.class);

        String msg = collectionPostBulkReqResponseModel.getMessage();
        boolean status = collectionPostBulkReqResponseModel.isSuccess();

        try {

            Assert.assertEquals(msg,"Request sent successfully");
            Assert.assertEquals(status,true);


        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }
}
