package com.yourlog.action;

import org.openqa.selenium.WebDriver;
import com.yourlog.components.PageObject;
import com.yourlog.components.YourLogDressesComponent;

public class YourLogDressesAction extends PageObject {

	
	public YourLogDressesAction(WebDriver driver) {
		super(driver);
		
	}
	YourLogDressesComponent yourLogDressesComponent;
	public String precoProdutoPopUp;
	
	public void selecionar_protudo1 () {	
		yourLogDressesComponent = new YourLogDressesComponent(driver);	
		yourLogDressesComponent.card_produto1.click();
	}

	public void clicar_botao_addtocart1 () throws InterruptedException {	
		yourLogDressesComponent = new YourLogDressesComponent(driver);	
		yourLogDressesComponent.botao_addtocart1.click();
		Thread.sleep(2000);
	}
	
	public void selecionar_protudo2 () {	
		yourLogDressesComponent = new YourLogDressesComponent(driver);	
		yourLogDressesComponent.card_produto2.click();		
	}
	
	public void clicar_botao_addtocart2 () throws InterruptedException {
		yourLogDressesComponent = new YourLogDressesComponent(driver);	
		yourLogDressesComponent.botao_addtocart2.click();
		Thread.sleep(2000);
	}
	
	public void clicar_botao_continueshopping () {
		yourLogDressesComponent = new YourLogDressesComponent(driver);	
		yourLogDressesComponent.botao_continueshopping.click();
	}
	
	public void valor_produtopopup(){
		yourLogDressesComponent = new YourLogDressesComponent(driver);	
		precoProdutoPopUp = yourLogDressesComponent.valorTotal_produtopopup.getAttribute("innerText");	
	}
	
	
}
