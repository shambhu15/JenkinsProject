package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\Resources"}, glue = {
		"com.runner" },dryRun=false, monochrome = true,strict=true,
				plugin= {"pretty","json:src\\test\\resources\\Resources\\Reports\\Cucumber.json","rerun:src\\test\\resources\\Resources\\Failed.txt"})
public class TestRunner {
	@AfterClass
	public static void afterClass() {
		JVMReport.JVMReportGeneration(System.getProperty("user.dir")+"\\src\\test\\resources\\Resources\\Reports\\Cucumber.json");
		

	}

}
