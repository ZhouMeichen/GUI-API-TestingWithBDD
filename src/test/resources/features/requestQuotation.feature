Feature: Request Quotation

  Scenario Outline: User request quotation with valid information
    Given the user access the login webpage
    When input email <email>
    And input password <password>
    And click the login button
    Given the user click the request quotation tab
    When select the Breakdowncover <Breakdowncover>
    And select the Windscreenrepair <Windscreenrepair>
    And input the incidents <incidents>
    And input the Registration <Registration>
    And input the Annual mileage <mileage>
    And input the Estimated value <value>
    And select the Parking Location <Location>
    And select the Year <Year>, Month <Month>, Day <Day>
    And click the Calculate Premium button
    Then the premium <premium> will be shown
    And click the Save Quotation button
    Then the success message "You have saved this quotation" will be shown
    
    Examples:
    |  email|password|Breakdowncover|Windscreenrepair|incidents|Registration|mileage| value|   Location|Year|   Month|Day|premium|
    |1@1.com|     123|      Roadside|             YES|        2|           1|  20000|100000|Street/Road|2014|February|  7|  £2080|