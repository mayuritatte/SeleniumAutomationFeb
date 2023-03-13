package xpathAdvanced;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_XPathExample {

	WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launch application");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		Thread.sleep(4000);

	}

	
	
	
	@AfterTest
	public void closeApp() throws Exception {

		System.out.println("close application");
		Thread.sleep(7000);
		driver.close();
		// driver.quit();

	}
	
	@Test
	public void verifySeeMore() throws Exception {

		
		driver.findElement(By.xpath("//h2[contains(text(),'Automotive essentials')]//parent::div//following-sibling::div[contains(@class, 'foot')]//child::a[text()='See more']")).click();

		
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		Assert.assertTrue(driver.getTitle().contains("Car &"));
		
	}

}
