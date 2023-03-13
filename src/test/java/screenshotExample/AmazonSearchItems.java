package screenshotExample;

import java.io.File;

import org.apache.commons.io.FileUtils;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonSearchItems extends  BaseTest {
	
	
	@Test
	public void verifyAmaoznSearchItems() throws Exception {
	
	
//		WebDriverWait wait = new WebDriverWait(driver, 120);			//seconds //maximum time 
//		wait.until(ExpectedConditions.alertIsPresent());

		
		driver.findElement(By.cssSelector("input[id=twotabsearchtextbox]")).sendKeys("iphone 14 pro max");
		
		driver.findElement(By.cssSelector("input[value=Go]")).click();
		
		
		//validation
		Assert.assertTrue(driver.getTitle().contains("iphone 14"));
		
		
		
//		//take screenshot
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		
//		File targetLocation = new File(".\\ibm_screenshot\\AmazonSearchItem.png");
//		
//		
//		FileUtils.copyFile(screenshotFile, targetLocation);
//		
		
		
		getScreenshot(driver, "iphone 14 pro max");
		
		
	}
	

	
	
}
