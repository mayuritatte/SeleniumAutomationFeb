package controlExample;

import org.junit.Test;
import org.openqa.selenium.By;

public class HandleInputbox_MultiupleMatch extends  BaseTest {

	@Test
	public void verifyInput() {
	
		
		
		//xpath/css
		
		//driver.findElement(By.xpath("//input")).sendKeys("enter username");			//match --- 14, by default - perform action on first one
		driver.findElement(By.tagName("input")).sendKeys("enter username");
		
	}
	
}
