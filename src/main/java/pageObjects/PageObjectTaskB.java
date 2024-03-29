package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjectTaskB extends BasePage {

    private final By tokyoTalkies = By.xpath("//div[@class='noo-product-item noo-product-sm-4 not_featured post-704 product type-product status-publish has-post-thumbnail product_cat-dress product_tag-dress product_tag-women has-featured first instock sale shipping-taxable purchasable product-type-variable has-default-attributes']//div[2]//div[1]//a[1]");
    private final By tokyoTalkieIsAdded = By.xpath("//*[contains(text(),'Tokyo Talkies')]");

    public PageObjectTaskB(WebDriver driver) {

        super(driver);
    }

    public void addToWishlist() {
        clickOnWebElement(tokyoTalkies);
    }

    public boolean itemIsAddedToWishlist() {
        scroll();
        return elementIsDisplayed(tokyoTalkieIsAdded);
    }
}
