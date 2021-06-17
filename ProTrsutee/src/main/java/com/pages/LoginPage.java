package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.Utils;

public class LoginPage {
	
	private WebDriver driver;
	
	//locators or object repository
	private By emailId = By.id("person_email");
	private By password = By.id("person_password");
	private By logInButton = By.name("commit");
	private By forgotPwdLink = By.linkText("Forgot your password?");
	
	//Intialization
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	
	//utilization or features
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public boolean idForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}
	
	public void enterPwd(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnSignIn() {
		driver.findElement(logInButton).click();
	}
	
	public void doLogin(String un,String pwd) throws Exception {
		driver.findElement(emailId).sendKeys(un);
		Utils.waitUntilElementIsVisible(password);
		driver.findElement(password).sendKeys(pwd);
		Utils.waitUntilElementIsVisible(logInButton);
		driver.findElement(logInButton).click();
		Thread.sleep(5000);
		
	}
}