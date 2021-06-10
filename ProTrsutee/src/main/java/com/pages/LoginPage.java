package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;

	//locators or object repository
	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By signInButton = By.id("SubmitLogin");
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
		driver.findElement(signInButton).click();
	}
	
	public AccountPage doLogin(String un,String pwd) {
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(signInButton).click();
		
		return new AccountPage(driver);
	}
}