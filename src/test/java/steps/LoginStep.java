package steps;


import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utils.DriverManager;

import static org.junit.Assert.*;

public class LoginStep extends StepsClass {
    LoginPage objLogin;
    HomePage objHome;
    
    @Given("^the user access the login webpage via url \"(.*)\" in the \"(.*)\" browser$")
    public void login(String url, String browser) {
        dm.init(browser,url);
        objLogin = PageFactory.initElements(DriverManager.driver, LoginPage.class);
        objHome = PageFactory.initElements(DriverManager.driver, HomePage.class);
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
        dm.quit();
    }
    
    @Then("^the error message \"(.*)\" will be shown$")
    public void loginWithInvalidData(String msg) {
        assertTrue(objLogin.getErrorMessage().equalsIgnoreCase(msg));
        dm.quit();
    }
    
    
}
