Feature: Examples of Cucumber data table implementations

  Scenario: List of fruits I like
    Then user should see fruits I like
      | apple  |
      | pear   |
      | grapes |
      | orange |
      | kiwi   |
    # ctrl+Alt+L  to organize pipes above


  Scenario: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |