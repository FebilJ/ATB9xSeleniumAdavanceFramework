package com.thetestingacademy.ATB9xSeleniumAdavanceFramework.pages.pageObjectModel.katalonCura;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Initialize Locators
	private By username = By.xpath("//input[@id='txt-username']");
	private By password = By.xpath("//input[@id='txt-password']");
	private By loginBtn = By.xpath("//button[@id='btn-login']");
	
	public void testLoginPage() {

		driver.findElement(username).sendKeys("John Doe");
		driver.findElement(password).sendKeys("ThisIsNotAPassword");
		driver.findElement(loginBtn).click();
		
		try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
	}
}