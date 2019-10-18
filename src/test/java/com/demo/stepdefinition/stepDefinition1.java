package com.demo.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.demo.resources.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition1 extends Base {
	public static WebDriver driver;
	@Given("User is on demo guru page")
	public void user_is_on_demo_guru_page() {
		getBrowser();
		loadUrl("https://www.demo.guru99.com");
		maximize();
		
	}

	@When("User clicks the telecom project")
	public void user_clicks_the_telecom_project() {
		  WebElement telecom = driver.findElement(By.xpath("//a[text()='Telecom Project']"));
		   telecom.click();
	}

	@Then("User navigates to the telecom page.")
	public void user_navigates_to_the_telecom_page() {
		System.out.println("Customer is on telecom page");
	}

	@When("User clicks the add customer")
	public void user_clicks_the_add_customer() {
		WebElement telecom1 = driver.findElement(By.xpath("//a[text()='Telecom Project']"));
		telecom1.click();
		WebElement addcust = driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]"));
		addcust.click();
	    	}

	@Then("User navigates to the add customer page.")
	public void user_navigates_to_the_add_customer_page() {
		 System.out.println("Customer is on add customer page");
	}

	@When("User enters the details with the firstname,lastname,email,address")
	public void user_enters_the_details_with_the_firstname_lastname_email_address(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<List<String>> custList = dataTable.asLists(String.class);
		WebElement telecom2 = driver.findElement(By.xpath("//a[text()='Telecom Project']"));
		telecom2.click();
		WebElement addcust1 = driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]"));
		addcust1.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'Done')]")).click();
		WebElement Firstname = driver.findElement(By.name("fname"));
		Firstname.sendKeys(custList.get(1).get(0));
		WebElement Lastname = driver.findElement(By.name("lname"));
		Lastname.sendKeys(custList.get(1).get(1));
		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
	    Email.sendKeys(custList.get(1).get(0));
	    WebElement Address = driver.findElement(By.xpath("//textarea[@id='message']"));
	    Address.sendKeys(custList.get(1).get(1));
	}

	@When("the user enters the mobile no")
	public void the_user_enters_the_mobile_no(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<List<String>> custList1 = dataTable.asLists(String.class);
		WebElement mobileno = driver.findElement(By.xpath("//input[@id='telephoneno']"));
		mobileno.sendKeys(custList1.get(1).get(0));
		WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		Thread.sleep(2000);

	}

	@Then("the user can able to get the confirmation message.")
	public void the_user_can_able_to_get_the_confirmation_message() {
		System.out.println("Customer Id generated successfully");
	}

}
