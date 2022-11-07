package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OrderManagementPage {
    WebDriver driver;

    public OrderManagementPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
