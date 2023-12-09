package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {

    public WebDriver driver;


    public By checkoutFinishButton = By.id("finish");


    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }



    public void clickOnFinishButton(){
        driver.findElement(checkoutFinishButton).click();
    }











}
