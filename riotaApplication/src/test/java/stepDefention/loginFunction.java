package stepDefention;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pages.loginPage;


public class loginFunction {
	WebDriver driver;
	loginPage loginP;
	
	@Given("I am on the vendolite website")
	public void i_am_on_the_vendolite_website() throws InterruptedException {
		hooks hooksIns = new hooks();
    	driver = hooksIns.getDriver();
    	System.out.println("Statring the Browser");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		
	}

	@When("enter valid username {string} and password {string}")
	public void i_enters_valid_username_and_password(String username, String password) {
	   loginP = new loginPage(driver);
	   loginP.Username.sendKeys(username);
	   loginP.Password.sendKeys(password);
	}
	
	@When("enter invalid username {string} and password {string}")
	public void i_enters_invalid_username_and_password(String Invalidusername, String Invalidpassword) {
	   loginP = new loginPage(driver);
	   loginP.Username.sendKeys(Invalidusername);
	   loginP.Password.sendKeys(Invalidpassword);
	}

	@When("I clicked the login button")
	public void i_clicked_the_login_button() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		loginP.loginButton.click();
	}

	@Then("I should successfully login to the application")
	public void i_should_successfully_login_to_the_application() {
	
	 String ActualURL = "https://cloud-test.vendolite.com/home/login";
	 String ExpectedTitle = driver.getCurrentUrl();	 
	 Assert.assertEquals(ExpectedTitle, ActualURL);	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	}
	

@Then("I should not successfully login to the application")
public void i_should_not_successfully_login_to_the_application() {
	System.out.println(driver.getTitle());
	 String ActualURL = "https://cloud-test.vendolite.com/home/login";
	 String ExpectedTitle = driver.getCurrentUrl();	 
	 Assert.assertEquals(ExpectedTitle, ActualURL);	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	
	
}

}
