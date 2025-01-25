package com.thetestingacademy.ATB9xSeleniumAdavanceFramework.pages.pageObjectModel.katalonCura;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerificationPage {
		WebDriver driver;
		
		public VerificationPage(WebDriver driver)
	    {
	        this.driver = driver;
	    }
		
		// page locators
	    private By Text = By.xpath("//h2[text()]");
	        
	//	    public void testverifyPage() {
	//	        String actualText = driver.findElement(Text).getText();
	//	        if (!actualText.isEmpty()) {
	//	            System.out.println("Text is displayed: " + actualText);
	//	        } else {
	//	            System.out.println("No text found");
	//	        }
	//	    }
		    
		    public String  testverifyPage() {
		    	try {
		    		Thread.sleep(3000);
		    	}catch(Exception e) {
		    		throw new RuntimeException(e);
		    	}
		    	return  driver.findElement(Text).getText();
		    }
}