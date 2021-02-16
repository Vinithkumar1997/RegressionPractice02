package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLogin {
    WebDriver driver;
	@Given("Launch the browser and hit the fb url")
	public void launch_the_browser_and_hit_the_fb_url() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("http://www.facebook.com/");
	}

	@When("Enter the username and password")
	public void enter_the_username_and_password() {
	    driver.findElement(By.id("email")).sendKeys("Greens123@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("Greens@123");
	}

	@When("click the login button")
	public void click_the_login_button() {
	    driver.findElement(By.name("login")).click();
	}

	@Then("check if user entered the homepage")
	public void check_if_user_entered_the_homepage() {
	    Assert.assertTrue("user unable to login!", false);
	    System.out.println("Scenarion 01 ended...");
	}
}
