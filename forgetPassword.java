package seleniumSessions;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class forgetPassword {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/HP/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testForgetPasswordFlow() throws InterruptedException {
        driver.get("http://localhost:3000");
        driver.manage().window().maximize();

        // Navigate to forget password page
        navigateToForgetPasswordPage();

        // Enter and submit the first phone number
        enterPhoneNumber("8558903747");

        // Enter and submit the second phone number
        enterPhoneNumber("8558903749");

        enterOtp("4567");
        Thread.sleep(3000);
        enterOtp("1234");
        Thread.sleep(3000);
        
        // Perform the rest of the password reset steps
        enterNewPassword("12345678");
        Thread.sleep(3000);
        enterNewPassword("Aa1234.12");
        Thread.sleep(3000);
        // Validate the success message
        validateSuccessMessage("Password Updated");
    }
    

    private void navigateToForgetPasswordPage() throws InterruptedException {
    	Thread.sleep(3000);
        clickElement("//*[@id=\"navbarSupportedContent\"]/div/a[1]");
        Thread.sleep(3000);
        clickElement("//*[@id=\"loginForm\"]/a[1]");
        Thread.sleep(3000);
        
    }

    private void enterPhoneNumber(String phoneNumber) throws InterruptedException {
        WebElement phoneInput = waitForElement(By.id("phoneNumber"));
        phoneInput.clear();
        phoneInput.sendKeys(phoneNumber);
        Thread.sleep(3000);
        
        clickElement("//*[@id=\"verificationForm\"]/div[2]/button");
        Thread.sleep(3000);
        
    }

   

    private void enterOtp(String otp) throws InterruptedException {
        WebElement otpInput = waitForElement(By.id("otpInput"));
        otpInput.clear();
        otpInput.sendKeys(otp);
        Thread.sleep(3000);
        clickElement("//*[@id=\"verifyBtn\"]");
        Thread.sleep(3000);
        
    }

    private void enterNewPassword(String newPassword) throws InterruptedException {
        WebElement newPasswordInput = waitForElement(By.id("newPassword"));
        newPasswordInput.clear();
        Thread.sleep(3000);
        newPasswordInput.sendKeys(newPassword);
        Thread.sleep(3000);
        WebElement confirmPasswordInput = waitForElement(By.id("confirmPassword"));
        confirmPasswordInput.clear();
        Thread.sleep(3000);
        confirmPasswordInput.sendKeys(newPassword);
        Thread.sleep(3000);
        driver.findElement(By.id("resetBtn")).click();
        Thread.sleep(3000);
    }

    private void validateSuccessMessage(String expectedMessage) throws InterruptedException {
        WebElement successMessage = waitForElement(By.xpath("/html/body/div/h1"));
        Thread.sleep(3000);
        Assert.assertEquals(successMessage.getText(), expectedMessage);
        Thread.sleep(3000);
    }

    private WebElement waitForElement(By locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    private void clickElement(String xpath) {
        waitForElement(By.xpath(xpath)).click();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


