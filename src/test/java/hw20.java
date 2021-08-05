import base.BaseTest;
import org.testng.annotations.Test;
import pageFactory.pageFactoryTaskA;

public class hw20 extends BaseTest {

    @Test
    public void taskA (){
        getDriver().get("http://shop.demoqa.com/author/lsharm/");
        pageFactoryTaskA pageFactoryTaskA = new pageFactoryTaskA (getDriver());
        pageFactoryTaskA.leaveComment("Anna", "test@gmail.com", "Testwebsite.com", "Love your new Bag collection!!");

    }

}
