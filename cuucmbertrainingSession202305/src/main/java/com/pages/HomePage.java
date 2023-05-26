package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	
	//By locators
	By testcases=By.xpath("//a[contains(text(),'Test Cases')]");
	By home=By.xpath("(//a[normalize-space()='Home'])[1]");
	By cart=By.xpath("//a[normalize-space()='Cart']");
	By signuplogin=By.xpath("//a[normalize-space()='Signup / Login']");
	By contactus=By.xpath("//a[normalize-space()='Contact us']");
	By apiTesting=By.xpath("//a[normalize-space()='API Testing']");
	By loggedinUser=By.xpath("//li[10]//a[1]");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public TestcasesPage getTestcasesPage() {
		driver.findElement(testcases).click();
		return new TestcasesPage(driver);
	}
	public SignupOrSignInPage getSignupPage() {
		driver.findElement(signuplogin).click();
		return new SignupOrSignInPage(driver);
	}
	
	
	
}
