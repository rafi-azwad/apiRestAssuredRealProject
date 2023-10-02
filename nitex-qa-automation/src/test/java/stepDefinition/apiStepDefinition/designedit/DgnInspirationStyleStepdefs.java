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
import org.json.simple.JSONObject;
import org.testng.Assert;
import repository.remoteRepo.requestRepo.designedit.DgnInspirationStyleRequestModel;
import repository.remoteRepo.responseRepo.designedit.DgnInspirationStyleResponseModel;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import static core.Helper.FilePathHelper.DgnInspirationStyle;
import static core.urlDefine.apiURL.base_url;

public class DgnInspirationStyleStepdefs {

    private Gson gson = new Gson();
    private String requestCostModel;

    DgnInspirationStyleRequestModel dgnInspirationStyleRequestModel;

    Response postCostApiResponse;
    String url;




    @Given("design inspiration style api will be provided")
    public void designInspirationStyleApiWillBeProvided() {
        url = base_url;
    }

    @When("user will hit inspiration style api {string} and {string} and {string}")
    public void userWillHitInspirationStyleApiAndAnd(String arg0, String arg1, String arg2) {
        url = url + arg0 + arg1 + arg2;

    }

    @And("user will hit inspiration style with body {string} and {string} and {string} and {string}")
    public void userWillHitInspirationStyleWithBodyAndAndAnd(String arg0, String arg1, String arg2, String arg3) throws NoSuchAlgorithmException, KeyManagementException {
        JSONObject requestBody = new FileReaderHelper().readJsonFile(DgnInspirationStyle);
        dgnInspirationStyleRequestModel = new Gson().fromJson(requestBody.toJSONString(), DgnInspirationStyleRequestModel.class);

       /* dgnInspirationStyleRequestModel.setDocumentDTOList(List.of(DgnInspirationStyleRequestModel.DocumentDTOListBean.builder()
                .base64Str(arg0)
                .name(arg1)
                .docMimeType(arg2)
                .documentType(arg3)
                .build()));
*/

        dgnInspirationStyleRequestModel.getDocumentDTOList().get(0).setBase64Str(arg0);
        dgnInspirationStyleRequestModel.getDocumentDTOList().get(0).setName(arg1);
        dgnInspirationStyleRequestModel.getDocumentDTOList().get(0).setDocMimeType(arg2);
        dgnInspirationStyleRequestModel.getDocumentDTOList().get(0).setDocumentType(arg3);


        requestCostModel = gson.toJson(dgnInspirationStyleRequestModel);
        postCostApiResponse = ApiCallHelper.postCall(HeaderFormatHelper.commonHeadersForNewAgent(),requestCostModel,url);
        System.out.println(postCostApiResponse.body().asString());
    }

    @Then("inspiration style will be verified with DB")
    public void inspirationStyleWillBeVerifiedWithDB() {



        DgnInspirationStyleResponseModel dgnInspirationStyleResponseModel = gson.fromJson(postCostApiResponse.getBody().asString(), DgnInspirationStyleResponseModel.class);

        String a = dgnInspirationStyleResponseModel.getProductDesignDocResponse().getDocType();

        System.out.println("================>" + a);
        String b = dgnInspirationStyleRequestModel.getDocumentDTOList().get(0).getDocumentType();
        System.out.println("================>" + b);



        try {

            Assert.assertEquals(a,b);

        } catch (AssertionError e) {
            System.out.println("Not equal");
            throw e;
        }
        System.out.println("Equal");



    }
}
