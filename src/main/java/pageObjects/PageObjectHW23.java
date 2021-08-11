package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectHW23 extends BasePage{

    public PageObjectHW23(WebDriver driver) {
        super(driver);
    }

    private final By fullName = By.xpath("//input[@id='userName']");
    private final By email = By.xpath("//input[@id='userEmail']");
    private final By currentAddress = By.xpath("//textarea[@id='currentAddress']");
    private final By permanentAddress = By.xpath("//textarea[@id='permanentAddress']");
    private final By submit = By.xpath("//button[normalize-space()='Submit']");
    private final By textForm = By.xpath("//div[@class='border col-md-12 col-sm-12']");

    public void fillInTheForm (String nameInput, String emailInput, String currentAddressInput, String permanentAddressInput) {
        webElementLocator(fullName).sendKeys(nameInput);
        webElementLocator(email).sendKeys(emailInput);
        webElementLocator(currentAddress).sendKeys(currentAddressInput);
        webElementLocator(permanentAddress).sendKeys(permanentAddressInput);
        scroll();
        webElementLocator(submit).click();
    }
    public boolean isFormFilledIn (){
        return elementIsDisplayed(textForm);
    }
}
