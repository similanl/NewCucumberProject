@Regression
Feature: Library app login feature

  UserStory:
  As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.
  Accounts are: librarian, student, admin

  Background:
    Given user is on log in page


  @librarian @employee @smoke
  Scenario: login with valid "<librarian>" credentials
    When "<librarian>" enter valid username, valid password and click login
    Then "<librarian>" should login successfully
    And Homepage should be displayed

  @Student
  Scenario: login with valid "<student>" credentials
    When "<student>" enter valid username, valid password and click login
    Then "<student>" should login successfully
    And Homepage should be displayed

  @Admin
  Scenario: login with valid "<admin>" credentials
    When "<admin>" enter valid username, valid password and click login
    Then "<admin>" should login successfully
    And Homepage should be displayed