Feature: Retrieve Quotation
 
  Scenario Outline: User retrieve quotation with valid id
    Given the user access the login webpage
    When input email <email>
    And input password <password>
    And click the login button
    Given the user click the retrieve quotation tab
    When input id <id>
    And click the Retrieve button
    Then get the quotation values like breakdowncover <breakdowncover>, windscreenrepair <windscreenrepair>, user_id <user_id>, incidents <incidents>, Registration <Registration>, Annual mileage <mileage>, Estimated value <value>, Parking Location <Location>, Start of policy <StartDate>, Calculate Premium <Premium>
    
    Examples:
    |  email|password| id| breakdowncover|windscreenrepair|user_id|incidents|Registration|mileage| value|Location|StartDate|Premium|
    |1@1.com|     123|987|              2|              No|  10112|        1|           2| 200000|100000|    Road| 2014.2.7|   2050|