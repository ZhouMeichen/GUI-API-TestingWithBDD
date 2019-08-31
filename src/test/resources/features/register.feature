Feature: Register

  Scenario Outline: User register with valid information
    Given the user access the login webpage
    Given the user click the register button
    When select the Title <Title>
    And input the First Name <FirstName>
    And input the Surname <Surname>
    And input the Phone <Phone>
    And select the year <Year>, the month <Month>, and the day <Day>
    And select the Licence type <LicenceType>
    And select the Licence period <LicencePeriod> years
    And select the Occupation <Occupation>
    And input the Street <Street>
    And input the City <City>
    And input the County <County>
    And input the Postcode <Postcode>
    And input the Email <Email>
    And input the Password <Password>
    And input the Confirm Password <ConfirmPassword>
    And click the create button
    Then the login page will be shown
    
    Examples:
    |Title|FirstName|Surname|     Phone|Year|Month|Day|LicenceType|LicencePeriod|Occupation|Street    |City|County|Postcode|  Email|Password|ConfirmPassword|
    |   Ms|     Mike|    Lee|1234567890|1995|March| 20|Provisional|            2|  Engineer|1 Queen St|  LA|    CA|    1234|3@3.com|     123|            123|