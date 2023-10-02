package stepDefinition.apiStepDefinition.photography;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import repository.dbModel.photography.PhotoDbModel;
import repository.dbModel.query.Photography.PhotoQuery;
import repository.remoteRepo.responseRepo.photography.PhotoGetSearchRequestModel;

import java.sql.SQLException;

import static core.urlDefine.apiURL.base_url;

public class PhotoGetSearchStepdefs {

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


    @Given("design photography search api will be provided")
    public void designPhotographySearchApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit the photography search api url with {string}, {string}, {string}")
    public void userWillHitThePhotographySearchApiUrlWith(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @And("user will get photography search according to the api")
    public void userWillGetPhotographySearchAccordingToTheApi() {
        PhotoGetSearchRequestModel photoGetSearchRequestModel = gson.fromJson(getApiResponse.getBody().asString(), PhotoGetSearchRequestModel.class);

        ID = photoGetSearchRequestModel.getData().get(0).getId();
        name = photoGetSearchRequestModel.getData().get(0).getName();

        System.out.println("API ID : " + ID);
        System.out.println("Name : " + name);
    }

    @Then("photography search api will be verified with DB")
    public void photographySearchApiWillBeVerifiedWithDB() throws SQLException, ClassNotFoundException {


        PhotoQuery photoQuery = new PhotoQuery();
        PhotoDbModel photoDbModel = photoQuery.getPhotoTableInfo(ID,123);

        System.out.println("Database Name : " + photoDbModel.getCollection_name());

        try {
            Assert.assertEquals(name,photoDbModel.getCollection_name());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");


    }
}
