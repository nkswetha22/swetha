
Feature: AddCustomer flow
  
  Scenario: 
    Given User should be in the telecom home page
    And user click on add customer button
    When user enters all the fields with valid data
    And clicks on submit button
    
    Then user should be displayed customer id is generated
   

