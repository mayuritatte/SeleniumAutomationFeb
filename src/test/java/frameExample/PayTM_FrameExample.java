package frameExample;

import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PayTM_FrameExample  {
	
	
	WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launch application");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://paytm.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterTest
	public void closeApp() throws Exception {

		System.out.println("close application");
		Thread.sleep(7000);
		driver.close();
		// driver.quit();

	}
	
	@Test
	public void verifyFrame() throws Exception {
	
	
		//sign button
		
		driver.findElement(By.xpath("//span[contains(text(), 'Sign')]")).click();
		
		
		
		
		//Alert/frame/window  ----- switchTo
		
		//handle frame
		
		//index --- start from 0
		//name/id
		//webElement
		
		
		
		//WebElement payTMFrame = driver.findElement(By.xpath("//iframe[contains(@src,'login')]"));
		WebElement payTMFrame = driver.findElement(By.tagName("iframe"));
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("name/id");
		driver.switchTo().frame(payTMFrame);
		
		
		//Thread.sleep(5000);
		
		
		String actualFrameHeading = driver.findElement(By.cssSelector(".heading")).getText();
		System.out.println("Frame Heading: " + actualFrameHeading);
		
		
		Assert.assertTrue(actualFrameHeading.contains("Paytm Web account"));
		
		//click on Watch video
		driver.findElement(By.xpath("//span[contains(text(), 'Watch')]")).click();
		
	}
	

	
	
}
