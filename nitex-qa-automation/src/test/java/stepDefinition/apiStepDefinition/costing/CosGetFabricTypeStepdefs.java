package stepDefinition.apiStepDefinition.costing;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import repository.remoteRepo.responseRepo.costing.CosGetFabricTypeResponseModel;

import java.util.Arrays;
import java.util.List;

import static core.urlDefine.apiURL.costing_run_url;

public class CosGetFabricTypeStepdefs {


    private Gson gson = new Gson();
    private String requestModel;
    //  CreateCollectionRequestModel createCollectionRequestModel;

    Response getApiResponse;
    String url;


    @Given("costing fabric type api will be provided")
    public void costingFabricTypeApiWillBeProvided() {
        url = costing_run_url;
    }

    @When("user will hit fabric type api {string} and {string} and {string}")
    public void userWillHitFabricTypeApiAndAnd(String arg0, String arg1, String arg2) {

        url = url + arg0 + arg1 + arg2;
        System.out.println(url);

        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);

        System.out.println(getApiResponse.body().asString());
    }

    @Then("user will get fabric type data according to id data will be saved to db")
    public void userWillGetFabricTypeDataAccordingToIdDataWillBeSavedToDb() {

        CosGetFabricTypeResponseModel[] cosGetFabricTypeResponseModel = gson.fromJson(getApiResponse.getBody().asString(), CosGetFabricTypeResponseModel[].class);

        List<CosGetFabricTypeResponseModel> cosGetFabricTypeResponseModelList = Arrays.asList(cosGetFabricTypeResponseModel);


        System.out.println("code : " + cosGetFabricTypeResponseModelList.get(0).getCode());
        System.out.println("value : " +  cosGetFabricTypeResponseModelList.get(0).getValue());

    }
}
