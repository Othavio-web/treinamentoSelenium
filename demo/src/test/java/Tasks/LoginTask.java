package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Utils.FileOperation;
import PageObjects.LoginPage;
import Validations.LoginValidation;

public class LoginTask {
    private WebDriver driver;
    private LoginPage loginPage;
    private LoginValidation loginValidation;

    public LoginTask(WebDriver driver) {
        this.driver = driver;
        this.loginPage = new LoginPage(this.driver);
        loginValidation = new LoginValidation(this.driver);
    }
    public void efetuarLogin() {
        loginValidation.validationLoginPage();
        loginPage.getUserNameInput().sendKeys("standard_user");
        loginPage.getPassword().sendKeys("secret_sauce");
        loginPage.getBotaoLogin().click();
    }
    public void efetuarLoginParametrizado(String user, String password) {
        loginValidation.validationLoginPage();
        loginPage.getUserNameInput().sendKeys(user);
        loginPage.getPassword().sendKeys(password);
        loginPage.getBotaoLogin().click();
    }
    public void efetuarLoginProperties() {
        String user = FileOperation.getProperties("user").getProperty("user");
        String password = FileOperation.getProperties("user").getProperty("password");
        loginValidation.validationLoginPage();
        loginPage.getUserNameInput().sendKeys(user);
        loginPage.getPassword().sendKeys(password);
        loginPage.getBotaoLogin().click();
    }
}
