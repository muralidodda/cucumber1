package stepDefinationFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition {
	@Given("I visit the website as Guest user")
	public void i_visit_the_website_as_guest_user() {
		System.out.println("I visit the website as Guest user");
	   
	}

	@When("I select the books option from the dropdown")
	public void i_select_the_books_option_from_the_dropdown() {
		System.out.println("I select the books option from the dropdown");
	}

	@When("I click on Search Icon button")
	public void i_click_on_search_icon_button() {
		System.out.println("I click on Search Icon button");
	    
	}

	@Then("I should see the Books page loaded")
	public void i_should_see_the_books_page_loaded() {
		System.out.println("I should see the Books page loaded");
	   
	}

	@Then("I should see Books at Amazon as heading")
	public void i_should_see_books_at_amazon_as_heading() {
		System.out.println("I should see Books at Amazon as heading");
	    
	}

	@When("I select the {string} option from the dropdown")
	public void i_select_the_option_from_the_dropdown(String string) {
		System.out.println("I select the {string} option from the dropdown");
	   
	}

	@Then("I should see the Baby page loaded")
	public void i_should_see_the_baby_page_loaded() {
		System.out.println("I should see the Baby page loaded");
	    
	}

	@Then("I should see 'The Baby Store at Amazon'as heading")
	public void i_should_see_the_baby_store_at_amazon_as_heading() {
		System.out.println("I should see 'The Baby Store at Amazon'as heading");
	    
	}

	@Then("I should see the Computers page loaded")
	public void i_should_see_the_computers_page_loaded() {
		System.out.println("I should see the Computers page loaded");
	   
	}

	@Then("I should see {string} as heading")
	public void i_should_see_as_heading(String string) {
		System.out.println("I should see {string} as heading");
	   
	}

	@When("I select the 'Clothing&Accessories'option from the dropdown")
	public void i_select_the_clothing_accessories_option_from_the_dropdown() {
		System.out.println("I select the 'Clothing&Accessories'option from the dropdown");
	   
	}

	@Then("I should see the Clothing page loaded")
	public void i_should_see_the_clothing_page_loaded() {
		System.out.println("I should see the Clothing page loaded");
	    
	}
	

}
