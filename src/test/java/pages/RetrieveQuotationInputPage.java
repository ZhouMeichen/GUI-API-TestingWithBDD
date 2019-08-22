package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RetrieveQuotationInputPage {
    @FindBy(how = How.NAME, using = "id")
    WebElement id;
    
    @FindBy(how = How.ID, using = "getquote")
    WebElement retrieveBtn;
    
    public void setId(String str) {
        id.clear();
        id.sendKeys(str);
    }
    
    public void clickRetrieveBtn() {
        retrieveBtn.click();
    }
}
