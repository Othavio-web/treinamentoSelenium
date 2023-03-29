package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
    private WebDriver driver;
    private String firstName;
    private String lastName;
    private String zipCode;
    
    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getFirstNameInput() {
        return driver.findElement(By.id("first-name"));
    }
    public WebElement getLastNameInput() {
        return driver.findElement(By.id("last-name"));
    }
    public WebElement getZipCodeInput() {
        return driver.findElement(By.id("postal-code"));
    }
    public WebElement getLogoText() {
        return driver.findElement(By.className("app_logo"));
    }
    public WebElement getContinueButton() {
        return driver.findElement(By.id("continue"));
    }
}
