Feature: AddTariffPlan

  Scenario: 
    Given User should be in the telecom home pagess
    And click add tariff buttons
    When User enter all the datasss
    And click on submit buttonss
    Then user should be displayed home button is enteredd

  Scenario: 
    Given User should be in the telecom home pagess
    And click add tariff buttons
    When User enter all the datasss.
      | 200 | 140 | 400 | 100 | 1 | 2 | 3 |
      | 300 |  50 | 300 |  58 | 9 | 9 | 7 |
      | 400 |  60 |  80 |  40 | 4 | 4 | 5 |
      | 500 | 100 |  20 |  70 | 6 | 5 | 4 |
    And click on submit buttonss
    Then user should be displayed home button is enteredd

  Scenario: 
    Given User should be in the telecom home pagess
    And click add tariff buttons
    When User enter all the datassss.
      | MonthlyRen | LM  | IM  | SMS | MC | IC | SC |
      |        640 | 120 | 400 | 100 |  1 |  2 |  9 |
      |        500 |  50 |  79 |  58 |  2 |  3 |  8 |
      |        678 |  67 |  87 |  56 |  3 | 35 |  1 |
      |        300 | 100 |  45 |  70 |  6 |  7 |  8 |
    And click on submit buttonss
    Then user should be displayed home button is enteredd
