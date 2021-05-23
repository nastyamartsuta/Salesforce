package elements.contactPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
    WebDriver driver;
    String searchLabel;
    String searchLocator = "//*[contains(@class, 'modal-body')]//label[text()='%s']/..//child::input";
    String searchOptionLocator = "//input[@aria-expanded='true']//ancestor::div[contains(@class,'slds-is-open')]//strong[text()='%s']";

    public Search(WebDriver driver, String searchLabel) {
        this.driver = driver;
        this.searchLabel = searchLabel;
    }

    public void select(String option) {
        driver.findElement(By.xpath(String.format(searchLocator, searchLabel))).click();
        driver.findElement(By.xpath(String.format(searchOptionLocator, option))).click();
    }
}

