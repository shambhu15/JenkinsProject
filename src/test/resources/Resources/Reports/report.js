$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Resources/Guru99OneDFeatureFile.feature");
formatter.feature({
  "name": "Validate the  Guur99 Demo site",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": ": Add a tariff plan to customers",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user click on Add tariff plan to customer links",
  "keyword": "Then "
});
formatter.step({
  "name": "user enters \"\u003cMonthlyRen\u003e\",\"\u003cFreeLMin\u003e\",\"\u003cFreeIMin\u003e\",\"\u003cFreeSMSPack\u003e\",\"\u003cLocalPMCharge\u003e\",\"\u003cIntPMCharge\u003e\" and \"\u003cSmsPerCharge\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user click on submit button",
  "keyword": "Then "
});
formatter.step({
  "name": "User verify sucessful message",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "MonthlyRen",
        "FreeLMin",
        "FreeIMin",
        "FreeSMSPack",
        "LocalPMCharge",
        "IntPMCharge",
        "SmsPerCharge"
      ]
    },
    {
      "cells": [
        "500",
        "10",
        "10",
        "50",
        "2",
        "3",
        "1"
      ]
    },
    {
      "cells": [
        "1000",
        "50",
        "40",
        "80",
        "2",
        "7",
        "2"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should launch the browser and URL Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.userShouldLaunchTheBrowserAndURLApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": ": Add a tariff plan to customers",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user click on Add tariff plan to customer links",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.userClickOnAddTariffPlanToCustomerLinks()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"500\",\"10\",\"10\",\"50\",\"2\",\"3\" and \"1\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.userEntersAnd(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.userClickOnSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify sucessful message",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.userVerifySucessfulMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should launch the browser and URL Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.userShouldLaunchTheBrowserAndURLApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": ": Add a tariff plan to customers",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user click on Add tariff plan to customer links",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.userClickOnAddTariffPlanToCustomerLinks()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"1000\",\"50\",\"40\",\"80\",\"2\",\"7\" and \"2\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.userEntersAnd(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.userClickOnSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify sucessful message",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.userVerifySucessfulMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should launch the browser and URL Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.userShouldLaunchTheBrowserAndURLApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a tariff plan to customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User click on Add tariff plan to customer",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.userClickOnAddTariffPlanToCustomer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User provide a valid details",
  "rows": [
    {
      "cells": [
        "MonthlyRen",
        "FreeLMin",
        "FreeIMin",
        "FreeSMSPack",
        "LocalPMCharge",
        "IntPMCharge",
        "SmsPerCharge"
      ]
    },
    {
      "cells": [
        "5001",
        "10",
        "60",
        "50",
        "9",
        "8",
        "5"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.userProvideAValidDetails(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.userClickSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify sucessful messages",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.userVerifySucessfulMessages()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": ": Add a customer",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User click on Add customer link",
  "keyword": "When "
});
formatter.step({
  "name": "User select Beckground check",
  "keyword": "Then "
});
formatter.step({
  "name": "User enters \"\u003cfirstName\u003e\",\"\u003clastName\u003e\",\"\u003cemilId\u003e\",\"\u003caddress\u003e\" and \"\u003cmobileNum\u003e\" on text field box",
  "keyword": "Then "
});
formatter.step({
  "name": "User should click on submit button",
  "keyword": "Then "
});
formatter.step({
  "name": "User should verify sucessful message",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "emilId",
        "address",
        "mobileNum"
      ]
    },
    {
      "cells": [
        "sham",
        "raj",
        "sham@gmail.com",
        "OMR Chennai",
        "545265544"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should launch the browser and URL Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.userShouldLaunchTheBrowserAndURLApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": ": Add a customer",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User click on Add customer link",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.userClickOnAddCustomerLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select Beckground check",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.userSelectBeckgroundCheck()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"sham\",\"raj\",\"sham@gmail.com\",\"OMR Chennai\" and \"545265544\" on text field box",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.userEntersAndOnTextFieldBox(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click on submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.userShouldClickOnSubmitButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should verify sucessful message",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.userShouldVerifySucessfulMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});