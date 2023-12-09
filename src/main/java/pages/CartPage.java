package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

   public WebDriver driver;

    public By removeFromCartButton = By.xpath("//*[@class='btn btn_secondary btn_small cart_button']");

    public By checkoutButton = By.id("checkout");



    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnCheckoutButton(){
        driver.findElement(checkoutButton).click();
    }

    public void clickOnRemoveFromCartButton(){
        driver.findElement(removeFromCartButton).click();
    }

    public boolean removeFromCartButtonIsDisplayed(){
        return driver.findElement(removeFromCartButton).isDisplayed();
    }












}
