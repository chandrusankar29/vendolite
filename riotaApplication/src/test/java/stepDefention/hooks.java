	package stepDefention;

import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Before;
import io.cucumber.java.After;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class hooks {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @Before("@BrowserInitialization")
    public void setUp() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandru\\OneDrive\\Desktop\\AutomationSupports\\Driver\\chromedriver.exe");
        driver.set(new ChromeDriver());
        driver.get().get("https://cloud-test.vendolite.com/home/login");
        driver.get().manage().window().maximize();

    }

    public WebDriver getDriver() {
        WebDriver currentDriver = driver.get();
        if (currentDriver == null) {
            throw new RuntimeException("WebDriver instance not initialized. Please call setUp before using getDriver");
        }
        return currentDriver;
    }
    
    @After("@logout")
    public void logout() {
    	System.out.println("CLOSING THE BROWSER");
    	 driver.get().quit();
    	
    }    
}
