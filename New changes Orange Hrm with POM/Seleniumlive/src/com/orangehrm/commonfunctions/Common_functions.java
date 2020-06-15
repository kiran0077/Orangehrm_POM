package com.orangehrm.commonfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common_functions {
	
	public static WebDriver driver;
	

	
	public void launch_browser(){
		
			System.setProperty("webdriver.chrome.driver", "E:\\New folder (3)\\Browser\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
	
	}
	
	
	

}
