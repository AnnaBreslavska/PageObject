import base.BaseTestWithThreadLocal;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.PageObjectTaskB;
import pageObjects.PageObjectTaskC;


public class HW19 extends BaseTestWithThreadLocal {

    @Test
    public void taskB() {
        PageObjectTaskB pageObjectTaskB = new PageObjectTaskB(getDriver());
        getDriver().get("http://shop.demoqa.com/");
        allureLog("Check Adding Item to Wishlist");
        pageObjectTaskB.addToWishlist();
        getDriver().get("http://shop.demoqa.com/wishlist/");
        allureLog("Check if correct item was added:");
        Assert.assertTrue(pageObjectTaskB.itemIsAddedToWishlist());
    }

    @Test
    public void taskC() {
        PageObjectTaskC pageObjectTaskC = new PageObjectTaskC(getDriver());
        getDriver().get("http://shop.demoqa.com/");
        allureLog("Check Adding Shop Item to Cart");
        pageObjectTaskC.addTShirtToCard();
        getDriver().get("http://shop.demoqa.com/cart/");
        allureLog("Check if correct Shop Item was added:");
        Assert.assertTrue(pageObjectTaskC.isItemAddedToCard());
    }
}
