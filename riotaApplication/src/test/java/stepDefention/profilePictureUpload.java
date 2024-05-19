package stepDefention;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
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
import pages.AccountSectionPage;
public class profilePictureUpload {

AccountSectionPage account;	
WebDriver driver;
	
@When("I navigated to account section to upload image")
public void i_navigated_to_account_section_to_upload_image() throws InterruptedException, AWTException, UnsupportedFlavorException, IOException {
	hooks hooksIns = new hooks();
	driver = hooksIns.getDriver();
	account = new AccountSectionPage(driver);
	Thread.sleep(2000);
	account.AccountIcon.click();
	Thread.sleep(2000);
	account.ChangePicture.click();
}

@When("i uploaded the image path {string} in image section")
public void i_uploaded_the_image_url_in_image_section(String path) throws UnsupportedFlavorException, IOException, AWTException, InterruptedException {
	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	StringSelection str = new StringSelection(path);
	clipboard.setContents(str, null);
	Thread.sleep(2000);
	System.out.println(str.getTransferData(DataFlavor.stringFlavor));
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	Thread.sleep(2000);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(6000);
	account.SaveButton.click();
	
	
}

@When("I navigated to account section")
public void i_navigated_to_account_section() throws InterruptedException {
	hooks hooksIns = new hooks();
	driver = hooksIns.getDriver();
	account = new AccountSectionPage(driver);
	Thread.sleep(2000);
	account.AccountIcon.click();
}

@Then("I should see the uploaded image")
public void i_should_see_the_uploaded_image() {
	System.out.println("Uploaded successfully");
	
}
}
