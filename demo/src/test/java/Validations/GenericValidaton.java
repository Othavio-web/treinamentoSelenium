package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.GerericPage;
import Report.Report;
import Report.Screenshot;

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
        try {
            String label = genericPage.getHomeTextSpan().getText();
            Assertions.assertEquals(texto, genericPage.getHomeTextSpan().getText());
            Report.log(Status.PASS, "A pagina acessou corretamente", Screenshot.capturebase64(driver));
        } catch (Exception e) {
            Report.log(Status.PASS, e.getMessage(), Screenshot.capturebase64(driver));
        }
        
    }
    public void validationProduto() {
        try {
            Assertions.assertTrue(genericPage.getNomeproductLabel().isDisplayed());
            Report.log(Status.PASS, "o produto foi selecionado", Screenshot.capturebase64(driver));
        } catch (Exception e) {
            Report.log(Status.FAIL, e.getMessage(), Screenshot.capturebase64(driver));
        }
        
    }
}
