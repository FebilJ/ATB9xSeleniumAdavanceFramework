package com.thetestingacademy.ATB9xSeleniumAdavanceFramework.pages.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.thetestingacademy.ATB9xSeleniumAdavanceFramework.base.CommonToAllPage;

public class DashBoardPage extends CommonToAllPage{
			WebDriver driver;
		
		    public DashBoardPage(WebDriver driver) {
		        this.driver = driver;
		    }
		
		    By userNameOnDashboard = By.xpath("//span[@data-qa='lufexuloga']");
		
		
		    // Page Actions
		    public String loggedInUserName(){
		        visibilityOfElement(userNameOnDashboard);
		        return getText(userNameOnDashboard);
		    }
}