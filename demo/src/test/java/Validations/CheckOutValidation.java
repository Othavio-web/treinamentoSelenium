package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import Framework.Utils.FileOperation;
import PageObjects.CheckOutPage;

public class CheckOutValidation {
    private WebDriver driver;
    private CheckOutPage checkOutPage;
    
    public CheckOutValidation(WebDriver driver) {
        this.driver = driver;
        checkOutPage = new CheckOutPage(this.driver);
    }
    public void validationForm() {
        Assertions.assertFalse(checkOutPage.getFirstNameInput().getAttribute("value").equalsIgnoreCase(" "));
    }
    public void validationsCamposForm() {
        String name = FileOperation.getProperties("form").getProperty("name");
        String lastName = FileOperation.getProperties("form").getProperty("lastName");
        String zipCode = FileOperation.getProperties("form").getProperty("zip");
        Assertions.assertEquals(name, checkOutPage.getFirstNameInput().getAttribute("value"));
        Assertions.assertEquals(lastName, checkOutPage.getLastNameInput().getAttribute("value"));
        Assertions.assertEquals(zipCode, checkOutPage.getZipCodeInput().getAttribute("value"));
    }
}
