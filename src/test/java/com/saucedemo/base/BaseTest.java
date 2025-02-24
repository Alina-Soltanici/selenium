package com.saucedemo.base;

import com.saucedemo.pages.BasePage;
import com.saucedemo.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    String url = "http://www.saucedemo.com/";


    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver ().setup ();
        driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();
        driver.get (url);
        basePage = new BasePage ();
        basePage.setDriver (driver);
        loginPage = new LoginPage ();
    }


    @AfterClass
    public void tearDown() {
        if(driver != null) {
            driver.quit ();
        }
    }
}

