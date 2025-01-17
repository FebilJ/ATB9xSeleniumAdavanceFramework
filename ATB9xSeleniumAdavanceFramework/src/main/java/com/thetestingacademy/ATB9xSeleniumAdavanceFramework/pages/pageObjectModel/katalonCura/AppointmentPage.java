package com.thetestingacademy.ATB9xSeleniumAdavanceFramework.pages.pageObjectModel.katalonCura;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppointmentPage {
	WebDriver driver;
	
	public AppointmentPage(WebDriver driver)
    {
        this.driver = driver;
    }
	
	// page locators
    private By makeappointment = By.xpath("//a[@id='btn-make-appointment']");
    
    public void testAppointmentPage() {
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.findElement(makeappointment).click();
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
}
    
    
}