package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage {



    public WebDriver driver;


    public By successfulCheckoutMessage = By.xpath("//*[text()='Thank you for your order!']");


    public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean successfulCheckoutMessageIsDisplayed(){
        return driver.findElement(successfulCheckoutMessage).isDisplayed();
    }




}
