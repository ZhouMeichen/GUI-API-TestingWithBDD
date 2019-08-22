package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class RequestQuotationPage {
    @FindBy(how = How.ID, using = "quotation_breakdowncover")
    WebElement breakdownCover;
    
    @FindBy(how = How.ID, using = "quotation_windscreenrepair_t")
    WebElement windScreenRepairYes;
    
    @FindBy(how = How.ID, using = "quotation_windscreenrepair_f")
    WebElement windScreenRepairNo;
    
    @FindBy(how = How.NAME, using = "incidents")
    WebElement incidents;
    
    @FindBy(how = How.NAME, using = "registration")
    WebElement registration;
    
    @FindBy(how = How.NAME, using = "mileage")
    WebElement annualMileage;
    
    @FindBy(how = How.NAME, using = "value")
    WebElement estimatedValue;
    
    @FindBy(how = How.NAME, using = "parkinglocation")
    WebElement parkingLocation;
    
    @FindBy(how = How.NAME, using = "year")
    WebElement year;
    
    @FindBy(how = How.NAME, using = "month")
    WebElement month;
    
    @FindBy(how = How.NAME, using = "date")
    WebElement day;
    
    @FindBy(how = How.XPATH, using = "//*[@id=\"new_quotation\"]/div[8]/input[1]")
    WebElement calculateBtn;
    
    @FindBy(how = How.ID, using = "resetquote")
    WebElement resetBtn;
    
    @FindBy(how = How.NAME, using = "submit")
    WebElement saveBtn;
    
    @FindBy(how = How.ID, using = "calculatedpremium")
    WebElement premium;
    
    public void selectBreakdownCover(String str) {
        Select dropdown = new Select(breakdownCover);
        dropdown.selectByVisibleText(str);
    }
    
    public void setWindScreenRepair(String str) {
        if (str.equalsIgnoreCase("yes")) {
            windScreenRepairYes.click();
        }else {
            windScreenRepairNo.click();
        }
    }
    
    public void setIncidents(String str) {
        incidents.clear();
        incidents.sendKeys(str);
    }
    
    public void setRegistration(String str) {
        registration.clear();
        registration.sendKeys(str);
    }
    
    public void setAnnualMileage(String str) {
        annualMileage.clear();
        annualMileage.sendKeys(str);
    }
    
    public void setEstimatedValue(String str) {
        estimatedValue.clear();
        estimatedValue.sendKeys(str);
    }
    
    public void selectParkingLocation(String str) {
        Select dropdown = new Select(parkingLocation);
        dropdown.selectByVisibleText(str);
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
    
    public void clickCalculatePremiumBtn() {
        calculateBtn.click();
    }
    
    public void clickSaveBtn() {
        saveBtn.click();
    }
    
    public String getPremium() {
        return premium.getText();
    }
}
