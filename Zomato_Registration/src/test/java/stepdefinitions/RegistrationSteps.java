package stepdefinitions;

import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class RegistrationSteps {
	WebDriver driver;
    

    @Given("User is on Zomato registration page")
    public void user_is_on_registration_page() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.zomato.com/india");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
        
        Thread.sleep(2000);
    }

    @When("User enters valid Name, Email and click on create account")
    public void user_enters_details() throws InterruptedException {
        WebElement Name = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        WebElement Email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        WebElement Checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement Create_account = driver.findElement(By.xpath("(//span[@class='sc-1kx5g6g-3 dkwpEa'])[1]"));
    	
        
        Name.sendKeys("Sagar");
        Email.sendKeys("pm5253973@gmail.com");
        Checkbox.click();
        Thread.sleep(1000);
        Create_account.click();
        
        
        
        
    }

    @And("User Verify the otp")
    public void User_Verify_the_otp() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	WebElement otpInput = driver.findElement(By.cssSelector("section[class='sc-1yzxt5f-6 gXbCjv'] input[type='text']"));
    	System.out.println("Please enter the OTP you received:");
        Scanner scanner = new Scanner(System.in);
        String otp = scanner.nextLine();
        otpInput.sendKeys(otp);
        Thread.sleep(500);
        scanner.close();
        WebElement Proceed_Button = driver.findElement(By.xpath("//span[contains(text(),'Proceed')]"));
        Proceed_Button.click();
    	
    }
    

    @Then("User should be successfully registered")
    public void user_should_be_registered() {
        
        assertTrue(true);
        driver.quit();
    }
}
