package hrmLogin;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ConfigRead;

public class HRMLogin {

	WebDriver driver;
	ConfigRead conf;
	
	// pre-condition
	// Test
	// post-condition

	@Test
	public void login() throws Exception {

		System.out.println("login test case");
		
		//conf.getEmail();
		
		//locator --- id
		
		Thread.sleep(5000);
		WebElement txtEmail = driver.findElement(By.id("Email"));
		
		txtEmail.clear();
		
		Thread.sleep(5000);
		
		txtEmail.sendKeys(conf.getEmail());
		
		
		//locator - name
		driver.findElement(By.name("Password")).clear();
		Thread.sleep(5000);
		driver.findElement(By.name("Password")).sendKeys("admin");
		

	}

	@After
	public void closeApp() throws Exception {

		System.out.println("closing application");
		
		Thread.sleep(5000);
		driver.close();
	}

	@Before
	public void launchApp() throws Exception {

		System.out.println("launching application");
		
		driver =WebDriverManager.chromedriver().create();
		
		conf = new ConfigRead();
		
		System.out.println(conf.getApplicationURL());
		
		driver.get(conf.getApplicationURL());
		
		//driver.
		
		
	}

}
