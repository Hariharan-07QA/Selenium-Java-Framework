Feature : Verifying the Orange Hrm Login feature
  Scenario: Login to the Orange HRM with valid email & password
    Given user launch the application in browser
    When user enters valid "Admin" and "admin123"
    And user clicks the Login button
    Then user will navigate to HomeScreen.