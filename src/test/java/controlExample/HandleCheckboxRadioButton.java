package controlExample;

import org.junit.Test;
import org.openqa.selenium.By;

public class HandleCheckboxRadioButton extends  BaseTest {

	
	@Test
	public void verifyInput() throws Exception {
	
		
		
		//checkbox
		
		driver.findElement(By.xpath("//input[@value='Boat']")).click();;
		
		Thread.sleep(4000);
		
		//radioButton
		
		driver.findElement(By.cssSelector("input[value='female']")).click();;
		
		
	}
	
}
