package elements.contactPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea {
    WebDriver driver;
    String label;
    String textAreaLocator = "//*[contains(@class,'isModal')]//label[text() ='%s']" +
            "/parent::lightning-textarea[contains(@class, 'slds-form-element')]//textarea";

    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        System.out.println(String.format("Writing text '%s' into input with label %s", text, label));
        //JS set style
        driver.findElement(By.xpath(String.format(textAreaLocator, label))).sendKeys(text);
    }
}
