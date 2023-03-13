package logExample;

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

public class NOPLoginTest extends BaseTest {

	@Test
	public void verifyLogin() throws Exception {

		
		ibm_logger.info("before login application title: " + driver.getTitle());
		
		ibm_logger.info("clear the email value");
		driver.findElement(By.id("Email")).clear();

		ibm_logger.info("enter email: " + conf.getEmail());
		driver.findElement(By.id("Email")).sendKeys(conf.getEmail());

		
		ibm_logger.info("clear the password value");
		driver.findElement(By.className("password")).clear();
		
		
		ibm_logger.info("enter password: " );
		driver.findElement(By.className("password")).sendKeys("admin");

		Thread.sleep(5000);

		// name
		// checkbox
		
		ibm_logger.info("click on rem me checkbox" );
		driver.findElement(By.name("RememberMe")).click();

		
		ibm_logger.info("click on login Button" );
		driver.findElement(By.tagName("button")).click();

		Thread.sleep(3000);
		ibm_logger.info("after login application title: " + driver.getTitle());
		
		ibm_logger.info("click on logout Button" );
		driver.findElement(By.partialLinkText("ogo")).click();
		
		Thread.sleep(3000);
		ibm_logger.info("before logout application title: " + driver.getTitle());
		
		System.out.println("===========================================");

	}

}
