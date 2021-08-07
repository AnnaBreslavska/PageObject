import base.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageFactory.pageFactoryTaskA;
import pageFactory.pageFactoryTaskBAddItemToCart;
import pageFactory.pageFactoryTaskBCart;
import pageFactory.pageFactoryTaskBSearch;

public class HW20 extends baseTest {

    @Test
    public void taskA() {
        getDriver().get("http://shop.demoqa.com/author/lsharm/");
        pageFactoryTaskA pageFactoryTaskA = new pageFactoryTaskA(getDriver());
        pageFactoryTaskA.leaveComment("Anna", "test@gmail.com", "Testwebsite.com", "Love your new Bag collection!!");
        Assert.assertEquals(pageFactoryTaskA.errorMessageContains(), "Error: You entered an incorrect CAPTCHA answer. Please go back and try again.");
    }

    @Test
    public void taskB() {
        getDriver().get("http://shop.demoqa.com/");
        pageFactoryTaskBSearch search = new pageFactoryTaskBSearch(getDriver());
        pageFactoryTaskBAddItemToCart addItemToCart = new pageFactoryTaskBAddItemToCart(getDriver());
        pageFactoryTaskBCart cart = new pageFactoryTaskBCart(getDriver());
        search.performSearch("blue");
        addItemToCart.addItemToCart();
        Assert.assertTrue(cart.checkItemIsAdded());
    }
}
