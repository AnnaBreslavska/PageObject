import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HW24.PageObjectLoginPage;
import pageObjects.HW24.PageObjectMessagePage;

public class HW24 extends BaseTest {
    @Test
    public void loginPage () {
        PageObjectLoginPage loginPage = new PageObjectLoginPage(getDriver());
        PageObjectMessagePage messagePage = new PageObjectMessagePage(getDriver());
        getDriver().get("https://idemo.bspb.ru/");
        loginPage.login("demo", "demo", "0000");
        getDriver().get("https://idemo.bspb.ru/messages");
        messagePage.workWithMessages();
        messagePage.messageSending("Please, Help! I cannot login!");
        Assert.assertTrue(messagePage.alertIsdsplayed());
    }
}
