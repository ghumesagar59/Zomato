package stepdefinitions;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;

public class LoginSteps {
	WebDriver driver;
	
	@Given("User is on Zomato login page")
	public void zomato_login() throws InterruptedException {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.zomato.com/india");
        Thread.sleep(2000);
        WebElement Login_Button = driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
        Login_Button.click();
        Thread.sleep(2000);
	}
	
	
    @When("User enters valid Email and click on send otp")
    public void enter_Email () throws InterruptedException {
    	Thread.sleep(5000);
    	
    	WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='auth-login-ui']"));
    	
    	driver.switchTo().frame(iframe1);
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement emailBtn = wait.until(ExpectedConditions.presenceOfElementLocated(
    	    By.xpath("//div[@aria-label='Continue with Email']")
    	));

    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click();", emailBtn);
    	
    	
    	
    }
    @When("User send otp")
    public void User_send_otp () throws InterruptedException {
    	
    	Thread.sleep(2000);
    	WebElement emailField = driver.findElement(By.cssSelector("input[type='text']"));
    	emailField.sendKeys("ghumesagar59@gmail.com");
    	
    	
    	driver.findElement(By.xpath("//button[contains(., 'Send One Time Password')]")).click();
    	
    }
    
    @And("User Verify the otp")
    public void verify_otp () throws InterruptedException {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter OTP: ");
        String otp = scanner.nextLine();
        scanner.close();

       
        for (int i = 0; i < otp.length(); i++) {
            String xpath = "(//input[@type='text' and @maxlength='2'])[" + (i + 1) + "]";
            WebElement otpBox = driver.findElement(By.xpath(xpath));
            otpBox.sendKeys(String.valueOf(otp.charAt(i)));} 	
        	Thread.sleep(3000);

    	
    }
    
    @Then("User should be successfully login")
    public void successfully_login () throws InterruptedException {
    	driver.switchTo().defaultContent();
    	Thread.sleep(3000);
    	driver.close();
    	
    }
	
}
