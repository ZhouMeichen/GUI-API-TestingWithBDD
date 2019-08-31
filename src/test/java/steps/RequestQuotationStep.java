package steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.NewQuotationPage;
import pages.RequestQuotationPage;
import utils.DriverManager;

import static org.junit.Assert.*;

import org.openqa.selenium.support.PageFactory;

public class RequestQuotationStep{
    HomePage objHome;
    RequestQuotationPage objRequestQuotation;
    NewQuotationPage objNewQuotation;
    
	@Given("^the user click the request quotation tab$")
	public void accessRequestQuotationPage() {
	    objRequestQuotation = PageFactory.initElements(DriverManager.driver, RequestQuotationPage.class);
        objNewQuotation = PageFactory.initElements(DriverManager.driver, NewQuotationPage.class);
        objHome = PageFactory.initElements(DriverManager.driver, HomePage.class);
	    objHome.requestQuotationLinkClick();
	}

	@When("^select the Breakdowncover (.*)$")
	public void selectTitle(String str) {
	    objRequestQuotation.selectBreakdownCover(str);
	}

	@And("^select the Windscreenrepair (.*)$")
	public void selectWindscreenrepair(String str) {
	    objRequestQuotation.setWindScreenRepair(str);
	}
	
	@And("^input the incidents (.*)$")
	public void inputIncidents(String str) {
	    objRequestQuotation.setIncidents(str);
	}
	
	@And("^input the Registration (.*)$")
	public void inputRegistration(String str) {
	    objRequestQuotation.setRegistration(str);
	}
	
	@And("^input the Annual mileage (.*)$")
	public void inputAnnualMileage(String str) {
	    objRequestQuotation.setAnnualMileage(str);
	}
	
	@And("^input the Estimated value (.*)$")
	public void inputEstimatedValue(String str) {
	    objRequestQuotation.setEstimatedValue(str);
	}
	
	@And("^select the Parking Location (.*)$")
	public void selectParkingLocation(String str) {
	    objRequestQuotation.selectParkingLocation(str);
	}
	
	@And("^select the Year (.*), Month (.*), Day (.*)$")
	public void selectStartPolicy(String year, String month, String day) {
	    objRequestQuotation.selectYear(year);
	    objRequestQuotation.selectMonth(month);
	    objRequestQuotation.selectDay(day);
	}
	
	@And("^click the Calculate Premium button$")
	public void calculatePremium() {
	    objRequestQuotation.clickCalculatePremiumBtn();
	}
	
	@Then("^the premium (.*) will be shown$")
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
        DriverManager.quit();
    }
	
}
