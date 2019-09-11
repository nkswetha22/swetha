Feature: AddCustomer flow
  I

  Scenario: 
    Given User should be in the telecom home page
    And click on add customer button
    When user enter all the field with valid data
    And user clicks on submit button
    Then user should be displayed customer id is generated
    
      Scenario: 
    Given User should be in the telecom home page
    And click on add customer button
    When user enter all the field with valid data.
    |Rishika|Nithi|rishika@gmail.com|Udaipur|5566778899|
    And user clicks on submit button
    Then user should be displayed customer id is generated
    
      Scenario: 
    Given User should be in the telecom home page
    And click on add customer button
    When user enter all the field with valid datas
    |fname|Nishika|
    |lname|nk|
    |email|nishika@gmail.com|
    |address|Jaipur|
    |phno|8899776655|
    And user clicks on submit button
    Then user should be displayed customer id is generated
