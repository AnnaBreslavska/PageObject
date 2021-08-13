package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement webElementLocator(By locator) {
        return driver.findElement(locator);
    }

    public void clickOnWebElement(By locator) {
        webElementLocator(locator).click();
    }

    public void sendKeysWebElement(By locator, String text) {
        webElementLocator(locator).clear();
        webElementLocator(locator).sendKeys(text);
    }


    public boolean elementIsDisplayed(By locator) {
        return webElementLocator(locator).isDisplayed();
    }

    public void scroll() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
    }
    public void waitDriver (By locator){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
