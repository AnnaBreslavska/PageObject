package pageObjects.HW24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;

public class PageObjectLoginPage extends BasePage {

    public PageObjectLoginPage(WebDriver driver) {
        super(driver);
    }

    private final By userName = By.xpath("//input[@placeholder='Логин']");
    private final By password = By.xpath("//input[@placeholder='Пароль']");
    private final By submit = By.xpath("//button[contains(text(),'Войти')]");
    private final By pinToFactor = By.xpath("//input[@id='otp-code']");

    public void login(String user, String userPassword, String pin) {
        sendKeysWebElement(userName, user);
        sendKeysWebElement(password, userPassword);
        clickOnWebElement(submit);
        sendKeysWebElement(pinToFactor, pin);
        clickOnWebElement(submit);
    }
}
