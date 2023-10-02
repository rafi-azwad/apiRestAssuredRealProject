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
import repository.remoteRepo.responseRepo.collection.CollectionGetAllBrandResponseModel;

import java.sql.SQLException;

import static core.Helper.FilePathHelper.brand_id;
import static core.urlDefine.apiURL.base_url;

public class CollectionGetAllBrandStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    Response getApiResponse;
    String url;

    public static int ID=0;
    public static String name;

    public static int brandID=0;


    @Given("get all brand api url will be given")
    public void getAllBrandApiUrlWillBeGiven() {
        url = base_url;
    }

    @When("get all brand will passdown api url endpoints {string} and {string}")
    public void getAllBrandWillPassdownApiUrlEndpointsAnd(String arg0, String arg1) {
        url = url + arg0 + arg1;
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());

        CollectionGetAllBrandResponseModel collectionGetAllBrandResponseModel = gson.fromJson(getApiResponse.getBody().asString(), CollectionGetAllBrandResponseModel.class);
        //List<CollectionGetAllBrandResponseModel> brandList = Arrays.asList(collectionGetAllBrandResponseModel);
         ID = collectionGetAllBrandResponseModel.getData().get(0).getId();
         name = collectionGetAllBrandResponseModel.getData().get(0).getName();
        brandID = collectionGetAllBrandResponseModel.getData().get(0).getId();

        FileReaderHelper fileReaderHelper= new  FileReaderHelper();
        if(fileReaderHelper.readFile(brand_id) !=null) {
            fileReaderHelper.updateFile(brand_id, String.valueOf(brandID));

        }
        else {
            fileReaderHelper.writeFile(brand_id, String.valueOf(brandID));
        }


        System.out.println("APi ID: " + ID);
        System.out.println("APi Name: " + name);

    }

    @Then("get all brand will be fetched and verified")
    public void getAllBrandWillBeFetchedAndVerified() throws SQLException, ClassNotFoundException {

        CollectionQuery collectionQuery = new CollectionQuery();
        CollectionDbModel collectionDbModel = collectionQuery.getAllBrand(ID);

        String db_name = collectionDbModel.getName();

        System.out.println("BRAND NAME :" + db_name);

        try {
            Assert.assertEquals(db_name,name);

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
