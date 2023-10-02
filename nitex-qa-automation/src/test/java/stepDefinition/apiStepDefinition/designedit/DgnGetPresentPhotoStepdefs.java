package stepDefinition.apiStepDefinition.designedit;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import repository.dbModel.designedit.DesignDbModel;
import repository.dbModel.query.DesignEdit.DesignQuery;
import repository.remoteRepo.responseRepo.designedit.DgnGetPresentPhotoResponseModel;

import java.sql.SQLException;

import static core.urlDefine.apiURL.base_url;

public class DgnGetPresentPhotoStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    //  CreateCollectionRequestModel createCollectionRequestModel;

    Response getApiResponse;
    String url;

    int ID = 0;
    String getName;
    String get_ref;

    @Given("design present photo api will be provided")
    public void designPresentPhotoApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit the present photo url with {string} and {string} {string} and {string}")
    public void userWillHitThePresentPhotoUrlWithAndAnd(String arg0, String arg1, String arg2, String arg3) {
        url = url + arg0 + arg1 + arg2 + arg3;
    }

    @And("user will get data according to present photo api")
    public void userWillGetDataAccordingToPresentPhotoApi() {
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @Then("dgn present photo api will be verified with DB")
    public void dgnPresentPhotoApiWillBeVerifiedWithDB() throws SQLException, ClassNotFoundException {

        DgnGetPresentPhotoResponseModel dgnGetPresentPhotoResponseModel = gson.fromJson(getApiResponse.getBody().asString(), DgnGetPresentPhotoResponseModel.class);

        ID = dgnGetPresentPhotoResponseModel.getProductInfoForPresentationList().get(0).getId();
        getName = dgnGetPresentPhotoResponseModel.getProductInfoForPresentationList().get(0).getStyleName();
        get_ref = dgnGetPresentPhotoResponseModel.getProductInfoForPresentationList().get(0).getReferenceNumber();

        System.out.println("Here is ID: " + ID);
        System.out.println("Here is Name: " + getName);
        System.out.println("Here is Ref: " + get_ref);

        DesignQuery designQuery = new DesignQuery();
        DesignDbModel designDbModel = designQuery.getCollectionPhoto(ID);

        System.out.println(designDbModel.getBrand_Id());
        System.out.println(designDbModel.getName());

        try {

            Assert.assertEquals(ID,designDbModel.getBrand_Id());
            Assert.assertEquals(getName,designDbModel.getName());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }
}
