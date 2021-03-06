package com.yourlog.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.yourlog.action.YourLogDressesAction;

public class YourLogDressesComponent extends YourLogDressesAction {
	  
	public YourLogDressesComponent(WebDriver driver) {
		super(driver);
		}
	
	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]")
	public WebElement card_produto1;
	
	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[1]/span[1]")
	public WebElement botao_addtocart1;
	
	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]")
	public WebElement card_produto2;
			
	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/div[2]/a[1]/span[1]")
	public WebElement botao_addtocart2;
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/span[1]/span[1]")
	public WebElement botao_continueshopping;
	
	@FindBy(className = "ajax_block_cart_total")
	public WebElement valorTotal_produtopopup;	
	
	
}
