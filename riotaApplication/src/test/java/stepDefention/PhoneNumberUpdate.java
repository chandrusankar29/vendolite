package stepDefention;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountSectionPage;

public class PhoneNumberUpdate {
	WebDriver driver;
	AccountSectionPage account;	
	@When("i Update the phone number in phone number field")
	public void i_update_the_phone_number_in_phone_number_field() throws InterruptedException, AWTException {
		hooks hooksIns = new hooks();
		driver = hooksIns.getDriver();
		account = new AccountSectionPage(driver);
	
		account.EditIcon.click();
		Thread.sleep(4000);
		System.out.println("Testing");
		account.PhoneNumberField1.click();
		account.PhoneNumberField1.sendKeys("9883949823");
		Thread.sleep(2000);
		account.EditSaveButton.click();
	}
	
	

	@Then("Update should be success")
	public void update_should_be_success() {
    System.out.println("updated successfully");



	}





}
