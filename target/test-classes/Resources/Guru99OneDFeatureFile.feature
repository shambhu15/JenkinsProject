Feature: Validate the  Guur99 Demo site 
Background: 
	Given user should launch the browser and URL Application 
	
Scenario Outline: : Add a tariff plan to customers 
	Then user click on Add tariff plan to customer links 
	When user enters "<MonthlyRen>","<FreeLMin>","<FreeIMin>","<FreeSMSPack>","<LocalPMCharge>","<IntPMCharge>" and "<SmsPerCharge>" 
	Then user click on submit button 
	And User verify sucessful message 
	Examples: 
		|MonthlyRen|FreeLMin|FreeIMin|FreeSMSPack|LocalPMCharge|IntPMCharge|SmsPerCharge|
		|500|10|10|50|2|3|1|
		|1000|50|40|80|2|7|2|
		
Scenario: Add a tariff plan to customer 
	When User click on Add tariff plan to customer 
	Then User provide a valid details 
		|MonthlyRen|FreeLMin|FreeIMin|FreeSMSPack|LocalPMCharge|IntPMCharge|SmsPerCharge|
		|5001|10|60|50|9|8|5|
		
	Then User click submit button 
	And User verify sucessful messages 
	
Scenario Outline: : Add a customer 
	When User click on Add customer link 
	Then User select Beckground check 
	Then User enters "<firstName>","<lastName>","<emilId>","<address>" and "<mobileNum>" on text field box 
	Then User should click on submit button 
	And User should verify sucessful message 
	Examples: 
		|firstName|lastName|emilId|address|mobileNum|
		|sham|raj|sham@gmail.com|OMR Chennai|545265544|

