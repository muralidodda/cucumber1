package stepDefinationFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logg {

@Given("User navigates to Login Page")
public void user_navigates_to_login_page() {

	System.out.println("Navigates to Login page");
}

@When("^Enter Valid Username (.+)$")
public void Enter_Valid_Username(String user) {
   
	System.out.println("Enter Valid Username:"+user);
}
@When("^Enter Valid Password (.+)$")
public void Enter_Valid_Password(String pwd) {

	System.out.println("Enter Valid Password:"+pwd);
	
}

@When("clcik on Login button")
public void clcik_on_login_button() {
   
	System.out.println("Click on login button");
}

@Then("User should login Scuccessfully")
public void user_should_login_scuccessfully() {

	System.out.println(" Scuccessfully logged in");
}

@When("^Enter Invalid Username \"(.+)\"$")
public void enter_invalid_username(String InvalidUser) {

	System.out.println("Entered Invalid Username:"+InvalidUser);

}

@When("^Enter Invalid Password \"([0-9]*)\"$")
public void enter_invalid_password(String Invalidpwd) {


	System.out.println("Entered Inavalid Password:"+Invalidpwd);
}

@Then("User should displayed warning  msg")
public void user_should_displayed_warning_msg() {
   
	System.out.println("Error msg");
}

@When("^Enter valid Username \"(.+)\"$")
public void enter_valid_username(String ValidUser) {
    
	System.out.println("Entered Valid Username:"+ValidUser);
}

@When("^Enter valid Password \"([0-9]*)\"$")
public void enter_valid_password(String Validpwd) {
    
	System.out.println("Entered Valid Password:"+Validpwd);
}

@When("User dont entered any credentials")
public void user_dont_entered_any_credentials() {
    
	System.out.println("Error msg");
}


}
