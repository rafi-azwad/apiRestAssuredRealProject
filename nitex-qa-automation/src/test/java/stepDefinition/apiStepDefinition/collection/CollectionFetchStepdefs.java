package stepDefinition.apiStepDefinition.collection;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.FileReaderHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import repository.dbModel.collection.CollectionDbModel;
import repository.dbModel.query.Collection.CollectionQuery;
import repository.remoteRepo.requestRepo.collection.CreateCollectionRequestModel;
import repository.remoteRepo.responseRepo.collection.CollectionFetchResponseModel;

import java.sql.SQLException;

import static core.Helper.FilePathHelper.idReaderPath;
import static core.urlDefine.apiURL.collection_base_url;

public class CollectionFetchStepdefs {
    private Gson gson = new Gson();
    private String requestModel;
    CreateCollectionRequestModel createCollectionRequestModel;

    Response getApiResponse;
    String url;
    int collection_id;
    @Given("base api will be provided")
    public void baseApiWillBeProvided() {
        FileReaderHelper file = new FileReaderHelper();
        String id =file.readFile(idReaderPath);
         collection_id = Integer.parseInt(id);
        url =  collection_base_url+collection_id;
    }

    @When("user will hit get api with {string}")
    public void userWillHitGetApiWithId(String id) {
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());


    }

    @Then("user will get data according to id")
    public void userWillGetDataAccordingToId() throws SQLException, ClassNotFoundException {
        CollectionQuery collectionQuery = new CollectionQuery();
        CollectionFetchResponseModel collectionFetchResponseModel = gson.fromJson(getApiResponse.getBody().asString(), CollectionFetchResponseModel.class);
        CollectionDbModel collectionDbModel = collectionQuery.getCollectionTableInfo(collection_id);

        System.out.println(collectionFetchResponseModel.getBrand());
        System.out.println(collectionFetchResponseModel.getBrandId());
        System.out.println(collectionFetchResponseModel.getName());
        System.out.println(collectionFetchResponseModel.getSeason());
        System.out.println(collectionFetchResponseModel.getStatus());
        System.out.println(collectionDbModel.getName());


    }
}
