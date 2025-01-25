package com.thetestingacademy.ATB9xSeleniumAdavanceFramework.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.thetestingacademy.ATB9xSeleniumAdavanceFramework.driver.DriverManager;

public class CommonToAllTest {
		
			 @BeforeMethod
		        public void setUp(){
		            DriverManager.init();
		        }

		        @AfterMethod
		        public void tearDown(){
		            DriverManager.down();
		        }
}