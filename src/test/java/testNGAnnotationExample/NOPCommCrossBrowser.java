package testNGAnnotationExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NOPCommCrossBrowser {
	WebDriver driver;

	@Test
	public void verifyLogin() throws Exception {

		System.out.println("login test case");

		// Locator Example
		// ID
		// email
		Thread.sleep(5000);
		WebElement txt_Email = driver.findElement(By.id("Email"));

		// clear the value
		txt_Email.clear();

		// get the attribute value
		String attributeValueEMail = txt_Email.getAttribute("data-val-required"); // Please enter your email
		System.out.println("Attribute value are: " + attributeValueEMail);

		// sendKeys ---enter value
		txt_Email.sendKeys("admin@yourstore.com");

		// Password ---
		// className
		Thread.sleep(5000);
		driver.findElement(By.className("password")).clear();
		Thread.sleep(5000);
		driver.findElement(By.className("password")).sendKeys("admin");

		Thread.sleep(5000);

		// name
		// checkbox
		driver.findElement(By.name("RememberMe")).click();

		// Tagname
		// Login button

		String loginButtonText = driver.findElement(By.tagName("button")).getText();

		System.out.println("login button text value are: " + loginButtonText);
		driver.findElement(By.tagName("button")).click();

		System.out.println("Application title after login: " + driver.getTitle());
		System.out.println("Application URL after login: " + driver.getCurrentUrl());

		// validation step

		Thread.sleep(5000);
		// LinkText
		// driver.findElement(By.linkText("Logout")).click();;

		// partialLinkText
		// Logout button
		// driver.findElement(By.partialLinkText("Logo")).click();;
		driver.findElement(By.partialLinkText("ogo")).click();
		;

		System.out.println("===========================================");

		Thread.sleep(5000);
		System.out.println("Application title after logout: " + driver.getTitle());
		System.out.println("Application URL after logout: " + driver.getCurrentUrl());

		Thread.sleep(5000);
		// Login button
		// XPATH

		// driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		// driver.findElement(By.xpath("//button[@type='submit']")).click();
		// driver.findElement(By.xpath("//*[@type='submit']")).click();
		// driver.findElement(By.xpath("//button")).click();

		// Login button
		// CSS

		// driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		// driver.findElement(By.xpath("//*[@type='submit']")).click();
		// driver.findElement(By.cssSelector("button")).click();

		Thread.sleep(5000);
		// Logout button
		driver.findElement(By.partialLinkText("Logo")).click();
		;

	}

	@AfterTest
	public void closeApp() throws Exception {

		System.out.println("closing application");
		Thread.sleep(5000);
		driver.close();
//		driver.quit();  

	}

	@Parameters("ibm_browser")
	@BeforeTest
	public void launchApp(String br) {

		System.out.println("launching application");

		System.out.println("Execution on browser: " + br);
		// cross Browser testing

		String browser = br;

		if (browser.equalsIgnoreCase("chrome")) {

			System.out.println("Execution on chrome browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		else if (browser.equalsIgnoreCase("edge")) {

			System.out.println("Execution on edge browser");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		else if (browser.equalsIgnoreCase("firefox")) {

			System.out.println("Execution on forefox browser");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}

		else {

			System.out.println("Execution on default - chrome browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		// chrome browser

//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();

		// edge browser

//		WebDriverManager.edgedriver().setup();
//		driver = new EdgeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		driver.manage().window().maximize();

	}

}
