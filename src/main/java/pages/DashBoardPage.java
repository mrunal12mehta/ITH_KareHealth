package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

    WebDriver driver;

    @FindBy(xpath = "//a[@class='sidebar-toggle']")
    public WebElement ToggleButton;

    //WebElement OrderMgmtLink = driver.findElement(By.linkText("Order Management"));

    @FindBy(xpath = "//aside[@class='main-sidebar']")
    public WebElement MainMenu;

    @FindBy(linkText = "Order Management")
    public WebElement OrderMgmtLink;

    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']")
    public WebElement OrderMgmtMenu;

    @FindBy(linkText = "Orders")
    public WebElement OrderList;

    @FindBy(linkText = "Administrator")
    public WebElement Administrator;

    @FindBy(linkText = "Logout")
    public WebElement Logout;

    @FindBy(linkText = "Setting")
    public WebElement Setting;


    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
