package com.runner;

import com.utility.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {
	@Before
	public void before() {
		chromeBrowserLaunch();
		urlLoad("http://demo.guru99.com/telecom/index.html");
	}

	@After
	public void afterScenario(Scenario sc) {
		if(sc.isFailed()) {
			sc.embed(screenshot(), "Failed/png");
		}
		else {
			sc.embed(screenshot(), "Passed/png");
		}
		closeBrouser();

	}

}
