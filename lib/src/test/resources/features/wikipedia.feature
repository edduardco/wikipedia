@wikipedia
Feature: Web Automation Testing

  @search-automation
  Scenario: Search article automation
    Given User searches article of "automation"
    When User selects the first result
    Then User verifies article title

#  @search-enigma
#  Scenario: Search article enigma
#    Given User searches article of "enigma"
#    When User selects the first result
#    Then User verifies article title
