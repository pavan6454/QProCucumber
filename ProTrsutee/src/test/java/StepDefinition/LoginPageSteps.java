package StepDefinition;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private static String title;
	//private Properties prop;
	
	@Given("user has logged in to application")
	public void user_has_logged_in_to_application(DataTable credTable) {
		
		List<Map<String,String>> credList= credTable.asMaps();
	    String userName = credList.get(0).get("username");
	    String password = credList.get(0).get("password");
	    DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	    loginPage.doLogin(userName, password);
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws Exception {
		//prop.getProperty("url");
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		Thread.sleep(5000);
	}

	@When("user gets the title of webpage")
	public void user_gets_the_title_of_webpage() {
	     title = loginPage.getPageTitle();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expctedTitle) throws Exception {
		Thread.sleep(5000);
		Assert.assertTrue(title.contains(expctedTitle));
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
		Assert.assertTrue(loginPage.idForgotPwdLinkExist());
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {
	   loginPage.enterUserName(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
	    loginPage.enterPwd(password);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    loginPage.clickOnSignIn();
	}

}
