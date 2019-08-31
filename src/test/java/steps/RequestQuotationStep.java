package steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class RequestQuotationStep extends StepsClass {

	@Given("^the user click the request quotation tab$")
	public void accessRequestQuotationPage() {

	    objHome.requestQuotationLinkClick();
	}

	@When("^select the Breakdowncover \"(.*)\"$")
	public void selectTitle(String str) {
	    objRequestQuotation.selectBreakdownCover(str);
	}

	@And("^select the Windscreenrepair \"(.*)\"$")
	public void selectWindscreenrepair(String str) {
	    objRequestQuotation.setWindScreenRepair(str);
	}
	
	@And("^input the incidents \"(.*)\"$")
	public void inputIncidents(String str) {
	    objRequestQuotation.setIncidents(str);
	}
	
	@And("^input the Registration \"(.*)\"$")
	public void inputRegistration(String str) {
	    objRequestQuotation.setRegistration(str);
	}
	
	@And("^input the Annual mileage \"(.*)\"$")
	public void inputAnnualMileage(String str) {
	    objRequestQuotation.setAnnualMileage(str);
	}
	
	@And("^input the Estimated value \"(.*)\"$")
	public void inputEstimatedValue(String str) {
	    objRequestQuotation.setEstimatedValue(str);
	}
	
	@And("^select the Parking Location \"(.*)\"$")
	public void selectParkingLocation(String str) {
	    objRequestQuotation.selectParkingLocation(str);
	}
	
	@And("^select the Year \"(.*)\", Month \"(.*)\", Day \"(.*)\"$")
	public void selectStartPolicy(String year, String month, String day) {
	    objRequestQuotation.selectYear(year);
	    objRequestQuotation.selectMonth(month);
	    objRequestQuotation.selectDay(day);
	}
	
	@And("^click the Calculate Premium button$")
	public void calculatePremium() {
	    objRequestQuotation.clickCalculatePremiumBtn();
	}
	
	@Then("^the premium \"(.*)\" will be shown$")
    public void calculatePremiumWithValidData(String str) {
        assertTrue(objRequestQuotation.getPremium().contains(str));
    }
	
	@And("^click the Save Quotation button$")
    public void saveQuotation() {
        objRequestQuotation.clickSaveBtn();
    }
	
	@Then("^the success message \"(.*)\" will be shown$")
    public void saveQuotationWithValidData(String str) {
        assertTrue(objNewQuotation.getMsg().contains(str));
        System.out.println(objNewQuotation.getMsg());
        driverManager.quit();
    }
	
}
