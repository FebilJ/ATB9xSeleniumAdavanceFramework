package com.thetestingacademy.ATB9xSeleniumAdavanceFramework.pages.pageObjectModel.vwo.improved_pom;

import com.thetestingacademy.ATB9xSeleniumAdavanceFramework.base.CommonToAllPage;
import com.thetestingacademy.ATB9xSeleniumAdavanceFramework.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import com.thetestingacademy.utils.PropertiesReader;

public class LoginPage extends CommonToAllPage{
				//Page Class
				//Page Locators
				WebDriver driver;
			
			    public LoginPage(WebDriver driver){
			        this.driver = driver;
			    }
				
				//Page Actions
				//Step 1 - Page Locators
				private By username = By.id("login-username");
				private By password = By.id("login-password");
				private By signButton = By.id("js-login-btn");
				private By error_message = By.id("js-notification-box-msg");
				
				//Step 2 - Page Actions
				 public String loginToVWOLoginInvalidCreds(String user, String pwd) {
				        openVWOUrl();
					 	enterInput(username, user);
					 	enterInput(password, pwd);
					 	clickElement(signButton);
					 	presenceOfElement(error_message);
				        return getText(error_message);
				    }

				 public void loginToVWOLoginValidCreds(String user, String pwd) {

				    	openVWOUrl();
				        enterInput(username,user);
				        enterInput(password,pwd);
				        clickElement(signButton);
				        custom_wait();
		    }
}