package actionExample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmaoznCreateWishList {

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
	public void verifyLogin() throws Exception {

		
		
		WebElement SignIn = driver.findElement(By.xpath("//span[contains(text(),'Hello, si')]"));
		
		WebElement CreateWishList = driver.findElement(By.xpath("//span[contains(text(),'Create a Wis')]"));
		
		
		//create an object of Actions clas
		
		Actions act = new Actions(driver);
		
//		//app1
//		//mouse hover
//		act.moveToElement(SignIn).perform();
//		act.moveToElement(CreateWishList).perform();
//		act.click().perform();
//		
//		
//		//app2
//		act.moveToElement(SignIn).perform();
//		act.click(CreateWishList).perform();
//		
//		
//		//app3
//		act.moveToElement(SignIn).moveToElement(CreateWishList).click().perform();
		
		//app4
		act.moveToElement(SignIn).click(CreateWishList).perform();
		
		
		System.out.println(driver.getTitle());
		
	}

}
