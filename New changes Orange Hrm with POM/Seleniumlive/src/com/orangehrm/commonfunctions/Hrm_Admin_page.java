package com.orangehrm.commonfunctions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.ohrm.leave.Leave_Functions;

public class Hrm_Admin_page extends Common_functions{
	
	Actions actions;
	Select select;
	
		
		@Test(priority=1)
		
		public void Browser(){
			
			//call the method of the Common_functions class
			launch_browser();
			
		}
		
		
		@Test(priority = 2)
		public void login_page(){
		
			//create object for the Login_pageobjects class
			Login_pageobjects page = new Login_pageobjects(driver);
			
			page.username("Admin");
			page.password("admin123");
			page.submitbutton();
		
		}
	

		@Test(priority=3)
		
		public void Pim_Details(){
			
			
			//create object for the Pim_Details class
			Pim_Details details = new Pim_Details(driver);
			
			actions = new Actions(driver);
			actions.moveToElement(details.pim);
			actions.moveToElement(details.configuration);
			actions.moveToElement(details.optionalfileds).click().build().perform();
			details.edit_button();
			//details.checkbox();
			//Assert.assertEquals(details.DeprecatedFields.isSelected(), true);
			details.multiplecheckbox();
			
			details.save();
				
			}
				
				
		@Test(priority=3)	
		public void leave_page(){
			
			Leave_Functions leave = new Leave_Functions(driver);
			actions = new Actions(driver);
			actions.moveToElement(leave.leave);
			actions.moveToElement(leave.reports);
			actions.moveToElement(leave.usagereports).click().build().perform();
		
			//by using select class for drop down
			
			select = new Select(leave.drop);
			select.selectByIndex(2);
			leave.employeedetails("H");
			leave.employeelists();
	
		}
		
		
		
		
			
			
		}
		
		
		
		
		

