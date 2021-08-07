package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PageObjectTaskC extends BasePage {

    public PageObjectTaskC(WebDriver driver) {
        super(driver);
    }

    private final By tShirtPink = By.xpath("//a[normalize-space()='pink drop shoulder oversized t shirt']");
    private final By selectColor = By.xpath("//option[@value='pink']");
    private final By selectSize = By.xpath("//option[@value='37']");
    private final By addQty = By.xpath("//button[@class='qty-increase']");
    private final By addToCard = By.xpath("//button[normalize-space()='Add to cart']");
    private final By tShirtPinkAdded = By.xpath("//a[normalize-space()='pink drop shoulder oversized t shirt - Pink']");
    private final By verifySizeAdded = By.xpath("//p[normalize-space()='37']");
    private final By verifyQtyAdded = By.xpath("//input[@value='3']");


    public void addTShirtToCard() {
        clickOnWebElement(tShirtPink);
        scroll();
        clickOnWebElement(selectColor);
        clickOnWebElement(selectSize);
        for (int i = 0; i < 2; i++) {
            clickOnWebElement(addQty);
        }
        clickOnWebElement(addToCard);

    }

    public boolean isItemAddedToCard() {

        return elementIsDisplayed(tShirtPinkAdded) &&
                elementIsDisplayed(verifySizeAdded) &&
                elementIsDisplayed(verifyQtyAdded);
    }
}
