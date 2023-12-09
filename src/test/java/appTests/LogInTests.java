package appTests;

import org.junit.Assert;
import org.junit.Test;

public class LogInTests extends BaseTestsClass{

    @Test
    public void validLogInAction() {
        logInPage.successfulLogin();
        Assert.assertTrue("Korisnik nije uspesno ulogovan", homePage.addToCartButtonIsDisplayed());
        Assert.assertTrue("Korisnik nije uspesno ulogovan", homePage.productImgIsDisplayed());
        Assert.assertTrue("Korisnik nije uspesno ulogovan", homePage.cartIconIsPresent());
        
    }

    @Test
    public void validUserNameInvalidPassword() {
        logInPage.enterUserName("standard_user");
        logInPage.enterPassword("2343rferf");
        logInPage.clickOnLoginButton();
        Assert.assertTrue("Nije izasla error poruka", logInPage.errorMessageIsDisplayed());
    }

    @Test
    public void invalidUserNameValidPassword() {
        logInPage.enterUserName("efefefe");
        logInPage.enterPassword("secret_sauce");
        logInPage.clickOnLoginButton();
        Assert.assertTrue("Nije izasla error poruka",logInPage.errorMessageIsDisplayed());
    }

    @Test
    public void invalidUsernameInvalidPassword() {
        logInPage.enterUserName("fdegfgferf");
        logInPage.enterPassword("ergrgrgg");
        logInPage.clickOnLoginButton();
        Assert.assertTrue("Nije izasla error poruka",logInPage.errorMessageIsDisplayed());
    }

    @Test
    public void leaveEmptyUserNameAndPasswordField() {
        logInPage.clickOnLoginButton();
        Assert.assertTrue("Nije izasla error poruka",logInPage.errorMessageWhenUserNameFieldIsLeftEmptyIsDisplayed());
    }
}
