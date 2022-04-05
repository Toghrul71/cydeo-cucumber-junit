Feature: Etsy title verificaton
  Background:
    When User is on https://www.etsy.com

  Scenario:  Etsy Title Verification
    Then User sees title is as expected


  Scenario: Etsy Search Functionality Title Verification (without parameterization)
    When User types Wooden Spoon in the search box
    And User clicks search button
    Then User sees Wooden Spoon is in the title


  Scenario: Etsy Search Functionality Title Verification (with parameterization)
    When User types "Wooden Spoon" in the search box
    And User clicks search button
    Then User sees "Wooden spoon | Etsy CA" is in the title
