package StepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.AccountPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AccountPageSteps {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private AccountPage accountpage;
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credTable) {
		
		List<Map<String,String>> credList= credTable.asMaps();
	    String userName = credList.get(0).get("username");
	    String password = credList.get(0).get("password");
	    
	    DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	    //accountpage = loginPage.doLogin(userName, password);
	    loginPage.doLogin(userName, password);
	}

	@Given("user is on account page")
	public String user_is_on_account_page() {
		return loginPage.getPageTitle();
		
	}

	@Then("user gets account section")
	public void user_gets_account_section(DataTable sectionTable) {
		List<String> expectedList = sectionTable.asList();
		List<String> actualList = accountpage.getAccountSectionList();
		Assert.assertTrue(expectedList.containsAll(actualList));
	}

	@Then("account section count should be {int}")
	public void account_section_count_should_be(Integer expectedCount) {
		Assert.assertTrue(accountpage.getAccountSectionsCount() == expectedCount);
		
	}
}
