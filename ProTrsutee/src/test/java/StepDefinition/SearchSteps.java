package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchSteps {
	WebDriver driver;
	
	@Given("Open the chrome and launch the application")					
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
       System.setProperty("webdriver.chrome.driver", "/home/pavans/Pavan/mavenProj/QDir/chromedriver_linux64/chromedriver");					
       driver= new ChromeDriver();					
       driver.manage().window().maximize();			
       driver.get("http://demo.guru99.com/v4");					
    }		
	
	@Given("I have search field")
	public void i_have_search_field() {
	   System.out.println("Its From Given");
	   //WebDriver driver = new chromeDriver();
	}

	@When("I search for product with name {string} and price {int}")
	public void i_search_for_product_with_name_and_price(String string, Integer int1) {
	   System.out.println("Its from When");
	}

	@Then("Product with name {string} should displayed")
	public void product_with_name_should_displayed(String string) {
	    System.out.println("Its from Then");
	}
}
