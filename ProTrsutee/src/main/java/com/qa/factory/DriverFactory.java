package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	public WebDriver driver;
	/**
	 * This method is used to initialize threadlocal driver on the basis of given browser
	 * @param browser name
	 * @return tldriver
	 */
	static {
		System.setProperty("webdriver.chrome.driver", "D:\\mavenProj\\QDir\\driver\\chromedriver.exe");
	}
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();
	
	
	public WebDriver init_driver(String browser) {
		if(browser.equals("chrome")){
			tldriver.set(new ChromeDriver());
		}
		else
			tldriver.set(new FirefoxDriver());
		
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	/**
	 * This is to return
	 * @return
	 */
	public static WebDriver getDriver() {
		return tldriver.get();
		
	}
}
