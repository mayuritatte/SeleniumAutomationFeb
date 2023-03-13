package hrmLogin;

//Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class LoginTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		
		
		//Scenario 1 
		//Browser version --- v110
		//download chrome driver ---- v110
		
		//browser updated -------v 119
		//chrome driver ---- v110  ----- compatibility issue
		
		//Solution -------
		//Download v 119 chrome driver 
		
		
		//WebDriverManger ------- external lib ----- resolve compatibility issue
		
		//WebDriverManager ----- after 5.0 ---- createMethod 
		
		
		//System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		
		//WebDriverManager.chromedriver().setup();
		
		//--------------------------------------------------
		//app1
		//driver = WebDriverManager.chromedriver().create();
		
		
		//app2
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		
		
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void test1() {
		
		// specific API called
		//endPoint
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		
		//REST API ----  get/post/put/delete etc...
		//data ------ JSON format
		
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.cssSelector(".oxd-button")).click();
	}
}