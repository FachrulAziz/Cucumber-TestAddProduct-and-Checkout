Feature: Login Page Test
  Scenario: Login Valid Functionality Test
    Given User enter url DemoQA
    When User go to login
    And User enter valid username
    And User enter valid password
    And User click button login
    Then User get text title page dashboard