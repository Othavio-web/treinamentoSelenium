package TesteCases;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Framework.TestBase;
import Framework.Utils.FileOperation;
import Tasks.CheckOutTask;
import Tasks.FinishTask;
import Tasks.LoginTask;
import Tasks.ProdutoTask;

public class RealizarCompraComSucessoPropertiesTeste extends TestBase{
    private WebDriver driver = getDriverManager();
    LoginTask loginTask = new LoginTask(driver);
    ProdutoTask produtoTask = new ProdutoTask(driver);
    CheckOutTask checkOutTask = new CheckOutTask(driver);
    FinishTask finishTask = new FinishTask(driver);
    
    @Test
    public void realizarCompra() {
        /*String user = FileOperation.getProperties("user").getProperty("user");
        String password = FileOperation.getProperties("user").getProperty("password");
        loginTask.efetuarLoginParametrizado(user, password);*/
        loginTask.efetuarLoginProperties();
        produtoTask.selecionarProduto();
        checkOutTask.preencherForm2();
        finishTask.finalizaCompra();
    }
}
