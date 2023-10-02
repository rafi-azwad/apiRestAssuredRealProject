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
import repository.remoteRepo.responseRepo.photography.PhotoGetAllResponseModel;

import java.sql.SQLException;

import static core.urlDefine.apiURL.base_url;

public class PhotoGetAllStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    Response getApiResponse;
    String url;

    public static int ID=0;
    public static String status;

    public static String c_name;
    public static String season;

    public static String brand;
    public static String owner;

    public static int brand_id;



    @Given("design photography all api will be provided")
    public void designPhotographyAllApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit the photography all api url with {string}, {string}, {string}, {string} and {string}")
    public void userWillHitThePhotographyAllApiUrlWithAnd(String arg0, String arg1, String arg2, String arg3, String arg4) {
        url = url + arg0 + arg1 + arg2 + arg3 + arg4;
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
       // System.out.println(getApiResponse.body().asString());
    }

    @And("user will get photography all according to the api")
    public void userWillGetPhotographyAllAccordingToTheApi() {

        PhotoGetAllResponseModel photoGetAllResponseModel = gson.fromJson(getApiResponse.getBody().asString(), PhotoGetAllResponseModel.class);
        ID = photoGetAllResponseModel.getData().get(0).getId();
        c_name =photoGetAllResponseModel.getData().get(0).getCollectionName();
        owner = photoGetAllResponseModel.getData().get(0).getOwnerName();
        brand = photoGetAllResponseModel.getData().get(0).getBrand();
        season = photoGetAllResponseModel.getData().get(0).getSeason();
        status = photoGetAllResponseModel.getData().get(0).getAvailabilityStatus();
        brand_id = photoGetAllResponseModel.getData().get(0).getBrandId();

        System.out.println("API ID: "+ ID);
        System.out.println("API Collection name: "+ c_name);
        System.out.println("API Owner name: "+ owner);
        System.out.println("API Brand name: "+ brand);
        System.out.println("API Season: "+ season);
        System.out.println("API Brand ID: "+ brand_id);


    }

    @Then("photography all api will be verified with DB")
    public void photographyAllApiWillBeVerifiedWithDB() throws SQLException, ClassNotFoundException {


        PhotoQuery photoQuery = new PhotoQuery();
        PhotoDbModel photoDbModel = photoQuery.getPhotoTableInfo(ID,brand_id);

        System.out.println("Database Brand Name: "+ photoDbModel.getBrand_name());
        System.out.println("Database Collection name: "+ photoDbModel.getCollection_name());

        try {
            Assert.assertEquals(brand,photoDbModel.getBrand_name());
            Assert.assertEquals(c_name,photoDbModel.getCollection_name());


        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
