Feature: Request Quotation

  Scenario: User request quotation with valid information
    Given the user access the login webpage
    When input email "1@1.com"
    And input password "123"
    And click the login button
    Given the user click the request quotation tab
    When select the Breakdowncover "Roadside"
    And select the Windscreenrepair "YES"
    And input the incidents "2"
    And input the Registration "1"
    And input the Annual mileage "20000"
    And input the Estimated value "100000"
    And select the Parking Location "Street/Road"
    And select the Year "2014", Month "February", Day "7"
    And click the Calculate Premium button
    Then the premium "£2080" will be shown
    And click the Save Quotation button
    Then the success message "You have saved this quotation" will be shown