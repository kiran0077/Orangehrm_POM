package com.orangehrm.commonfunctions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pim_Details {
	
	WebDriver driver;
	
	Pim_Details(WebDriver ldriver){
		
		driver = ldriver;
		
		PageFactory.initElements(driver, this);
	
	}
	
	
	
	@FindBy(xpath="//a[@id='menu_pim_viewPimModule']/b")
	public  WebElement pim;
	
	@FindBy(xpath="//a[@id='menu_pim_Configuration']")
	public  WebElement configuration;
	
	@FindBy(xpath="//a[text()='Optional Fields']")
	public WebElement optionalfileds;
	
	
	@FindBy(xpath="//input[@id='btnSave']")
	public WebElement editbutton;
	
	
	@FindBy(xpath="//input[@id='configPim_chkDeprecateFields']")
	public WebElement DeprecatedFields;
	
	@FindBy(xpath="//li[@class='checkbox']")
	public List<WebElement> checkboxes; 
	
	@FindBy(xpath="//input[@id='btnSave']")
	public WebElement savebutton;
	
	
	
	
	
	
	
	//click on optional fields button

	public void optionalfileds(){
		
		optionalfileds.click();
	}
	
	public void edit_button(){
		
		editbutton.click();
	}
	
	
	
		
		
	public void multiplecheckbox(){
		
		System.out.println(checkboxes.size());

		
		for(WebElement checkbox:checkboxes){
			
		if(checkbox.isSelected())
		{
			System.out.println("Checkbox is already selected");
		}
		else
		{
			checkbox.click();
			
			
		}
		
		}
	}
	
		public void save(){
			
			savebutton.click();
		}
	
	
		
	}
	



