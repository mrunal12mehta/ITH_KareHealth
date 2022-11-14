import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources/AppFeature"},
        glue ={"MyStepdefs"},
        tags="@CancelationReason",
        plugin={"pretty", "html:target/destination.html"}
)

public class TestRunner {
    public static WebDriver driver;

    @BeforeClass

    public static void StartChromeBrowser()
    {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(Constants.url);
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void CloseChromeBrowser(){
       driver.close();
    }
}
