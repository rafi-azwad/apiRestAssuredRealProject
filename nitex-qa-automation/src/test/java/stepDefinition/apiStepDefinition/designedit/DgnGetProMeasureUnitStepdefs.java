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
import repository.remoteRepo.responseRepo.designedit.DgnGetProMeasureUnitResponseModel;

import java.sql.SQLException;

import static core.Helper.FilePathHelper.idDesignReaderPath;
import static core.urlDefine.apiURL.base_url;

public class DgnGetProMeasureUnitStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    //  CreateCollectionRequestModel createCollectionRequestModel;

    Response getApiResponse;
    String url;

    int ID = 0;
    String name;
    int bID =0;

    @Given("design get pro api unit will be provided")
    public void designGetProApiUnitWillBeProvided() {
        url = base_url;
    }

    @When("user will hit get pro unit api url with {string} and {string} {string}")
    public void userWillHitGetProUnitApiUrlWithAnd(String arg0, String arg1, String arg2) {


        FileReaderHelper file = new FileReaderHelper();
        String id =file.readFile(idDesignReaderPath);
        String payLoad_Id = id + "?";

        url = url + arg0 + payLoad_Id + arg2;

        System.out.println("API URL: ======>>" + url);
    }

    @And("user will get data according to pro measure unit api")
    public void userWillGetDataAccordingToProMeasureUnitApi() {
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @Then("dgn measure unit api will be verified with DB")
    public void dgnMeasureUnitApiWillBeVerifiedWithDB() throws SQLException, ClassNotFoundException {

        DgnGetProMeasureUnitResponseModel dgnGetProMeasureUnitResponseModel = gson.fromJson(getApiResponse.getBody().asString(), DgnGetProMeasureUnitResponseModel.class);



        ID = dgnGetProMeasureUnitResponseModel.getData().get(0).getPomResponse().getId();
        name = dgnGetProMeasureUnitResponseModel.getData().get(0).getPomResponse().getName();
        int cat_id = dgnGetProMeasureUnitResponseModel.getData().get(0).getPomResponse().getCategoryResponse().getId();

        System.out.println("ID ===>" + ID);
        System.out.println("Name ===>" + name);


        DesignQuery designQuery = new DesignQuery();
        DesignDbModel designDbModel = designQuery.getProMeasureUnit(ID);

        try {
            Assert.assertEquals(cat_id,designDbModel.getCat_id());
            Assert.assertEquals(name,designDbModel.getName());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");


    }
}
