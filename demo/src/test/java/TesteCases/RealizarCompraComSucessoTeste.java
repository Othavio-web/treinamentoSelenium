package TesteCases;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Tasks.LoginTask;

public class RealizarCompraComSucessoTeste {
    private WebDriver driver;
    LoginTask loginTask = new LoginTask(driver);
    
    @Test
    public void realizarCompra() {
        loginTask.efetuarLogin();
    }
}
