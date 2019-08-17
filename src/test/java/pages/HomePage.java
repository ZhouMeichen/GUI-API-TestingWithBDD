package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
    @FindBy(how = How.XPATH, using = "/html/body/div[3]/form/input")
    WebElement logoutBtn;
    
    @FindBy(how = How.ID, using = "ui-id-1")
    WebElement homeLink;
    
    @FindBy(how = How.ID, using = "ui-id-2")
    WebElement requestQuotationLink;
    
    @FindBy(how = How.ID, using = "ui-id-3")
    WebElement retrieveQuotationLink;
    
    @FindBy(how = How.ID, using = "ui-id-4")
    WebElement profileLink;
    
    @FindBy(how = How.ID, using = "ui-id-5")
    WebElement editProfileLink;
    
    public void clickLogoutButton() {
        logoutBtn.click();
    }
    
    public void homeLinkClick() {
        homeLink.click();
    }
    
    public void requestQuotationLinkClick() {
        requestQuotationLink.click();
    }
    
    public void retrieveQuotationLinkClick() {
        retrieveQuotationLink.click();
    }
    
    public void profileLinkClick() {
        profileLink.click();
    }
    
    public void editProfileLinkClick() {
        editProfileLink.click();
    }
    
    public boolean isLogoutButtonDisplayed() {
        return logoutBtn.isDisplayed();
    }
    
}
