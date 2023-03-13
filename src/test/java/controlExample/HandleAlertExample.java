package controlExample;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class HandleAlertExample extends  BaseTest {
	
	//@Test
	public void verifySimpleAlert() throws Exception {
	
		
		
		//click on ALert Button
		driver.findElement(By.xpath("//input[@value='Show Me Alert']")).click();
		
		
		Thread.sleep(4000);
		
		//handle an alert
		//Alert/iframe/window      ----------- driver.switchTo()
		
		Alert simpleAlert = driver.switchTo().alert();
		
		
		
		//action on Alert
		//accept ------ click on ok
		//dismiss ------ cancel button
		//getText ------- get the text from alert
		//sendKeys------- enter value into alert
		
		
		String actualAlertText = simpleAlert.getText();
		String expectedAlertText = "Hi.. This is alert message!";
		
		
		//Validation step
		Assert.assertEquals(expectedAlertText, actualAlertText);  				//hard assertion
		Assert.assertEquals("Hi.. This is alert message!", simpleAlert.getText());  	
		
		System.out.println("Alert Text: " + actualAlertText);
		
		//simpleAlert.accept();
		
		simpleAlert.dismiss();
		
		
		
	}
	
	
	
	//@Test
	public void verifyConfirmAlert() throws Exception {
	
		
		
		//click on Confirm ALert Button
		driver.findElement(By.cssSelector("button[onclick='myFunction()']")).click();
		
		
		Thread.sleep(4000);
		
		//handle an alert
		//Alert/iframe/window      ----------- driver.switchTo()
		
		Alert confirmAlert = driver.switchTo().alert();
		
		
		
		//action on Alert
		//accept ------ click on ok
		//dismiss ------ cancel button
		//getText ------- get the text from alert
		//sendKeys------- enter value into alert
		
		
		String actualAlertText = confirmAlert.getText();
		String expectedAlertText = "Press 'OK' or 'Cancel' button!";
		
		
		//Validation step
		Assert.assertEquals(expectedAlertText, actualAlertText);  				//hard assertion
		Assert.assertEquals("Press 'OK' or 'Cancel' button!", confirmAlert.getText());  	
		
		System.out.println("Alert Text: " + actualAlertText);
		
		//simpleAlert.accept();
		
		confirmAlert.dismiss();
		
		Thread.sleep(4000);
		
		
		String ok_cancel_validation = driver.findElement(By.cssSelector("[id=\"demo\"]")).getText();
		
		System.out.println(ok_cancel_validation);
		
		Assert.assertEquals("You pressed Cancel!", ok_cancel_validation);  
		
		
		System.out.println("Valdiation step: =========: " + ok_cancel_validation.contains("Cancel"));
		
	
		
		
		Assert.assertTrue(ok_cancel_validation.contains("Cancel"));
		
		
	}
	
	
	
	@Test
	public void verifyPromptAlert() throws Exception {
	
		
		
		//click on Prompt ALert Button
		driver.findElement(By.cssSelector("button[onclick='myFunctionf()']")).click();
		
		
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
		String expectedAlertText = "Your Name Please";
		
		
		//Validation step
		Assert.assertEquals(expectedAlertText, actualAlertText);  				//hard assertion
		Assert.assertEquals("Your Name Please", ibm_promptAlert.getText());  	
		
		System.out.println("Alert Text: " + actualAlertText);
		
		
		
		Thread.sleep(4000);
		System.out.println("entering value onto alert......");
		
		String name = "Mamta";
		
		//enter value on Alert
		
		ibm_promptAlert.sendKeys(name);
		
		
		
		
		
		ibm_promptAlert.accept();
		
		//ibm_promptAlert.dismiss();
		
		Thread.sleep(4000);
		
		
		
		
		
	}
	
	
}
