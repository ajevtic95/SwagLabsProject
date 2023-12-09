package appTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pages.*;

public class BaseTestsClass {

    public static WebDriver driver;


    @BeforeClass
    public static void beforeClass() throws Exception {
        WebDriverManager.chromedriver().setup();


        driver = new ChromeDriver();
        driver.manage().window().maximize();


    }

    @AfterClass
    public static void afterClass() throws Exception {
        driver.quit();
    }

    @Before
    public void setUp() throws Exception {
        driver.get("https://www.saucedemo.com/");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);

    }

    HomePage homePage = new HomePage(driver);

    LogInPage logInPage = new LogInPage(driver);

    CheckoutYourInformationPage checkoutYourInformationPage = new CheckoutYourInformationPage(driver);

    CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);

    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);


    CartPage cartPage = new CartPage(driver);
















}
