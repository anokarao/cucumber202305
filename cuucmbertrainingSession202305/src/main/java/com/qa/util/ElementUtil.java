package com.qa.util;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	
	private static JavascriptExecutor js;
	
	public static void selectValue(WebElement dropdownELm,String value) {
		Select select=new Select(dropdownELm);
		select.selectByValue(value);
	}
	
	public static String[] splittedDOB(String dateOfBirth) {
		String[] dob=dateOfBirth.split("-");
		return dob;
	}
	
	public static WebElement explicitWait(WebDriver driver,WebElement elem) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement elm=wait.until(ExpectedConditions.visibilityOf(elem));
		return elm;
	}
	
	public static void jsClick(WebDriver driver,WebElement elm) {
		 js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", elm);
	}
	
}
