package Framework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import Framework.Brouser.DriverManager;
import Framework.Brouser.TypeBrowser;
import Framework.Utils.FileOperation;

public class TestBase extends DriverManager{
    private static WebDriver driver;
    private static String url = FileOperation.getProperties("url").getProperty("index");
    
    public static WebDriver getDriverManager() {
        driver = getDriver(TypeBrowser.CHROME);
        return driver;
    }
    @BeforeEach
    public void setup() {
        getDriverManager().get(url);
    }
    @AfterEach
    public void finish() {
        quitDriver();
    }
}
