package com.demo.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.demo.resources.Base;
import com.demo.stepdefinition.Hooks;

public class LoginPage extends Base {
	public LoginPage() {
		PageFactory.initElements(Hooks.driver,this);
	}
	
	@FindBy(xpath="//a[text()='Telecom Project']")
	private WebElement telecomClick;
	
	@FindBy(xpath="(//a[text()='Add Customer'])[1]")
	private WebElement addCustomerClick;
	
	@FindBy(xpath="//label[contains(text(),'Done')]")
	private WebElement backgroundClick;
	
	@FindBy(name="fname")
	private WebElement txtFirstName;
	
	@FindBy(name="lname")
	private WebElement txtLastName;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement txtEmailAddress;
	
	@FindBy(xpath="//textarea[@id='message']")
	private WebElement txtAddress;
	
	@FindBy(xpath="//input[@id='telephoneno']")
	private WebElement txtMobileNo;
	
	@FindBy(xpath="//input[@name='submit']")
	private WebElement submitClick;
	
	@FindBy(xpath="//h1[text()='Access Details to Guru99 Telecom']")
	private WebElement txtGuruTelecom;

	public WebElement getTxtGuruTelecom() {
		return txtGuruTelecom;
	}

	public void setTxtGuruTelecom(WebElement txtGuruTelecom) {
		this.txtGuruTelecom = txtGuruTelecom;
	}

	public WebElement getTelecomClick() {
		return telecomClick;
	}

	public void setTelecomClick(WebElement telecomClick) {
		this.telecomClick = telecomClick;
	}

	public WebElement getAddCustomerClick() {
		return addCustomerClick;
	}

	public void setAddCustomerClick(WebElement addCustomerClick) {
		this.addCustomerClick = addCustomerClick;
	}

	public WebElement getBackgroundClick() {
		return backgroundClick;
	}

	public void setBackgroundClick(WebElement backgroundClick) {
		this.backgroundClick = backgroundClick;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public void setTxtFirstName(WebElement txtFirstName) {
		this.txtFirstName = txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public void setTxtLastName(WebElement txtLastName) {
		this.txtLastName = txtLastName;
	}

	public WebElement getTxtEmailAddress() {
		return txtEmailAddress;
	}

	public void setTxtEmailAddress(WebElement txtEmailAddress) {
		this.txtEmailAddress = txtEmailAddress;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public void setTxtAddress(WebElement txtAddress) {
		this.txtAddress = txtAddress;
	}

	public WebElement getTxtMobileNo() {
		return txtMobileNo;
	}

	public void setTxtMobileNo(WebElement txtMobileNo) {
		this.txtMobileNo = txtMobileNo;
	}

	public WebElement getSubmitClick() {
		return submitClick;
	}

	public void setSubmitClick(WebElement submitClick) {
		this.submitClick = submitClick;
	}
}
