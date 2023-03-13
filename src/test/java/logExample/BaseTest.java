package logExample;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
//import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ConfigRead;

public class BaseTest {

	WebDriver driver;
	ConfigRead conf;
	Logger ibm_logger;

	@BeforeTest
	public void launchApp() throws Exception {

		
		
		ibm_logger = Logger.getLogger("NOP comm Application Module");
		PropertyConfigurator.configure(".\\data\\ibm_log.properties");
		
		
		ibm_logger.info("============================");
		
		
		
		ibm_logger.info("launch application");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		conf = new ConfigRead();
		
		ibm_logger.info("Application url : " +conf.getApplicationURL());
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		ibm_logger.info("Application launch sucessfully");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterTest
	public void closeApp() throws Exception {

		ibm_logger.info("close an application");
		Thread.sleep(7000);
		driver.close();
		// driver.quit();

	}

	
	
	
	public void getScreenshot(WebDriver driver, String screenshotName) throws Exception {

		ibm_logger.info("============capturing a screenshot===============");
		
		// take screenshot
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File targetLocation = new File(".\\ibm_screenshot\\Amazon_"+screenshotName+ "_.png");

		
		
		FileUtils.copyFile(screenshotFile, targetLocation);

		ibm_logger.info("============screenshot location: " + targetLocation);
		
	}

}
