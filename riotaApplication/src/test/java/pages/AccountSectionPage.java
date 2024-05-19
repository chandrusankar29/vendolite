package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSectionPage {
	WebDriver driver;
	
	@FindBy(css="mat-toolbar[class='mat-toolbar border-bottom mat-toolbar-single-row']>button:nth-child(5)>span>mat-icon")
	public  WebElement AccountIcon;
	
	@FindBy(xpath="//*/span[text()=' Change Image ']")
	public  WebElement ChangePicture;
	
	
	@FindBy(xpath="//*/span[text()=' Save ']")
	public  WebElement SaveButton;
	
	@FindBy(xpath="//*/img[@class='icon_img ng-star-inserted']")
	public  WebElement EditIcon;
	
	@FindBy(xpath="//*/input[@id='mat-input-17']")
	public  WebElement PhoneNumberField;
	
	@FindBy(xpath="//*/input[@id='mat-input-17']")
	public  WebElement PhoneNumberField1;
	
	@FindBy(xpath="//*/span[text()=' Save ']")
	public  WebElement EditSaveButton;
	
	
	public AccountSectionPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
