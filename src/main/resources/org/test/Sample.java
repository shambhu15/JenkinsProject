package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHAMBHU\\eclipse-workspace\\CucumberFramework\\Jenkins\\driver\\chromedriver.exe");
		ChromeOptions cp=new ChromeOptions();
		ChromeOptions a = cp.addArguments("--desable-notifications");
		WebDriver driver = new ChromeDriver(a);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/telecom/index.html");
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
		driver.findElement(By.id("rental1")).sendKeys("5000");
		driver.findElement(By.id("local_minutes")).sendKeys("2");
	}

}
