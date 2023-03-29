package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import PageObjects.FinishPage;
import junit.framework.Assert;

public class FinishValidation {
    private WebDriver driver;
    private FinishPage finishPage;

    
    public FinishValidation(WebDriver driver) {
        this.driver = driver;
        finishPage = new FinishPage(this.driver);
             
    }

    
    public void valitationMensageCompra() {
       Assertions.assertEquals("Thank you for your order!", finishPage.getFinishTextLabel().getText());
    }

    
}
