@Wikipedia
Feature: Web Automation Testing

  @Search
  Scenario: Search article
    Given User searches article of "automation"
    When User selects the first result
    Then User verifies article title
