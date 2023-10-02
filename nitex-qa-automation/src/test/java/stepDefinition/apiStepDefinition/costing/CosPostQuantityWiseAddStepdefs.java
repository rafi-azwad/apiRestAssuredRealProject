package stepDefinition.apiStepDefinition.costing;

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
import repository.dbModel.costing.CostingDbModel;
import repository.dbModel.query.Costing.CostingQuery;
import repository.remoteRepo.requestRepo.costing.CostingAddQuantityRequestModel;
import repository.remoteRepo.responseRepo.costing.CostingAddQuantityResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import static core.Helper.FilePathHelper.costingQuantityAdd;
import static core.urlDefine.apiURL.base_url;

public class CosPostQuantityWiseAddStepdefs {

    public static int initialCostingId;
    public static Double price;

    private Gson gson = new Gson();
    private String requestCostModel;

    CostingAddQuantityRequestModel costingAddQuantityRequestModel;

    Response postCostApiResponse;
    String url;

    @Given("costing add quantity cost api will be provided")
    public void costingAddQuantityCostApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit get costingquantity api queryparameters {string}")
    public void userWillHitGetCostingquantityApiQueryparametersQp(String params) {

        url = url + params + "add";
        System.out.println(url);
    }

    @And("user will pass body {string} and {string} and {string} and {string}")
    public void userWillPassBodyIdAndMinQuantityAndPriceAndInitialCostingId(String id, String mqu, String price, String intCos) {

        JSONObject requestBody = new FileReaderHelper().readJsonFile(costingQuantityAdd);
        costingAddQuantityRequestModel = new Gson().fromJson(requestBody.toJSONString(), CostingAddQuantityRequestModel.class);

        costingAddQuantityRequestModel.setId(null);
        costingAddQuantityRequestModel.setMinQuantity(mqu);
        costingAddQuantityRequestModel.setPrice(price);
        costingAddQuantityRequestModel.setInitialCostingId(Integer.parseInt(intCos));

        requestCostModel = gson.toJson(costingAddQuantityRequestModel);
        System.out.println("this is request model: >>>>" + requestCostModel);


    }

    @And("user will get quantity according to the costing parameters")
    public void userWillGetQuantityAccordingToTheCostingParameters() throws NoSuchAlgorithmException, KeyManagementException {

        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postCostApiResponse.body().asString());

    }

    @And("user will get costing quantity according to id")
    public void userWillGetCostingQuantityAccordingToId() {

        CostingAddQuantityResponseModel costingAddQuantityResponseModel = gson.fromJson(postCostApiResponse.getBody().asString(), CostingAddQuantityResponseModel.class);
          initialCostingId = costingAddQuantityResponseModel.getPayload().
                getQuantityWiseInitialCostingResponseList().get(1).getId();

        System.out.println("API First initialCostingId V1: " + initialCostingId);

         price = costingAddQuantityResponseModel.getPayload().
                getQuantityWiseInitialCostingResponseList().get(1).getPrice();

    }

    @Then("data will be saved to quantity db")
    public void dataWillBeSavedToQuantityDb() throws SQLException, ClassNotFoundException {

        System.out.println("API First initialCostingId V2: " + initialCostingId);

        CostingQuery costingQuery = new CostingQuery();
        CostingDbModel costingDbModel = costingQuery.costingQuantityWiseCosting(initialCostingId);

        System.out.println("Database Output Quantity: " + costingDbModel.getMinimum_quantity());
        System.out.println("Database Output Q_Price: " + costingDbModel.getPrice());

        System.out.println("API Price: " + price);


        try {
            Assert.assertEquals(costingDbModel.getPrice(),price);

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");



    }
}
