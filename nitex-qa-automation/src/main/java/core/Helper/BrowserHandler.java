package core.Helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class BrowserHandler {

    public WebDriver driver=null;

    public WebDriver selectBrowser(String browserName, String baseUrl) throws MalformedURLException {
        if(browserName.equalsIgnoreCase("chrome")){
            System.out.println(" passing browser name");
            ChromeOptions options = new ChromeOptions();
            Map<String, Object> prefs = new HashMap<String, Object>();
            Map<String, Object> profile = new HashMap<String, Object>();
            Map<String, Integer> contentSettings = new HashMap<String, Integer>();

            // SET CHROME OPTIONS
            // 0 - Default, 1 - Allow, 2 - Block
            contentSettings.put("notifications", 2);
            contentSettings.put("geolocation", 2);
            profile.put("managed_default_content_settings", contentSettings);
            prefs.put("profile", profile);
            options.addArguments("--remote-allow-origins=*");
            options.setExperimentalOption("prefs", prefs);
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
            driver.get(baseUrl);
            driver.manage().window().maximize();
            return driver;

        }
        else if (browserName.equalsIgnoreCase("firefox")){
            FirefoxOptions options = new FirefoxOptions();
            options.setProfile(new FirefoxProfile());
            options.addPreference("dom.webnotifications.enabled", false);
            options.addPreference("geo.enabled", true);
            options.addPreference("geo.prompt.testing",true);
            options.addPreference("geo.prompt.testing.allow",true);
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver(options);
            driver.get(baseUrl);
            driver.manage().window().maximize();
            return driver;

        }

       else if(browserName.equalsIgnoreCase("lamdaTest")){
            String username = "nitexpl";
            String accessKey = "SUo3oDyL2ivoLSeQhFXTn7VS5w2rSDXKejAkI4QXJbt10lzQzX";
            String gridURL = "https://" + username + ":" + accessKey + "@hub.lambdatest.com/wd/hub";









            System.out.println(" passing browser name");
            ChromeOptions options = new ChromeOptions();
            Map<String, Object> prefs = new HashMap<String, Object>();
            Map<String, Object> profile = new HashMap<String, Object>();
            Map<String, Integer> contentSettings = new HashMap<String, Integer>();

            // SET CHROME OPTIONS
            // 0 - Default, 1 - Allow, 2 - Block
            contentSettings.put("notifications", 2);
            contentSettings.put("geolocation", 2);
            profile.put("managed_default_content_settings", contentSettings);
            prefs.put("profile", profile);
            options.addArguments("--remote-allow-origins=*");
            options.setExperimentalOption("prefs", prefs);


            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("browserName", "chrome"); 	//To specify the browser
            capabilities.setCapability("version", " 114.0.5735.198 ");		//To specify the browser version
            capabilities.setCapability("platform", "macOS Ventura"); 		// To specify the OS
            capabilities.setCapability("build", "Automation Web");               //To identify the test
            capabilities.setCapability("name", "Automation Web");
            capabilities.setCapability("network", true); 		// To enable network logs
            capabilities.setCapability("visual", true); 			// To enable step by step screenshot
            capabilities.setCapability("video", true);			// To enable video recording
            capabilities.setCapability("console", true);

            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver(options);

            RemoteWebDriver remoteWebDriver = new RemoteWebDriver(new URL(gridURL), capabilities);
            remoteWebDriver.get(baseUrl);
            remoteWebDriver.manage().window().maximize();
            remoteWebDriver.setFileDetector(new LocalFileDetector());
            return remoteWebDriver;

        }





     return driver;
    }

}
