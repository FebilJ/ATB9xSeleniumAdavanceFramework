package com.thetestingacademy.ATB9xSeleniumAdavanceFramework.Tests.vwoTestCases.PageFactory;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.thetestingacademy.ATB9xSeleniumAdavanceFramework.base.CommonToAllTest;
import com.thetestingacademy.ATB9xSeleniumAdavanceFramework.driver.DriverManager;
import com.thetestingacademy.ATB9xSeleniumAdavanceFramework.pages.pageFactory.LoginPage_PF;
import com.thetestingacademy.ATB9xSeleniumAdavanceFramework.utils.PropertiesReader;


public class TestVWOLogin_PF extends CommonToAllTest {

    private static final Logger logger = LogManager.getLogger(TestVWOLogin_PF.class);

    @Test
    public void testLoginNegativeVWO_PF() {
        logger.info("Starting the Testcases Page Factory");
        WebDriver driver = DriverManager.getDriver();
        driver.get(PropertiesReader.readKey("url"));
        LoginPage_PF loginPage_PF = new LoginPage_PF(driver);
        String error_msg = loginPage_PF.loginToVWOInvalidCreds();
        Assert.assertEquals(error_msg, PropertiesReader.readKey("error_message"));
    }




}