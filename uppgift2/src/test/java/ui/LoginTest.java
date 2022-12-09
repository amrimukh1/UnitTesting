package ui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver ;
	@Test
	public void testloginfunction()
	{
		try {
			//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\webdrivers\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			// driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.get("https://www.amazon.se");
			
           driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	    	
	    	// Username
			driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("seleniumtesting021222@gmail.com");
			driver.findElement(By.id("continue")).click();
			
		
			// Password
			driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("@Dec0222");
			driver.findElement(By.id("signInSubmit")).click();
			
			driver.close();
			
//			String expected = "Hej, Test";
			//		String actual = (driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"))).toString();
	//		System.out.println("Actual is :" + actual);
					
		
	}
		catch (Exception e) {
			e.printStackTrace();
		}

}
}
