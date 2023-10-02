package stepDefinition.apiStepDefinition.sample;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import repository.dbModel.query.Sample.SampleQuery;
import repository.dbModel.sample.SampleDbModel;
import repository.remoteRepo.responseRepo.sample.SampleGetReqCountResponseModel;

import java.sql.SQLException;

import static core.urlDefine.apiURL.base_url;

public class SampleGetReqCountStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    Response getApiResponse;
    String url;

    public static int ID=0;
    public static int c_ID=0;
    public static String c_name;
    public static String ref_name;



    @Given("design sample request api will be provided")
    public void designSampleRequestApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit the sample request api url with {string} and {string} {string}")
    public void userWillHitTheSampleRequestApiUrlWithAnd(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @And("user will get sample req data according to type api")
    public void userWillGetSampleReqDataAccordingToTypeApi() {

        SampleGetReqCountResponseModel sampleGetReqCountResponseModel = gson.fromJson(getApiResponse.getBody().asString(), SampleGetReqCountResponseModel.class);

        ID = sampleGetReqCountResponseModel.getId();
        c_name = sampleGetReqCountResponseModel.getCollectionName();
        ref_name = sampleGetReqCountResponseModel.getRefNo();
        c_ID = sampleGetReqCountResponseModel.getCollectionId();

        System.out.println("Response ID: " + ID);
        System.out.println("Response Collection Name: " + c_name);
        System.out.println("Collection ID: " + c_ID);
        System.out.println("Reference Name: " + ref_name);

    }

    @Then("sample req api will be verified with DB")
    public void sampleReqApiWillBeVerifiedWithDB() throws SQLException, ClassNotFoundException {


        SampleQuery sampleQuery = new SampleQuery();
        SampleDbModel sampleDbModel = sampleQuery.getSampleTableInfo(ID,c_ID);

        System.out.println("Database Ref Name: "+ sampleDbModel.getRef_name());
        System.out.println("Database Collection name: "+ sampleDbModel.getCollection_name());

        try {
            Assert.assertEquals(c_name,sampleDbModel.getCollection_name());
            Assert.assertEquals(ref_name,sampleDbModel.getRef_name());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");


    }
}
