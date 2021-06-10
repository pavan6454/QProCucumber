package com.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {
	
	protected  static WebDriver driver;
	
	public static void waitUntilElementIsVisible(By element) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated
			(element));
		if(webElement.isDisplayed()) {
			System.out.println(element +" is visible" );
		}
		else
			System.out.println(element +" is not visible");
	}
}
