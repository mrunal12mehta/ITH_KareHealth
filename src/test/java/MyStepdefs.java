import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.DashBoardPage;
import pages.LoginPage;
import pages.OrderManagementPage;

public class MyStepdefs {

    WebDriver driver;
    LoginPage loginPage;
    OrderManagementPage orderManagementPage;
    DashBoardPage dashBoardPage;

    @Before
    public void Start() {
       driver = TestRunner.driver;
       loginPage = new LoginPage(driver);
       orderManagementPage = new OrderManagementPage(driver);
       dashBoardPage = new DashBoardPage(driver);
    }

    @Given("User navigates to the application")
    public void userNavigatesToTheApplication () throws InterruptedException {
        Thread.sleep(2000);
        String ExpectedTitle = driver.getTitle();
        String ActualTitle = "Admin | Login";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }

    @When("User provides valid credential")
    public void userProvidesValidCredential () {
        loginPage.UserName.sendKeys("admin");
        loginPage.Password.sendKeys("admin");
    }
    @And("User clicks on Login button")
    public void userClicksOnLoginButton () {

        loginPage.LoginButton.click();
    }
    @Then("User is navigated to the Dashboard")
    public void userIsNavigatedToTheDashboard () {
        String ExpectedTitleDB = driver.getTitle();
        String ActualTitleDB = "Admin | Dashboard";
        Assert.assertEquals(ExpectedTitleDB, ActualTitleDB);
        }
    @Given("User is logged in with valid Credentials")
    public void userIsLoggedInWithValidCredentials() {
        String ExpectedTitleDB = driver.getTitle();
        String ActualTitleDB = "Admin | Dashboard";
        Assert.assertEquals(ExpectedTitleDB, ActualTitleDB);
   }
    @When("User clicks on the toggle button on the top")
    public void userClicksOnTheToggleButtonOnTheTop(){

        dashBoardPage.ToggleButton.click();
   }
    @Then("Menu panel should open")
    public void menuPanelShouldOpen() {

        Assert.assertTrue(dashBoardPage.MainMenu.isDisplayed());
    }


    @When("Users clicks on Order Management")
    public void usersClicksOnOrderManagement() {

        dashBoardPage.OrderMgmtLink.click();
    }

    @Then("Order Management SubMenu should open")
    public void orderManagementSubMenuShouldOpen() {
        Assert.assertTrue(dashBoardPage.OrderMgmtMenu.isDisplayed());
    }

    @When("User Clicks on Orders link")
    public void userClicksOnOrdersLink() {

        dashBoardPage.OrderList.click();
    }

    @Then("Order List screen should open")
    public void orderListScreenShouldOpen() throws InterruptedException {
        Thread.sleep(2000);
        String ExpectedTitleOrderList = "Admin | Orders";
        String ActualTitleOrderList = driver.getTitle();
        Assert.assertEquals(ExpectedTitleOrderList, ActualTitleOrderList);
    }

    @When("User clicks on Logged in User name")
    public void userClicksOnLoggedInUserName() {

        dashBoardPage.Administrator.click();
    }

    @And("User clicks on Setting Button")
    public void userClicksOnSettingButton() {

        dashBoardPage.Setting.click();
    }

    @Then("User Setting screen should open")
    public void userSettingScreenShouldOpen() throws InterruptedException {
        Thread.sleep(2000);
        String ExpectedTitleSettingScreen = "Admin | User setting";
        String ActualTitleSettingScreen = driver.getTitle();
        Assert.assertEquals(ExpectedTitleSettingScreen, ActualTitleSettingScreen);
    }

    @And("User clicks on Logout button")
    public void userClicksOnLogoutButton() {

        dashBoardPage.Logout.click();
    }

    @Then("User is Logged out of KareHealth Application")
    public void userIsLoggedOutOfKareHealthApplication() throws InterruptedException {
        Thread.sleep(2000);
        String ExpectedTitle = "Admin | Login";
        String ActualTitle = driver.getTitle();
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }

    @When("User provides invalid credential")
    public void userProvidesInvalidCredential() {
        loginPage.UserName.sendKeys("admin");
        loginPage.Password.sendKeys("admin123");
    }

    @Then("Credential do not match message is displayed")
    public void credentialDoNotMatchMessageIsDisplayed() {
        loginPage.LoginButton.click();
        loginPage.InvalidCredMessage.getText().compareTo("These credentials do not match our records.");
        System.out.println(loginPage.InvalidCredMessage);
    }

    @When("User Clicks on Cancelation Reasons link")
    public void userClicksOnCancelationReasonsLink() {

        orderManagementPage.CancelReasonLink.click();
    }

    @Then("Cancelation Reasons List screen should open")
    public void cancelationReasonsListScreenShouldOpen() {
        String ExpectCancelReasonTitle = "Admin | Cancelation Reasons";
        String ActCancelReasonTitle = driver.getTitle();
        Assert.assertEquals(ExpectCancelReasonTitle, ActCancelReasonTitle);
    }
}
