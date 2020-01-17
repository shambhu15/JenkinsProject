package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.BaseClass;

public class AddTarrifPom extends BaseClass{
	public AddTarrifPom() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Add Tariff Plan']")
	private WebElement addTarrifPlan;
	@FindBy(id="rental1")
	private WebElement monthlyRental;
	@FindBy(id="local_minutes")
	private WebElement localMinute;
	@FindBy(id="inter_minutes")
	private WebElement interMinute;
	@FindBy(id="sms_pack")
	private WebElement smsPack;
	@FindBy(id="minutes_charges")
	private WebElement minuteCharges;
	@FindBy(id="inter_charges")
	private WebElement interCharges;
	@FindBy(id="sms_charges")
	private WebElement smsCharges;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitButton;
	public WebElement getAddTarrifPlan() {
		return addTarrifPlan;
	}
	public WebElement getMonthlyRental() {
		return monthlyRental;
	}
	public WebElement getLocalMinute() {
		return localMinute;
	}
	public WebElement getInterMinute() {
		return interMinute;
	}
	public WebElement getSmsPack() {
		return smsPack;
	}
	public WebElement getMinuteCharges() {
		return minuteCharges;
	}
	public WebElement getInterCharges() {
		return interCharges;
	}
	public WebElement getSmsCharges() {
		return smsCharges;
	}
	public WebElement getSubmitButton() {
		return submitButton;
	}

}
