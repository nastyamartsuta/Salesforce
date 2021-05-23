package pages;

import elements.accountPage.DropDown;
import elements.contactPage.Input;
import elements.contactPage.Search;
import elements.contactPage.TextArea;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactModal extends BasePage {
    public static final By MODAL_TITLE = By.xpath("//h2[text()='New Contact']");
    public static final By SAVE_BUTTON = By.cssSelector("[title=Save]");

    public ContactModal(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return isExist(MODAL_TITLE);
    }

    public ContactDetailsPage create(Contact contact) {
//        new DropDown(driver, "Salutation").select("Ms.");
        new Input(driver, "First Name").write(contact.getFirstName());
        new Input(driver, "Middle Name").write(contact.getMiddleName());
        new Input(driver, "Last Name").write(contact.getLastName());
        new Input(driver, "Suffix").write(contact.getSuffix());
        new Input(driver, "Title").write(contact.getTitle());
        new Input(driver, "Email").write(contact.getEmail());
        new Input(driver, "Phone").write(contact.getPhone());
        new Input(driver, "Mobile").write(contact.getMobile());
        new Input(driver, "Department").write(contact.getDepartment());
        new Input(driver, "Fax").write(contact.getFax());
//        new Input(driver, "Mailing Address").write(contact.getMailingAddress());
        new Input(driver, "Mailing City").write(contact.getMailingCity());
        new Input(driver, "Mailing Zip/Postal Code").write(contact.getMailingZipPostalCode());
        new Input(driver, "Mailing State/Province").write(contact.getMailingStateProvince());
        new Input(driver, "Mailing Country").write(contact.getMailingCountry());
        new Input(driver, "Mailing Country").write(contact.getMailingCountry());
        new TextArea(driver, "Mailing Street").write(contact.getMailingStreet());
//        new Search(driver, "Account Name").select("fbdkd");
        save();
        return new ContactDetailsPage(driver);
    }

    public void save() {
        driver.findElement(SAVE_BUTTON).click();
    }
}
