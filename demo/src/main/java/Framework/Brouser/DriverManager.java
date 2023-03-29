package Framework.Brouser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
    private static WebDriver driver;
    
    private static WebDriver getManagerDriver(TypeBrowser type) {
        switch(type) {
        case CHROME:
            WebDriverManager.chromedriver().proxy("https://nswg.corp.banrisul.com.br:9090").setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximixed");
            chromeOptions.addArguments("--incognito");
            chromeOptions.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(chromeOptions);
            break;
        case EDGE:
            WebDriverManager.edgedriver().proxy("https://nswg.corp.banrisul.com.br:9090").setup();
            EdgeOptions EdgeOption = new EdgeOptions();
            EdgeOption.addArguments("--start-maximixed");
            EdgeOption.addArguments("--incognito");
            driver = new EdgeDriver(EdgeOption);
            break;
        case FIREFOX:
            WebDriverManager.firefoxdriver().proxy("https://nswg.corp.banrisul.com.br:9090").setup();
            driver = new FirefoxDriver();
            break;
        case HEADLESS:
            WebDriverManager.chromedriver().proxy("https://nswg.corp.banrisul.com.br:9090").setup();
            ChromeOptions headlessOptions = new ChromeOptions();
            headlessOptions.addArguments("--headless");
            headlessOptions.addArguments("--window-size(1366,768)");
            driver = new ChromeDriver(headlessOptions);
            
        }
        return driver;
    }
    public static WebDriver getDriver(TypeBrowser type) {
        if(driver==null) {
            driver = getManagerDriver(type);
            
        }
        return driver;
    }
    public static void quitDriver() {
        if(driver!=null) {
            driver.quit();
            driver = null;
        }
    }
}
