package stepDefinition.apiStepDefinition.collection;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.FileReaderHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import repository.dbModel.collection.CollectionDbModel;
import repository.dbModel.query.Collection.CollectionQuery;
import repository.remoteRepo.responseRepo.collection.CollectionGetSingleMemberResponseModel;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static core.Helper.FilePathHelper.member_id;
import static core.urlDefine.apiURL.base_url;

public class CollectionGetSingleMemberStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    Response getApiResponse;
    String url;

    public static int ID=0;
    public static String name;

    public static int brandID=0;

    @Given("get single member api url will be given")
    public void getSingleMemberApiUrlWillBeGiven() {
        url = base_url;
    }

    @When("get single member will passdown api url endpoints {string} and {string} and {string}")
    public void getSingleMemberWillPassdownApiUrlEndpointsAndAnd(String arg0, String arg1, String arg2) {

        FileReaderHelper file = new FileReaderHelper();
        String id =file.readFile(member_id);
        int member = Integer.parseInt(id);

        url = url + arg0 + member + "/" + arg2;
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @Then("get single member data will be fetched and verified with db")
    public void getSingleMemberDataWillBeFetchedAndVerifiedWithDb() throws SQLException, ClassNotFoundException {

        CollectionGetSingleMemberResponseModel[] collectionGetSingleMemberResponseModel = gson.fromJson(getApiResponse.getBody().asString(), CollectionGetSingleMemberResponseModel[].class);
       List<CollectionGetSingleMemberResponseModel> memberList = Arrays.asList(collectionGetSingleMemberResponseModel);

        ID = memberList.get(0).getId();
        name = memberList.get(0).getName();
        String email = memberList.get(0).getEmail();

        System.out.println("Response Name: " + name);
        System.out.println("Response ID: " + ID);
        System.out.println("Response Email: " + email);

        CollectionQuery collectionQuery = new CollectionQuery();
        CollectionDbModel collectionDbModel = collectionQuery.getcollectionGetSingleMember(ID);

        String name_db = collectionDbModel.getName();
        String email_db = collectionDbModel.getEmail();

        System.out.println("Database OwnerName: " + name_db);
        System.out.println("Database Email: " + email);

        try {
            Assert.assertEquals(name_db,name);
            Assert.assertEquals(email_db,email);

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
