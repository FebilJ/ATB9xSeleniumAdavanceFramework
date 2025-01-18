package com.thetestingacademy.ATB9xSeleniumAdavanceFramework.Tests.katalonCuraTestCases;

import com.thetestingacademy.ATB9xSeleniumAdavanceFramework.pages.pageObjectModel.katalonCura.AppointmentPage;
import com.thetestingacademy.ATB9xSeleniumAdavanceFramework.pages.pageObjectModel.katalonCura.LoginPage;
import com.thetestingacademy.ATB9xSeleniumAdavanceFramework.pages.pageObjectModel.katalonCura.MakeBookingPage;
import com.thetestingacademy.ATB9xSeleniumAdavanceFramework.pages.pageObjectModel.katalonCura.VerificationPage;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

	public class TestkatalonCura_POM {
//		   @Owner("Febil")
//		   @Description("Verify Make Appointment Page ")
//		   @Test
//		   public void testmakeAppointment() {
//			    ChromeOptions options = new ChromeOptions();
//	        	options.addArguments("--start-maximized");
//	        	
//	        	//WebDriver driver = new EdgeDriver();
//	        	WebDriver driver = new ChromeDriver(options);
//		
//	        	AppointmentPage MakeAppointment = new AppointmentPage(driver);
//	        	MakeAppointment.testAppointmentPage();		
//		    }
//		   
//		   @Owner("Febil")
//		   @Description("Verify Login Page ")
//		   @Test
//		   public void testLoginPage() {
//			   ChromeOptions options = new ChromeOptions();
//	        	options.addArguments("--start-maximized");
//	        	
//	        	WebDriver driver = new ChromeDriver(options);
//	        	
//	        	LoginPage login = new LoginPage(driver);
//	        	login.testLoginPage();
//		   }
//		   
//		   @Owner("Febil")
//		   @Description("Verify Make Booking Page")
//		   @Test
//		   public void testMakeBookingPage() {
//			   ChromeOptions options = new ChromeOptions();
//	        	options.addArguments("--start-maximized");
//	        	
//	        	WebDriver driver = new ChromeDriver(options);
//	        	
//	        	MakeBookingPage MakeBooking = new MakeBookingPage(driver);
//	        	MakeBooking.testMakeBookingPage();
//		   }
		   
		   //--------------------------------------------------------------------------------
		@Test
		   public void testkatalon() {
			   ChromeOptions options = new ChromeOptions();
	        	options.addArguments("--start-maximized");
	        	
	        	WebDriver driver = new ChromeDriver(options);
	        	
	        	//Page 1
	        	AppointmentPage MakeAppointment = new AppointmentPage(driver);
	        	MakeAppointment.testAppointmentPage();		
	        	
	        	//Page 2
	        	LoginPage login = new LoginPage(driver);
	        	login.testLoginPage();
	        	
	        	//Page 3
	        	MakeBookingPage MakeBooking = new MakeBookingPage(driver);
	        	MakeBooking.testMakeBookingPage();

	        	//Page 4
	        	VerificationPage VerifyText = new VerificationPage(driver);
	        	String vText = VerifyText.testverifyPage();

	        	assertThat(vText).isNotBlank().isNotNull().isNotEmpty();
		        Assert.assertEquals(vText,"Appointment Confirmation");
		   }
    }
