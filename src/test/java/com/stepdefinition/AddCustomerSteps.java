package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class AddCustomerSteps {
	static WebDriver driver;
	@Given("User should be in the telecom home page")
	public void user_should_be_in_the_telecom_home_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\eclipse-workspace\\nks\\CCD2\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("click on add customer button")
	public void click_on_add_customer_button() {
	  driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	
	}

	@When("user enter all the field with valid data")
	public void user_enter_all_the_field_with_valid_data() {
		driver.findElement(By.xpath("//label[@for='done']")).click();
		  driver.findElement(By.id("fname")).sendKeys("swetha");
		  driver.findElement(By.id("lname")).sendKeys("nk");
		  driver.findElement(By.id("email")).sendKeys("swetha@gmail.com");
		  driver.findElement(By.name("addr")).sendKeys("chennai");
		  driver.findElement(By.id("telephoneno")).sendKeys("9988776655"); 
	}



	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	}

	@Then("user should be displayed customer id is generated")
	public void user_should_be_displayed_customer_id_is_generated() {
		 driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed();
	}
		//1D
		
		@When("user enter all the field with valid data.")
		public void user_enter_all_the_field_with_valid_data(DataTable cusData) {
		List<String> datas = cusData.asList(String.class);
			
			driver.findElement(By.xpath("//label[@for='done']")).click();
			driver.findElement(By.id("fname")).sendKeys(datas.get(0));
			driver.findElement(By.id("lname")).sendKeys(datas.get(1));
			driver.findElement(By.id("email")).sendKeys(datas.get(2));
			driver.findElement(By.name("addr")).sendKeys(datas.get(3));
			driver.findElement(By.id("telephoneno")).sendKeys(datas.get(4));

		}
		//2D
		@When("user enter all the field with valid datas")
		public void user_enter_all_the_field_with_valid_datas(DataTable cusMap) {
			Map<String, String> datas = cusMap.asMap(String.class, String.class);
			
			driver.findElement(By.xpath("//label[@for='done']")).click();
			driver.findElement(By.id("fname")).sendKeys(datas.get("fname"));
			driver.findElement(By.id("lname")).sendKeys(datas.get("lname"));
			driver.findElement(By.id("email")).sendKeys(datas.get("email"));
			driver.findElement(By.name("addr")).sendKeys(datas.get("address"));
			driver.findElement(By.id("telephoneno")).sendKeys(datas.get("phno"));
		
	  
	}
		

}
