package ui;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest {
	
	/*@BeforeTest
	public WebDriver startWebdriver()
	
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.scribbr.com");
		return(driver);
		
	}*/
	
	
	 @Test
	public void atitleTest(WebDriver driver1)
	{
		
		String expectedtitle = "Scribbr - Your path to academic success" ;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.scribbr.com");
		String actualtitle = driver1.getTitle(); 
	//	System.out.println("actualtitle is "+ actualtitle);
		AssertJUnit.assertEquals(actualtitle, expectedtitle);
		
		
	}
	 @Test
	  public void loginTest()
	 {
		 String expectedHeader="Test Test";
		 WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			// driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			driver.get("https://www.scribbr.com"); 
			driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
			//Click sign in
		//	driver.findElement(By.className("nav__link dropdown__toggle")).click();
		//	driver.findElement(By.cssSelector(".nav__link.dropdown__toggle")).click();
			
			driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/ul[1]/li[6]/a[1]")).click();
		//	String actualHeader = driver.findElement(By.xpath("//h1[@id='welcome-msg']")).getText();	
		//	System.out.println("The actual Header is : " + actualHeader); 
			//String actualHeader= 
			driver.findElement(By.className("text-dark")).click(); 
			
			// Username
			driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("seleniumtesting021222@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
			
		
			// Password
			driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("@Dec0222");
			driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
			
			String actualHeader = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div/div[2]/header/div/h2")).getText();
			//System.out.println("actual header is " + actualHeader);
			AssertJUnit.assertEquals(actualHeader, expectedHeader); 
			
			driver.close();
			
		
			}
	 
	   
	  @Test
	  public void navigationTest()
	  {
		    String expectedTitle="Upload essay";
			 WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				// driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
				driver.get("https://www.scribbr.com"); 
				driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
				//Click sign in
			//	driver.findElement(By.className("nav__link dropdown__toggle")).click();
			//	driver.findElement(By.cssSelector(".nav__link.dropdown__toggle")).click();
				
				driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/ul[1]/li[6]/a[1]")).click();
			//	String actualHeader = driver.findElement(By.xpath("//h1[@id='welcome-msg']")).getText();	
			//	System.out.println("The actual Header is : " + actualHeader); 
				//String actualHeader= 
				driver.findElement(By.className("text-dark")).click(); 
				
				// Username
				driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("seleniumtesting021222@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
				
				// Password
				driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("@Dec0222");
				driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
				
				// Navigate , Initiating Action class
				Actions actions = new Actions(driver);
				
				
				actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div/header/div/div/ul/li[1]/a")));
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div/header/div/div/ul/li[1]/div/div/div/div[1]/a[1]/span")));
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				actions.click().build().perform();
				String actualTitle = driver.findElement(By.xpath("//a[contains(text(),'Upload essay')]")).getText();
				AssertJUnit.assertEquals(actualTitle, expectedTitle,"Navigation Test passed"); 
				// locating 
				
		  
	  }
	  
	  @Test
	  public void dateTypeTest()
	  {
			String expectedErrorMsg = "Validation errors occurred. Try again.";
			
			 WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				// driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
				driver.get("https://www.scribbr.com"); 
				driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
				//Click sign in
			//	driver.findElement(By.className("nav__link dropdown__toggle")).click();
			//	driver.findElement(By.cssSelector(".nav__link.dropdown__toggle")).click();
				
				driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/ul[1]/li[6]/a[1]")).click();
			//	String actualHeader = driver.findElement(By.xpath("//h1[@id='welcome-msg']")).getText();	
			//	System.out.println("The actual Header is : " + actualHeader); 
				//String actualHeader= 
				driver.findElement(By.className("text-dark")).click(); 
				
				// Username
				driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("seleniumtesting021222@gmail.com");
				driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
				
				// Password
				driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("@Dec0222");
				driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
				
				// Navigate , Initiating Action class
				Actions actions = new Actions(driver);
				
				actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div/div[1]/div/div/div[1]/span")));
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contact')]")));
				
				
				actions.click().build().perform();
				// Adding name & email an then clicking on send
				driver.findElement(By.xpath("//*[@id=\"your-name\"]")).sendKeys("abc");
				driver.findElement(By.xpath("//*[@id=\"your-email\"]")).sendKeys("abc");
				driver.findElement(By.xpath("//*[@id=\"wpcf7-f2770-o1\"]/form/p[2]/input")).click();
				
				String actualErrorMsg = driver.findElement(By.xpath("//*[@id=\"wpcf7-f2770-o1\"]/form/div[3]")).getText();
			
				
				
				
			
			//	String actualTitle = driver.findElement(By.xpath("//a[contains(text(),'Upload essay')]")).getText();
				Assert.assertEquals(actualErrorMsg,expectedErrorMsg,"ErrorMsg Test passed"); 
		  
	  }
	
	  
	  @Test
	  public void uploadDocTest()
	  {
		  
		  
	  }
	  
	

}
