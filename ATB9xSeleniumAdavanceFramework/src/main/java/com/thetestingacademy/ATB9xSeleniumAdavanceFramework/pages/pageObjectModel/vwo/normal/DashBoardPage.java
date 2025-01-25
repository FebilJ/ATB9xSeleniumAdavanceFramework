package com.thetestingacademy.ATB9xSeleniumAdavanceFramework.pages.pageObjectModel.vwo.normal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage {
			WebDriver driver;
		
		    public DashBoardPage(WebDriver driver) {
		        this.driver = driver;
		    }
		
		    By userNameOnDashboard = By.xpath("//span[@data-qa='lufexuloga']");
		
		
		    // Page Actions
		    public String loggedInUserName(){
		        try {
		            Thread.sleep(20000);
		        } catch (InterruptedException e) {
		            throw new RuntimeException(e);
		        }
		        return driver.findElement(userNameOnDashboard).getText();
		    }
}