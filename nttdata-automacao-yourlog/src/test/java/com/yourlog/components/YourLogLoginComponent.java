package com.yourlog.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.yourlog.action.YourLogLoginAction;

public class YourLogLoginComponent extends YourLogLoginAction {
	
	public YourLogLoginComponent(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@id='email']")
	public WebElement campo_usuario;
	
	@FindBy(xpath = "//input[@id='passwd']")
	public WebElement campo_senha;
	
	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
	public WebElement botao_signin;
	
}
