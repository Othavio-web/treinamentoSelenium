package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public WebElement getButtonContinueShopping() {
        return driver.findElement(By.id("continue-shopping"));
    }
    public WebElement getButtoncheckout() {
        return driver.findElement(By.id("checkout"));
    }
    public WebElement getButtonRemove() {
        return driver.findElement(By.className("btn btn_secondary btn_small cart_button"));
    }
}
