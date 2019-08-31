Feature: Login
 
  Scenario: User login with valid email and password
    Given the user access the login webpage
    When input email "1@1.com"
    And input password "123"
    And click the login button
    Then the home page will be shown with the logout button
    
  Scenario: User login with invalid email and password
    Given the user access the login webpage
    When input email "123@123.com"
    And input password "1"
    And click the login button
    Then the error message "Enter your Email address and password correct" will be shown