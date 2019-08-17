Feature: Register

  Scenario: User register with valid information
    Given the user access the login webpage via url "http://demo.guru99.com/insurance/v3/index.php" in the "chrome" browser
    Given the user click the register button
    When select the Title "Ms"
    And input the First Name "Mike"
    And input the Surname "Xi"
    And input the Phone "1234567890"
    And select the year "1995", the month "March", and the day "20"
    And select the Licence type "Provisional"
    And select the Licence period "2" years
    And select the Occupation "Engineer"
    And input the Street "1 Queen St"
    And input the City "LA"
    And input the County "CA"
    And input the Postcode "1234"
    And input the Email "3@3.com"
    And input the Password "123"
    And input the Confirm Password "123"
    And click the create button
    Then the login page will be shown