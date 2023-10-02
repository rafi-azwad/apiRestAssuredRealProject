package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


@CucumberOptions(tags ="@smoke",
        features = {"src/test/resources/Features/ApiFeatures/collectionCreate.feature",
                "src/test/resources/Features/ApiFeatures/collectionFetch.feature",
                "src/test/resources/Features/ApiFeatures/collectionUpdate.feature"},
        glue = {"stepDefinition"},
        monochrome = true,
        dryRun = false,
        plugin = {
                "pretty","html:build/reports/feature.html"
        })
@Test
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}

/*
"src/test/resources/Features/ApiFeatures/collectionCreate.feature",
"src/test/resources/Features/ApiFeatures/collectionFetch.feature",
"src/test/resources/Features/ApiFeatures/collectionUpdate.feature"*/
