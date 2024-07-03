package seleniumSessions;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class editProfile {
    private WebDriver driver;
    

    @BeforeClass
    public void setUp() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:/Users/HP/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:3000");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/a[1]")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("phoneNumber")).sendKeys("9417785134");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("Lakha123*");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#loginForm > div.pt-1.mb-4 > button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("backToHomeBtn")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#profileDropdown > img")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#navbarSupportedContent > div > div > ul > li:nth-child(1) > a")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(" body > section > div.container.my-4 > div.col-lg-8.mx-auto > div.text-center > a.btn.btn-primary.mx-2\r\n")).click();
        Thread.sleep(2000);
        
        

    }

    @Test(priority = 1)
    public void testProfileImageChange() throws InterruptedException, AWTException {
        WebElement profileImage = driver.findElement(By.id("profileImage"));
        
        String originalImageSrc = profileImage.getAttribute("src");

        WebElement editIcon = driver.findElement(By.className("edit-icon"));
        editIcon.click();
        Thread.sleep(2000);
        String filePath = "C:\\Users\\HP\\OneDrive\\Desktop\\NODEJS\\public\\E-2.jpg"; 
        Robot robot = new Robot();

        // Simulate typing the file path and pressing Enter
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection(filePath);
        clipboard.setContents(stringSelection, null);

        // Paste the clipboard content (file path) into the dialog
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Press Enter to confirm the file selection
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        
        
        Thread.sleep(3000);
        driver.findElement(By.id("phoneNumber")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("phoneNumber")).sendKeys("9417785135");
        
        Thread.sleep(2000);
        
        
        
        
        driver.findElement(By.id("update")).click();
        Thread.sleep(3000);
        
        
        


       
    }

    @Test(priority = 2)
    public void testServiceSelectionValidation() throws InterruptedException {
    	
    	driver.findElement(By.cssSelector(" body > section > div.container.my-4 > div.col-lg-8.mx-auto > div.text-center > a.btn.btn-primary.mx-2\r\n")).click();
        Thread.sleep(2000);
        
    	
    	
        WebElement ElectricianCheckbox = driver.findElement(By.id("option10"));
        ElectricianCheckbox.click();
        Thread.sleep(2000);
        
        
        WebElement plumberCheckbox = driver.findElement(By.id("option1"));
        plumberCheckbox.click();
        Thread.sleep(2000);
       
        ElectricianCheckbox.click();
        Thread.sleep(2000);
        
        driver.findElement(By.id("update")).click();
        Thread.sleep(5000);
        
    }
    @Test(priority = 3)
    public void testChangePassword() throws InterruptedException {
    	
    	
    	driver.findElement(By.cssSelector("body > section > div.container.my-4 > div.col-lg-8.mx-auto > div.text-center > a.btn.btn-secondary.mx-2")).click();
        Thread.sleep(2000);
        
      driver.findElement(By.id("revealPasswordBtn")).click();
        
        Thread.sleep(2000);
     WebElement OldPassword=driver.findElement(By.id("oldPassword"));
     OldPassword.sendKeys("Lakha123*");
        
        Thread.sleep(2000);
        OldPassword.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        OldPassword.clear();
        Thread.sleep(2000);
OldPassword.sendKeys("Lakha12*");
        
        Thread.sleep(2000);
        OldPassword.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        
        driver.findElement(By.id("newPassword")).sendKeys("Lakha123*");
        
 Thread.sleep(2000);
        
        driver.findElement(By.id("confirmPassword")).sendKeys("Lakha12*");
        Thread.sleep(2000);
        driver.findElement(By.id("resetBtn")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("confirmPassword")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("confirmPassword")).sendKeys("Lakha123*");
        Thread.sleep(2000);
        driver.findElement(By.id("resetBtn")).click();
        Thread.sleep(4000);
         
    }
    
    @Test(priority = 4)
    public void LogOut() throws InterruptedException {
    	
    	
    	
    	driver.findElement(By.id("logoutbtn")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("confirmLogout")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("okbutton")).click();
        Thread.sleep(4000);
        
    	
    	
    }
    
    

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
