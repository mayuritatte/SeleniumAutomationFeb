package handleWindows;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRCTCWindowsExample {

	WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launch application");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.irctc.co.in/nget/train-search");

		driver.manage().window().maximize();
		
		Thread.sleep(4000);

	}

	
	
	
	@AfterTest
	public void closeApp() throws Exception {

		System.out.println("close application");
		Thread.sleep(7000);
		//driver.close();				//current focus
		driver.quit();					//close all instance opened by driver

	}
	
	@Test
	public void verifyLogin() throws Exception {

		
		String parentWindow = driver.getWindowHandle();
		System.out.println("parent window:" + parentWindow);
		
		//driver.getWindowHandles();
		
		System.out.println("how many windows opened: " + driver.getWindowHandles().size());
		
		
		
		
		
		
		
		
		
		WebElement hotelButton = driver.findElement(By.partialLinkText("HOTELS"));
		hotelButton.click();
		
		
		
		Set<String> allwindow = driver.getWindowHandles();
		
		System.out.println("how many windows opened: after clicking on hotel window" + allwindow.size());
		
		
		String mainWindow =  (String)allwindow.toArray()[0];
		String hotelWindow =  (String)allwindow.toArray()[1];
		
		System.out.println("mainWindow window:" + mainWindow);
		System.out.println("hotelWindow window:" + hotelWindow);
		
		
		
		Thread.sleep(5000);
	//go to hotel window
		
		driver.switchTo().window(hotelWindow);
		
		driver.findElement(By.partialLinkText("Login")).click();;
		
		Thread.sleep(5000);
		
		driver.switchTo().window(mainWindow);
		
		driver.findElement(By.partialLinkText("CONTACT US")).click();
		
		
		Thread.sleep(5000);
		//go to hotel window
			
			driver.switchTo().window(hotelWindow);
	}

}
