@netflix
Feature: Movie suggestion feature
  As a user, I should be able to get movies according to my preference.

  @netflixScenario
  Scenario: Movie search
    Given I like "action"
    And I like "drama"
    And I like "cartoon"
    And I like "adventure"
    When I go to home page
    Then I should get right recommendation


  @netflixDataTable
  Scenario: Movie search with data table
    Given I like
      | action    |
      | drama     |
      | cartoon   |
      | adventure |
    When I go to home page
    Then I should get right recommendation


  @netflixDataTableMap
  Scenario: Movie search with data table map
    Given I like below favorite movie with certain type
      | action    | John Wick     |
      | drama     | Titanic       |
      | cartoon   | Tom and Jerry |
      | adventure | Tomb Raider   |
    When I go to home page
    Then I should get right recommendation

