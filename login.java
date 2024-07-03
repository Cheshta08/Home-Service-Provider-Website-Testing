package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class login {
	private WebDriver driver;
	 @BeforeClass
	    public void setUp() {
	        System.setProperty("webdriver.chrome.driver", "C:/Users/HP/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
	         driver = new ChromeDriver();
	    }

	    @Test
	    public void testSignUp() throws InterruptedException {
			
	      driver.get("http://localhost:3000/");
	      driver.manage().window().maximize();
	      System.out.println(driver.getTitle());
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/a[2]/button")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.cssSelector("body > div:nth-child(8) > div > div:nth-child(3) > figure > a > b")).click();
	      Thread.sleep(2000);
	      
	      driver.findElement(By.name ("fullName")).sendKeys("Param");
	      Thread.sleep(2000);
	      driver.findElement(By.name ("phoneNumber")).sendKeys("8558903750");
	      Thread.sleep(2000);
	      driver.findElement(By.name ("Address")).sendKeys("Patiala");
	      Thread.sleep(2000);
	      WebElement fileInput= driver.findElement(By.name ("profileImage"));
	    		  String filePath = "C:\\Users\\HP\\OneDrive\\Desktop\\New folder (2)\\public\\A-7.jpg";
	       fileInput.sendKeys(filePath);
	       Thread.sleep(5000);
	      String[] servicesCheckboxValues = {"Plumber", "Carpenter"};
	        for (String value : servicesCheckboxValues) {
	            WebElement checkbox = driver.findElement(By.xpath("//input[@value='" + value + "']"));
	            checkbox.click();
	        }
	        Thread.sleep(2000);
	        WebElement passwordField = driver.findElement(By.name("password"));
	        passwordField.sendKeys("Test1");
	        Thread.sleep(2000);
	        passwordField.clear();
	        passwordField.sendKeys("testpassword@");
	        Thread.sleep(2000);
	        passwordField.clear();
	        passwordField.sendKeys("Testpassword1");
	        Thread.sleep(2000);
	        passwordField.clear();
	        passwordField.sendKeys("TESTPASSWORD1@");
	        Thread.sleep(2000);
	        passwordField.clear();
	        passwordField.sendKeys("Testpassword@");
	        Thread.sleep(2000);
	        passwordField.clear();
	        passwordField.sendKeys("Testpassword@1");
	        
	        
	        
	        Thread.sleep(2000);
	        // Fill Confirm Password
	        WebElement confirmPasswordField = driver.findElement(By.name("confirmPassword"));
	        confirmPasswordField.sendKeys("TestPassword@1");
	        Thread.sleep(3000);
	        confirmPasswordField.clear();
	        Thread.sleep(1000);
	        confirmPasswordField.sendKeys("Testpassword@1");
	        Thread.sleep(3000);
	        
	        // Select City
	        WebElement cityDropdown = driver.findElement(By.name("city"));
	        Select citySelect = new Select(cityDropdown);
	        citySelect.selectByVisibleText("Ludhiana");
	        Thread.sleep(2000);
	        // Fill Preferred Timings
	        WebElement timingsField = driver.findElement(By.name("preferredTiming"));
	        timingsField.sendKeys("9am-6pm");
	        Thread.sleep(2000);
	        // Agree to Terms
	        WebElement agreeCheckbox = driver.findElement(By.id("agreeTerms"));
	        agreeCheckbox.click();
	        Thread.sleep(2000);
	        // Submit the Form
	        WebElement signupButton = driver.findElement(By.id("signupButton"));
	        signupButton.click();
	        Thread.sleep(10000);
	      
	            driver.quit();
	      
	      
	      
		}

}



