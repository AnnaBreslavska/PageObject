package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageFactoryTaskBSearch {
    private WebDriver driver;

    public pageFactoryTaskBSearch(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Search']")
    WebElement search;

    @FindBy(xpath = "//input[@name='s']")
    WebElement inputSearch;


    public void performSearch(String searchInput) {
        search.click();
        inputSearch.sendKeys(searchInput);
        inputSearch.submit();
    }



}
