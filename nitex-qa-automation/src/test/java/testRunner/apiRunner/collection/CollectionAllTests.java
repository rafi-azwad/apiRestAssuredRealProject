package testRunner.apiRunner.collection;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;


@CucumberOptions(
        tags ="@smoke",
        features = {
                "src/test/resources/Features/ApiFeatures/Collection/collectionCreate.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionFetch.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionUpdate.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionPostBulkReq.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionPostLike.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionPostPersonalSet.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionPostPhotoReq.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionPostPin.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionPostQuoteReq.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionPostSampleReq.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionPostSendToBd.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionPostShare.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionPostUnPin.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionMy.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionFilterCat.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionGetAllBrand.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionGetAllMaterialSeason.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionGetDownloadReport.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionGetFabricType.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionGetMaterialSeason.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionGetOrganogramSample.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionGetProductSearch.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionGetProducts.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionGetSampleDev.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionGetSingleMember.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionGetStatus.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionGetSubCategory.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionGetUserNEmailType.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionGetUserSearch.feature",
                "src/test/resources/Features/ApiFeatures/Collection/collectionDelete.feature"


        },
        glue = {"stepDefinition"},
        monochrome = true,
        dryRun = false,
        plugin = {
                "pretty",
                "html:build/reports/apiReports/collection/collectionAll.html"
        })
@Test
public class CollectionAllTests extends AbstractTestNGCucumberTests {

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