package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupOrSignInPage {
	
	private WebDriver driver;
	
	//By locators
	By userEmail=By.xpath("//input[@data-qa='login-email']");
	By signInpassword=By.xpath("//input[@placeholder='Password']");
	By loginBtn=By.xpath("//button[normalize-space()='Login']");
	By signupName=By.xpath("//input[@placeholder='Name']");
	By signupEmail=By.xpath("//input[@data-qa='signup-email']");
	By signupBtn=By.xpath("//button[normalize-space()='Signup']");
	By signInvalidationMsg=By.xpath("//input[@name='password']/following::p");
	By signupvalidationMsg=By.xpath("//button[contains(text(),'Signup')]/preceding::p");

	public SignupOrSignInPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getSignuporSignInTitle() {
		return driver.getTitle();
	}
	
	public void enterEmail(String email) {
		driver.findElement(userEmail).sendKeys(email);
	}
	public void enterpassword(String password) {
		driver.findElement(signInpassword).sendKeys(password);
	}
	public void clickOnlogIn() {
		driver.findElement(loginBtn).click();
	}
	public void enterSignupName(String name) {
		driver.findElement(signupName).sendKeys(name);
	}
	public void enterSignupEmail(String email) {
		driver.findElement(signupEmail).sendKeys(email);
	}
	public void ClickSignupBtn() {
		driver.findElement(signupBtn).click();
	}
	
	public void doLogin(String email,String password) {
		driver.findElement(userEmail).sendKeys(email);
		driver.findElement(signInpassword).sendKeys(password);
		driver.findElement(loginBtn).click();
		
	}
	public HomePage getHomePage() {
		return new HomePage(driver);
	}
	
	public String getSignInValidation() {
		return driver.findElement(signInvalidationMsg).getText();
	}
	
	public void doSignup(String name,String email) {
		driver.findElement(signupName).sendKeys(name);
		driver.findElement(signupEmail).sendKeys(email);
		driver.findElement(signupBtn).click();
		
	}
	
	public RegistrationPage getRegistrationPage() {
		return new RegistrationPage(driver);
	}
	
	public String getSignupValidationMsg() {
		return driver.findElement(signupvalidationMsg).getText();
	}
	
	

}
