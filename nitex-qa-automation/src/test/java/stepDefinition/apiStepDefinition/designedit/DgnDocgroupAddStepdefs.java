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
import repository.remoteRepo.requestRepo.designedit.DesignDocgroupAddRequestModel;
import repository.remoteRepo.responseRepo.designedit.DgnDocgroupAddResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import static core.Helper.FilePathHelper.designDocgroupAdd;
import static core.Helper.FilePathHelper.idDesignReaderPath;
import static core.urlDefine.apiURL.base_url;

public class DgnDocgroupAddStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;

    DesignDocgroupAddRequestModel designDocgroupAddRequestModel;
    Response postCostApiResponse;
    String url;


    @Given("design group add api will be provided")
    public void designGroupAddApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit the api url with {string} and {string} and {string}")
    public void userWillHitTheApiUrlWithAndAnd(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;
    }

    @And("user will hit group add api body {string} and {string} and {string} and {string}")
    public void userWillHitGroupAddApiBodyAndAndAnd(String arg0, String arg1, String arg2, String arg3) throws NoSuchAlgorithmException, KeyManagementException {

        JSONObject requestBody = new FileReaderHelper().readJsonFile(designDocgroupAdd);
        designDocgroupAddRequestModel = new Gson().fromJson(requestBody.toJSONString(), DesignDocgroupAddRequestModel.class);


        designDocgroupAddRequestModel.setName(arg0);
        designDocgroupAddRequestModel.setDocMimeType(arg1);
        designDocgroupAddRequestModel.setDocumentGroup(arg2);
        designDocgroupAddRequestModel.setDocumentType(arg3);

    }

    @And("user will also add and {string} and {string} and {string}")
    public void userWillAlsoAddAndAndAnd(String arg0, String arg1, String arg2) throws NoSuchAlgorithmException, KeyManagementException {

        FileReaderHelper file = new FileReaderHelper();
        String id =file.readFile(idDesignReaderPath);
        String payLoad_Id = id;


        designDocgroupAddRequestModel.setBase64Str(arg0);
        designDocgroupAddRequestModel.setProductId(payLoad_Id);
        designDocgroupAddRequestModel.setSize(Integer.parseInt(arg2));

        requestCostModel = gson.toJson(designDocgroupAddRequestModel);

        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postCostApiResponse.body().asString());
        
    }

    @Then("dgn doc group will be verified with DB")
    public void dgnDocGroupWillBeVerifiedWithDB() throws SQLException, ClassNotFoundException {

        DgnDocgroupAddResponseModel dgnDocgroupAddResponseModel  = gson.fromJson(postCostApiResponse.getBody().asString(), DgnDocgroupAddResponseModel.class);

        int dgnproductId = dgnDocgroupAddResponseModel.getId();
        String dgnprosuccessmsg = dgnDocgroupAddResponseModel.getMessage();


        DesignQuery designQuery = new DesignQuery();
        DesignDbModel designDbModel = designQuery.getProduct(dgnproductId);

        System.out.println("Database Output: " + designDbModel.getProduct_Id());
        System.out.println("API Output: " + dgnDocgroupAddResponseModel.getId());


        try {
          //  Assert.assertEquals(dgnproductId,designDbModel.getProduct_Id());
            Assert.assertEquals(dgnprosuccessmsg,"Document Added successfully to product");

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }

}
