package testRunner.webRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;


@CucumberOptions(tags ="@smoke", features = {"src/test/resources/Features/WebFeatures/TC-001-loginFeature/login.feature",
       "src/test/resources/Features/WebFeatures/TC-002-collectionFeature/createCollection.feature"},
        glue = {"stepDefinition"},   monochrome = true,
        dryRun = false,
        plugin = {
                "pretty","html:build/reports/webReport/login/login.html"
        })
@Test
public class CucumberLoginRunnerTest   extends AbstractTestNGCucumberTests {

}


