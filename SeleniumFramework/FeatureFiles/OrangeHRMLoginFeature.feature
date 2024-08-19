Feature: Verifying the OrangeHRM login feature
  Scenario: Login into the OrangeHRM application
    Given user is on OrangeHrm login page
    When user enter valid username and password
    And user clicks the login button
    Then user will navigated OrangeHrm Homepage
