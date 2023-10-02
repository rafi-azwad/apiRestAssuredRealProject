package stepDefinition.apiStepDefinition.collection;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.FileReaderHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import repository.dbModel.collection.CollectionDbModel;
import repository.dbModel.query.Collection.CollectionQuery;
import repository.remoteRepo.responseRepo.collection.CollectionMyResponseModel;

import java.sql.SQLException;

import static core.Helper.FilePathHelper.member_id;
import static core.urlDefine.apiURL.base_url;

public class CollectionMyStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    Response getApiResponse;
    String url;


    @Given("my collection api url will be given")
    public void myCollectionApiUrlWillBeGiven() {
        url = base_url;
    }

    @When("my collection will pass api url endpoints {string} and {string}")
    public void myCollectionWillPassApiUrlEndpointsAnd(String arg0, String arg1) {
        url = base_url + arg0 + arg1;
    }

    @Then("my collection data will be fetched and verified with db")
    public void myCollectionDataWillBeFetchedAndVerifiedWithDb() throws SQLException, ClassNotFoundException {
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());

        CollectionMyResponseModel collectionMyResponseModel = gson.fromJson(getApiResponse.getBody().asString(), CollectionMyResponseModel.class);
        int ID = collectionMyResponseModel.getData().get(0).getId();
        String name = collectionMyResponseModel.getData().get(0).getName();

        System.out.println("This is ID: " + ID);
        System.out.println("This is Name: " + name);

        FileReaderHelper fileReaderHelper= new  FileReaderHelper();
        if(fileReaderHelper.readFile(member_id) !=null) {
            fileReaderHelper.updateFile(member_id, String.valueOf(ID));
        }
        else {
            fileReaderHelper.writeFile(member_id, String.valueOf(ID));
        }

        CollectionQuery collectionQuery = new CollectionQuery();
        CollectionDbModel collectionDbModel = collectionQuery.getCollectionMy(ID);

        try {
            Assert.assertEquals(name,collectionDbModel.getName());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }
}
