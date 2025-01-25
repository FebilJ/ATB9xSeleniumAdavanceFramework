package com.thetestingacademy.ATB9xSeleniumAdavanceFramework.Tests.vwoTestCases.PageFactory;

import io.qameta.allure.Owner;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.thetestingacademy.ATB9xSeleniumAdavanceFramework.pages.pageObjectModel.vwo.normal.DashBoardPage;
import com.thetestingacademy.ATB9xSeleniumAdavanceFramework.pages.pageObjectModel.vwo.normal.LoginPage;

import static org.assertj.core.api.Assertions.*;



public class TestVWOLogin_02_POM {
		
	    @Owner("Febil")
	    @Description("Verify that invalid creds give error message")
	    @Test
	    public void testLoginNegativeVWO() {
	        
		        ChromeOptions options = new ChromeOptions();
	        	options.addArguments("--start-maximized");
	        	
	        	//WebDriver driver = new EdgeDriver();
	        	WebDriver driver = new ChromeDriver(options);
	
		        LoginPage loginPage_VWO = new LoginPage(driver);
		        String error_msg = loginPage_VWO.loginToVWOLoginInvalidCreds("admin@gmail.com","123");
	
		        assertThat(error_msg).isNotBlank().isNotNull().isNotEmpty();
		        Assert.assertEquals(error_msg,"Your email, password, IP address or location did not match");
	    }
	    
	    @Owner("Febil")
	    @Description("Verify that valid creds dashboard page is loaded")
	    @Test
	    public void testLoginPositiveVWO() {
		    	ChromeOptions options = new ChromeOptions();
	        	options.addArguments("--start-maximized");
	        	
	        	//WebDriver driver = new EdgeDriver();
	        	WebDriver driver = new ChromeDriver(options);
	        	
		        LoginPage loginPage_VWO = new LoginPage(driver);
		        loginPage_VWO.loginToVWOLoginValidCreds("contact+aug@thetestingacademy.com","TtxkgQ!s$rJBk85");
		        
		        DashBoardPage dashBoardPage  = new DashBoardPage(driver);
		        String usernameLoggedIn = dashBoardPage.loggedInUserName();
	
		        assertThat(usernameLoggedIn).isNotBlank().isNotNull().isNotEmpty();
		        Assert.assertEquals(usernameLoggedIn,"Aman");

	    }
}