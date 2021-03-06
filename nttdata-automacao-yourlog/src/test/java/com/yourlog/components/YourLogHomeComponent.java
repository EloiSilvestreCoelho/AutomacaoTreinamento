package com.yourlog.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.yourlog.action.YourLogHomeAction;


public class YourLogHomeComponent extends YourLogHomeAction{

	public YourLogHomeComponent(WebDriver driver) {
		super(driver);
		
		}
	
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	public WebElement botao_SingHome;
	
	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[3]/div[1]/a[1]")
	public WebElement card_carrinho;
	
	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
	public WebElement aba_Dresses;

	
}
		

