Feature: Basic Syntax
  @FirstScenario
  Scenario: This is scenario 1
    Given user is on TS homepage
    When user clicks on about us button
    Then user is directed to about us page
    And Close the Browser