package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTariffSteps {
	static WebDriver driver;
	@Given("User should be in the telecom home pagess")
	public void user_should_be_in_the_telecom_home_pagess() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\eclipse-workspace\\nks\\CCD2\\Driver\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("http://demo.guru99.com/telecom/");
	   
	}

	@Given("click add tariff buttons")
	public void click_add_tariff_buttons() {
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("User enter all the datasss")
	public void user_enter_all_the_datasss() {
		driver.findElement(By.id("rental1")).sendKeys("6995");
		driver.findElement(By.id("local_minutes")).sendKeys("120");
		driver.findElement(By.id("inter_minutes")).sendKeys("120");
		driver.findElement(By.id("sms_pack")).sendKeys("100");
		driver.findElement(By.id("minutes_charges")).sendKeys("1");
		driver.findElement(By.id("inter_charges")).sendKeys("1");
		driver.findElement(By.id("sms_charges")).sendKeys("1");
		
		
	   	}
	@When("User enter all the datasss.")
	public void user_enter_all_the_datasss(DataTable tList) {
		
		List<List<String>> datas = tList.asLists(String.class);
		
		driver.findElement(By.id("rental1")).sendKeys(datas.get(1).get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(datas.get(1).get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(datas.get(0).get(3));
		driver.findElement(By.id("sms_pack")).sendKeys(datas.get(0).get(2));
		driver.findElement(By.id("minutes_charges")).sendKeys(datas.get(2).get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(datas.get(3).get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(datas.get(1).get(6));
		
	}
	
	
	@When("User enter all the datassss.")
	public void user_enter_all_the_datassss(DataTable tMaps) {
		
		List<Map<String, String>> datas = tMaps.asMaps(String.class,String.class);
		
		
		driver.findElement(By.id("rental1")).sendKeys(datas.get(2).get("MonthlyRen"));
		driver.findElement(By.id("local_minutes")).sendKeys(datas.get(3).get("LM"));
		driver.findElement(By.id("inter_minutes")).sendKeys(datas.get(3).get("IM"));
		driver.findElement(By.id("sms_pack")).sendKeys(datas.get(3).get("SMS"));
		driver.findElement(By.id("minutes_charges")).sendKeys(datas.get(3).get("IC"));
		driver.findElement(By.id("inter_charges")).sendKeys(datas.get(3).get("IC"));
		driver.findElement(By.id("sms_charges")).sendKeys(datas.get(3).get("SC"));
		
	}


	@When("click on submit buttonss")
	public void click_on_submit_buttonss() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		}

	@Then("user should be displayed home button is enteredd")
	public void user_should_be_displayed_home_button_is_enteredd() {
		WebElement tffId = driver.findElement(By.xpath( "(//a[text()='Home'])[1]"));
	    Assert.assertTrue(tffId.isDisplayed());
	}

}
