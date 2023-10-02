package stepDefinition.apiStepDefinition.costing;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import repository.dbModel.costing.CostingDbModel;
import repository.dbModel.query.Costing.CostingQuery;
import repository.remoteRepo.responseRepo.costing.CosGetQuoteMembersResponseModel;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static core.urlDefine.apiURL.costing_run_url;

public class CosGetQuoteMembersStepdefs {

    private Gson gson = new Gson();
    private String requestModel;


    Response getApiResponse;
    String url;

    @Given("costing add cost quote members api will be provided")
    public void costingAddCostQuoteMembersApiWillBeProvided() {

        url = costing_run_url + "quote/";

    }

    @When("user will hit get costing quote members api {string} {string}")
    public void userWillHitGetCostingQuoteMembersApi(String arg0, String arg1) {

        url = url + arg0 + arg1;
        System.out.println(url);
    }

    @And("user will get data according to the quote members")
    public void userWillGetDataAccordingToTheQuoteMembers() {

        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @Then("user will get costing quote members as id")
    public void userWillGetCostingQuoteMembersAsId() throws SQLException, ClassNotFoundException {

        CosGetQuoteMembersResponseModel[] cosGetQuoteMembersResponseModel = gson.fromJson(getApiResponse.getBody().asString(), CosGetQuoteMembersResponseModel[].class);

        List<CosGetQuoteMembersResponseModel> cosGetQuoteMemberslList = Arrays.asList(cosGetQuoteMembersResponseModel);

        System.out.println("This is ID --- " + cosGetQuoteMemberslList.get(0).getId());
        System.out.println("This is Name --- " + cosGetQuoteMemberslList.get(0).getName());
        System.out.println("This is Name --- " + cosGetQuoteMemberslList.get(0).getDesignation());

        int databaseID = cosGetQuoteMemberslList.get(0).getId();

        CostingQuery costingQuery = new CostingQuery();
        CostingDbModel costingDbModel = costingQuery.costingQuoteMembers(databaseID);

        System.out.println("Database Member Name: "+ costingDbModel.getName());
        System.out.println("Database Member Designation: "+ costingDbModel.getDesignation());

        try {
            Assert.assertEquals(costingDbModel.getName(),cosGetQuoteMemberslList.get(0).getName());
            Assert.assertEquals(costingDbModel.getDesignation(),cosGetQuoteMemberslList.get(0).getDesignation());

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");


    }
}
