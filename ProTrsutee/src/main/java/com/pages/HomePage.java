package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.util.Utils;

public class HomePage {
	private WebDriver driver;
	private By accounts =By.linkText("Accounts");
	private By dashboard =By.linkText("Dashboard");
	private By assets =By.linkText("Accounts");
	private By accountReview =By.linkText("Account Review");
	private By kyc =By.linkText("Kyc Aml");
	private By moneyMovement =By.linkText("Money Movement");
	private By discretionary =By.linkText("Discretionary");
	private By overdraft =By.linkText("Overdraft");
	private By accountClose =By.linkText("Account Close");
	private By analytics =By.linkText("Analytics (placeholder)");
	private By people = By.linkText("People");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void navigateToSection(By webElement) {
		// WebElement element = driver.findElement(webElement);
		 Utils.hoverAndClick(webElement);
	}

}
