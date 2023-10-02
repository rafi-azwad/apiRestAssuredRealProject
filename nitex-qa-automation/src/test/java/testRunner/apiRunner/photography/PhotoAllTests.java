package testRunner.apiRunner.photography;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;


@CucumberOptions(
        tags ="@smoke",
        features = {
                "src/test/resources/Features/ApiFeatures/Photography/photoGetAll.feature",
                "src/test/resources/Features/ApiFeatures/Photography/photoGetDesignCount.feature",
                "src/test/resources/Features/ApiFeatures/Photography/photoGetSearch.feature",
                "src/test/resources/Features/ApiFeatures/Photography/photoGetUserSearch.feature",
                "src/test/resources/Features/ApiFeatures/Photography/photoPostGroupAdd.feature",
                "src/test/resources/Features/ApiFeatures/Photography/photoPostUpload.feature"
        },
        glue = {"stepDefinition"},
        monochrome = true,
        dryRun = false,
        plugin = {
                "pretty",
                "html:build/reports/apiReports/photography/photoAll.html"
        })
@Test
public class PhotoAllTests extends AbstractTestNGCucumberTests {

}

//"src/test/resources/Features/ApiFeatures/Costing/costingRunFetch.feature"
//"src/test/resources/Features/ApiFeatures/Costing/costingUpdateRemarks.feature"
// "src/test/resources/Features/ApiFeatures/Costing/cosGetBrandAllPage.feature"
//"src/test/resources/Features/ApiFeatures/Costing/cosGetBrandAllPageStatus.feature"
//"src/test/resources/Features/ApiFeatures/Costing/cosGetQuoteSingle.feature"
// "src/test/resources/Features/ApiFeatures/Costing/cosGetQuoteMembers.feature"
// "src/test/resources/Features/ApiFeatures/Costing/cosGetQuoteReqCount.feature"
//"src/test/resources/Features/ApiFeatures/Costing/cosGetQuoteReqAll.feature"
//"src/test/resources/Features/ApiFeatures/Costing/cosGetQuoteReqSingle.feature"
//"src/test/resources/Features/ApiFeatures/Costing/cosGetQuoteSearch.feature"
//"src/test/resources/Features/ApiFeatures/Costing/cosGetInitialCosDesignCount.feature"
//"src/test/resources/Features/ApiFeatures/Costing/cosGetInitialCostingList.feature"
//"src/test/resources/Features/ApiFeatures/Costing/cosGetFabricType.feature"
//"src/test/resources/Features/ApiFeatures/Costing/costingPutUpdateVariant.feature"
// "src/test/resources/Features/ApiFeatures/DesignEdit/designProductAddV2.feature"