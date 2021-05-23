package pages;

import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactDetailsPage extends BasePage {
    public static final By DETAILS_TAB = By.xpath("//div[contains(@class,'active')]//*[@id='detailTab__item']");

    public ContactDetailsPage(WebDriver driver) {
        super(driver);
    }

    //TODO implement
    public boolean isPageOpened() {
        return false;
    }

    public ContactDetailsPage openDetailsTab() {
        driver.findElement(DETAILS_TAB).click();
        return this;
    }

    public void validateContact(Contact contact) {
        validateInput("Title", contact.getTitle());
        validateInput("Email", contact.getEmail());
        validateInput("Phone", contact.getPhone());
        validateInput("Mobile", contact.getMobile());
        validateInput("Department", contact.getDepartment());
        validateInput("Fax", contact.getFax());
    }
}
