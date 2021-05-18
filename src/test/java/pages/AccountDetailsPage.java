package pages;

import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage {
    public static final By DETAILS_TAB = By.xpath("//div[contains(@class,'active')]//*[@id='detailTab__item']");

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    //TODO implement
    public boolean isPageOpened() {
        return false;
    }

    public AccountDetailsPage openDetailsTab() {
        driver.findElement(DETAILS_TAB).click();
        return this;
    }

    public void validateAccount(Account account) {
        validateInput("Account Name", account.getAccountName());
        validateInput("Phone", account.getPhone());
        validateInput("Website", account.getWebsite());
        validateInput("Employees", account.getEmployees());
        validateInput("Billing City", account.getBillingCity());
        validateInput("Billing Zip/Postal Code", account.getBillingZipPostalCode());
        validateInput("Billing State/Province", account.getBillingStateProvince());
        validateInput("Billing Country", account.getBillingCountry());
        validateInput("Shipping City", account.getShippingCity());
        validateInput("Shipping Zip/Postal Code", account.getBillingZipPostalCode());
        validateInput("Shipping State/Province", account.getBillingStateProvince());
        validateInput("Shipping Country", account.getShippingCountry());
        validateTextArea("Description", account.getDescription());
        validateTextArea("Billing Street", account.getBillingStreet());
        validateTextArea("Shipping Street", account.getShippingStreet());
    }
}
