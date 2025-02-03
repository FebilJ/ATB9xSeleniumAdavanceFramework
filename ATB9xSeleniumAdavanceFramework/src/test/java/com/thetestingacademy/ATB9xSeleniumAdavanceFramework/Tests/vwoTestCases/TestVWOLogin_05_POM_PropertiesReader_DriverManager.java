package com.thetestingacademy.ATB9xSeleniumAdavanceFramework.Tests.vwoTestCases;

import com.thetestingacademy.ATB9xSeleniumAdavanceFramework.base.CommonToAllTest;
import com.thetestingacademy.ATB9xSeleniumAdavanceFramework.driver.DriverManager;
import com.thetestingacademy.ATB9xSeleniumAdavanceFramework.pages.pageObjectModel.vwo.normal.DashBoardPage;
import com.thetestingacademy.ATB9xSeleniumAdavanceFramework.pages.pageObjectModel.vwo.normal.LoginPage;
import com.thetestingacademy.ATB9xSeleniumAdavanceFramework.utils.PropertiesReader;


import io.qameta.allure.Owner;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.*;

public class TestVWOLogin_05_POM_PropertiesReader_DriverManager extends CommonToAllTest{
		
	    @Owner("Febil")
	    @Description("Verify that invalid creds give error message")
	    @Test
	    public void testLoginNegativeVWO() {
	
		        LoginPage loginPage_VWO = new LoginPage(DriverManager.getDriver());
		        String error_msg = loginPage_VWO.loginToVWOLoginInvalidCreds(PropertiesReader.readKey("invalid_username"), PropertiesReader.readKey("invalid_password"));
		        
		        //Assert J Assertion
		        assertThat(error_msg).isNotBlank().isNotNull().isNotEmpty();
		        //TestNG Assertion
		        Assert.assertEquals(error_msg,PropertiesReader.readKey("error_message"));
	    }
	    
	    @Owner("Febil")
	    @Description("Verify that valid creds dashboard page is loaded")
	    @Test
	    public void testLoginPositiveVWO() {
		    	
		        LoginPage loginPage_VWO = new LoginPage(DriverManager.getDriver());
		        loginPage_VWO.loginToVWOLoginValidCreds(PropertiesReader.readKey("username"), PropertiesReader.readKey("password"));
		        
		        DashBoardPage dashBoardPage  = new DashBoardPage(DriverManager.getDriver());
		        String usernameLoggedIn = dashBoardPage.loggedInUserName();
	
		        assertThat(usernameLoggedIn).isNotBlank().isNotNull().isNotEmpty();
		        Assert.assertEquals(usernameLoggedIn,PropertiesReader.readKey("expected_username"));
	    }
}