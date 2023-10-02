package testRunner.webRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = {"src/test/resources/Features/WebFeatures/TC-001-loginFeature/login.feature","src/test/resources/Features/WebFeatures/nitexStudioFeature/nitexStudio.feature"},
        glue = {"stepDefinition"},   monochrome = true,
        dryRun = false,
        plugin = {
                "pretty","html:build/reports/webReport/editStyle/editStyle.html"
        })
@Test
public class CucumberStudioEditRunnerTest extends AbstractTestNGCucumberTests  {

}
