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
import repository.remoteRepo.responseRepo.sample.SampleGetReqAllResponseModel;

import java.sql.SQLException;

import static core.urlDefine.apiURL.base_url;

public class SampleGetReqAllStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    Response getApiResponse;
    String url;

    public static int ID=0;
    public static int c_ID=0;
    public static String c_name;
    public static String ref_no;

    public static String brand;


    @Given("design sample request all api will be provided")
    public void designSampleRequestAllApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit the sample request all api url with {string} and {string} {string}")
    public void userWillHitTheSampleRequestAllApiUrlWithAnd(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;
    }

    @And("user will also hit the sample request all api url with {string} and {string} {string}")
    public void userWillAlsoHitTheSampleRequestAllApiUrlWithAnd(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @And("user will get sample req all data according to type api")
    public void userWillGetSampleReqAllDataAccordingToTypeApi() {
        SampleGetReqAllResponseModel sampleGetReqAllResponseModel = gson.fromJson(getApiResponse.getBody().asString(), SampleGetReqAllResponseModel.class);

        brand = sampleGetReqAllResponseModel.getData().get(0).getBrand();
        c_ID = sampleGetReqAllResponseModel.getData().get(0).getCollectionId();
        c_name = sampleGetReqAllResponseModel.getData().get(0).getCollectionName();
        ref_no = sampleGetReqAllResponseModel.getData().get(0).getRefNo();
        ID = sampleGetReqAllResponseModel.getData().get(0).getId();


        System.out.println("Brand: " + brand);
        System.out.println("Response Collection Name: " + c_name);
        System.out.println("Collection ID: " + c_ID);
        System.out.println("Reference No: " + ref_no);
        System.out.println("Reference ID: " + ID);

    }

    @Then("sample req all api will be verified with DB")
    public void sampleReqAllApiWillBeVerifiedWithDB() throws SQLException, ClassNotFoundException {

        SampleQuery sampleQuery = new SampleQuery();
        SampleDbModel sampleDbModel = sampleQuery.getSampleTableAll(c_ID,ID);

        System.out.println("Database Ref Name: "+ sampleDbModel.getRef_name());
        System.out.println("Database Collection name: "+ sampleDbModel.getCollection_name());
        System.out.println("Database Brand name: "+ sampleDbModel.getBrand());

        try {
            Assert.assertEquals(c_name,sampleDbModel.getCollection_name());
            Assert.assertEquals(ref_no,sampleDbModel.getRef_name());
            Assert.assertEquals(brand,sampleDbModel.getBrand());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
