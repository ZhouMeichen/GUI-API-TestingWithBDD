package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewQuotationPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabs\"]")
    WebElement msg;
    
    
    public String getMsg() {
        return msg.getText();
    }
    

}
