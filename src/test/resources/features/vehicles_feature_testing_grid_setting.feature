@B26G12-50
Feature: Default

	#User Story: As a user when I am on Vytrack => Fleet => Vehicles, I should be able to see Export Grid dropdown, Refresh, Reset and Grid Settings Buttons 
	@B26G12-47 @B26G12-8
	Scenario: Automation: User should be able to click Grid Setting button
		Given I am logged in on VyTrack, Fleet Module and Vehicel funtionality
		Then I should be able to see and click Gride Setting button and see Grid Settings text Displayed