package pageFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageFactoryTaskBCart {
    private WebDriver driver;

    public pageFactoryTaskBCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class='cart-item has-items']")
    WebElement goToCart;

    @FindBy (xpath = "//a[contains(text(),'blue sinner ripped knee high waist skinny jeans - ')]")
    WebElement verifyProductNameAndColor;

    @FindBy (xpath = "//p[normalize-space()='37']")
    WebElement verifyProductSize;

    public void scroll() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
    }

    public boolean checkItemIsAdded() {
        goToCart.click();
        scroll();
        return verifyProductNameAndColor.isDisplayed();

    }
}
