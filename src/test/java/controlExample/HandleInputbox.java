package controlExample;

import org.junit.Test;
import org.openqa.selenium.By;

public class HandleInputbox extends  BaseTest {
//	WebDriver driver;
//	
//	@Before
//	public void launchApp() {
//	
//		System.out.println("launch application");
//		
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
//		
//		driver.manage().window().maximize();
//		
//		
//	}
//
//	
//	@After
//	public void closeApp() throws Exception {
//	
//		System.out.println("close application");
//		Thread.sleep(7000);
//		driver.close();
//		//driver.quit();
//		
//	}
	
	@Test
	public void verifyInput() {
	
		
		
		//xpath/css
		
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("enter username");
		
		
	}
	
}
