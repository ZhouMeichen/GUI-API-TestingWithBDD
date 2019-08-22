package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RetrieveQuotationPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"tabs\"]/table")
    WebElement quotationTb;
    
    public String[] getValue() {
        List<WebElement> rows = quotationTb.findElements(By.tagName("tr"));
        String[] value = new String[rows.size()-1];
        for (int i =1;i<rows.size();i++) {
            List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
                value[i-1] = cells.get(1).getText();
        }
        return value;
    }
}   
