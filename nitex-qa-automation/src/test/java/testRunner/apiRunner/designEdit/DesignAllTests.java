package testRunner.apiRunner.designEdit;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;


@CucumberOptions(
        tags ="@smoke",
        features = {
                "src/test/resources/Features/ApiFeatures/DesignEdit/designArtBoardAdd.feature",
                "src/test/resources/Features/ApiFeatures/DesignEdit/designDocgroupAdd.feature",
                "src/test/resources/Features/ApiFeatures/DesignEdit/designDownloadLink.feature",
                "src/test/resources/Features/ApiFeatures/DesignEdit/designFabricAdd.feature",
                "src/test/resources/Features/ApiFeatures/DesignEdit/designProDevComNew.feature",
                "src/test/resources/Features/ApiFeatures/DesignEdit/designProductAdd.feature",
                "src/test/resources/Features/ApiFeatures/DesignEdit/designProductAddV2.feature",
                "src/test/resources/Features/ApiFeatures/DesignEdit/designProductRemove.feature",
                "src/test/resources/Features/ApiFeatures/DesignEdit/designProMeasurementRmv.feature",
                "src/test/resources/Features/ApiFeatures/DesignEdit/designProMesSizeCat.feature",
                "src/test/resources/Features/ApiFeatures/DesignEdit/designPretSequence.feature",
                "src/test/resources/Features/ApiFeatures/DesignEdit/designPresentationLink.feature",
                "src/test/resources/Features/ApiFeatures/DesignEdit/designInspirationStyle.feature",
                "src/test/resources/Features/ApiFeatures/DesignEdit/designGetTagsType.feature",
                "src/test/resources/Features/ApiFeatures/DesignEdit/designGetProMeasureUnit.feature",
                "src/test/resources/Features/ApiFeatures/DesignEdit/designGetProMeasure.feature",
                "src/test/resources/Features/ApiFeatures/DesignEdit/designGetProDevCom.feature",
                "src/test/resources/Features/ApiFeatures/DesignEdit/designGetPresentPhoto.feature",
                "src/test/resources/Features/ApiFeatures/DesignEdit/designGetArtBoardCanvas.feature",
                "src/test/resources/Features/ApiFeatures/DesignEdit/designPutMaterialUpdate.feature",
                "src/test/resources/Features/ApiFeatures/DesignEdit/designPutProDocPinned.feature",
                "src/test/resources/Features/ApiFeatures/DesignEdit/designPutProDocUnPinned.feature",
                "src/test/resources/Features/ApiFeatures/DesignEdit/designPutProStyleInfo.feature"
        },
        glue = {"stepDefinition"},
        monochrome = true,
        dryRun = false,
        plugin = {
                "pretty",
                "html:build/reports/apiReports/designAndedit/designAll.html"
        })
@Test
public class DesignAllTests extends AbstractTestNGCucumberTests {

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