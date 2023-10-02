package stepDefinition.apiStepDefinition.sample;

import com.google.gson.Gson;
import core.Helper.ApiCallHelper;
import core.Helper.HeaderFormatHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;
import repository.dbModel.query.Sample.SampleQuery;
import repository.dbModel.sample.SampleDbModel;
import repository.remoteRepo.responseRepo.sample.SampleGetProductMaterialResponseModel;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import static core.urlDefine.apiURL.base_url;

public class SampleGetProductMaterialStepdefs {

    private Gson gson = new Gson();
    private String requestModel;
    Response getApiResponse;
    String url;

    public static int document_id=0;

    public static int ID=0;
    public static int lib_id=0;
    public static String ref_no;

    public static String name;
    public static String description;

    public static String materialType;
    public static String email;



    @Given("design sample product material api will be provided")
    public void designSampleProductMaterialApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit the sample product material api url with {string}, {string} and {string}")
    public void userWillHitTheSampleProductMaterialApiUrlWithAnd(String arg0, String arg1, String arg2) {

        url = url + arg0 + arg1 + arg2;
        getApiResponse = ApiCallHelper.getCall(HeaderFormatHelper.commonHeadersForNewAgent(),url);
        System.out.println(getApiResponse.body().asString());
    }

    @And("user will get product material data according to the api")
    public void userWillGetProductMaterialDataAccordingToTheApi() {

        SampleGetProductMaterialResponseModel[] sampleGetProductMaterialResponseModels = gson.fromJson(getApiResponse.getBody().asString(), SampleGetProductMaterialResponseModel[].class);
        List<SampleGetProductMaterialResponseModel> sampleList = Arrays.asList(sampleGetProductMaterialResponseModels);

        ID = sampleList.get(0).getId();
        ref_no = sampleList.get(0).getReferenceNumber();
        lib_id = sampleList.get(0).getLibraryId();
        document_id = sampleList.get(0).getDocumentId();
        materialType = sampleList.get(0).getMaterialType();
        description = sampleList.get(0).getDescription();



        System.out.println("Ref_No: " + ref_no);
        System.out.println("Library ID: " + lib_id);
        System.out.println("Document ID: " + document_id);
        System.out.println("Material Type: " + document_id);
        System.out.println("Description: " + description);
    }

    @Then("sample find product material api will be verified with DB")
    public void sampleFindProductMaterialApiWillBeVerifiedWithDB() throws SQLException, ClassNotFoundException {

        SampleQuery sampleQuery = new SampleQuery();
        SampleDbModel sampleDbModel = sampleQuery.getsampleGetMaterials(ID);

        System.out.println("Description: " + sampleDbModel.getDescription());
        System.out.println("Ref Number: " + sampleDbModel.getRef_number());

        try {
            Assert.assertEquals(description,sampleDbModel.getDescription());
            Assert.assertEquals(ref_no,sampleDbModel.getRef_number());


        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");

    }
}
