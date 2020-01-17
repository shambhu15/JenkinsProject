package com.runner;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.objectrepository.AddCustomerPom;
import com.objectrepository.AddTarrifPom;
import com.utility.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends BaseClass {
	AddTarrifPom Page;
	AddTarrifPom Page1;
	AddCustomerPom addCustomerPage;

	@Given("user should launch the browser and URL Application")
	public void userShouldLaunchTheBrowserAndURLApplication() {
		
	}

	@Then("user click on Add tariff plan to customer links")
	public void userClickOnAddTariffPlanToCustomerLinks() {
		 Page1 = new AddTarrifPom();
		btnClick(Page1.getAddTarrifPlan());
	}

	@When("user enters {string},{string},{string},{string},{string},{string} and {string}")
	public void userEntersAnd(String MonthlyRen1, String FreeLMin1, String FreeIMin1, String FreeSMSPack1,
			String LocalPMCharge1, String IntPMCharge1, String SmsPerCharge1) throws InterruptedException {
		txtType(Page1.getMonthlyRental(), MonthlyRen1);
		txtType(Page1.getLocalMinute(), FreeLMin1);
		txtType(Page1.getInterMinute(), FreeIMin1);
		txtType(Page1.getSmsPack(), FreeSMSPack1);
		txtType(Page1.getMinuteCharges(), LocalPMCharge1);
		txtType(Page1.getInterCharges(), IntPMCharge1);
		txtType(Page1.getSmsCharges(), SmsPerCharge1);
	}

	@Then("user click on submit button")
	public void userClickOnSubmitButton() {
		btnClick(Page1.getSubmitButton());
	}

	@Then("User verify sucessful message")
	public void userVerifySucessfulMessage() {
		Assert.assertEquals("Verify sucess message", "Congratulation you add Tariff Plan",
				driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).getText());
		Assert.assertTrue("verify", true);
	}

	@When("User click on Add tariff plan to customer")
	public void userClickOnAddTariffPlanToCustomer() {
			 Page = new AddTarrifPom();
		btnClick(Page.getAddTarrifPlan());
	}

	@Then("User provide a valid details")
	public void userProvideAValidDetails(io.cucumber.datatable.DataTable data) {
		List<Map<String, String>> mp = data.asMaps();
		txtType(Page.getMonthlyRental(),mp.get(0).get("MonthlyRen"));
		txtType(Page.getLocalMinute(), mp.get(0).get("FreeLMin"));
		txtType(Page.getInterMinute(), mp.get(0).get("FreeIMin"));
		txtType(Page.getSmsPack(), mp.get(0).get("FreeSMSPack"));
		txtType(Page.getMinuteCharges(), mp.get(0).get("LocalPMCharge"));
		txtType(Page.getInterCharges(), mp.get(0).get("IntPMCharge"));
		txtType(Page.getSmsCharges(), mp.get(0).get("SmsPerCharge"));
	}

	@Then("User click submit button")
	public void userClickSubmitButton() {
		btnClick(Page.getSubmitButton());
	}

	@Then("User verify sucessful messages")
	public void userVerifySucessfulMessages() {
		Assert.assertEquals("Verify sucess message", "Congratulation you add Tariff Plan",
				driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).getText());
	}

	@When("User click on Add customer link")
	public void userClickOnAddCustomerLink() {
		addCustomerPage = new AddCustomerPom();
		btnClick(addCustomerPage.getAddCustomer());
	}

	@Then("User select Beckground check")
	public void userSelectBeckgroundCheck() {
		btnClick(addCustomerPage.getBackgroundDone());
	}

	@Then("User enters {string},{string},{string},{string} and {string} on text field box")
	public void userEntersAndOnTextFieldBox(String firstName, String lastName, String emilId, String address,
			String mobileNum) {
		
		txtType(addCustomerPage.getFirstName(), firstName);
		txtType(addCustomerPage.getLastName(), lastName);
		txtType(addCustomerPage.getEmailId(), emilId);
		txtType(addCustomerPage.getAddress(), address);
		txtType(addCustomerPage.getPhoneNum(), mobileNum);
		
	}

	@Then("User should click on submit button")
	public void userShouldClickOnSubmitButton() {
		btnClick(addCustomerPage.getSubmitButton());
	}

	@Then("User should verify sucessful message")
	public void userShouldVerifySucessfulMessage() {
		Assert.assertTrue("Verify sucess message", driver.getCurrentUrl().contains("access.php"));
	}

}
