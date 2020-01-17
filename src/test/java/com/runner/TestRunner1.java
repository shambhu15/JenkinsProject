package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "@src\\test\\resources\\Resources\\Failed.txt" }, glue = {
		"com.runner" }, dryRun = false, monochrome = true, strict = true, plugin = { "pretty",
				"json:src\\test\\resources\\Resources\\Reports\\Cucumber1.json" })
public class TestRunner1 {

}
