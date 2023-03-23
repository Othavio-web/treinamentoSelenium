package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProdutoPage {
    private WebDriver driver;

    public ProdutoPage(WebDriver driver) {
        super();
        this.driver = driver;
    }
    public WebElement getProductLink() {
        return driver.findElement(By.id("item_4_title_link"));
    }
    public WebElement getAddCartLink() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }
    public WebElement getCartButton() {
        //return driver.findElement(By.class("shopping_cart_link")); 
        return driver.findElement(By.id("shopping_cart_badge"));
    }
}
