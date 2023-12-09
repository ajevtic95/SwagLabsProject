package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage {

    public WebDriver driver;

    public By productImg = By.className("inventory_item_img");
    public By addBackpackToCartButton = By.id("add-to-cart-sauce-labs-backpack");

    public By removeFromCartButton = By.id("remove-sauce-labs-backpack");

    public By cartIconInRightCorner = By.xpath("//a[@class='shopping_cart_link']");

    public By twitterIcon = By.xpath("//*[@href='https://twitter.com/saucelabs']");
    public By facebookIcon = By.xpath("//*[@href='https://www.facebook.com/saucelabs']");
    public By linkedInIcon = By.xpath("//*[@href='https://www.linkedin.com/company/sauce-labs/']");



    public HomePage(WebDriver driver) {
        this.driver = driver;

    }



    public boolean productImgIsDisplayed(){
        return driver.findElement(productImg).isDisplayed();
    }
    public boolean addToCartButtonIsDisplayed(){
        return driver.findElement(addBackpackToCartButton).isDisplayed();
    }

    public boolean removeFromCartButtonIsDisplayed(){
        return driver.findElement(removeFromCartButton).isDisplayed();
    }
    public boolean cartIconIsPresent(){
        return driver.findElement(cartIconInRightCorner).isDisplayed();
    }

    public void clickOnAddToCartButtonBackPack(){
        driver.findElement(addBackpackToCartButton).click();

    }
    public void clickOnCartButton(){
        driver.findElement(cartIconInRightCorner).click();
    }

    public void removeFromCartBackpack(){
        driver.findElement(removeFromCartButton).click();
    }

    public void clickOnTwitterIcon(){
        driver.findElement(twitterIcon).click();
    }
    public void clickOnFacebookIcon(){
        driver.findElement(facebookIcon).click();
    }
    public void clickOnLinkedInIcon(){
        driver.findElement(linkedInIcon).click();
    }

}
