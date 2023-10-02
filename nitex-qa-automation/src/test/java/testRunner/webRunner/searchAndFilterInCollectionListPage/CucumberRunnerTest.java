package testRunner.webRunner.searchAndFilterInCollectionListPage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(tags ="@smoke", features = {"src/test/resources/Features/WebFeatures/TC-001-loginFeature/login.feature",
        "src/test/resources/Features/WebFeatures/TC-008-searchCollection/searchCollection.feature",
        "src/test/resources/Features/WebFeatures/TC-009-searchCollectionBasedDesignNumber/searchByDesignNumber.feature",
        "src/test/resources/Features/WebFeatures/TC-010-sortingBasedOnNewestFeature/sortingBasedOnNewest.feature",
        "src/test/resources/Features/WebFeatures/TC-011-sortingBasedOnOldestFeature/sortingBasedOnOldest.feature",
        "src/test/resources/Features/WebFeatures/TC-012-sortingBasedOnLastModifiedFeature/sortingBasedLastModified.feature",
        "src/test/resources/Features/WebFeatures/TC-013-ClearSortingOption/clearSortingOption.feature",
        "src/test/resources/Features/WebFeatures/TC-014-clearSearchValueFeature/clearSearchValue.feature",
        "src/test/resources/Features/WebFeatures/TC-015-filterBasedOnMineFeature/filterBasedOnMine.feature",
        "src/test/resources/Features/WebFeatures/TC-016-filterBasedOnSharedFeature/filterBasedOnshared.feature",
        "src/test/resources/Features/WebFeatures/TC-017-filterBasedOnDevelopmentFeature/filterBasedOnDevelopment.feature",
        "src/test/resources/Features/WebFeatures/TC-018-filterBasedOnComplete&PublishedFeature/filterBasedOnComplete&Published.feature",
        "src/test/resources/Features/WebFeatures/TC-019-filterBasedOnStatusNitexDesignFeature/filterBesedOnStatusNitexDesign.feature",
       "src/test/resources/Features/WebFeatures/TC-020-filterBasedOnStatus_PresentationFeature/filterBasedOnStatus_Presentation.feature",
       "src/test/resources/Features/WebFeatures/TC-021-filterBasedOnStatus_BuyerRequestFuture/filterBasedOnStatus_BuyerRequest.feature",
       "src/test/resources/Features/WebFeatures/TC-022-filterBasedOnCatagory_JacketFeature/filterBasedOnCatagory_Jacket.feature",
       "src/test/resources/Features/WebFeatures/TC-023-filterBasedOnCategory_ZipPoloFeature/filterBasedOnCategory_ZipPolo.feature",
        "src/test/resources/Features/WebFeatures/TC-024-filterBasedOnCategory_ShirtFeature/filterBasedOnCategory_Shirt.feature",
        "src/test/resources/Features/WebFeatures/TC-025-filterBasedOnMarket_GirlsFeature/filterBasedOnMarket_Girls.feature",
        "src/test/resources/Features/WebFeatures/TC-026-filterBasedOnMarket_WomanFeature/filterBasedOnMarket_Woman.feature",
        "src/test/resources/Features/WebFeatures/TC-027-filterBasedOnMarket_InfantFeature/filterBasedOnMarket_Infant.feature"},
        glue = {"stepDefinition"},   monochrome = true,
        dryRun = false,
        plugin = {
                "pretty","html:build/reports/webReport/searchAndFilterInCollectionListPage/searchAndFilter.html"
        })
@Test
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
}
