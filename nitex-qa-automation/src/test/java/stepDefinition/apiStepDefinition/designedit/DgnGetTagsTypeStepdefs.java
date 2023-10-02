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
import repository.remoteRepo.responseRepo.designedit.DgnGetTagsTypeResponseModel;

import java.sql.SQLException;
import java.util.List;

import static core.urlDefine.apiURL.base_url;
import static java.util.Arrays.asList;

public class DgnGetTagsTypeStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    //  CreateCollectionRequestModel createCollectionRequestModel;

    Response getApiResponse;
    String url;

    int ID = 0;
    String getText;

    @Given("design tag type api will be provided")
    public void designTagTypeApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit the type api url with {string} and {string} {string} and {string}")
    public void userWillHitTheTypeApiUrlWithAndAnd(String arg0, String arg1, String arg2, String arg3) {

        url = url + arg0 + arg1 + arg2 + arg3;
    }

    @And("user will get data according to type api")
    public void userWillGetDataAccordingToTypeApi() {
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @Then("dgn tags type api will be verified with DB")
    public void dgnTagsTypeApiWillBeVerifiedWithDB() throws SQLException, ClassNotFoundException {

        DgnGetTagsTypeResponseModel[] dgnGetTagsTypeResponseModel = gson.fromJson(getApiResponse.getBody().asString(), DgnGetTagsTypeResponseModel[].class);
        List<DgnGetTagsTypeResponseModel> dgnGetTagsTypeResponseModels = asList(dgnGetTagsTypeResponseModel);


        ID = dgnGetTagsTypeResponseModels.get(0).getId();
        getText = dgnGetTagsTypeResponseModels.get(0).getText();

        System.out.println("==========>" + ID);
        System.out.println("==========>" + getText);

        DesignQuery designQuery = new DesignQuery();
        DesignDbModel designDbModel = designQuery.getTagsType(ID);


        System.out.println("DB Response: " + designDbModel.getTags());

        try {
            Assert.assertEquals(getText,designDbModel.getTags());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
