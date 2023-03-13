package sync_conditionalExample;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandleAlertExample extends  BaseTest {
	
	
	@Test
	public void verifyPromptAlert() throws Exception {
	
		
		
		//Thread.sleep(20000);     //hard coded delay
		//execution slow
		
		
		
		//Explicit Wait
		//conditional wait
		//Sepecific to element
		
		
		WebDriverWait wait = new WebDriverWait(driver, 120);			//seconds //maximum time 
		wait.until(ExpectedConditions.alertIsPresent());
//		

		
		
		
		System.out.println(driver.switchTo().alert().getText());
		
		//Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
	}
	
	
}
