package com.yourlog.steps;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.yourlog.action.YourLogDressesAction;
import com.yourlog.action.YourLogHomeAction;
import com.yourlog.action.YourLogLoginAction;
import com.yourlog.action.YourLogSummaryAction;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import utils.DriverFactory;



public class ValorCartSummarySteps {
	
	private YourLogHomeAction yourLogHomeAction;
	private YourLogDressesAction yourLogDressesAction;
	private YourLogLoginAction yourLogLoginAction;
	private YourLogSummaryAction yourLogSummaryAction;
	
	//teste git
	@Before
	public void iniciar() throws Exception{		
		DriverFactory.getdriver().get("http://automationpractice.com/index.php");
		yourLogHomeAction = new YourLogHomeAction(DriverFactory.getdriver());
		yourLogDressesAction = new YourLogDressesAction(DriverFactory.getdriver());
		yourLogLoginAction = new YourLogLoginAction(DriverFactory.getdriver());
		yourLogSummaryAction = new YourLogSummaryAction(DriverFactory.getdriver());
		}	
	
	@After
	public void finalizar () {
		DriverFactory.fecharNavegador();
	
		}
	
	@Dado("que Daniel acessou a aplicacao yourLog com usuario {string} e senha {string}")
	public void que_daniel_acessou_a_aplicacao_your_log_com_usuario_e_senha(String usuario, String senha) {
		yourLogHomeAction.clicar_botao_singHome();
		yourLogLoginAction.preencher_campoUsuario(usuario);
		yourLogLoginAction.preencher_campoSenha(senha);
		yourLogLoginAction.clicar_botaoSingIn();
	  }

	@Quando("ele navegar ate o Dresses e incluir o produto1 no carrinho de compra")
	public void ele_navegar_ate_o_dresses_e_incluir_o_produto1_no_carrinho_de_compra() throws InterruptedException{
		yourLogHomeAction.clicar_aba_dresses();
		yourLogDressesAction.selecionar_protudo1();
		yourLogDressesAction.clicar_botao_addtocart1();
		yourLogDressesAction.valor_produtopopup();
		yourLogDressesAction.clicar_botao_continueshopping();
		yourLogHomeAction.clicar_card_carrinho();
	}

	@Então("ele verifica se o valor total do Summary está correto contendo o produto1")
	public void ele_verifica_se_o_valor_total_do_summary_está_correto_contendo_o_produto1() {
		yourLogSummaryAction.valor_TotalCarrinho1();
		assertEquals("Valor do Produto 1 Incorreto",yourLogDressesAction.precoProdutoPopUp, yourLogSummaryAction.precoProduto1Carrinho);
		System.out.println(yourLogDressesAction.precoProdutoPopUp);
		System.out.println(yourLogSummaryAction.precoProduto1Carrinho);
	  }
	

	@Quando("ele navegar ate o Dresses e incluir o produto2 no carrinho de compra")
	public void ele_navegar_ate_o_dresses_e_incluir_o_produto2_no_carrinho_de_compra() throws InterruptedException {
		yourLogHomeAction.clicar_aba_dresses();
		yourLogDressesAction.selecionar_protudo2();;
		yourLogDressesAction.clicar_botao_addtocart2();
		yourLogDressesAction.valor_produtopopup();
		yourLogDressesAction.clicar_botao_continueshopping();
		yourLogHomeAction.clicar_card_carrinho();
	  }

	@Então("ele verifica se o valor total do Summary está correto contendo o produto2")
	public void ele_verifica_se_o_valor_total_do_summary_está_correto_contendo_o_produto2() {
		yourLogSummaryAction.valor_TotalCarrinho2();
		assertEquals("Valor do Produto 2 Incorreto",yourLogDressesAction.precoProdutoPopUp, yourLogSummaryAction.precoProduto2Carrinho);
		System.out.println(yourLogDressesAction.precoProdutoPopUp);
		System.out.println(yourLogSummaryAction.precoProduto2Carrinho);
		}
	
}
	
	

	
	
	
	