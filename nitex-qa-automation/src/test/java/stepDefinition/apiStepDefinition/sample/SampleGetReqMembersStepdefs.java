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
import repository.remoteRepo.responseRepo.sample.SampleGetReqMembersResponseModel;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static core.urlDefine.apiURL.base_url;

public class SampleGetReqMembersStepdefs {

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


    @Given("design sample request member api will be provided")
    public void designSampleRequestMemberApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit the sample request member api url with {string}, {string}, {string}, {string}")
    public void userWillHitTheSampleRequestMemberApiUrlWith(String arg0, String arg1, String arg2, String arg3) {
        url = url + arg0 + arg1 + arg2 + arg3;
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @And("user will get sample req member data according to type api")
    public void userWillGetSampleReqMemberDataAccordingToTypeApi() {
        SampleGetReqMembersResponseModel[] sampleGetReqMembersResponseModel = gson.fromJson(getApiResponse.getBody().asString(), SampleGetReqMembersResponseModel[].class);
        List<SampleGetReqMembersResponseModel> sampleList = Arrays.asList(sampleGetReqMembersResponseModel);

        ID =  sampleList.get(0).getId();
        name =  sampleList.get(0).getName();
        designation =  sampleList.get(0).getDesignation();
        email =  sampleList.get(0).getEmail();

        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Designation: " + designation);
        System.out.println("Email: " + email);

    }

    @Then("sample req member api will be verified with DB")
    public void sampleReqMemberApiWillBeVerifiedWithDB() throws SQLException, ClassNotFoundException {

        SampleQuery sampleQuery = new SampleQuery();
        SampleDbModel sampleDbModel = sampleQuery.getsampleGetReqMembers(ID);

        System.out.println("Database Email: "+ sampleDbModel.getEmail());
        System.out.println("Database Department name: "+ sampleDbModel.getDepartment());
        System.out.println("Database Designation name: "+ sampleDbModel.getDesignation());
        System.out.println("Database Brand name: "+ sampleDbModel.getName());

        try {
            Assert.assertEquals(email,sampleDbModel.getEmail());
            Assert.assertEquals(name,sampleDbModel.getName());
            Assert.assertEquals(designation,sampleDbModel.getDesignation());


        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");



    }
}
