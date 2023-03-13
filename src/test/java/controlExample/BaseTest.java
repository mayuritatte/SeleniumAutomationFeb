package controlExample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;

	@Before
	public void launchApp() throws Exception {

		System.out.println("launch application");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");

		driver.manage().window().maximize();
		
		Thread.sleep(4000);

	}

	
	
	
	@After
	public void closeApp() throws Exception {

		System.out.println("close application");
		Thread.sleep(7000);
		driver.close();
		// driver.quit();

	}

}
