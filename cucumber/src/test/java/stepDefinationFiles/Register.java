package stepDefinationFiles;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.*;

public class Register {
	
	@Before("@Register")
	public void Setup() {
		
		System.out.println("Browser got Opened");
	}
	@After
	public void clearDown() {
		
		System.out.println("Browser got Closed");
	}
	
	@BeforeStep
	public void Step() {
		
		System.out.println("Beforestep");
	}
	
	@AfterStep
	public void AfterMethod() {
		
		System.out.println("Afterstep");
	}
	@Given("User navigate to Register Account Page")
	public void User_navigate_to_Register_Account_Page() {
		
		System.out.println("Navigate to Register Account Page");
	}
	@When("User enters firstname {string} into the First Name field")
	public void User_enters_firstname_into_the_First_Name_field(String fname) {
		
		System.out.println("User has entered firstname: "+fname+" into the firstname field ");
	}
	@And("enters lastname {string} into the last Name field")
	public void  enters_lastname_into_the_last_Name_field(String lname) {
		
		System.out.println("User has entered lastname: "+lname+" into the lastname field ");
	}
	
	@And("enters email address {string} into the Email field")
	public void enters_email_address_into_the_email_field(String emailId) {
		System.out.println("User has entered Email address: "+emailId+" into the email field ");
	}

	@And("enters Phone number  {string} into the Phone number field")
	public void enters_phone_number_into_the_phone_number_field(String Number) {
	    
		System.out.println("User has entered Phone number: "+Number+" into the Number field ");
	}

	@And("enters Password {string} into the Password field")
	public void enters_password_into_the_password_field(String pwd) {
	    
		System.out.println("User has entered Password: "+pwd+" into the Password field ");
	}

	@And("enters Password {string} into the Password Confirm field")
	public void enters_password_into_the_password_confirm_field(String Confirmpwd) {
	    
		System.out.println("User has entered Confirm Password: "+Confirmpwd+" into the Password Confirm field ");
	}

	@And("selects privacy policy field")
	public void selects_privacy_policy_field() {
	    
		System.out.println("Selected privacy policy field");
	}

	@When("Clicks on Continue button")
	public void Clicks_on_continue_button1() {

		System.out.println("clicks on continue");
		
	}

	@Then("Account should get successfully Created")
	public void account_should_get_successfully_created() {
	    
		System.out.println("Account successfully created");
	}

	@When("Selects Yes for Newsletters")
	public void selects_yes_for_newsletters() {
	    
		System.out.println("Selcted yes button");

	}

	@When("User dont enter details into any fields")
	public void user_dont_enter_details_into_any_fields() {

		System.out.println("user dont entered any fields");
		
	}

	@When("Clicks on continue button")
	public void clicks_on_continue_button() {
	    
		System.out.println("Clicks on continue button");
	}

	@Then("Warning Messages should be displayed for the Mandatory Fileds")
	public void warning_messages_should_be_displayed_for_the_mandatory_fileds() {

		System.out.println("Warning Messages should be displayed for the Mandatory Fileds");
	}

	@Then("Warning msg informing the user about the duplicate email field should be displayeds")
	public void warning_msg_informing_the_user_about_the_duplicate_email_field_should_be_displayeds() {
	   
		System.out.println("Warning msg informing the user about the duplicate email field should be displayeds");
		
	}



	

}
