package TesteCases;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Framework.TestBase;
import Tasks.LoginTask;
import Tasks.ProdutoTask;

public class RealizarCompraComSucessoTeste extends TestBase{
    private WebDriver driver = getDriverManager();
    LoginTask loginTask = new LoginTask(driver);
    ProdutoTask produtoTask = new ProdutoTask(driver);
    
    @Test
    public void realizarCompra() {
        loginTask.efetuarLogin();
        produtoTask.selecionarProduto();
    }
}
