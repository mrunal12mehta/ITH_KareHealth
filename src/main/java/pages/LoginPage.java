package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(name = "username")
    public WebElement UserName;

    @FindBy(name = "password")
    public WebElement Password;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-block btn-flat']")
    public WebElement LoginButton;

    @FindBy(xpath = "//i[@class='fa fa-times-circle-o']")
    public WebElement InvalidCredMessage;

   // public void PerformLogin(){
   //    UserName.sendKeys("admin");
   //     Password.sendKeys("admin");
   //     LoginButton.click();
    //}

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
