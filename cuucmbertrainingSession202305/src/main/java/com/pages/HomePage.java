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
	By logOut=By.xpath("//a[normalize-space()='Logout']");
	By deleteAccount=By.xpath("//a[normalize-space()='Delete Account']");
	By loggedinUser=By.xpath("//li[10]//a[1]");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getHomePageTitle() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	public String getLoggedinMsg() {
		String loginUser=driver.findElement(loggedinUser).getText();
		return loginUser;
	}
	public void logOut() {
		driver.findElement(logOut).click();
	}
	public AccountCreated deleteAccount() {
		driver.findElement(deleteAccount).click();
		return new AccountCreated(driver);
	}
	
	
	
	
}
