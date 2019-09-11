
Feature: AddCustomer flow
  
  Scenario: 
    Given User should be in the telecom home page
    And user click on add customer button
    When user enters all the fields with valid data
    And clicks on submit button
    
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
    And user click on add customer button
    When user enters all the fieldsss  with valid data
      | fname    | lname | mail            | address | phno       |
      | swetha   | nk | swetha@gmail.com | chennai | 789987678 |
      | nithinisha  | manasi | nithi@gmail.com    | pune  | 4567899876 |
      | ashika    | anith | ashika@gmail.com    | maharashtira | 2345678 |
      | varodha | nivethan | varodha@gmail.com    | nainital | 23456789 |
    And user clicks on submit button
    Then user should be displayed customer id is generated


