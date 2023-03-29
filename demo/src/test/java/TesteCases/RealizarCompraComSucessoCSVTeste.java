package TesteCases;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;

import Framework.TestBase;
import Tasks.CheckOutTask;
import Tasks.FinishTask;
import Tasks.LoginTask;
import Tasks.ProdutoTask;

public class RealizarCompraComSucessoCSVTeste extends TestBase{
    private WebDriver driver = getDriverManager();
    LoginTask loginTask = new LoginTask(driver);
    ProdutoTask produtoTask = new ProdutoTask(driver);
    CheckOutTask checkOutTask = new CheckOutTask(driver);
    FinishTask finishTask = new FinishTask(driver);
    
    @ParameterizedTest
    @CsvFileSource(resources = "/CSV/user.csv", numLinesToSkip = 1)
    public void realizarCompra(String user, String password) {
        loginTask.efetuarLoginParametrizado(user, password);
        produtoTask.selecionarProduto();
        checkOutTask.preencherForm();
        finishTask.finalizaCompra();
    }
}
