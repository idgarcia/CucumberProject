package stepsDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpwithDtSteps {

		WebDriver driver;
		
		@Given("^I opens browser$")
		public void i_open_browser() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		 driver= new ChromeDriver();
	     driver.manage().window().fullscreen();
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}

		@When("^I Provide the following details$")
	    public void i_Provide_the_following_details(DataTable signDetails) throws InterruptedException {
	        List<Map<String, String>> maps = signDetails.asMaps(String.class, String.class);

	        for (Map<String, String> map : maps) {
	            Thread.sleep(4000);
	            driver.findElement(By.linkText("Sign Up")).click();
	            Thread.sleep(2000);
	            WebElement drop = driver.findElement(By.xpath("//select[@id='payment_plan_id']"));
	            Select dd = new Select(drop);
	            dd.selectByVisibleText(map.get("Edition"));
	            driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(map.get("FirstName"));
	            driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(map.get("LastName"));
	            driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(map.get("Email"));
	            driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")).sendKeys(map.get("ConfirmEmail"));
	            driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(map.get("UserName"));
	            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(map.get("Password"));
	            driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys(map.get("ConfirmPassword"));
	            Thread.sleep(1000);
	            
	            driver.findElement(By.xpath("//input[@value='false']")).click();
	            Thread.sleep(500);
	            driver.findElement(By.xpath("//div[@class='myButton']")).click();
	            Thread.sleep(2000);
	            driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys(map.get("Company"));
	            driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(map.get("Phone"));
	            Thread.sleep(1000);
	            driver.findElement(By.xpath("//button[@name='btnSubmit']")).click();
	            Thread.sleep(1000);
	            driver.findElement(By.xpath("//button[@name='finish']")).click();

	            boolean verificationText = driver
	                    .findElement(By.xpath("//div[contains(text(), 'Your account is now registered')]")).isDisplayed();
	            Assert.assertTrue(verificationText);}
	        }
	        @Then("^I close browser$")
	        public void i_close_browser() throws Throwable {
	            
	            throw new PendingException();
	        }
	        
	    }
