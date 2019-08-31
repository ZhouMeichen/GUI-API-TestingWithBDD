package steps;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.ConfigProperties;
import utils.DriverManager;

import static org.junit.Assert.*;

public class LoginStep extends StepsClass {
    
    @Given("^the user access the login webpage$")
    public void login() {
        DriverManager.driver.get(ConfigProperties.get("url"));
    }
    
    @When("^input email \"(.*)\"$")
    public void inputEmail(String email) {
        objLogin.setEmail(email);
    }
    
    @And("^input password \"(.*)\"$")
    public void inputPwd(String pwd) {
        objLogin.setPwd(pwd);
    }
    
    @And("^click the login button$")
    public void click() {
        objLogin.clickLoginButton();
    }
    
    @Then("^the home page will be shown with the logout button$")
    public void loginWithValidData() {
        assertTrue(objHome.isLogoutButtonDisplayed());
        driverManager.quit();
    }
    
    @Then("^the error message \"(.*)\" will be shown$")
    public void loginWithInvalidData(String msg) {
        assertTrue(objLogin.getErrorMessage().equalsIgnoreCase(msg));
        driverManager.quit();
    }
    
    
}
