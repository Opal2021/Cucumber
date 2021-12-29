package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Driver;

public class LoginStepDef {
	
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		  System.out.println("Im on Homepage");
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    System.out.println("Im entering username and password");
	}

	@Then("User should be logged in succesfully")
	public void user_should_be_logged_in_succesfully() {
	    System.out.println("Im in it");
	}

}
