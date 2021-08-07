package PackageSuiteTest;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Task2 extends BaseTest {
    @Test
    public void Task2() {

        getDriver().get("https://demoqa.com/text-box");
        getDriver().findElement(By.cssSelector("#userName")).sendKeys("Anna Bres");
        getDriver().findElement(By.cssSelector("#userEmail")).sendKeys("test@gmail.com");
        getDriver().findElement(By.cssSelector("#currentAddress")).sendKeys("Hawaii, Chill st.");
        getDriver().findElement(By.cssSelector("#permanentAddress")).sendKeys("Miami, Sunset st.");
        getDriver().findElement(By.cssSelector("#submit")).submit();
    }
}
