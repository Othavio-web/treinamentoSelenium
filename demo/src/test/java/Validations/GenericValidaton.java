package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import PageObjects.GerericPage;

public class GenericValidaton {
    private WebDriver driver;
    private GerericPage genericPage;
    
    public GenericValidaton(WebDriver driver) {
        this.driver = driver;
        genericPage= new GerericPage(this.driver);
    }
    /*public void validationPageProducts() {
        String label = genericPage.getHomeTextSpan().getText();
        Assertions.assertEquals("Products", label);
    }*/
    public void validationPages(String texto) {
        Assertions.assertEquals(texto, genericPage.getHomeTextSpan().getText());
    }
    public void validationProduto() {
        Assertions.assertTrue(genericPage.getNomeproductLabel().isDisplayed());
    }
}
