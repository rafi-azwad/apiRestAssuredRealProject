package stepDefinition.apiStepDefinition.designedit;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.FileReaderHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.Assert;
import repository.dbModel.designedit.DesignDbModel;
import repository.dbModel.query.DesignEdit.DesignQuery;
import repository.remoteRepo.requestRepo.designedit.DesignArtBoardAddRequestModel;
import repository.remoteRepo.responseRepo.designedit.DgnArtBoardAddResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import static core.Helper.FilePathHelper.designArtBoardAdd;
import static core.urlDefine.apiURL.base_url;

public class DgnArtBoardAddStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;

    DesignArtBoardAddRequestModel designArtBoardAddRequestModel;
    Response postCostApiResponse;
    String url;


    @Given("design art board add api will be provided")
    public void designArtBoardAddApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit the api url with {string} and {string}")
    public void userWillHitTheApiUrlWithAnd(String arg0, String arg1) {
        url = url + arg0 + arg1;
    }

    @And("user will hit art board add api body {string} and {string} and {string}")
    public void userWillHitArtBoardAddApiBodyAndAnd(String arg0, String arg1, String arg2) {
        JSONObject requestBody = new FileReaderHelper().readJsonFile(designArtBoardAdd);
        designArtBoardAddRequestModel = new Gson().fromJson(requestBody.toJSONString(), DesignArtBoardAddRequestModel.class);
        designArtBoardAddRequestModel.setCode(arg0);
        designArtBoardAddRequestModel.getDocumentDTO().setBase64Str("");
        designArtBoardAddRequestModel.getDocumentDTO().setDocMimeType(arg2);

    }

    @And("user will also add api body with {string} and {string} and {string} and {string} and {string}")
    public void userWillAlsoAddApiBodyWithAndAndAndAnd(String arg0, String arg1, String arg2, String arg3, String arg4) throws NoSuchAlgorithmException, KeyManagementException {

        designArtBoardAddRequestModel.getDocumentDTO().setDocumentType(arg0);
        designArtBoardAddRequestModel.getDocumentDTO().setName("");
        designArtBoardAddRequestModel.setHistoryJson("");
        designArtBoardAddRequestModel.setName(arg1);
        designArtBoardAddRequestModel.setProductId(arg3);
        designArtBoardAddRequestModel.setSerial(Integer.parseInt(arg4));

        requestCostModel = gson.toJson(designArtBoardAddRequestModel);

        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postCostApiResponse.body().asString());

    }

    @Then("dgn api will be verified with DB")
    public void dgnApiWillBeVerifiedWithDB() throws SQLException, ClassNotFoundException {

        DgnArtBoardAddResponseModel dgnArtBoardAddResponseModel  = gson.fromJson(postCostApiResponse.getBody().asString(), DgnArtBoardAddResponseModel.class);

        int dgnArtBoardId = dgnArtBoardAddResponseModel.getId();

        System.out.println("This is API ArtBoard ID: " + dgnArtBoardId);

        DesignQuery designQuery = new DesignQuery();
        DesignDbModel designDbModel = designQuery.getArtBoard(dgnArtBoardId);

        System.out.println("Database Output: " + designDbModel.getArtBoardName_2());


        String msg = dgnArtBoardAddResponseModel.getMessage();
        String artBName = dgnArtBoardAddResponseModel.getPayload().getName();



        try {
              Assert.assertEquals(msg,"Added successfully");
              Assert.assertEquals(artBName,designDbModel.getArtBoardName_2());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");


    }
}
