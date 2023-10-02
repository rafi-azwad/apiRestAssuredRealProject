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
import repository.remoteRepo.responseRepo.designedit.DgnGetProDevComResponseModel;

import java.sql.SQLException;

import static core.urlDefine.apiURL.base_url;

public class DgnGetProDevComStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    //  CreateCollectionRequestModel createCollectionRequestModel;

    Response getApiResponse;
    String url;


    @Given("design get pro dev api will be provided")
    public void designGetProDevApiWillBeProvided() {

        url = base_url;
    }

    @When("user will hit the api url with {string} and {string} and {string} and {string}")
    public void userWillHitTheApiUrlWithAndAndAnd(String arg0, String arg1, String arg2, String arg3) {

        url = url + arg0 + arg1 + arg2 + arg3;
        System.out.println(url);
    }

    @And("user will get data according to pro dev api")
    public void userWillGetDataAccordingToProDevApi() {

        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());

    }

    @Then("dgn pro dev api will be verified with DB")
    public void dgnProDevApiWillBeVerifiedWithDB() throws SQLException, ClassNotFoundException {

        DgnGetProDevComResponseModel dgnGetProDevComResponseModel = gson.fromJson(getApiResponse.getBody().asString(), DgnGetProDevComResponseModel.class);

        int ID = dgnGetProDevComResponseModel.getData().get(0).getId();
        String postType = dgnGetProDevComResponseModel.getData().get(0).getPostType();
        String artBName = dgnGetProDevComResponseModel.getData().get(0).getArtBoardName();
        String proName =  dgnGetProDevComResponseModel.getData().get(0).getProductName();
        String textComment =  dgnGetProDevComResponseModel.getData().get(0).getText();


        System.out.println(ID);
        System.out.println(postType);
        System.out.println(artBName);
        System.out.println(proName);
        System.out.println("API " + textComment);

        DesignQuery designQuery = new DesignQuery();
        DesignDbModel designDbModel = designQuery.getComment(ID);


        System.out.println("DB Text: ====>" + designDbModel.getText());



        try {
           Assert.assertEquals(textComment,designDbModel.getText());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");


    }




    }

