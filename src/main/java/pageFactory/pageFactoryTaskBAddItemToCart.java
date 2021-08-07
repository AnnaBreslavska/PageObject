package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageFactoryTaskBAddItemToCart {

    private WebDriver driver;

    public pageFactoryTaskBAddItemToCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='pull-right noo_woocommerce-catalog']//option[@value='94'][normalize-space()='37']")
    WebElement selectSize;

    @FindBy(xpath = "//a[normalize-space()='blue sinner ripped knee high waist skinny jeans']")
    WebElement selectItem;

    @FindBy(xpath = "//option[@value='blue']")
    WebElement selectColor;

    @FindBy(xpath = "//option[@value='37']")
    WebElement chooseSize;

    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement addToCard;


    public void addItemToCart (){
        selectSize.click();
        selectItem.click();
        selectColor.click();
        chooseSize.click();
        addToCard.click();
    }
}
