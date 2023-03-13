package xpathAdvanced;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPATHExample {

	WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launch application");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

		driver.manage().window().maximize();
		
		Thread.sleep(4000);

	}

	
	
	
	@AfterTest
	public void closeApp() throws Exception {

		System.out.println("close application");
		Thread.sleep(7000);
		//driver.close();
		// driver.quit();

	}
	
	@Test
	public void verifySeeMore() throws Exception {

		//click checkbox against Helen Bennett
		driver.findElement(By.xpath("//td[text()='Helen Bennett']//preceding-sibling::td/input")).click();

		
		
		
	}

}
