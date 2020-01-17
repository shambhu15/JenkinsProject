package com.utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	// public static void main(String[] args) {
	public static WebDriver driver;

	public static void chromeBrowserLaunch() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHAMBHU\\eclipse-workspace\\CucumberFramework\\Jenkins\\driver\\chromedriver.exe");
		ChromeOptions cp=new ChromeOptions();
		ChromeOptions a = cp.addArguments("--desable-notifications");
		driver = new ChromeDriver(a);
		driver.manage().window().maximize();
	}
public static byte[] screenshot() {
	return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

}
	public static void urlLoad(String url1) {
		driver.get(url1);
	}

	public static void closeBrouser() {
		driver.quit();
	}

	public static void txtType(WebElement e, String textBox) {
		e.sendKeys(textBox);
	}

	public static void btnClick(WebElement ele) {
		ele.click();
	}

	public static void dropDownBoxIndex(WebElement e, int index) {
		Select s = new Select(e);
		s.selectByIndex(index);
	}

	public static void dropDownBoxValue(WebElement e, String value) {
		Select s = new Select(e);
		s.selectByValue(value);
	}

	public static void dropDownBoxVisibleText(WebElement e, String visibleTxt) {
		Select s = new Select(e);
		s.selectByVisibleText(visibleTxt);
	}

	public static void radioBtnClick(WebElement e) {
		e.click();
	}

	public static void getText(WebElement e) {
		System.out.println(e.getText());
	}

	public static void getTextAttribute(WebElement e) {
		System.out.println(e.getAttribute("value"));

	}

	public static void txtClear(WebElement e) {
		e.clear();

	}

}
