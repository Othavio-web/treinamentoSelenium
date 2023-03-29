package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.CartPage;
import PageObjects.ProdutoPage;
import Validations.GenericValidaton;

public class ProdutoTask {
    private WebDriver driver;
    private ProdutoPage produtoPage;
    private GenericValidaton genericValidation;
    private CartPage cartPage;

    public ProdutoTask(WebDriver driver) {
        this.driver = driver;
        this.produtoPage = new ProdutoPage(this.driver);
        this.genericValidation = new GenericValidaton(this.driver);
        this.cartPage = new CartPage(this.driver);        
    }
    public void selecionarProduto() {
        genericValidation.validationPages("Products");
        produtoPage.getProductLink().click();
        produtoPage.getAddCartLink().click();
        produtoPage.getCartButton().click();
        genericValidation.validationPages("Your Cart");
        genericValidation.validationProduto();
        cartPage.getButtoncheckout().click();
    }    
}
