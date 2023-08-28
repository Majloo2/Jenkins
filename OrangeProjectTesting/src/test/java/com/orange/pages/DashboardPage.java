package com.orange.pages;

import static org.testng.Assert.assertNotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.orange.base.library.Base;


public class DashboardPage extends Base {
	
public static final Logger log = LogManager.getLogger(DashboardPage.class);
	
	
	
	private WebDriver driver;

	public DashboardPage(WebDriver driver) {
		if (driver == null) {
			this.driver = Library.getDriver();
		} else {
			this.driver = driver;
		}
		WebElement webPage = Library.Visibility(By.cssSelector("html"));
		assertNotNull(webPage);

	}

	public DashboardPage() {
		if (this.driver == null) {
			this.driver = Library.getDriver();
		}
		WebElement webPage = Library.Visibility(By.cssSelector("html"));
		assertNotNull(webPage);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public DashboardPage ClockLogo() throws InterruptedException {
		Library.hold(3);
		Library.Clickk(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div:nth-child(1) > div > div.orangehrm-dashboard-widget-body > div.orangehrm-attendance-card > div.orangehrm-attendance-card-bar > button"));
		Library.hold(3);
		
		
		return this;
		
		
	}
	
	
	

	public DashboardPage TimeSheetToApprove() throws InterruptedException {
		Library.hold(3);
		Library.Clickk(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div:nth-child(2) > div > div.orangehrm-dashboard-widget-body > div > div:nth-child(2) > p"));
		Library.hold(3);
		
		
		return this;
	
	}
	
	
	
	public DashboardPage MyLeave() throws InterruptedException {
		Library.hold(3);
		Library.Clickk(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div:nth-child(3) > div > div.orangehrm-dashboard-widget-body > div > div:nth-child(5) > button"));
		Library.hold(3);
		
		
		return this;
	
	}
	
	
	public DashboardPage GearIcon() throws InterruptedException {
		Library.hold(3);
		Library.Clickk(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div:nth-child(5) > div > div.orangehrm-dashboard-widget-header > i"));
		Library.hold(3);
		Library.Clickk(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div:nth-child(5) > div.oxd-overlay.oxd-overlay--flex.oxd-overlay--flex-centered > div > div > div > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space"));
		Library.hold(3);
		return this;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
