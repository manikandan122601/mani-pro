package org.stepdefinition;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utillities.BaseClass;
import org.utillities.fbLoginPojo;

import io.cucumber.java.en.*;

public class FbloginDefinition extends BaseClass {


@Given("User should launch the chrome browser and load facebook page")
public void user_should_launch_the_chrome_browser_and_load_facebook_page() {
		launchChrome();
		loadUrl("https://www.facebook.com");
		winMax();
	    
	}

	@When("User should type type the username in the facebook page")
	public void user_should_type_type_the_username_in_the_facebook_page() throws IOException {
		fbLoginPojo p = new fbLoginPojo();
		fill(p.getTxtUser(), getData(2, 1));
	   
	}
	
	@Then("I need to print the title of my page")
	public void iNeedToPrintTheTitleOfMyPage() {
	    String title = driver.getTitle();
	    System.out.println(title);
	}

//	@When("User should type the passward in the facebook page")
//	public void user_should_type_the_passward_in_the_facebook_page() throws IOException {
//		fbLoginPojo p = new fbLoginPojo();
//		fill(p.getTxtpass(), getData(3, 1));
//	 
//	}
	
	@When("User should type the Passward in the facebook page")
	public void user_should_type_the_Passward_in_the_facebook_page(io.cucumber.datatable.DataTable d2) {
		WebElement txtmobile = driver.findElement(By.xpath("//button[@name='login']"));
		   
		// 2D list
		List<List<String>> li = d2.asLists();
		fill(txtmobile, li.get(2).get(3));
	}
	


	@When("User should click the login button")
	public void user_should_click_the_login_button() throws InterruptedException {
		fbLoginPojo p = new fbLoginPojo();
		btnClick(p.getBtnLogin());
		Thread.sleep(2000);
	}

	
	
	@When("User should type type the username {string} in the facebook page")
	public void user_should_type_type_the_username_in_the_facebook_page(String user) {
		fbLoginPojo p = new fbLoginPojo();
		fill(p.getTxtpass(), user);
	    
	}

	@When("User should type the passward in the facebook page {string}")
	public void user_should_type_the_passward_in_the_facebook_page(String pass) {
		fbLoginPojo p = new fbLoginPojo();
		fill(p.getTxtpass(), pass);
	    
	
	}
	@And("User should navigate to incorrect credential page")
	public void user_should_navigate_to_incorrect_credential_page() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("verify the url", currentUrl.contains("privacy"));
		System.out.println("my scenario is passed");
	}

	
	


}
