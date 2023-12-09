package appTests;

import org.junit.Assert;
import org.junit.Test;

public class SuccessfulCheckout extends BaseTestsClass{

    @Test
    public void backpackPurchase() {
        logInPage.successfulLogin();
        homePage.clickOnAddToCartButtonBackPack();
        homePage.clickOnCartButton();
        cartPage.clickOnCheckoutButton();
        checkoutYourInformationPage.successfulInformationInput();
        checkoutOverviewPage.clickOnFinishButton();
        Assert.assertTrue("Kupovina nije uspesna", checkoutCompletePage.successfulCheckoutMessageIsDisplayed());

    }
}
