package com.ohrm.leave;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leave_Functions {
	
	WebDriver driver;
	
	
	public Leave_Functions(WebDriver ldriver){
		
		driver = ldriver;
		
		PageFactory.initElements(driver, this);
		
	}
	

	@FindBy(xpath="//a[@id='menu_leave_viewLeaveModule']//b")
	public WebElement leave;
	
	@FindBy(xpath="//a[@id='menu_leave_Reports']")
	public WebElement reports;
	
	@FindBy(xpath="//a[@id='menu_leave_viewLeaveBalanceReport']")
	public WebElement usagereports;
	
	@FindBy(xpath="//select[@id='leave_balance_report_type']")
	public WebElement drop;
	
	@FindBy(xpath="//input[@id='leave_balance_employee_empName']")
	public WebElement employee;
	
	@FindBy(xpath="//div[@class='ac_results']/ul/li")
	public List<WebElement> employeelists;
	
	@FindBy(xpath="//input[@id='viewBtn']")
	public WebElement view;
	
	
	
	
	
	
	public void dropdown(){
		
		drop.click();
	
	}
	
	public void employeedetails(String name){
		
		employee.sendKeys(name);
	
	}
	
	public void employeelists(){
		
		System.out.println(employeelists.size());
		
		for (WebElement emplist : employeelists) {
			
			System.out.println(emplist.getText());
			
			if(emplist.getText().equals(" HannahFlores")){
				
				emplist.click();
			}else{
				
				System.out.println("employee list is not available");
			}
			
		}
		
	}
	
}
