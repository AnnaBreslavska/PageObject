import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.BasePage;
import pageObjects.pageObjectShopDemo;


public class taskB extends BaseTest {


    @Test
    public void taskB() {
        pageObjectShopDemo pageObjectShopDemo = new pageObjectShopDemo(getDriver());
        getDriver().get("http://shop.demoqa.com/");
        pageObjectShopDemo.addToWishlist();
        getDriver().get("http://shop.demoqa.com/wishlist/");
        pageObjectShopDemo.scroll();
        Assert.assertTrue(pageObjectShopDemo.itemIsAddedToWishlist());

    }
}
