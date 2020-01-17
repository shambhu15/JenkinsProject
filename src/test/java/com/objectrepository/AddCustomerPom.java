package com.objectrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.utility.BaseClass;

public class AddCustomerPom extends BaseClass {
	public AddCustomerPom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Add Customer'])[1]")
	private WebElement addCustomer;
	@FindBy(id="fname")
	private WebElement firstName;
	@FindBy(id="lname")
	private WebElement lastName;
	@FindBy(id="email")
	private WebElement emailId;
	
	@FindBy(xpath="//textarea[@name='addr']")
	private WebElement address;
	@FindBy(id="telephoneno")
	private WebElement phoneNum;
	@FindBy(name="submit")
	private WebElement submitButton;
	public WebElement getAddCustomer() {
		return addCustomer;
	}
	public WebElement getBackgroundDone() {
		return backgroundDone;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getEmailId() {
		return emailId;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getPhoneNum() {
		return phoneNum;
	}
	public WebElement getSubmitButton() {
		return submitButton;
	}

	@FindBy(xpath="//label[text()='Done']")
	private WebElement backgroundDone;

}
