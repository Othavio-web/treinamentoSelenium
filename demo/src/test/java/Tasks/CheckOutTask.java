package Tasks;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import Framework.Utils.FakersGeneretor;
import Framework.Utils.FileOperation;
import PageObjects.CheckOutPage;
import Validations.CheckOutValidation;
import Validations.GenericValidaton;

public class CheckOutTask {
    private WebDriver driver;
    private CheckOutPage checkOutPage;
    private GenericValidaton genericValidation;
    private FakersGeneretor fakers;
    private CheckOutValidation checkOutValidation;
    
    public CheckOutTask(WebDriver driver) {
        this.driver = driver;
        this.checkOutPage = new CheckOutPage(this.driver);
        this.genericValidation = new GenericValidaton(this.driver);
        this.fakers = new FakersGeneretor();
        checkOutValidation = new CheckOutValidation(this.driver);
    }
    public void preencherForm() {
        genericValidation.validationPages("Checkout: Your Information");
        checkOutPage.getFirstNameInput().sendKeys(fakers.getFirstName());
        checkOutPage.getLastNameInput().sendKeys(fakers.getLastName());
        checkOutPage.getZipCodeInput().sendKeys(fakers.getZipCode());
        checkOutValidation.validationForm();
        checkOutPage.getContinueButton().click();
    }
    public void preencherForm2() {
        String name=fakers.getFirstName();
        String lastName = fakers.getLastName();
        String zipCode =fakers.getZipCode();
        FileOperation.setProperties("form", "name", name);
        FileOperation.setProperties("form", "lastName", lastName);
        FileOperation.setProperties("form", "zipCode", zipCode);
        genericValidation.validationPages("Checkout: Your Information");
        checkOutPage.getFirstNameInput().sendKeys(name);
        checkOutPage.getLastNameInput().sendKeys(lastName);
        checkOutPage.getZipCodeInput().sendKeys(zipCode);
        checkOutValidation.validationsCamposForm();
        checkOutPage.getContinueButton().click();
    }
    
    
}
