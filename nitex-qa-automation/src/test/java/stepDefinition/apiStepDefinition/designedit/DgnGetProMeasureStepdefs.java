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
import org.testng.Assert;
import repository.dbModel.designedit.DesignDbModel;
import repository.dbModel.query.DesignEdit.DesignQuery;
import repository.remoteRepo.responseRepo.designedit.DgnGetProMeasureResponseModel;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static core.Helper.FilePathHelper.idDesignReaderPath;
import static core.urlDefine.apiURL.base_url;

public class DgnGetProMeasureStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    //  CreateCollectionRequestModel createCollectionRequestModel;

    Response getApiResponse;
    String url;

    int ID = 0;
    String name;
    int bID =0;



    @Given("design get pro api will be provided")
    public void designGetProApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit get pro api url with {string} and {string} {string}")
    public void userWillHitGetProApiUrlWithAnd(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;
        System.out.println(url);
    }

    @And("user will also hit get pro api url with {string} and {string} {string}")
    public void userWillAlsoHitGetProApiUrlWithAnd(String arg0, String arg1, String arg2) {

        FileReaderHelper file = new FileReaderHelper();
        String id =file.readFile(idDesignReaderPath);
        int payLoad_Id = Integer.parseInt(id);

        url = url + arg0 + arg1 + payLoad_Id;
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        //System.out.println(getApiResponse.body().asString());

    }

    @And("user will get data according to pro measure api")
    public void userWillGetDataAccordingToProMeasureApi() {
        DgnGetProMeasureResponseModel[] dgnGetProMeasureResponseModel = gson.fromJson(getApiResponse.getBody().asString(), DgnGetProMeasureResponseModel[].class);

        List<DgnGetProMeasureResponseModel> dgnGetProMeasureResponseModelList = Arrays.asList(dgnGetProMeasureResponseModel);


         ID = dgnGetProMeasureResponseModelList.get(2).getId();
         name = dgnGetProMeasureResponseModelList.get(2).getName();
         bID = dgnGetProMeasureResponseModelList.get(2).getBrandId();

        System.out.println(ID);
        System.out.println(name);
        System.out.println(bID);


    }

    @Then("dgn measure api will be verified with DB")
    public void dgnMeasureApiWillBeVerifiedWithDB() throws SQLException, ClassNotFoundException {

        DesignQuery designQuery = new DesignQuery();
        DesignDbModel designDbModel = designQuery.getProMeasureBoard(ID);

        System.out.println("Database ID : "+ designDbModel.getBrand_Id());
        System.out.println("Database Name : "+ designDbModel.getName());

        try {
            Assert.assertEquals(bID,designDbModel.getBrand_Id());
            Assert.assertEquals(name,designDbModel.getName());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");


    }
}
