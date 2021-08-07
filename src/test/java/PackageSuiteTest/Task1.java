package PackageSuiteTest;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task1 extends BaseTest {
    @Test
    public void Task1() {

        getDriver().get("https://demoqa.com/frames");

        getDriver().switchTo().frame(getDriver().findElement(By.id("frame1")));
        WebElement frameFirstText = getDriver().findElement(By.cssSelector("#sampleHeading"));
        frameFirstText.getText();
        System.out.println("Text on First Frame: " + frameFirstText.getText());
        getDriver().switchTo().defaultContent();

        getDriver().switchTo().frame(getDriver().findElement(By.id("frame2")));
        WebElement frameSecondText = getDriver().findElement(By.cssSelector("#sampleHeading"));
        frameSecondText.getText();
        System.out.println("Text on Second Frame: " + frameSecondText.getText());

    }
}
