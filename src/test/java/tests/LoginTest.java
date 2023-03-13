package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends BaseTest {

	
	
	@Test
	public void verifyLogin() throws Exception {

		
		//validatio  Step
		lp.verifyApplicationTitle("Your store. Login");
		
		
		lp.enterEmail("admin@yourstore.com");
		lp.enterPass("admin");
		lp.clickCheckbox();
		lp.clickLoginButton();
		
		
		
		
		
	}
	
	@Test(priority = 1)
	public void verifyApplicationTitleBeforeLogout() throws Exception {
		
		lp.verifyApplicationTitle("Dashboard / nopCommerce administration");
		
		lp.clickLogoutButton();
		
	}

}
