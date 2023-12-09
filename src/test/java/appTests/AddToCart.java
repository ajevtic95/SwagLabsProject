package appTests;

import org.junit.Assert;
import org.junit.Test;

public class AddToCart extends BaseTestsClass{


    @Test
    public void successfulAddingBackpackToCart() {
        logInPage.successfulLogin();
        homePage.clickOnAddToCartButtonBackPack();
        homePage.clickOnCartButton();
        Assert.assertTrue("Proizvod nije uspesno dodat u korpu",cartPage.removeFromCartButtonIsDisplayed());
    }
}
