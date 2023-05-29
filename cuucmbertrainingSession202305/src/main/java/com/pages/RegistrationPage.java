package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.ElementUtil;

public class RegistrationPage {

	private WebDriver driver;
	
	private By titleMr=By.xpath("//input[@id='id_gender1']");
	private By titleMrs=By.xpath("//input[@id='id_gender2']");
	private By name=By.xpath("//input[@id='name']");
	private By password=By.xpath("//input[@id='password']");
	private By dobDay=By.xpath("//select[@id='days']");
	private By dobMonths=By.xpath("//select[@id='months']");
	private By dobYears=By.xpath("//select[@id='years']");
	private By newsletter=By.xpath("//input[@id='newsletter']");
	private By specialOffers=By.xpath("//input[@id='optin']");
	private By firstName=By.xpath("//input[@id='first_name']");
	private By lastName=By.xpath("//input[@id='last_name']");
	private By company=By.xpath("//input[@id='company']");
	private By address1=By.xpath("//input[@id='address1']");
	private By address2=By.xpath("//input[@id='address2']");
	private By country=By.xpath("//select[@id='country']");
	private By state=By.xpath("//input[@id='state']");
	private By city=By.xpath("//input[@id='city']");
	private By zipCode=By.xpath("//input[@id='zipcode']");
	private By mobile=By.xpath("//input[@id='mobile_number']");
	private By creatBtn=By.xpath("//button[normalize-space()='Create Account']");
	

	public RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private void selectTitleRadio(String title) {
		if(title.equals("Mr.")) {
		driver.findElement(titleMr);
		}else if(title.equals("Mrs.")) {
			driver.findElement(titleMrs);
		}
		
	}
	
	private void enterName(String username) {
		WebElement userNameElm=driver.findElement(name);
		String uName=userNameElm.getText();
		if(!uName.equals(username)) {
			userNameElm.clear();
			userNameElm.sendKeys(username);
		}
	}
	
	private void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	private void selectDOB(String dob) {
		String[] dateOfBirth=ElementUtil.splittedDOB(dob);
		String dateOfBirthDay=dateOfBirth[0];
		String dateOfBirthMonth=dateOfBirth[1];
		String dateOfBirthValue=dateOfBirth[2];
		WebElement day=driver.findElement(dobDay);
		ElementUtil.selectValue(day, dateOfBirthDay);
		WebElement months=driver.findElement(dobMonths);
		ElementUtil.selectValue(months, dateOfBirthMonth);
		WebElement year=driver.findElement(dobYears);
		ElementUtil.selectValue(year, dateOfBirthValue);
	}
	
	private void selectNewsLetter(String checkNewsLetter) {
		if(checkNewsLetter.equals("Y")) {
			ElementUtil.jsClick(driver, driver.findElement(newsletter));
			//ElementUtil.explicitWait(driver, newsletter).click();
		}
	}
	private void selectSpecialOffers(String checkSplOffers) {
		if(checkSplOffers.equals("Y")) {
			ElementUtil.jsClick(driver, driver.findElement(specialOffers));
			//driver.findElement(specialOffers).click();
			//ElementUtil.explicitWait(driver, specialOffers).click();
		}
	}
	
	private void enterFirstName(String firstname) {
		driver.findElement(firstName).sendKeys(firstname);
	}
	private void enterLastName(String lastname) {
		driver.findElement(lastName).sendKeys(lastname);
	}
	private void enterCompany(String companyName) {
		driver.findElement(company).sendKeys(companyName);
	}
	private void enterAddress1(String addressone) {
		driver.findElement(address1).sendKeys(addressone);
	}
	private void enterAddress2(String addressTwo) {
		driver.findElement(address2).sendKeys(addressTwo);
	}
	private void selectCountry(String countryName) {
		WebElement countryElm=driver.findElement(country);
		ElementUtil.selectValue(countryElm, countryName);
	}
	private void enterState(String stateName) {
		driver.findElement(state).sendKeys(stateName);
	}
	private void enterCity(String cityName) {
		driver.findElement(city).sendKeys(cityName);
	}
	private void enterZip(String zipcode) {
		driver.findElement(zipCode).sendKeys(zipcode);
	}
	private void enterMobile(String mobileno) {
		driver.findElement(mobile).sendKeys(mobileno);
	}
	private AccountCreated clickOnCreate() {
		driver.findElement(creatBtn).submit();;
		return new AccountCreated(driver);
	}
	
	public void CreateAccount(String title,String username,String pass,String dob,String checkNewsLetter,String checkSplOffers,
			String firstname,String lastname,String companyName,String addressone,String addressTwo,String countryName,String stateName,
			String cityName,String zipcode,String mobileno) {
		selectTitleRadio(title);
		enterName(username);
		enterPassword(pass);
		selectDOB(dob);
		selectNewsLetter(checkNewsLetter);
		selectSpecialOffers(checkSplOffers);
		enterFirstName(firstname);
		enterLastName(lastname);
		enterCompany(companyName);
		enterAddress1(addressone);
		enterAddress2(addressTwo);
		selectCountry(countryName);
		enterState(stateName);
		enterCity(cityName);
		enterZip(zipcode);
		enterMobile(mobileno);
		clickOnCreate();
	}
	
}
