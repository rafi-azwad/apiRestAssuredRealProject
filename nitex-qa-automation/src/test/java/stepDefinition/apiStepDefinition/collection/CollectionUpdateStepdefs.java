package stepDefinition.apiStepDefinition.collection;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.FileReaderHelper;
import core.Helper.HeaderFormatHelper;
import core.Helper.RandomStringHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import repository.dbModel.collection.CollectionDbModel;
import repository.dbModel.query.Collection.CollectionQuery;
import repository.remoteRepo.requestRepo.collection.CreateCollectionRequestModel;
import repository.remoteRepo.requestRepo.collection.UpdateCollectionRequestModel;
import repository.remoteRepo.responseRepo.collection.UpdateCollectionResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import static core.Helper.FilePathHelper.collectionUpdateJsonPath;
import static core.Helper.FilePathHelper.idReaderPath;
import static core.urlDefine.apiURL.collection_base_url;

public class CollectionUpdateStepdefs {
    private Gson gson = new Gson();
    private String requestModel;
    CreateCollectionRequestModel createCollectionRequestModel;
    UpdateCollectionRequestModel updateCollectionRequestModel;

    Response updateApiResponse;
    String url;
    String name;
    @Given("base api url will be given")
    public void baseApiUrlWillBeGiven() {
        url =  collection_base_url+"update";
        
    }

    @When("user will pass collection_id through {string}")
    public void userWillPassCollection_idThroughId(String id) throws NoSuchAlgorithmException, KeyManagementException {
        RandomStringHelper rdm = new RandomStringHelper();
        String collection_id = null;
        JSONObject requestBody = new FileReaderHelper().readJsonFile(collectionUpdateJsonPath);
        updateCollectionRequestModel = new Gson().fromJson(requestBody.toJSONString(),UpdateCollectionRequestModel.class);
        name = "sample automation update collection "+ rdm.generateRandomString();

        FileReaderHelper fileReaderHelper= new  FileReaderHelper();
        if(fileReaderHelper.readFile(idReaderPath) !=null) {
            collection_id = fileReaderHelper.readFile(idReaderPath);
        }
        else {
            System.out.println("no id found in collect text file........please trigger create api");
        }

        updateCollectionRequestModel.setId(collection_id);
        updateCollectionRequestModel.setName(name);
        requestModel = gson.toJson(updateCollectionRequestModel);
        updateApiResponse = ApiCallHelper.putCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestModel,url);
        System.out.println(updateApiResponse.body().asString());


    }

    @Then("data will be updated and saved in db")
    public void dataWillBeUpdatedAndSavedInDb() throws SQLException, ClassNotFoundException {
        UpdateCollectionResponseModel updateCollectionResponseModel = gson.fromJson(updateApiResponse.getBody().asString(), UpdateCollectionResponseModel.class);


        CollectionQuery collectionQuery = new CollectionQuery();
        CollectionDbModel collectionDbModel = collectionQuery.getCollectionTableInfo(  updateCollectionResponseModel.getId());
        Assert.assertEquals(updateCollectionResponseModel.isSuccess(),true);
        Assert.assertEquals(updateCollectionResponseModel.getMessage(),"Collection updated successfully");
        Assert.assertEquals( collectionDbModel.getName(),name);

    }
}
