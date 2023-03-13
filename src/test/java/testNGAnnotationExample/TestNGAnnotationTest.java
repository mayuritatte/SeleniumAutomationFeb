package testNGAnnotationExample;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationTest {
	
	//pre-condition @BeforeSuite----->BeforeTest----->BeforeClass------BeforeMethod
	//Test			TestCase
	//post-condition 
	
	
	@BeforeSuite
	public void logSetp() {
		
		System.out.println("-------------logSetp---------------");
		
	}

	
	@AfterSuite
	public void logTearDown() {
		
		System.out.println("-------------logSetpComplete---------------");
		
	}
	
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("-------------launchApp---------------");
		
	}

	
	@AfterTest
	public void closeApp() {
		
		System.out.println("-------------closeApp---------------");
		
	}
	
	
	@Test
	public void login() {
		
		System.out.println("login test case");
	}
	
	
	@Test
	public void logout() {
		
		System.out.println("logout test case");
	}
	
}
