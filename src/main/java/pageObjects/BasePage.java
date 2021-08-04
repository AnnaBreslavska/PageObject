package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    public boolean elementIsDisplayed(By locator) {
        return webElementLocator(locator).isDisplayed();
    }

    public void scroll() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
    }

}
