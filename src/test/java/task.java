import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.pageObjectTaskB;
import pageObjects.pageObjectTaskC;


public class task extends BaseTest {


    @Test
    public void taskB() {
        pageObjectTaskB pageObjectTaskB = new pageObjectTaskB(getDriver());
        getDriver().get("http://shop.demoqa.com/");
        pageObjectTaskB.addToWishlist();
        getDriver().get("http://shop.demoqa.com/wishlist/");
        Assert.assertTrue(pageObjectTaskB.itemIsAddedToWishlist());

    }
    @Test
    public void taskC() {
        pageObjectTaskC pageObjectTaskC = new pageObjectTaskC(getDriver());
        getDriver().get("http://shop.demoqa.com/");
        pageObjectTaskC.addTShirtToCard();
        getDriver().get("http://shop.demoqa.com/cart/");
        Assert.assertTrue(pageObjectTaskC.isItemAddedToCard());
    }
}
