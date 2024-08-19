Feature: This is to test search field in google.com
  Scenario: Google Search Scenario
    Given user is entering google.co.in
    When user is typing the search term as "amazon"
    And user clicks the enter key
    Then user should see the search results