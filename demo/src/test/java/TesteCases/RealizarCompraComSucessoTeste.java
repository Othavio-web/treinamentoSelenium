package TesteCases;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Framework.TestBase;
import Report.Report;
import Report.ReportType;
import Tasks.CheckOutTask;
import Tasks.FinishTask;
import Tasks.LoginTask;
import Tasks.ProdutoTask;

public class RealizarCompraComSucessoTeste extends TestBase{
    private WebDriver driver = getDriverManager();
    LoginTask loginTask = new LoginTask(driver);
    ProdutoTask produtoTask = new ProdutoTask(driver);
    CheckOutTask checkOutTask = new CheckOutTask(driver);
    FinishTask finishTask = new FinishTask(driver);
    
    @Test
    public void realizarCompra(){
        try {
            Report.creatTask("RealizarCompra com Sucesso", ReportType.SINGLE);
            loginTask.efetuarLogin();
            produtoTask.selecionarProduto();
            checkOutTask.preencherForm();
            finishTask.finalizaCompra();
        } catch (Exception e) {
            //Report.log(Status.)
        }
    }
}
