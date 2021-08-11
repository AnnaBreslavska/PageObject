import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.PageObjectHW23;

public class HW23 extends BaseTest {

    @Test (dataProvider = "data-provider")
    public void fillInTextBoxForm (String userName, String userEmail, String userCurrentAddress, String userPermanentAddress){
        PageObjectHW23 fillInFormPO = new PageObjectHW23(getDriver());
        getDriver().get("https://demoqa.com/text-box");
        fillInFormPO.fillInTheForm(userName,userEmail,userCurrentAddress,userPermanentAddress);
        Assert.assertTrue(fillInFormPO.isFormFilledIn());
    }

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod(){
        return new Object[][] {{"Anna", "test@gmail.com", "Hollywood 20", "Great st. 150"},
                {"John", "John@gmail.com", "Beautiful st. 78", "Awesome st.99"},
                {"Marry", "Marry@gmail.com", "Marry st. 99", "Fun st. 55"},
                {"Max", "Max@gmail.com", "Maxville 17", "Incredible st. 65"},
                {"Lucy", "Lucy@gmail.com", "Dance st. 615", "Party st. 99"}
        };
    }
}
