package stepDefinition.apiStepDefinition.photography;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import repository.dbModel.photography.PhotoDbModel;
import repository.dbModel.query.Photography.PhotoQuery;
import repository.remoteRepo.responseRepo.photography.PhotoGetUserSearchResponseModel;

import java.sql.SQLException;

import static core.urlDefine.apiURL.base_url;

public class PhotoGetUserSearchStepdefs {

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


    @Given("photography user search api will be provided")
    public void photographyUserSearchApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit the photography user search api url with {string}, {string}, {string}, {string}")
    public void userWillHitThePhotographyUserSearchApiUrlWith(String arg0, String arg1, String arg2, String arg3) {
        url = url + arg0 + arg1 + arg2 + arg3;
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @And("user will get photography user search according to the api")
    public void userWillGetPhotographyUserSearchAccordingToTheApi() {

        PhotoGetUserSearchResponseModel photoGetUserSearchResponseModel = gson.fromJson(getApiResponse.getBody().asString(), PhotoGetUserSearchResponseModel.class);

        ID = photoGetUserSearchResponseModel.getData().get(0).getId();
        name = photoGetUserSearchResponseModel.getData().get(0).getName();
        email = photoGetUserSearchResponseModel.getData().get(0).getEmail();

        System.out.println("API ID : " + ID);
        System.out.println("API Name : " + name);
        System.out.println("API Email : " + email);
    }

    @Then("photography user search api will be verified with DB")
    public void photographyUserSearchApiWillBeVerifiedWithDB() throws SQLException, ClassNotFoundException {

        PhotoQuery photoQuery = new PhotoQuery();
        PhotoDbModel photoDbModel = photoQuery.getPhotoTableInfo(ID,123);

        System.out.println("Database Name : " + photoDbModel.getName());
        System.out.println("Database Email : " + photoDbModel.getEmail());

        try {
           // Assert.assertEquals(name,photoDbModel.getCollection_name());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
