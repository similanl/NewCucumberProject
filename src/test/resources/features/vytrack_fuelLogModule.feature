@FuelLog
Feature: Default

	Background:
		Given I am a truck driver logged in on the Fleet management website
		When I hover over to the Fleet module
		When I choose Vehicles Fuel Logs from the Fleet module dropdown
	
	@B26G12-41 @B26G12-8
	Scenario: Automation: As a truck driver I should be able to access Vehicle Fuel Logs
		Then I should be able to see texts below displayed on the grid:
		|ODOMETER VALUE|
		|LITER|
		|PRICE PER LITER|
		|TOTAL PRICE|
		|DATE|
		|PURCHASER|
		|INVOICE REFERENCE|
		|VENDOR|

	@B26G12-40 @B26G12-8
	Scenario: Verify that truck driver can reset the grid by clicking on Grid setting
		When I click on Grid Setting
		Then I should be able to reset the grid