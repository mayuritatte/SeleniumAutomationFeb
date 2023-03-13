package testNGAnnotationExample;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonExamplePriroity {
	
	
	//Execution workflow
	//Priority
	
	//Default Priority - 0 
	//highest negative number having highest priority
	//If priority is same -----default execution as per naming conv (ASCII)

	
	
//	launchapp
	//	addItems test case
	//	login test case
	//	logout test case
	//	payment test case
//	closeApp
	
//	launchapp
	//	login test case
	//	addItems test case
	//	payment test case
	//	logout test case
//	closeApp
	
	
	@BeforeTest
	public void launchapp() {
		System.out.println("launchapp");
		
	}

	
	@AfterTest
	public void closeapp() {
		System.out.println("closeApp");
		
	}
	
	@Test(priority = -100)
	public void login() {
		
		System.out.println("login test case");
		
	}
	
	
	@Test(priority = 1)
	public void logout() {
		
		System.out.println("logout test case");
		
	}
	
	
	@Test
	public void addItems() {
		
		System.out.println("addItems test case");
		
	}
	
	@Test
	public void payment() {
		
		System.out.println("payment test case");
		Assert.assertTrue(false);
	}
	
	//@Test(retryAnalyzer = retryLogicExample.RetryLogic.class)
	@Test()
	public void cancelOrder() {
		
		System.out.println("cancelOrder test case");
		
		Assert.assertTrue(false);
		
	}
}
