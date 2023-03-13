package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



public class LoginPage_oldtool {

	WebDriver driver;

	public LoginPage_oldtool(WebDriver rdriver) {

		// this.driver = driver;
		driver = rdriver;

	}

	// Identification

	By txtEmail = By.cssSelector("input#Email");
	By txtPass = By.className("password");
	By chkRem = By.name("RememberMe");
	By btnLogin = By.tagName("button");
	// Actions/Methods

	public void enterEmail(String email) {

		driver.findElement(txtEmail).clear();
		driver.findElement(txtEmail).sendKeys(email);

	}

	public void enterPass(String pwd) {

		driver.findElement(txtPass).clear();
		driver.findElement(txtPass).sendKeys(pwd);

	}
	
	public void clickCheckbox() {
		driver.findElement(chkRem).click();
		
	}
	
	public void clickLoginButton() {
		driver.findElement(btnLogin).click();
		
	}
	
	
	public void login(String email, String pwd) {
		
		enterEmail(email);
		enterPass(pwd);
		clickLoginButton();
		
	}
	
	
	public void verifyApplicationTitle(String expectedVal) throws Exception {
		Thread.sleep(4000);
		Assert.assertEquals(driver.getTitle(), expectedVal);
	}

}
