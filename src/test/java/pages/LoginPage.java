package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver rdriver) {

		// this.driver = driver;
		driver = rdriver;
		
		PageFactory.initElements(rdriver, this);

	}

	// Identification

//	By txtEmail = By.cssSelector("input#Email");
//	By txtPass = By.className("password");
//	By chkRem = By.name("RememberMe");
//	By btnLogin = By.tagName("button");
	
	
	
	@FindBy(css = "input#Email")
	WebElement txt_Email;
	
	@FindBy(className  = "password")
	WebElement txt_Pass;
	
	@FindBy(name = "RememberMe")
	WebElement chk_Rem;
	
	@FindBy(tagName  = "button")
	WebElement btn_Login;
	
	@FindBy(partialLinkText   = "ogout")
	WebElement btn_Logout;
	
	// Actions/Methods

	public void enterEmail(String email) {

		txt_Email.clear();
		txt_Email.sendKeys(email);

	}

	public void enterPass(String pwd) {

		txt_Pass.clear();
		txt_Pass.sendKeys(pwd);

	}
	
	public void clickCheckbox() {
		chk_Rem.click();
		
	}
	
	public void clickLoginButton() {
		btn_Login.click();
		
	}
	
	public void clickLogoutButton() {
		btn_Logout.click();
		
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
