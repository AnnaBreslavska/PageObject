package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageFactoryTaskA {
    private WebDriver driver;

    public pageFactoryTaskA(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@title='The New Marc Jacobs Gotham Saddle Bag']")
    WebElement readMoreButton;

    @FindBy(xpath = "//input[@id='author']")
    WebElement nameField;

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@id='url']")
    WebElement websiteField;

    @FindBy(xpath = "//textarea[@id='comment']")
    WebElement commentField;

    @FindBy(xpath = "//input[@id='wp-comment-cookies-consent']")
    WebElement saveCheckbox;

    @FindBy(xpath = "//input[@id='submit']")
    WebElement postCommentButton;

    @FindBy(xpath = "//div[@class='wp-die-message']")
    WebElement errorMessage;

    public void openLinkForComment(){
        readMoreButton.click();
    }

    public void setNameField(String name) {
        nameField.sendKeys(name);
    }

    public void setEmailField(String email) {
        emailField.sendKeys(email);
    }

    public void setWebsiteField(String website) {
        websiteField.sendKeys(website);
    }

    public void setCommentField(String comment) {
        commentField.sendKeys(comment);
    }

    public void saveCheckboxAsTrue() {
        saveCheckbox.click();
    }

    public void clickPostComment() {
        postCommentButton.click();
    }


    public void leaveComment(String name, String email, String website, String comment) {
        openLinkForComment();
        setNameField(name);
        setEmailField(email);
        setWebsiteField(website);
        setCommentField(comment);
        saveCheckboxAsTrue();
        clickPostComment();
    }

    public String errorMessageContains (){
        return errorMessage.getText();
    }
}
