package com.Syntax.cucumberproject.stepsDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	WebDriver driver;
	
	@Given("^I open browser$")
	public void i_open_browser() throws Throwable {
	 System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
	 driver= new ChromeDriver();
     driver.manage().window().fullscreen();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Given("^I navigate to FreeCrm$")
	public void i_navigate_to_FreeCrm() throws Throwable {
	   
driver.get("https://www.freecrm.com/index.html");
	}

	@When("^I enter valid username and Pasword$")
	public void i_enter_valid_username_and_Pasword() throws Throwable {
	  driver.findElement(By.name("username")).sendKeys("irisfree");
	  driver.findElement(By.name("password")).sendKeys("IRISfree");
	}

	@When("^I click login button$")
	public void i_click_login_button() throws Throwable {

	   driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("^I successfully logged in$")
	public void i_successfully_logged_in() throws Throwable {
	   
	    System.out.println("Successful login");
	}
	@When("^I enter invalid username and password$")
	public void i_enter_invalid_username_and_password() throws Throwable {
		  driver.findElement(By.name("username")).sendKeys("irisfre");
		  driver.findElement(By.name("password")).sendKeys("irisfre");
	}

	@Then("^I see sign up link$")
	public void i_see_sign_up_link() throws Throwable {
	driver.findElement(By.xpath("//a[@class='navbar-brand']//img[@class='img-responsive']")).isDisplayed();
}
}