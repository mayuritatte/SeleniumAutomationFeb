package testNGAnnotationExample;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonExamplePriroity2 {
	
	

	
	@BeforeTest
	public void launchapp() {
		System.out.println("launchapp");
		
	}

	
	@AfterTest
	public void closeapp() {
		System.out.println("closeApp");
		
	}
	
	@Test(priority = 1,  description = "verification of login feature of Amazon Application.")
	public void login() {
		
		System.out.println("login test case");
		
	}
	
	
	@Test(priority = 5, dependsOnMethods = "login")
	public void logout() {
		
		System.out.println("logout test case");
		
	}
	
	
	@Test(priority = 2, description = "verification of additems on Amazon Application.")
	public void addItems() {
		
		System.out.println("addItems test case");
		
		//get failed
		
		
//		int x  = 1/0;
		
		Assert.assertTrue(true, "Validation of Add items get failed.");
		
	}
	
	@Test(priority = 4, dependsOnMethods = "addItems")
	public void payment() {
		
		System.out.println("payment test case");
		
	}
	
	@Test(priority = 3, dependsOnMethods = "addItems")
	public void cancelOrder() {
		
		System.out.println("cancelOrder test case");
		
	}
}
