Feature: CheckOut Test
  Scenario: CheckOut Product
    When User click view cart
    And User click proses checkOut
    And User input first name
    And User input last name
    And User input company name
    And User select country
    And User input street addres
    And User input city
    And User select province
    And User input postCode
    And User input phone number
    And User input email addres
    And User clik checkBox
    And User click button order
    Then User get text title checkout

