package testRunner.webRunner.accountManagerJourney;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(tags ="@smoke", features = {"src/test/resources/Features/WebFeatures/TC-001-loginFeature/login.feature",
        "src/test/resources/Features/WebFeatures/TC-002-collectionFeature/createCollection.feature",
         "src/test/resources/Features/WebFeatures/TC-003-addDesign/addDesign.feature",
         "src/test/resources/Features/WebFeatures/TC-004-deleteBeforeUpdate/deleteBeforeUpdate.feature",
         "src/test/resources/Features/WebFeatures/TC-005-updateDesignInformation/updateDesignInformation.feature",
         "src/test/resources/Features/WebFeatures/TC-006-deleteUpdateDesign/deleteUpdateDesign.feature",
        "src/test/resources/Features/WebFeatures/TC-007-createOrder/createOrder.feature"},
        glue = {"stepDefinition"},   monochrome = true,
        dryRun = false,
        plugin = {
                "pretty","html:build/reports/webReport/accountManagerJourney/accountManagerJourney.html"
        })
@Test
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
}
