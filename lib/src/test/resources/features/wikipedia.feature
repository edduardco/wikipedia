@wikipedia
Feature: Web Automation Testing

  @wikipedia-search
  Scenario: Search article
    Given User searches article of "automation"
    When User selects the first result
    Then User verifies article title
