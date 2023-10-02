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
import repository.remoteRepo.responseRepo.photography.PhotoGetDesignCountResponseModel;

import static core.urlDefine.apiURL.base_url;

public class PhotoGetDesignCountStepdefs {

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


    @Given("design photography design count api will be provided")
    public void designPhotographyDesignCountApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit the photography design count api url with {string}, {string}, {string}, {string} and {string}")
    public void userWillHitThePhotographyDesignCountApiUrlWithAnd(String arg0, String arg1, String arg2, String arg3, String arg4) {
        url = url + arg0 + arg1 + arg2 + arg3 + arg4;
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @And("user will get photography design count according to the api")
    public void userWillGetPhotographyDesignCountAccordingToTheApi() {

        PhotoGetDesignCountResponseModel photoGetDesignCountResponseModel = gson.fromJson(getApiResponse.getBody().asString(), PhotoGetDesignCountResponseModel.class);

        int a = photoGetDesignCountResponseModel.getCOMPLETED();
        int b = photoGetDesignCountResponseModel.getTODAY();
        int c = photoGetDesignCountResponseModel.getPENDING();

        System.out.println("Completed: " + a);
        System.out.println("Today: " + b);
        System.out.println("Pending: " + c);


    }

    @Then("photography design count api will be verified with DB")
    public void photographyDesignCountApiWillBeVerifiedWithDB() {

        try {

            Assert.assertEquals(getApiResponse.statusCode(),200);


        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }
}
