import base.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.PageObjectTaskB;
import pageObjects.PageObjectTaskC;


public class HW19 extends baseTest {

    @Test
    public void taskB() {
        PageObjectTaskB pageObjectTaskB = new PageObjectTaskB(getDriver());
        getDriver().get("http://shop.demoqa.com/");
        pageObjectTaskB.addToWishlist();
        getDriver().get("http://shop.demoqa.com/wishlist/");
        Assert.assertTrue(pageObjectTaskB.itemIsAddedToWishlist());
    }

    @Test
    public void taskC() {
        PageObjectTaskC pageObjectTaskC = new PageObjectTaskC(getDriver());
        getDriver().get("http://shop.demoqa.com/");
        pageObjectTaskC.addTShirtToCard();
        getDriver().get("http://shop.demoqa.com/cart/");
        Assert.assertTrue(pageObjectTaskC.isItemAddedToCard());
    }
}
