package Tasks;

import org.openqa.selenium.WebDriver;

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
}
