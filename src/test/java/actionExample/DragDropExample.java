package actionExample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropExample {

	WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launch application");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

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
	public void verifyDragDropTest() throws Exception {

		
		//handle a frame
		WebElement ibm_frame = driver.findElement(By.cssSelector("iframe[data-src*='photo-manager']"));
		
		driver.switchTo().frame(ibm_frame);
		
		
		//its working fine as per dragdrop concept
		
		
		Actions act = new Actions(driver);
		
		WebElement img3 = driver.findElement(By.cssSelector("img[src*='tatras3']"));
		WebElement img4 = driver.findElement(By.cssSelector("img[src*='tatras4']"));
		WebElement trash = driver.findElement(By.cssSelector("div#trash"));
		
		//app1
		act.dragAndDrop(img3, trash).perform();
		
		
		
		//build 
		
		
		
		
		//app2
		//A convenience method that performs click-and-hold at the location of the source element, 
		//moves to the location of the target element, then releases the mouse.
		
		act.clickAndHold(img4).moveToElement(trash).release().build().perform();
		
		
		//act.clickAndHold(img4).moveToElement(trash).release().perform();
		
		
		
	}

}
