package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {
	private WebDriver driver;
	private By accountSection =By.xpath("//div[@id='center_column']//span");
	
	public AccountPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public int getAccountSectionsCount() {
		return driver.findElements(accountSection).size();
	}

	public List<String> getAccountSectionList() {
		List<String> accountsList = new ArrayList<>();
		List<WebElement> accountsHeaderList = driver.findElements(accountSection);
		
		for(WebElement e : accountsHeaderList) {
			String text = e.getText();
			accountsList.add(text);
		}
		return accountsList;
		}
}
