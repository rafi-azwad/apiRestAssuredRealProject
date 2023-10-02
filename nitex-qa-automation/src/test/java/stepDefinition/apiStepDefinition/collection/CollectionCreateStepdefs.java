package stepDefinition.apiStepDefinition.collection;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.FileReaderHelper;
import core.Helper.HeaderFormatHelper;
import core.Helper.RandomStringHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import repository.dbModel.collection.CollectionDbModel;
import repository.dbModel.query.Collection.CollectionQuery;
import repository.remoteRepo.requestRepo.collection.CreateCollectionRequestModel;
import repository.remoteRepo.responseRepo.collection.CreateCollectionResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import static core.Helper.FilePathHelper.*;
import static core.urlDefine.apiURL.collection_base_url;

public class CollectionCreateStepdefs {
    private Gson gson = new Gson();
    private String requestModel;
    CreateCollectionRequestModel createCollectionRequestModel;

    Response postApiResponse;
    String url;
    @Given("base api url will be provided")
    public void baseApiUrlWillBeProvided() {
          url =  collection_base_url+"add";
        
    }

    @When("User will input {string} , {string} , {string}")
    public void userWillInputNameBrandIdSession(String name , String brandId, String session) {
        RandomStringHelper rdm = new RandomStringHelper();
        JSONObject requestBody = new FileReaderHelper().readJsonFile(collectionCreationJsonPath);
        createCollectionRequestModel = new Gson().fromJson(requestBody.toJSONString(),CreateCollectionRequestModel.class);
        name = "sample automation collection "+ rdm.generateRandomString();
        int bID = Integer.parseInt(brandId);
        createCollectionRequestModel.setName(name);
        createCollectionRequestModel.setBrandId(bID);
        createCollectionRequestModel.setSeason(session);

    }
    @And("user also will add {string}, {string}, {string}")
    public void userAlsoWillAddTagRequestListPrivacyIsNitexCollection(String tagRequestList, String privacy,String isNitexCollection) {
        List<CreateCollectionRequestModel.TagRequestListBean> tagRequest = null;
        CreateCollectionRequestModel.TagRequestListBean tagBean = new CreateCollectionRequestModel.TagRequestListBean();
        tagBean.setText(tagRequestList);
        System.out.println("................"+    tagBean.getText());
        //tagRequest.get(0).setText(tagBean);

        createCollectionRequestModel.setTagRequestList(Collections.singletonList(tagBean));
        createCollectionRequestModel.setPrivacy(privacy);
        createCollectionRequestModel.setIsNitexCollection(true);
        requestModel = gson.toJson(createCollectionRequestModel);


    }

    @And("user will call the api")
    public void userWillCallTheApi() throws NoSuchAlgorithmException, KeyManagementException {

        postApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestModel,url);
        System.out.println(postApiResponse.body().asString());
    }


    @Then("it will be created successfully and saved in db")
    public void itWillBeCreatedSuccessfullyAndSavedInDb() throws SQLException, ClassNotFoundException {
        //CreateCollectionResponseModel createCollectionResponseModel = new CreateCollectionResponseModel();
        CreateCollectionResponseModel createCollectionResponseModel = gson.fromJson(postApiResponse.getBody().asString(), CreateCollectionResponseModel.class);
        int collection_id = createCollectionResponseModel.getId();

        System.out.println("Collection ID: " + collection_id);

        CollectionQuery collectionQuery = new CollectionQuery();
        CollectionDbModel collectionDbModel = collectionQuery.getCollectionTableInfo(collection_id);
        System.out.println("=====>>" + collectionDbModel.getName());
        System.out.println(collectionDbModel.getBrand_id());
        System.out.println(collectionDbModel.getSeason());

        System.out.println(createCollectionResponseModel.getMessage());
        System.out.println(createCollectionResponseModel.isSuccess());

        Assert.assertEquals(createCollectionResponseModel.isSuccess(),true);
        Assert.assertEquals(createCollectionResponseModel.getMessage(),"Collection added successfully");
        Assert.assertEquals(collectionDbModel.getName(),createCollectionRequestModel.getName());
        Assert.assertEquals(collectionDbModel.getBrand_id(),1);
        //Assert.assertEquals(collectionDbModel.getSeason(),15);
        FileReaderHelper fileReaderHelper= new  FileReaderHelper();
        if(fileReaderHelper.readFile(idReaderPath) !=null) {
            fileReaderHelper.updateFile(idReaderPath, String.valueOf(collection_id));

        }
        else {
            fileReaderHelper.writeFile(idReaderPath, String.valueOf(collection_id));
        }

    }



}
