package TesteCases;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.WebDriver;

import Framework.TestBase;
import Tasks.CheckOutTask;
import Tasks.FinishTask;
import Tasks.LoginTask;
import Tasks.ProdutoTask;

public class RealizarCompraComDataClass extends TestBase{
    private WebDriver driver = getDriverManager();
    LoginTask loginTask = new LoginTask(driver);
    ProdutoTask produtoTask = new ProdutoTask(driver);
    CheckOutTask checkOutTask = new CheckOutTask(driver);
    FinishTask finishTask = new FinishTask(driver);
    
    @ParameterizedTest
    @MethodSource("Framework.Utils.DataClass#loginTestData")
    public void realizarCompra(String user, String password) {
        loginTask.efetuarLoginParametrizado(user, password);
        produtoTask.selecionarProduto();
        checkOutTask.preencherForm();
        finishTask.finalizaCompra();
    }
}
