package appTests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;
import java.util.ArrayList;

public class FooterLinks extends BaseTestsClass{

    @Test
    public void twitterLinkTest() {

        logInPage.successfulLogin();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");
        homePage.clickOnTwitterIcon();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        String expectedURL="https://twitter.com/saucelabs";
        String actualURL=driver.getCurrentUrl();
        Assert.assertTrue("Twitter strana nije otvorena",expectedURL.equals(actualURL) );
        driver.close();
        driver.switchTo().window(newTab.get(0));
        String expURL="https://www.saucedemo.com/inventory.html";
        String actURL=driver.getCurrentUrl();
        Assert.assertTrue("Homepage nije otvoren", expURL.equals(actURL));





    }

    @Test
    public void facebookLinkTest() {
        logInPage.successfulLogin();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");
        homePage.clickOnFacebookIcon();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        String expectedURL="https://www.facebook.com/saucelabs";
        String actualURL=driver.getCurrentUrl();
        Assert.assertTrue("Facebook strana nije otvorena",expectedURL.equals(actualURL) );
        driver.close();
        driver.switchTo().window(newTab.get(0));
        String expURL="https://www.saucedemo.com/inventory.html";
        String actURL=driver.getCurrentUrl();
        Assert.assertTrue("Homepage nije otvoren", expURL.equals(actURL));


    }

    @Test
    public void linkedInLinkTest(){
        logInPage.successfulLogin();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");
        homePage.clickOnLinkedInIcon();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        String expectedURL="https://www.linkedin.com/company/sauce-labs/";
        String actualURL=driver.getCurrentUrl();
        Assert.assertTrue("LinkedIn strana nije otvorena",expectedURL.equals(actualURL) );
        driver.close();
        driver.switchTo().window(newTab.get(0));
        String expURL="https://www.saucedemo.com/inventory.html";
        String actURL=driver.getCurrentUrl();
        Assert.assertTrue("Homepage nije otvoren", expURL.equals(actURL));






    }
}
