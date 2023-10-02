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
import repository.remoteRepo.requestRepo.designedit.DgnProductAddReqestModel;
import repository.remoteRepo.responseRepo.designedit.DgnProductAddResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Collections;

import static core.Helper.FilePathHelper.*;
import static core.urlDefine.apiURL.base_url;

public class DgnProductAddStepdefs {


    private Gson gson = new Gson();
    private String requestCostModel;

    DgnProductAddReqestModel dgnProductAddReqestModel;

    Response postCostApiResponse;
    String url;

    @Given("design add product api will be provided")
    public void designAddProductApiWillBeProvided() {

        url = base_url;
    }

    @When("user will hit post design api {string} and {string} and {string}")
    public void userWillHitPostDesignApiAndAnd(String arg0, String arg1, String arg2) {

        url = url + arg0 + arg1 + arg2;

    }
    @And("user will hit api with body {string} and {string} and {string}")
    public void userWillHitApiWithBodyAndAnd(String arg0, String arg1, String arg2) throws NoSuchAlgorithmException, KeyManagementException {

        JSONObject requestBody = new FileReaderHelper().readJsonFile(dgnProductAdd);
        dgnProductAddReqestModel = new Gson().fromJson(requestBody.toJSONString(), DgnProductAddReqestModel.class);

        int inCostingConvert = Integer.parseInt(arg1);
        dgnProductAddReqestModel.setId(arg0);
        dgnProductAddReqestModel.setProductIds(Collections.singletonList(inCostingConvert));
        dgnProductAddReqestModel.setAsync(false);

        requestCostModel = gson.toJson(dgnProductAddReqestModel);


        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postCostApiResponse.body().asString());
    }

    @Then("user will get design product and verified with DB")
    public void userWillGetDesignProductAndVerifiedWithDB() throws SQLException, ClassNotFoundException {

        DgnProductAddResponseModel dgnProductAddResponseModel = gson.fromJson(postCostApiResponse.getBody().asString(), DgnProductAddResponseModel.class);
        int design_id = dgnProductAddResponseModel.getPayload().get(0).getId();
        String name = dgnProductAddResponseModel.getPayload().get(0).getName();
        String ref = dgnProductAddResponseModel.getPayload().get(0).getReferenceNumber();
        String cons = dgnProductAddResponseModel.getPayload().get(0).getConstruction();


        System.out.println("This is ID ====>>> " + design_id);
        System.out.println("This is Name ====>>> " + name);
        System.out.println("This is Ref_Num ====>>> " + ref);
        System.out.println("This is Construction ====>>> " + cons);


        FileReaderHelper fileReaderHelper= new  FileReaderHelper();
        if(fileReaderHelper.readFile(idDesignReaderPath) !=null) {
            fileReaderHelper.updateFile(idDesignReaderPath, String.valueOf(design_id));
        }
        else {
            fileReaderHelper.writeFile(idDesignReaderPath, String.valueOf(design_id));
        }


        //////

        DesignQuery designQuery = new DesignQuery();
        DesignDbModel designDbModel = designQuery.getProduct(design_id);

        /////

        System.out.println("Database Name: " + designDbModel.getName());
        System.out.println("Database Ref: " + designDbModel.getRef_Num());
        System.out.println("Database Construction: " + designDbModel.getConstruction());

        /////

        try {
            Assert.assertEquals(name,designDbModel.getName());
            Assert.assertEquals(ref,designDbModel.getRef_Num());
            Assert.assertEquals(cons,designDbModel.getConstruction());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");
    }





}
