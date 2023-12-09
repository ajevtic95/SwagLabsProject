package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutYourInformationPage {

    public WebDriver driver;


    public By checkoutInfName = By.id("first-name");
    public By checkoutInfLastName = By.id("last-name");
    public By checkoutZipCode = By.id("postal-code");
    public By checkoutContinueButton = By.id("continue");


    public CheckoutYourInformationPage(WebDriver driver) {
        this.driver = driver;
    }


    public void successfulInformationInput() {
        driver.findElement(checkoutInfName).sendKeys("Aleksandar");
        driver.findElement(checkoutInfLastName).sendKeys("Jevtic");
        driver.findElement(checkoutZipCode).sendKeys("11090");
        driver.findElement(checkoutContinueButton).click();
    }
}


