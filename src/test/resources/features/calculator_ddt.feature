Feature: Calculator should work for simple math

  As a user, I should be able to to simple math

  Background:
    Given Calculator is open

  @calculator
  Scenario Outline: User should be able to add two numbers
    When I add <number1> with <number2>
    Then I should get <result>
    Examples:
      | number1 | number2 | result |
      | 10      | 5       | 15     |
      | 20      | 30      | 50     |