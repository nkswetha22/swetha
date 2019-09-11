package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddCustomerSteps {

static WebDriver driver;
@Given("User should be in the telecom home page")
public void user_should_be_in_the_telecom_home_page() {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\eclipse-workspace\\nks\\CCD1\\Driver\\chromedriver.exe");
driver  = new ChromeDriver();
driver.get("http://demo.guru99.com/telecom/");

}

@Given("user click on add customer button")
public void user_click_on_add_customer_button() {
  driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
}

@When("user enters all the fields with valid data")
public void user_enters_all_the_fields_with_valid_data() {
    driver.findElement(By.xpath("//label[@for='done']")).click();
    driver.findElement(By.id("fname")).sendKeys("swetha");
    driver.findElement(By.id("lname")).sendKeys("nk");
    driver.findElement(By.id("email")).sendKeys("swetha@gmail.com");
    driver.findElement(By.name("addr")).sendKeys("omr");
    driver.findElement(By.id("telephoneno")).sendKeys("9988776655");
}

@When("clicks on submit button")
public void clicks_on_submit_button() {
driver.findElement(By.xpath("//input[@type='submit']")).click();
}

@Then("user should be displayed customer id is generated")
public void user_should_be_displayed_customer_id_is_generated() {
  WebElement customerId = driver.findElement(By.xpath("(//td[@align='center'])[2]"));
  Assert.assertTrue(customerId.isDisplayed());
}}