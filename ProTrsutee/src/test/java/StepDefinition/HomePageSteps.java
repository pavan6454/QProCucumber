package StepDefinition;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageSteps {
	WebDriver driver = DriverFactory.getDriver();
	private LoginPage loginPage = new LoginPage(driver);
	private HomePage homePage = new HomePage(driver);
	
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credTable) throws Exception {
		
		List<Map<String,String>> credList= credTable.asMaps();
	    String userName = credList.get(0).get("username");
	    String password = credList.get(0).get("password");
	    
	    //Enter URL
	    driver.get("https://protrustee.uc.r.appspot.com/people/sign_in");
	    loginPage.doLogin(userName, password);
	}

	@Given ("navigate to section {string}")
	public void navigate_to_section(String element) throws Exception {
		homePage.navigateToSection(By.linkText(element));
	}
}
