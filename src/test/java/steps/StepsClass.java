package steps;

import org.openqa.selenium.support.PageFactory;

import pages.HomePage;
import pages.LoginPage;
import pages.NewQuotationPage;
import pages.RegisterPage;
import pages.RequestQuotationPage;
import pages.RetrieveQuotationInputPage;
import pages.RetrieveQuotationPage;
import utils.ConfigProperties;
import utils.DriverManager;

public class StepsClass {
    DriverManager driverManager;
    LoginPage objLogin;
    HomePage objHome;
    RegisterPage objRegister;
    RequestQuotationPage objRequestQuotation;
    NewQuotationPage objNewQuotation;
    RetrieveQuotationInputPage objRetrieveQuotationInput;
    RetrieveQuotationPage objRetrieveQuotation;
    
    public StepsClass() {
        driverManager = new DriverManager();
        driverManager.init(ConfigProperties.get("browser"));
        objLogin = PageFactory.initElements(DriverManager.driver, LoginPage.class);
        objHome = PageFactory.initElements(DriverManager.driver, HomePage.class);
        objRegister = PageFactory.initElements(DriverManager.driver, RegisterPage.class);
        objRequestQuotation = PageFactory.initElements(DriverManager.driver, RequestQuotationPage.class);
        objNewQuotation = PageFactory.initElements(DriverManager.driver, NewQuotationPage.class);
        objRetrieveQuotationInput = PageFactory.initElements(DriverManager.driver, RetrieveQuotationInputPage.class);
        objRetrieveQuotation = PageFactory.initElements(DriverManager.driver, RetrieveQuotationPage.class);        

    }
}
