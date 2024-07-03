package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class submitInquiry {
	 private WebDriver driver;
	    

	    @Test
	    
	    public void testInquiry() throws InterruptedException{
	        System.setProperty("webdriver.chrome.driver", "C:/Users/HP/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("http://localhost:3000");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        driver.findElement(By.cssSelector("#navbarSupportedContent > ul > li:nth-child(3) > a")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.id("name")).sendKeys("Cheshta");
	        Thread.sleep(2000);
	        driver.findElement(By.id("email")).sendKeys("aroracheshta03@gmail.com");
	      
	        Thread.sleep(2000);
	        driver.findElement(By.id("message")).sendKeys("where is the forget password button");
	        Thread.sleep(2000);
	       
	        driver.findElement(By.cssSelector("#inquiryForm > button")).click();
	        Thread.sleep(5000);
	    }


@AfterClass
public void tearDown() {
    if (driver != null) {
        driver.quit();
    }
}
}
	        
	        
	
	


