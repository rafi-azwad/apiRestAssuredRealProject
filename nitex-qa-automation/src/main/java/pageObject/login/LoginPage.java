package pageObject.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    WebDriver driver;

    By emailId = By.id("standard-adornment-email");

    By passwordId = By.id("standard-adornment-password");
    By loginXpath = By.xpath("//button[text()=\"Log in\"]");





    public LoginPage(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
    }

   public void setEmailId(String email){
        driver.findElement(emailId).sendKeys(email);

   }
    public void setPasswordId(String password){
        driver.findElement(passwordId).sendKeys(password);

    }

    public void clickLoginButton() {
        driver.findElement(loginXpath).click();
    }
}
