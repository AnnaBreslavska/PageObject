package pageObjects.HW24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.BasePage;

public class PageObjectMessagePage extends BasePage {
    public PageObjectMessagePage(WebDriver driver) {
        super(driver);
    }

    private final By markAsRead = By.xpath("//a[contains(text(),'Отметить все как прочитанные')]");
    private final By newMessageButton = By.xpath("//a[contains(text(),'Новое сообщение')]");
    private final By selectMessageType = By.xpath("//option[@value='BUG']");
    private final By textField = By.xpath("//textarea[@name='message.text']");
    private final By sendButton = By.xpath("//button[@id='send-button']");
    private final By successfulSending = By.xpath("//div[contains(@class,'alert alert-success')]");

    public void workWithMessages() {
        clickOnWebElement(markAsRead);
        clickOnWebElement(newMessageButton);
    }

    public void messageSending(String text) {
        clickOnWebElement(selectMessageType);
        waitDriver(textField);
        sendKeysWebElement(textField, text);
        clickOnWebElement(sendButton);
    }
    public boolean alertIsdsplayed(){
        return elementIsDisplayed(successfulSending);
    }
}
