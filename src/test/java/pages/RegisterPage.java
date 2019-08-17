package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    @FindBy(how = How.ID, using = "user_title")
    WebElement title;
    
    @FindBy(how = How.ID, using = "user_firstname")
    WebElement firstName;
    
    @FindBy(how = How.ID, using = "user_surname")
    WebElement surname;
    
    @FindBy(how = How.ID, using = "user_phone")
    WebElement phone;
    
    @FindBy(how = How.ID, using = "user_dateofbirth_1i")
    WebElement year;
    
    @FindBy(how = How.ID, using = "user_dateofbirth_2i")
    WebElement month;
    
    @FindBy(how = How.ID, using = "user_dateofbirth_3i")
    WebElement day;
    
    @FindBy(how = How.ID, using = "licencetype_t")
    WebElement full;
    
    @FindBy(how = How.ID, using = "licencetype_f")
    WebElement provisoinal;
    
    @FindBy(how = How.ID, using = "user_licenceperiod")
    WebElement licencePeriod;
    
    @FindBy(how = How.ID, using = "user_occupation_id")
    WebElement occupation;
    
    @FindBy(how = How.ID, using = "user_address_attributes_street")
    WebElement street;
    
    @FindBy(how = How.ID, using = "user_address_attributes_city")
    WebElement city;
    
    @FindBy(how = How.ID, using = "user_address_attributes_county")
    WebElement county;
    
    @FindBy(how = How.ID, using = "user_address_attributes_postcode")
    WebElement postcode;
    
    @FindBy(how = How.ID, using = "user_user_detail_attributes_email")
    WebElement email;
    
    @FindBy(how = How.ID, using = "user_user_detail_attributes_password")
    WebElement password;
    
    @FindBy(how = How.ID, using = "user_user_detail_attributes_password_confirmation")
    WebElement confirmPwd;
    
    @FindBy(how = How.NAME, using = "submit")
    WebElement createBtn;
    
    @FindBy(how = How.ID, using = "resetform")
    WebElement resetBtn;
    
    public void selectTitle(String str) {
        Select dropdown = new Select(title);
        dropdown.selectByVisibleText(str);
    }
    
    public void setFirstName(String str) {
        firstName.clear();
        firstName.sendKeys(str);;
    }
    
    public void setSurname(String str) {
        surname.clear();
        surname.sendKeys(str);
    }
    
    public void setPhone(String str) {
        phone.clear();
        phone.sendKeys(str);
    }
    
    public void selectYear(String str) {
        Select dropdown = new Select(year);
        dropdown.selectByVisibleText(str);
    }
    
    public void selectMonth(String str) {
        Select dropdown = new Select(month);
        dropdown.selectByVisibleText(str);
    }
    
    public void selectDay(String str) {
        Select dropdown = new Select(day);
        dropdown.selectByVisibleText(str);
    }
    
    public void selectLicenceType(String str) {
        if (str.equalsIgnoreCase("provisional")) {
            provisoinal.click();
        }else {
            full.click();
        }
    }
    
    public void selectLicencePeriod(String str) {
        Select dropdown = new Select(licencePeriod);
        dropdown.selectByVisibleText(str);
    }
    
    public void selectOccupation(String str) {
        Select dropdown = new Select(occupation);
        dropdown.selectByVisibleText(str);
    }
    
    public void setStreet(String str) {
        street.clear();
        street.sendKeys(str);
    }
    
    public void setCity(String str) {
        city.clear();
        city.sendKeys(str);
    }
    
    public void setCounty(String str) {
        county.sendKeys(str);
        county.click();
    }
    
    public void setPostcode(String str) {
        postcode.clear();
        postcode.sendKeys(str);
    }
    
    public void setEmail(String str) {
        email.clear();
        email.sendKeys(str);
    }
    
    public void setPassword(String str) {
        password.clear();
        password.sendKeys(str);
    }
    
    public void setConfirmPassword(String str) {
        confirmPwd.clear();
        confirmPwd.sendKeys(str);
    }
    
    public void clickCreateButton() {
        createBtn.click();
    }
    
    public void clickResetButton() {
        resetBtn.click();
    }
}
