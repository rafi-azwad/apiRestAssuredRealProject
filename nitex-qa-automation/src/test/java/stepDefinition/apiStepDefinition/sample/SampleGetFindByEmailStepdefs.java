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
import repository.remoteRepo.responseRepo.sample.SampleGetFindByEmailResponseModel;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static core.urlDefine.apiURL.base_url;

public class SampleGetFindByEmailStepdefs {


    private Gson gson = new Gson();
    private String requestModel;
    Response getApiResponse;
    String url;

    public static int ID=0;
    public static int c_ID=0;

    public static String name;
    public static String designation;

    public static String brand;
    public static String email;


    @Given("design sample find email api will be provided")
    public void designSampleFindEmailApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit the sample find email api url with {string}, {string}, {string} and {string}")
    public void userWillHitTheSampleFindEmailApiUrlWithAnd(String arg0, String arg1, String arg2, String arg3) {

        url = url + arg0 + arg1 + arg2 + arg3;
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @And("user will get find email data according to the api")
    public void userWillGetFindEmailDataAccordingToTheApi() {

        SampleGetFindByEmailResponseModel[] sampleGetFindByEmailResponseModel = gson.fromJson(getApiResponse.getBody().asString(), SampleGetFindByEmailResponseModel[].class);
        List<SampleGetFindByEmailResponseModel> sampleList = Arrays.asList(sampleGetFindByEmailResponseModel);

        ID = sampleList.get(0).getId();
        email = sampleList.get(0).getEmail();
        name = sampleList.get(0).getName();
        designation = sampleList.get(0).getDesignation();

        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("ID: " + ID);
        System.out.println("Designation: " + designation);


    }

    @Then("sample find email api will be verified with DB")
    public void sampleFindEmailApiWillBeVerifiedWithDB() throws SQLException, ClassNotFoundException {

        SampleQuery sampleQuery = new SampleQuery();
        SampleDbModel sampleDbModel = sampleQuery.getsampleGetReqMembers(ID);



        System.out.println("Name: " + sampleDbModel.getName());
        System.out.println("Email: " + sampleDbModel.getEmail());
        System.out.println("Designation: " + sampleDbModel.getDesignation());

        try {
            Assert.assertEquals(name,sampleDbModel.getName());
            Assert.assertEquals(email,sampleDbModel.getEmail());
            Assert.assertEquals(designation,sampleDbModel.getDesignation());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
