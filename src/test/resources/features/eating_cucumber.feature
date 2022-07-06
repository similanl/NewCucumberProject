@eating # this tag will run everything under this functionality
Feature: Eating too many cucumbers may not be good for you.
  user story: Eating too much of anything may not be good for you.


  @eating @smoke
  Scenario: Eating a few is no problem
    Given  John is hungry
    When  he eats cucumbers
    Then  he will be full

  @eating @smoke
  Scenario: Eating a few is no problem
    Given  "John" is hungry
    When  he eats 3 cucumbers
    Then  "John" will be full