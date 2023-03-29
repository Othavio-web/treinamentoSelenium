package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Brouser.Waits;

public class FinishPage {
    private WebDriver driver;
    private Waits wait;
    
    public FinishPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new Waits(this.driver);
    }

    public WebElement getFinishTextLabel() {
        return driver.findElement(By.className("complete-header"));
    }

    public WebElement getLogOutLink() {
        return driver.findElement(By.id("logout_sidebar_link"));
    }

    public WebElement getMenuLogOutButton() {
        return driver.findElement(By.id("react-burger-menu-btn"));
    }
    
    
}
