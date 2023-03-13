package hrmLogin;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;

public class HRMLoginTestNG {

	// pre-condition ---- @BeforeSuite  ---BeforeTest -----BeforeClass ---BeforeMethod
	// Test
	// post-condition

	@Test
	public void login() {

		System.out.println("login test case");

	}

	@AfterTest
	public void closeApp() {

		System.out.println("closing application");
	}

	@BeforeTest
	public void launchApp() {

		System.out.println("launching application-----testNG");
	}

}
