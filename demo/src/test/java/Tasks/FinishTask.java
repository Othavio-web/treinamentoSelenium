package Tasks;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import Framework.Brouser.Waits;
import PageObjects.FinishPage;
import PageObjects.LoginPage;
import Validations.FinishValidation;
import Validations.LoginValidation;

public class FinishTask {
    private WebDriver driver;
    private FinishPage finishPage;
    private FinishValidation finishValidation;
    private LoginValidation loginValidation;
    private Waits wait;
    private LoginPage loginPage;
    
    public FinishTask(WebDriver driver) {
        this.driver = driver;
        finishPage = new FinishPage(this.driver);
        finishValidation = new FinishValidation(this.driver);
        loginValidation = new LoginValidation(this.driver);
        wait = new Waits(this.driver);
        loginPage = new LoginPage(this.driver);
    }
   public void validationMensageCompra() {
       Assertions.assertEquals("Thank you for order", finishPage.getFinishTextLabel().getText());
   }
   public void finalizaCompra() {
       finishValidation.valitationMensageCompra();
       finishPage.getMenuLogOutButton().click();
       finishPage.getLogOutLink().click();
       wait.loadElement(loginPage.getLogoText());
       loginValidation.validationLoginPage();
       
       
   }
}
