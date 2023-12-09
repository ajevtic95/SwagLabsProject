package appTests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class RemoveFromCart extends BaseTestsClass{




    @Test
    public void removeFromCart() {
        logInPage.successfulLogin();
        homePage.clickOnAddToCartButtonBackPack();
        homePage.clickOnCartButton();
        cartPage.clickOnRemoveFromCartButton();
        driver.navigate().back();
        Assert.assertTrue("Artikan nije izbacen iz korpe", homePage.addToCartButtonIsDisplayed());
    }
}
