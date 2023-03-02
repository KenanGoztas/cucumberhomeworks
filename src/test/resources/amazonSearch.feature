Feature: Amazon search results
  Scenario: go amazon homepage and search
    Given go amazon homepage
    When search an item
    Then see what do you search