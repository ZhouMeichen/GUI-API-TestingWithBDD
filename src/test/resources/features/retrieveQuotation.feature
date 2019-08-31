Feature: Retrieve Quotation
 
  Scenario: User retrieve quotation with valid id
    Given the user access the login webpage
    When input email "1@1.com"
    And input password "123"
    And click the login button
    Given the user click the retrieve quotation tab
    When input id "987"
    And click the Retrieve button
    Then get the quotation values like breakdowncover "2", windscreenrepair "No", user_id "10112", incidents "1", Registration "2", Annual mileage "200000", Estimated value "100000", Parking Location "Road", Start of policy "2014.2.7", Calculate Premium "2050" 