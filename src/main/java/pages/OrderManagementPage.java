package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderManagementPage {
    WebDriver driver;

    @FindBy(linkText= "Cancelation Reasons")
    public WebElement CancelReasonLink;

    public OrderManagementPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
