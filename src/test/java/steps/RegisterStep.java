package steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.RegisterPage;
import utils.DriverManager;

import static org.junit.Assert.*;

import org.openqa.selenium.support.PageFactory;

public class RegisterStep{
    LoginPage objLogin;
    RegisterPage objRegister;
    
	@Given("^the user click the register button$")
	public void accessRegisterPage() {
	    objLogin = PageFactory.initElements(DriverManager.driver, LoginPage.class);
	    objRegister = PageFactory.initElements(DriverManager.driver, RegisterPage.class);
	    objLogin.clickRegisterLink();
	}

	@When("^select the Title (.*)$")
	public void selectTitle(String str) {
	    objRegister.selectTitle(str);
	}

	@And("^input the First Name (.*)$")
	public void inputFirstName(String str) {
		objRegister.setFirstName(str);
	}
	
	@And("^input the Surname (.*)$")
	public void inputSurname(String str) {
	    objRegister.setSurname(str);
	}
	
	@And("^input the Phone (.*)$")
	public void inputPhone(String str) {
	    objRegister.setPhone(str);
	}
	
	@And("^select the year (.*), the month (.*), and the day (.*)$")
	public void selectBirth(String year, String month, String day) {
	    objRegister.selectYear(year);
	    objRegister.selectMonth(month);
	    objRegister.selectDay(day);
	}
	
	@And("^select the Licence type (.*)$")
	public void selectLicenceType(String str) {
	    objRegister.selectLicenceType(str);
	}
	
	@And("^select the Licence period (.*) years$")
	public void selectLicencePeriod(String str) {
	    objRegister.selectLicencePeriod(str);
	}
	
	@And("^select the Occupation (.*)$")
	public void selectOccupation(String str) {
	    objRegister.selectOccupation(str);
	}
	
	@And("^input the Street (.*)$")
	public void inputStreet(String str) {
	    objRegister.setStreet(str);
	}
	
	@And("^input the City (.*)$")
	public void inputCity(String str) {
	    objRegister.setCity(str);
	}
	
	@And("^input the County (.*)$")
	public void inputCounty(String str) {
	    objRegister.setCounty(str);
	}
	
	@And("^input the Postcode (.*)$")
	public void inputPostcode(String str) {
	    objRegister.setPostcode(str);
	}
	
	@And("^input the Email (.*)$")
	public void inputEmail(String str) {
	    objRegister.setEmail(str);
	}
	
	@And("^input the Password (.*)$")
	public void inputPassword(String str) {
	    objRegister.setPassword(str);
	}
	
	@And("^input the Confirm Password (.*)$")
    public void inputConfirmPassword(String str) {
        objRegister.setConfirmPassword(str);
    }
	
	@And("^click the create button$")
    public void clickCreateButton() {
        objRegister.clickCreateButton();
    }
	
	@Then("^the login page will be shown$")
    public void registerWithValidData() {
        assertTrue(objLogin.isLoginButtonDisplayed());
        DriverManager.quit();
    }
}
