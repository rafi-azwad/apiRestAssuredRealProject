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
import repository.remoteRepo.responseRepo.sample.SampleGetRequestResponseModel;

import java.sql.SQLException;

import static core.urlDefine.apiURL.base_url;

public class SampleGetRequestStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    Response getApiResponse;
    String url;

    public static int ID=0;
    public static int c_ID=0;

    public static String collection_name;
    public static String ref_no;

    public static String brand;
    public static String email;

    @Given("design sample request specific user api will be provided")
    public void designSampleRequestSpecificUserApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit the sample request specific user api url with {string} and {string} {string}")
    public void userWillHitTheSampleRequestSpecificUserApiUrlWithAnd(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @And("user will get sample specific user req data according to type api")
    public void userWillGetSampleSpecificUserReqDataAccordingToTypeApi() {
        SampleGetRequestResponseModel sampleGetRequestResponseModel = gson.fromJson(getApiResponse.getBody().asString(), SampleGetRequestResponseModel.class);
        brand = sampleGetRequestResponseModel.getBrand();
        collection_name = sampleGetRequestResponseModel.getCollectionName();
        c_ID = sampleGetRequestResponseModel.getCollectionId();
        ID = sampleGetRequestResponseModel.getId();
        ref_no = sampleGetRequestResponseModel.getRefNo();

        System.out.println("Collection_Name: " + collection_name);
        System.out.println("C_ID: " + c_ID);
        System.out.println("Brand: " + brand);
        System.out.println("Brand: " + ID);
        System.out.println("Ref_No: " + ref_no);

    }

    @Then("sample req api specific user will be verified with DB")
    public void sampleReqApiSpecificUserWillBeVerifiedWithDB() throws SQLException, ClassNotFoundException {

        SampleQuery sampleQuery = new SampleQuery();
        SampleDbModel sampleDbModel = sampleQuery.getSampleTableInfo(ID,c_ID);

        System.out.println("Database Ref: "+ sampleDbModel.getRef_name());
        System.out.println("Database Collection name: "+ sampleDbModel.getCollection_name());

        try {

            Assert.assertEquals(collection_name,sampleDbModel.getCollection_name());
            Assert.assertEquals(ref_no,sampleDbModel.getRef_name());


        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
