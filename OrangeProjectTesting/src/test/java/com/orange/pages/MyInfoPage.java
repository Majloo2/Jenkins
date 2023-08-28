package com.orange.pages;

import static org.testng.Assert.assertNotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.orange.base.library.Base;

public class MyInfoPage extends Base {

	public static final Logger log = LogManager.getLogger(MyInfoPage.class);

	private WebDriver driver;

	public MyInfoPage(WebDriver driver) {
		if (driver == null) {
			this.driver = Library.getDriver();
		} else {
			this.driver = driver;
		}
		WebElement webPage = Library.Visibility(By.cssSelector("html"));
		assertNotNull(webPage);

	}

	public MyInfoPage() {
		if (this.driver == null) {
			this.driver = Library.getDriver();
		}
		WebElement webPage = Library.Visibility(By.cssSelector("html"));
		assertNotNull(webPage);
	}
	
	
	
	
	
	
	
	/*
	 * public MyInfoPage ClearFirstAndLastName () throws InterruptedException {
	 * 
	 * Library.ClearText(By.name("")); Library.hold(3);
	 * Library.ClearText(By.name("")); Library.hold(3);
	 * 
	 * return this; }
	 */
	 
		public MyInfoPage ClearFullName () throws InterruptedException {
			Library.hold(3);
			Library.EmptyText(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(1) > div.oxd-grid-1.orangehrm-full-width-grid > div > div > div.--name-grouped-field > div:nth-child(1) > div:nth-child(2) > input"));
			Library.hold(3);
			Library.EmptyText(By.name("middleName"));
			Library.hold(3);
			Library.EmptyText(By.name("lastName"));
			Library.hold(3);
			
			
			
			return this;
			
		}
		
		public MyInfoPage FirstAndLastName(String query, String query2, String query3) throws InterruptedException {
			Library.hold(3);
			Library.textInput(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(1) > div.oxd-grid-1.orangehrm-full-width-grid > div > div > div.--name-grouped-field > div:nth-child(1) > div:nth-child(2) > input"), query);
			Library.hold(3);
			
			Library.textInput(By.name("middleName"), query2);
			Library.hold(3);
			
			Library.textInput(By.name("lastName"), query3);
			Library.hold(3);
			return this;
		}
		
		
		
		public MyInfoPage SaveButton() {
			Library.Clickk(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div.oxd-form-actions > button"));
			return this;
		}
		
	
		
	public MyInfoPage ExpiryDate(String date) throws InterruptedException {
		
		Library.Clickk(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(2) > div > div > i"));
		Library.textInput(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div > div:nth-child(2) > div > div > input"), date);
		
		
		
		
		return this;
	}
	
	
	public MyInfoPage BloodTypeList() throws InterruptedException {
		
		
		  Library.ThirdOptionDown(By.
		  cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-custom-fields > div > form > div.oxd-form-row > div > div > div > div:nth-child(2) > div > div > div.oxd-select-text-input"
		  )); 
		 
		  
		  
				
		
		
		//Library.ListWeb(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-custom-fields > div > form > div.oxd-form-row > div > div > div > div:nth-child(2) > div > div > div.oxd-select-text--after"), number);
		
		/*
		 * List <WebElement> calendar = driver.findElements(By.xpath(
		 * "//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div/div/div[2]/div/comment()"
		 * )); Library.hold(6); calendar.get(BloodType).click(); Library.hold(6);
		 */
		
		//Library.select(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-custom-fields > div > form > div.oxd-form-row > div > div > div > div:nth-child(2) > div > div > div.oxd-select-text-input"), bloodtype);
		return this;
	}
	
	public MyInfoPage SmokerBox() {
		
		Library.CheckBoxSelect(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(7) > div > div:nth-child(2) > div > div:nth-child(2) > div > label > span > i"));
		
		
		
		
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
