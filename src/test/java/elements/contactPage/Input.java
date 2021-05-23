package elements.contactPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {
    WebDriver driver;
    String label;
    String inputLocator = "//*[contains(@class,'isModal')]//label[text() ='%s']" +
            "/parent::lightning-input[contains(@class, 'slds-form-element')]//input";

    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        System.out.println(String.format("Writing text '%s' into input with label %s", text, label));
        //JS set style
        driver.findElement(By.xpath(String.format(inputLocator, label))).sendKeys(text);
    }
}
