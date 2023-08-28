package com.orange.pages;

import static org.testng.Assert.assertNotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.orange.base.library.Base;

public class PerformancePage extends Base {

	public static final Logger log = LogManager.getLogger(PerformancePage.class);

	private WebDriver driver;

	public PerformancePage(WebDriver driver) {
		if (driver == null) {
			this.driver = Library.getDriver();
		} else {
			this.driver = driver;
		}
		WebElement webPage = Library.Visibility(By.cssSelector("html"));
		assertNotNull(webPage);

	}

	public PerformancePage() {
		if (this.driver == null) {
			this.driver = Library.getDriver();
		}
		WebElement webPage = Library.Visibility(By.cssSelector("html"));
		assertNotNull(webPage);
	}

	public PerformancePage EmployeeReviewsArrowButton() {

		Library.Clickk(By.cssSelector(
				"#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-header > div.oxd-table-filter-header-options > div:nth-child(3) > button"));

		return this;
	}

	public PerformancePage EmployeeNameBox(String name) throws InterruptedException {

		Library.Clickk(By.cssSelector(
				"#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div.oxd-grid-4.orangehrm-full-width-grid > div:nth-child(1) > div > div:nth-child(2) > div > div > input"));
		Library.hold(3);
		Library.textInput(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div.oxd-grid-4.orangehrm-full-width-grid > div:nth-child(1) > div > div:nth-child(2) > div > div > input"), name);
		return this;
	}
	
	public PerformancePage ArrowDown() {
		Library.ArrowDownMovement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div.oxd-grid-4.orangehrm-full-width-grid > div:nth-child(1) > div > div:nth-child(2) > div > div > input"));
	
		return this;
	}
	
	
	
	
	public PerformancePage ResetButton() throws InterruptedException {
		Library.hold(2);
		Library.HiddenElementClick(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--ghost"));
		
		return this;
	}

	public PerformancePage SearchButton() throws InterruptedException {
		Library.hold(2);
		Library.HiddenElementClick(By.cssSelector(
				"#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div.oxd-form-actions > button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space"));

		return this;
	}

}
