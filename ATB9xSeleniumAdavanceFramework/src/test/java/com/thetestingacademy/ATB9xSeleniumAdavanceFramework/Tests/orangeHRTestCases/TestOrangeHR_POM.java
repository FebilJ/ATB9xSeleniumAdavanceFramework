package com.thetestingacademy.ATB9xSeleniumAdavanceFramework.Tests.orangeHRTestCases;

import com.thetestingacademy.ATB9xSeleniumAdavanceFramework.pages.pageObjectModel.orangeHR.EmployeeListHomePage;
import com.thetestingacademy.ATB9xSeleniumAdavanceFramework.pages.pageObjectModel.orangeHR.LoginHRPage;


import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

	public class TestOrangeHR_POM {
		   @Owner("Febil")
		   @Description("Verify that the login to the OrangeHR ")
		   @Test
		   public void testLoginPositive() {
			    ChromeOptions options = new ChromeOptions();
	        	options.addArguments("--start-maximized");
	        	
	        	//WebDriver driver = new EdgeDriver();
	        	WebDriver driver = new ChromeDriver(options);
		
		        LoginHRPage loginHRPage = new LoginHRPage(driver);
		        loginHRPage.loginToHRCreds("admin","Hacker@4321");
		
		        EmployeeListHomePage dashboardPagePom = new EmployeeListHomePage(driver);
		        String loggedInUserName = dashboardPagePom.loggedInUserName();
		
		        assertThat(loggedInUserName).isNotBlank().isNotNull().isNotEmpty();
		        Assert.assertEquals(loggedInUserName,"PIM");
		    }
    }
