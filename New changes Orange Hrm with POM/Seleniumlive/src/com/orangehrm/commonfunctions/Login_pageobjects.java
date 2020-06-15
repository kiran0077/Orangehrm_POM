package com.orangehrm.commonfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_pageobjects {
	
	WebDriver driver;
	
	Login_pageobjects(WebDriver ldriver){
		
		this.driver =ldriver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	//page objects for login page
	@FindBy(xpath="//input[@id='txtUsername']")
	public WebElement username;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='btnLogin']")
	public WebElement loginbutton;
	

	
	public void username(String user){
		
		username.sendKeys(user);
		
	}
	
	public void password(String pass){
		
		password.sendKeys(pass);
	}
	
	public void submitbutton(){
		
		loginbutton.click();
	}
}