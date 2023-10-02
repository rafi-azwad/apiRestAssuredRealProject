package stepDefinition.apiStepDefinition.collection;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.FileReaderHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import repository.remoteRepo.requestRepo.collection.CollectionDeleteRequestModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import static core.Helper.FilePathHelper.*;
import static core.Helper.FilePathHelper.collectionDelete;
import static core.urlDefine.apiURL.collection_base_url;

public class CollectionDeleteStepdefs {


    private Gson gson = new Gson();
    private String requestModel;

    Response deleteApiResponse;
    String url;
    String name;

    CollectionDeleteRequestModel collectionDeleteRequestModel;


    @Given("base api will be provided for delete")
    public void baseApiWillBeProvidedForDelete() {
        url =  collection_base_url+"delete";
    }

    @When("user will hit delete api with {string}")
    public void userWillHitDeleteApiWith(String arg0) throws NoSuchAlgorithmException, KeyManagementException {


        JSONObject requestBody = new FileReaderHelper().readJsonFile(collectionDelete);
        collectionDeleteRequestModel = new Gson().fromJson(requestBody.toJSONString(), CollectionDeleteRequestModel.class);

        String collection_id = null;
        FileReaderHelper fileReaderHelper= new  FileReaderHelper();
        if(fileReaderHelper.readFile(idReaderPath) !=null) {
            collection_id = fileReaderHelper.readFile(idReaderPath);

        }
        else {
            System.out.println("no id found in collect text file........please trigger create api");
        }

        collectionDeleteRequestModel.setId(Integer.parseInt(collection_id));

        requestModel = gson.toJson(collectionDeleteRequestModel);

        deleteApiResponse = ApiCallHelper.deleteCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestModel,url);
        System.out.println(deleteApiResponse.body().asString());
    }

    @Then("user will delete collection according to id")
    public void userWillDeleteCollectionAccordingToId() {


        try {
            Assert.assertEquals(deleteApiResponse.statusCode(),200);

        } catch (AssertionError e) {
            System.out.println("Not Deleted");
            throw e;
        }
        System.out.println("Deleted");
    }
}
