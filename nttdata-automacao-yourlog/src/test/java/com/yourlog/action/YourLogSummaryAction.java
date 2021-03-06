package com.yourlog.action;

import org.openqa.selenium.WebDriver;
import com.yourlog.components.PageObject;
import com.yourlog.components.YourLogSummaryComponent;

public class YourLogSummaryAction extends PageObject {

	public YourLogSummaryAction(WebDriver driver) {
		super(driver);
	}
	
	YourLogSummaryComponent yourLogSummaryComponent;
	public String precoProduto1Carrinho;
	public String precoProduto2Carrinho; 
	
	public void valor_TotalCarrinho1(){
	yourLogSummaryComponent = new YourLogSummaryComponent(driver);
	precoProduto1Carrinho = yourLogSummaryComponent.valor_summary.getAttribute("innerText");
	}
	
	public void valor_TotalCarrinho2(){
		yourLogSummaryComponent = new YourLogSummaryComponent(driver);
		precoProduto2Carrinho = yourLogSummaryComponent.valor_summary.getAttribute("innerText");
		}
	
}
