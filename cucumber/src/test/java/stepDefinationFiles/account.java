package stepDefinationFiles;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class account {
	

	WebDriver driver;
@Given("I enter the Url")
public void i_enter_the_url() {
	
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			
}

@Then("Click on My Account")
public void click_on_my_account() {
	
    driver.findElement(By.xpath("//a[@title='My Account']")).click();
    System.out.println("My Account page");
	
}

}