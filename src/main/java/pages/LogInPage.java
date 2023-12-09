package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

    public WebDriver driver;

     public By userNameInputField = By.id("user-name");
     public By passwordInputField = By.id("password");
     public By logInButton = By.id("login-button");

      public By errorMessage = By.xpath("//*[text()='Epic sadface: Username and password do not match any user in this service']");
      public By errorMessageWhenUserNameFieldIsLeftEmpty = By.xpath("//*[text()='Epic sadface: Username is required']");


     public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUserName(String userName){
         driver.findElement(userNameInputField).sendKeys(userName);
    }

    public void enterPassword(String passwrod){
         driver.findElement(passwordInputField).sendKeys(passwrod);
    }

    public void clickOnLoginButton(){
         driver.findElement(logInButton).click();
    }

    public void successfulLogin(){
         driver.findElement(userNameInputField).sendKeys("standard_user");
         driver.findElement(passwordInputField).sendKeys("secret_sauce");
         driver.findElement(logInButton).click();

    }
    public boolean errorMessageIsDisplayed(){
         return driver.findElement(errorMessage).isDisplayed();
    }

    public boolean errorMessageWhenUserNameFieldIsLeftEmptyIsDisplayed(){
         return driver.findElement(errorMessageWhenUserNameFieldIsLeftEmpty).isDisplayed();
    }






}
