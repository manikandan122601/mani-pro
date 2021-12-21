package org.stepdefinition;

import java.io.IOException;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utillities.BaseClass;

import io.cucumber.java.en.*;

public class ForgotPasswordStepdefinition extends BaseClass {
	
	@Given("User should launch the chrome browser and load the facebook url")
	public void user_should_launch_the_chrome_browser_and_load_the_facebook_url() {
	   	launchChrome();
		loadUrl("https://www.facebook.com");
		winMax();
	   
	}

	@When("User should Click the forgot password link")
	public void userShouldClickTheForgotPasswordLink() throws IOException, InterruptedException {
	  driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	  Thread.sleep(2000);
	}

//	@When("User should type the invalid mobile number")
//	public void userShouldTypeTheInvalidMobileNumber() {
//		WebElement txtMobile = driver.findElement(By.xpath("//input[@id='identify_email']"));
//		txtMobile.sendKeys("8870327823");
//
//	}

	@And("User should click the search button")
	public void userShouldClickTheSearchButton() throws InterruptedException {
		driver.findElement(By.id("did_submit")).click();
		Thread.sleep(2000);
	   
	}

	@Then("user should navigate to password reset recover page")
	public void userShouldNavigateToPasswordResetRecoverPage() {
		String current = driver.getCurrentUrl();
		
		Assert.assertTrue("verify", current.contains("recover"));
		System.out.println("the forgot password scenario is passed");
		System.out.println(current);
	}
//	@When("User should type the invalid mobile Number")
//	public void user_should_type_the_invalid_mobile_Number(io.cucumber.datatable.DataTable d) {
//	    WebElement txtmobile = driver.findElement(By.xpath("//input[@id='identify_email']"));
//	    // 1D list
//	    fill(txtmobile, d.asList().get(1));
//	
//	}

	@And("User should type the invalid mobile Number for D Map")
	public void user_should_type_the_invalid_mobile_Number_for_D_Map(io.cucumber.datatable.DataTable d) {
		WebElement txtmobile1 = driver.findElement(By.xpath("//input[@id='identify_email']"));
		
		//1D Map
		Map<String, String> mp = d.asMap(String.class, String.class);
		
		fill(txtmobile1, mp.get("dhoni"));
		
	}
	
	
}
