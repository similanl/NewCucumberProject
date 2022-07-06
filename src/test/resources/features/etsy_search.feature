
Feature: Etsy search

  User Story: As a user I should be able to search anything so that I can see related vendors results.

  Background:
    Given User is on Etsy home page

  @scenario1
  Scenario: User is able to search wooden spoon
    When User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title

  @scenario2
  Scenario: User is able to search "wooden spoon"
    When User types "Wooden spoon" in the search box
    And User clicks search button
    Then User sees "Wooden spoon" is in the title