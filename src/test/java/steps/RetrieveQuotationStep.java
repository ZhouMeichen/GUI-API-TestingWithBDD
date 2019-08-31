package steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RetrieveQuotationStep extends StepsClass{

    @Given("^the user click the retrieve quotation tab$")
    public void accessRequestQuotationPage() {

        objHome.retrieveQuotationLinkClick();
    }

    @When("^input id \"(.*)\"$")
    public void selectTitle(String str) {
        objRetrieveQuotationInput.setId(str);

    }

    @And("^click the Retrieve button$")
    public void selectWindscreenrepair() {
        objRetrieveQuotationInput.clickRetrieveBtn();
    }
    
    @Then("^get the quotation values like breakdowncover \"(.*)\", windscreenrepair \"(.*)\", user_id \"(.*)\", incidents \"(.*)\", Registration \"(.*)\", Annual mileage \"(.*)\", Estimated value \"(.*)\", Parking Location \"(.*)\", Start of policy \"(.*)\", Calculate Premium \"(.*)\"$")
    public void calculatePremiumWithValidData(String breakdownCover, String windscreenRepair, String userId, String incidents, String registration, String annualMileage, String estimatedValue, String parkingLocation, String startOfPolicy, String calculatePremium) {
        String [] values = objRetrieveQuotation.getValue();
        
        assertTrue(values[0].contains(breakdownCover));
        assertTrue(values[1].contains(windscreenRepair));
        assertTrue(values[2].contains(userId));
        assertTrue(values[3].contains(incidents));
        assertTrue(values[4].contains(registration));
        assertTrue(values[5].contains(annualMileage));
        assertTrue(values[6].contains(estimatedValue));
        assertTrue(values[7].contains(parkingLocation));
        assertTrue(values[8].contains(startOfPolicy));
        assertTrue(values[9].contains(calculatePremium));
        driverManager.quit();
    }
}
