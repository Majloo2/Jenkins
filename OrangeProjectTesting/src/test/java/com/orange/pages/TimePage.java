package com.orange.pages;

import static org.testng.Assert.assertNotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.orange.base.library.Base;

public class TimePage extends Base {

	public static final Logger log = LogManager.getLogger(TimePage.class);

	private WebDriver driver;

	public TimePage(WebDriver driver) {
		if (driver == null) {
			this.driver = Library.getDriver();
		} else {
			this.driver = driver;
		}
		WebElement webPage = Library.Visibility(By.cssSelector("html"));
		assertNotNull(webPage);

	}

	public TimePage() {
		if (this.driver == null) {
			this.driver = Library.getDriver();
		}
		WebElement webPage = Library.Visibility(By.cssSelector("html"));
		assertNotNull(webPage);
	}

	public TimePage EmployeeNameBox(String letter) throws InterruptedException {

		Library.boxField(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-card-container > form > div.oxd-form-row > div > div > div > div:nth-child(2) > div > div > input"), letter);
		return this;
	}

	public TimePage PickOneEmployee() {
		
		
		try {
			Library.SecondOptionDown(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-card-container > form > div.oxd-form-row > div > div > div > div:nth-child(2) > div > div > input"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return this;
	}

	public TimePage ViewButtonTimeSheetPage() {

		Library.Clickk(By.cssSelector(
				"#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-card-container > form > div.oxd-form-actions > button"));

		return this;
	}

	
	public TimePage RecordViewButton() {
		
		Library.Clickk(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.orangehrm-paper-container > div.orangehrm-container > div > div.oxd-table-body > div:nth-child(1) > div > div:nth-child(3) > div > button"));
		
		
		
		return this;
	}
	
	
	
	public TimePage AttendanceTab() throws InterruptedException {
		
		Library.HiddenElementClick(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > header > div.oxd-topbar-body > nav > ul > li:nth-child(2)"));
		
	
		/*
		 * List <WebElement> links = driver.findElements(By.
		 * cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > header > div.oxd-topbar-body > nav > ul"
		 * )); Library.hold(3); WebElement choice = links.get(1); Library.hold(3);
		 * choice.click();
		 */
		return this;
	}
	
	public TimePage PunchingOptionUnderAttendanceTab() {
		
		Library.Clickk(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > header > div.oxd-topbar-body > nav > ul > li.--active.oxd-topbar-body-nav-tab.--parent > ul > li:nth-child(2) > a"));
		
		return this;
	}
	
	
	public TimePage InOutButtonPunchesPage() {
		
		Library.Clickk(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > form > div.oxd-form-actions > button"));
		
		
		return this;
	}
	
	
	
	
	
	
}
