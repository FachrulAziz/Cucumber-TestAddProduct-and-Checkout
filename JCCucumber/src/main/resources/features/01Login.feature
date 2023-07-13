Feature: Login Page Test
  Scenario: Login Valid Functionality Test
    Given User enter url TMS
    When User enter valid username
    And User enter valid password
    And User click button login
    Then User get text title page dashboard

#  Scenario: Login Invalid Functionality Test
#    When User enter invalid username
#    And User enter invalid password
#    And User click button login
#    Then User get text invalid credentials