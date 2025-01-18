package com.thetestingacademy.ATB9xSeleniumAdavanceFramework.pages.pageObjectModel.katalonCura;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MakeBookingPage {
	WebDriver driver;

	public MakeBookingPage(WebDriver driver) {
		this.driver = driver;
	}
	//Initialize Locators
	private By facilitydropdown = By.xpath("//select[@id='combo_facility']/option[2]");
	private By checkbox = By.xpath("//input[@name='hospital_readmission']");
	private By radioBtn = By.xpath("//input[@id='radio_program_medicaid']");
	private By dateBtn = By.xpath("//div[@class='input-group-addon']");
	private By selectDate = By.xpath("//table[@class='table-condensed']/tbody/tr/td[1]");
	private By comment = By.xpath("//textarea[@id='txt_comment']");
	private By bookAppointmentbtn = By.xpath("//button[text()]");
	
	public void testMakeBookingPage() {
		
		driver.findElement(facilitydropdown).click();
		driver.findElement(checkbox).click();
		driver.findElement(radioBtn).click();
		driver.findElement(dateBtn).click();
		driver.findElement(selectDate).click();
		driver.findElement(comment).sendKeys("Commenting using Selenium");
		driver.findElement(bookAppointmentbtn).click();
		
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}