package com.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.factory.DriverFactory;

public class Utils {
	
	protected  static WebDriver driver = DriverFactory.getDriver();
	
	public static void waitUntilElementIsVisible(By element) {
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated
			(element));
		if(webElement.isDisplayed()) {
			System.out.println("Element is visible" );
		}
		else
			System.out.println("Element is not visible");
	}
	
	public static void hoverAndClick(By element) {
		 //Instantiate Action Class        
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(element);
        if(target.isDisplayed()) {
        	System.out.println("Element is displayed");
        	 actions.moveToElement(target).build().perform();
        }
        else
        	System.out.println("Element is not visible");
       
      
	}
}
