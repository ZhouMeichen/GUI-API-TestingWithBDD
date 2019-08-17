package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    @FindBy(how = How.ID, using = "email")
    WebElement email;
    
    @FindBy(how = How.ID, using = "password")
    WebElement pwd;
    
    @FindBy(how = How.NAME, using = "submit")
    WebElement loginBtn;
    
    @FindBy(how = How.XPATH, using = "//*[@id=\"login-form\"]/div[2]/span/b")
    WebElement errorMsg;
    
    @FindBy(how = How.XPATH, using = "//a[@href=\"register.php\"]")
    WebElement registerLink;
    
    public void setEmail(String str) {
        email.clear();
        email.sendKeys(str);
    }
    
    public void setPwd(String str) {
        pwd.clear();
        pwd.sendKeys(str);
    }
    
    public void clickLoginButton() {
        loginBtn.click();
    }
    
    public String getErrorMessage() {
        return errorMsg.getText();
    }
    
    public void clickRegisterLink() {
        registerLink.click();
    }
    
    public boolean isLoginButtonDisplayed() {
        return loginBtn.isDisplayed();
    }
    
}
