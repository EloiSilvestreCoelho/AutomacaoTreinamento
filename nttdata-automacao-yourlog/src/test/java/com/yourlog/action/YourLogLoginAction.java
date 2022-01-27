package com.yourlog.action;

import org.openqa.selenium.WebDriver;
import com.yourlog.components.PageObject;
import com.yourlog.components.YourLogLoginComponent;

public class YourLogLoginAction extends PageObject {
	
	public YourLogLoginAction(WebDriver driver) {
		super(driver);
   }
	YourLogLoginComponent yourLogLoginComponent; 
			
	public void preencher_campoUsuario(String usuario){
		yourLogLoginComponent = new YourLogLoginComponent(driver);
		yourLogLoginComponent.campo_usuario.sendKeys(usuario);	
	}
	
	public void preencher_campoSenha(String senha){
		yourLogLoginComponent = new YourLogLoginComponent(driver);
		yourLogLoginComponent.campo_senha.sendKeys(senha);	
	}
	
	public void clicar_botaoSingIn(){
		yourLogLoginComponent = new YourLogLoginComponent(driver);
		yourLogLoginComponent.botao_signin.click();	
	}

}
