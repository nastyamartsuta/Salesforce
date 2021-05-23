package elements.contactPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {
    WebDriver driver;
    String label;
    String locator = "//*[contains(@class,'isModal')]//label[text() ='%s']" +
            "/ancestor::div[contains(@class, 'slds-form-element__row')]//input";
    String optionLocator = "//*[contains(@class,'slds-dropdown-trigger_click') and " +
            "contains(@class,'slds-is-open')]//input[@title='%s']";

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void select(String option) {
        driver.findElement(By.xpath(String.format(locator, label))).click();
        driver.findElement(By.xpath(String.format(optionLocator, option))).click();
    }
}
