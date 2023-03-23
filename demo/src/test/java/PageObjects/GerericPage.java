package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GerericPage {
    private WebDriver driver;

    public GerericPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getHomeTextSpan() {
        return driver.findElement(By.xpath("//div[@id='header_container']/div[@class='header_secondary_conteiner']/span"));
    }
    public WebElement getNomeproductLabel() {
        return driver.findElement(By.className("inventory_item_name"));
    }
}
