package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class About_Us {
	
	WebDriver driver;
	
	@Given("User is on Zomato home page")
	public void homepage () throws InterruptedException {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.zomato.com/india");
        Thread.sleep(2000);
	}
	
    @When("User click Who We Are navigate and back")
    public void Who_We_Are () throws InterruptedException {
    	
    	WebElement Who_We_Are = driver.findElement(By.xpath("//p[normalize-space()='Who We Are']"));
    	System.out.println(Who_We_Are.getText()+" Clicked");
    	Who_We_Are.click();
    	Thread.sleep(3000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    	
    }
    
    @When("User click Blog navigate and back")
    public void Blog () throws InterruptedException {
    	
    	WebElement Blog = driver.findElement(By.xpath("//p[normalize-space()='Blog']"));
    	System.out.println(Blog.getText()+" Clicked");
    	Blog.click();
    	Thread.sleep(3000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    }
    
    @When("User click Work With Us navigate and back")
    public void Work_With_Us () throws InterruptedException {

    	WebElement Work_With_Us = driver.findElement(By.xpath("//p[normalize-space()='Work With Us']"));
    	System.out.println(Work_With_Us.getText()+" Clicked");
    	Work_With_Us.click();
    	Thread.sleep(3000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    }
    
    @When("User click Investor Relations navigate and back")
    public void Investor () throws InterruptedException {

    	WebElement Investor = driver.findElement(By.xpath("//p[normalize-space()='Investor Relations']"));
    	System.out.println(Investor.getText()+" Clicked");
    	Investor.click();
    	Thread.sleep(3000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    }
    
    @When("User click Report Fraud navigate and back")
    public void Report_Fraud () throws InterruptedException {

    	WebElement Report_Fraud = driver.findElement(By.xpath("//p[normalize-space()='Report Fraud']"));
    	System.out.println(Report_Fraud.getText()+" Clicked");
    	Report_Fraud.click();
    	Thread.sleep(3000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    }
    
    @When("User click Press Kit navigate and back")
    public void Press_Kit () throws InterruptedException {

    	WebElement Press_Kit = driver.findElement(By.xpath("//p[normalize-space()='Press Kit']"));
    	System.out.println(Press_Kit.getText()+" Clicked");
    	Press_Kit.click();
    	Thread.sleep(3000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    }
    
    @When("User click Contact Us navigate and back")
    public void Contact_Us () throws InterruptedException {

    	WebElement Contact_Us = driver.findElement(By.xpath("//p[normalize-space()='Contact Us']"));
    	System.out.println(Contact_Us.getText()+" Clicked");
    	Contact_Us.click();
    	Thread.sleep(3000);
    	driver.navigate().back();
    	Thread.sleep(2000);
    }
    
  	@Then("User close the browser")
  	public void close_browser () {
  		
  		driver.quit();
  	}

}
