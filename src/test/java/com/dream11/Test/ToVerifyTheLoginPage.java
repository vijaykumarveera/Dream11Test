package com.dream11.Test;

import GenericRepository.BaseClass;
import ObjectRepository.LoginPageTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ToVerifyTheLoginPage extends BaseClass
{
    @Test
    public void toverifyLoginPageTest()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginPageTest login = new LoginPageTest(driver);
        login.loginPageTest();
    }
}
