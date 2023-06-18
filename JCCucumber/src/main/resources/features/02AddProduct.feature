Feature: Dashboard product
  Scenario: Add Product One
    When User click menu demo site
    And User select product one
    And User select color
    And User select size
    And User select add to cart
    Then User get text title add product one

  Scenario: Add Product Two
    When User click menu demo site
    And User select product two
    And User select color two
    And User select size two
    And User select add to cart
    Then User get text title add product two