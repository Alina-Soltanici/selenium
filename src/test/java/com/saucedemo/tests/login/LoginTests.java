package com.saucedemo.tests.login;

import com.saucedemo.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @Test
    public void testLoginErrorMessage() {
        loginPage.setUsername ("standard_user");
        loginPage.setPassword ("xyz3400");
        loginPage.clickLoginButton ();
        String actualErrorMessage = loginPage.getErrorMessage ();
        Assert.assertTrue (actualErrorMessage.contains ("Epic sadface"));
    }
}
