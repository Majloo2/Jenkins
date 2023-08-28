package com.orange.pages;

import static org.testng.Assert.assertNotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.orange.base.library.Base;

public class LoginPage extends Base {

	public static final Logger log = LogManager.getLogger(LoginPage.class);
	
	
	
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		if (driver == null) {
			this.driver = Library.getDriver();
		} else {
			this.driver = driver;
		}
		WebElement webPage = Library.Visibility(By.cssSelector("html"));
		assertNotNull(webPage);

	}

	public LoginPage() {
		if (this.driver == null) {
			this.driver = Library.getDriver();
		}
		WebElement webPage = Library.Visibility(By.cssSelector("html"));
		assertNotNull(webPage);
	}
	
	public LoginPage MyInfoTab() {
		
		Library.Clickk(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(6) > a"));
		
		
		
		return this;
	}
	
	
	
	
	
	public LoginPage ClearUsernameAndPass () throws InterruptedException {
		
	Library.ClearText(By.name("username"));
	Library.hold(3);
	Library.ClearText(By.name("password"));
	Library.hold(3);
	
	return this;
	}
	
	
	public LoginPage UsernameAndPassword(String query, String query2) throws InterruptedException {
		Library.textInput(By.name("username"), query);
		Library.hold(2);
		Library.textInput(By.name("password"), query2);
		
		
		return this;
	}
	
	
	
	public LoginPage LoginButton() {
		Library.Clickk(By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button"));
		return this;
	}
	
	
	
	
	public LoginPage TimeButton() {
		
		
		Library.Clickk(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(4) > a"));
		
		
		return this;
	}
	
	
	public LoginPage PerformanceTab() {
		
		
		Library.Clickk(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(7) > a > span"));
		
		
		
		
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
