@testingWithPDao
Feature: Logging in NetFlix
  User story: As a student, I am able to log in my parent NetFlix account


  Scenario: Positive test, as a student I am able to log in with valid credentials
    Given a student is on NetFlix log in page
    When a student enter valid username and valid password and click login
    Then a student should be able to see the homepage