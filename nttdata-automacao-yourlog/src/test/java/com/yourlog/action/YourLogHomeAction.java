package com.yourlog.action;

import org.openqa.selenium.WebDriver;

import com.yourlog.components.PageObject;
import com.yourlog.components.YourLogHomeComponent;

public class YourLogHomeAction extends PageObject {

	public YourLogHomeAction(WebDriver driver) {
		super(driver);
	}
	YourLogHomeComponent yourLogHomeComponent;
	public String precoProduto1;
	
	public void clicar_botao_singHome(){
		yourLogHomeComponent = new YourLogHomeComponent(driver);
		yourLogHomeComponent.botao_SingHome.click();
		
	}
	
	public void clicar_aba_dresses(){
		yourLogHomeComponent = new YourLogHomeComponent(driver);
		yourLogHomeComponent.aba_Dresses.click();
		
	}
	
	public void clicar_card_carrinho() throws InterruptedException{
		yourLogHomeComponent = new YourLogHomeComponent(driver);
		yourLogHomeComponent.card_carrinho.click();
		Thread.sleep(2000);
		
	}
	
	
}
