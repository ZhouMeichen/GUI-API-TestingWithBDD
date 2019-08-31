Feature: Login
 
  Scenario Outline: User login with valid email and password
    Given the user access the login webpage
    When input email <email>
    And input password <password>
    And click the login button
    Then the home page will be shown with the logout button
    
    Examples:
    | email |password|
    |1@1.com|     123|
    |2@2.com|     123|
    
  Scenario Outline: User login with invalid email and password
    Given the user access the login webpage
    When input email <email>
    And input password <password>
    And click the login button
    Then the error message "Enter your Email address and password correct" will be shown
    
    Examples:
    |   email   |password|
    |123@123.com|       1|
    |         qw|     123|