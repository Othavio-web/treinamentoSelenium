package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.LoginPage;

public class LoginTask {
    private WebDriver driver;
    private LoginPage loginPage;

    public LoginTask(WebDriver driver) {
        this.driver = driver;
        this.loginPage = new LoginPage(this.driver);
    }
    public void efetuarLogin() {
        loginPage.getUserNameInput().sendKeys("standard_user");
        loginPage.getPassword().sendKeys("secret_sauce");
        loginPage.getBotaoLogin().click();
    }
    
}
