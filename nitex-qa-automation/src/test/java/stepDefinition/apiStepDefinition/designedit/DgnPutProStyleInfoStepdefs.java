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
import repository.remoteRepo.requestRepo.designedit.DgnProStyleInfoRequestModel;
import repository.remoteRepo.responseRepo.designedit.DgnProStyleInfoResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import static core.Helper.FilePathHelper.dgnProStyleInfo;
import static core.urlDefine.apiURL.base_url;

public class DgnPutProStyleInfoStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;

    DgnProStyleInfoRequestModel dgnProStyleInfoRequestModel;
    Response postCostApiResponse;
    String url;


    @Given("design pro style info put api will be provided")
    public void designProStyleInfoPutApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit pro style info put api url with {string} and {string} and {string}")
    public void userWillHitProStyleInfoPutApiUrlWithAndAnd(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;
    }

    @And("user will hit pro style info put api body {string} and {string} and {string}")
    public void userWillHitProStyleInfoPutApiBodyAndAnd(String arg0, String arg1, String arg2) {

        JSONObject requestBody = new FileReaderHelper().readJsonFile(dgnProStyleInfo);
        dgnProStyleInfoRequestModel = new Gson().fromJson(requestBody.toJSONString(), DgnProStyleInfoRequestModel.class);
        dgnProStyleInfoRequestModel.setId(Integer.parseInt(arg0));
        dgnProStyleInfoRequestModel.setName(arg1);
        dgnProStyleInfoRequestModel.setReferenceNumber(arg2);
    }

    @And("user will also put pro style info body with {string} and {string}")
    public void userWillAlsoPutProStyleInfoBodyWithAnd(String arg0, String arg1) throws NoSuchAlgorithmException, KeyManagementException {
        dgnProStyleInfoRequestModel.setProductSubCategoryId(Integer.parseInt(arg0));
        dgnProStyleInfoRequestModel.setProductGroupId(Integer.parseInt(arg1));

        requestCostModel = gson.toJson(dgnProStyleInfoRequestModel);

        postCostApiResponse = ApiCallHelper.putCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postCostApiResponse.body().asString());

    }

    @Then("dgn pro style info api will be verified with DB")
    public void dgnProStyleInfoApiWillBeVerifiedWithDB() throws SQLException, ClassNotFoundException {

        DgnProStyleInfoResponseModel dgnProStyleInfoResponseModel  = gson.fromJson(postCostApiResponse.getBody().asString(), DgnProStyleInfoResponseModel.class);

        int dgnProStyleIn = dgnProStyleInfoResponseModel.getPayload().getId();

        DesignQuery designQuery = new DesignQuery();
        DesignDbModel designDbModel = designQuery.designProStyleInfo(dgnProStyleIn);

        String name = designDbModel.getName();
        String ref = designDbModel.getRef_Num();

        System.out.println("====>" + name + "====>" + ref);

        try {
            Assert.assertEquals(dgnProStyleInfoResponseModel.getMessage(), "Style info updated successfully");
            Assert.assertEquals(name,dgnProStyleInfoResponseModel.getPayload().getName());
            Assert.assertEquals(ref,dgnProStyleInfoResponseModel.getPayload().getReferenceNumber());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
