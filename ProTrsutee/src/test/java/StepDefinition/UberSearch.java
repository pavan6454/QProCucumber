package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberSearch {
	
	@Given("User wants to book car")
	public void user_wants_to_book_car() {
	    System.out.println("Given");
	}

	@When("User select car {string} pickup {string} and drop to {string}")
	public void user_select_car_pickup_and_drop_to(String string, String string2, String string3) {
		 System.out.println("When");
	}

	@Then("Driver ends journey")
	public void driver_ends_journey() {
		 System.out.println("Then1");
	}

	@Then("User pays the amount {int}")
	public void user_pays_the_amount(Integer int1) {
		 System.out.println("Then2");
	}
}
