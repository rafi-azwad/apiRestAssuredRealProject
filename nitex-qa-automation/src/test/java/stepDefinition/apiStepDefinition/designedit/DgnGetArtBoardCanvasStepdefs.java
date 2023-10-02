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
import repository.remoteRepo.responseRepo.designedit.DgnGetArtBoardCanvasResponseModel;

import static core.urlDefine.apiURL.base_url;

public class DgnGetArtBoardCanvasStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    //  CreateCollectionRequestModel createCollectionRequestModel;

    Response getApiResponse;
    String url;

    int ID = 0;
    String getText;


    @Given("design art board canvas api will be provided")
    public void designArtBoardCanvasApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit the art board canvas url with {string} and {string} {string} and {string}")
    public void userWillHitTheArtBoardCanvasUrlWithAndAnd(String arg0, String arg1, String arg2, String arg3) {
        url = url + arg0 + arg1 + arg2 + arg3;
    }

    @And("user will get data according to art board canvas api")
    public void userWillGetDataAccordingToArtBoardCanvasApi() {
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @Then("dgn art board canvas api will be verified with DB")
    public void dgnArtBoardCanvasApiWillBeVerifiedWithDB() {

        DgnGetArtBoardCanvasResponseModel dgnGetArtBoardCanvasResponseModel = gson.fromJson(getApiResponse.getBody().asString(), DgnGetArtBoardCanvasResponseModel.class);
        getText = dgnGetArtBoardCanvasResponseModel.getMessage();

        System.out.println(getText);

        try {
            Assert.assertEquals(getText,"ArtBoard already generated!!!");

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }
}
