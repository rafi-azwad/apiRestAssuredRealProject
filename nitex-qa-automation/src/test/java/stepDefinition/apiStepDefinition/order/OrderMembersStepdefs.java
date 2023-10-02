package stepDefinition.apiStepDefinition.order;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import repository.remoteRepo.responseRepo.order.OrderMembersResponseModel;

import java.util.Arrays;
import java.util.List;

import static core.urlDefine.apiURL.base_url;

public class OrderMembersStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    Response getApiResponse;
    String url;

    public static int ID=0;
    public static String name;
    public static String email;

    public static int brandID=0;





    @Given("base order api url will be provided")
    public void baseOrderApiUrlWillBeProvided() {

        url = base_url;
    }

    @When("User will input orders {string} , {string} , {string}")
    public void userWillInputOrders(String order, String orderNumber, String members) {

        url = url+order+orderNumber+members;
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());

    }

    @And("user will call order api")
    public void userWillCallOrderApi() {
        OrderMembersResponseModel[] orderMembersResponseModels = gson.fromJson(getApiResponse.getBody().asString(), OrderMembersResponseModel[].class);
        List<OrderMembersResponseModel> orderMembersResponseModelList = Arrays.asList(orderMembersResponseModels);



        ID = orderMembersResponseModelList.get(0).getId();
        name = orderMembersResponseModelList.get(0).getName();
       email=orderMembersResponseModelList.get(0).getEmail();




        System.out.println("Order member 0 index id:"+ID);
        System.out.println("Order member 0 index name:"+name);
        System.out.println("Order member 0 index email:"+email);

    }

    @Then("It will return order members info and saved in db")
    public void itWillReturnOrderMembersInfoAndSavedInDb() {
    }
}
