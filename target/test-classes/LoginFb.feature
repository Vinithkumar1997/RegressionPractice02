Feature: To validate the Login Functionality

  Scenario: To verify the Login Functionality
    Given Launch the browser and hit the fb url
    When Enter the username and password
    And click the login button
    Then check if user entered the homepage
