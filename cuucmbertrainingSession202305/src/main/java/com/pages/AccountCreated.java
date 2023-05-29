package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.ElementUtil;

public class AccountCreated {
	
	private WebDriver driver;
	private By pageHeader=By.xpath("//h2[@class='title text-center']/b");
	private By continueBtn=By.xpath("//a[normalize-space()='Continue']");
	
	
	public AccountCreated(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getPageHeader() {
		WebElement elm=ElementUtil.explicitWait(driver, driver.findElement(pageHeader));
		return elm.getText();
	}
	
	public HomePage clickContinue() {
		driver.findElement(continueBtn).click();
		return new HomePage(driver);
	}
	

}
