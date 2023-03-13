package controlExample;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlertExample2  {
	
	WebDriver driver;

	@Before
	public void launchApp() throws Exception {

		System.out.println("launch application");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://www.uitestpractice.com/Students/Switchto");

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
	
	
	@Test
	public void verifyPromptAlert() throws Exception {
	
		
		
		//click on Prompt ALert Button
		driver.findElement(By.cssSelector("[id='prompt']")).click();
		
		
		Thread.sleep(4000);
		
		//handle an alert
		//Alert/iframe/window      ----------- driver.switchTo()
		
		Alert ibm_promptAlert = driver.switchTo().alert();
		
		
		
		//action on Alert
		//accept ------ click on ok
		//dismiss ------ cancel button
		//getText ------- get the text from alert
		//sendKeys------- enter value into alert
		
		
		String actualAlertText = ibm_promptAlert.getText();
		String expectedAlertText = "Enter your name";
		
		
		//Validation step
		Assert.assertEquals(expectedAlertText, actualAlertText);  				//hard assertion
		Assert.assertEquals("Enter your name", ibm_promptAlert.getText());  	
		
		System.out.println("Alert Text: " + actualAlertText);
		
		
		
		Thread.sleep(4000);
		System.out.println("entering value onto alert......");
		
		String name = "Mamta Agarwal";
		
		//enter value on Alert
		
		ibm_promptAlert.sendKeys(name);
		
		
		
		
		
		ibm_promptAlert.accept();
		
		//ibm_promptAlert.dismiss();
		
		Thread.sleep(4000);
		
		
		

		
		
		String validationText = driver.findElement(By.cssSelector("[id=\"demo\"]")).getText();
		
		System.out.println(validationText);
		
		System.out.println("Valdiation step: =========: " + validationText.contains(name));
		
	
		
		
		Assert.assertTrue(validationText.contains(name));
		
		
		
	}
	
	
}
