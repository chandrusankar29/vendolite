package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class loginPage {
	WebDriver driver;
	
	@FindBy(css="input[name='username']")
	public  WebElement Username;
	
	@FindBy(css="input[name='password']")
	public WebElement Password;
	
	@FindBy(xpath="//*[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']/span")
	public  WebElement loginButton;
	
	
	
	public loginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
