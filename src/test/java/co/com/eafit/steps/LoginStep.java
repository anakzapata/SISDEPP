package co.com.eafit.steps;

import co.com.eafit.pageobject.Loginpage;
import net.thucydides.core.annotations.Step;

public class LoginStep {
		Loginpage loginPage;

	@Step
	public void Abrirpagina() {
		loginPage.open();
		}
	
	@Step
	public void IngresarCredenciales(String user, String pass) {
	  // loginPage.RealizarLogin(user, pass);
	   
		}

	@Step	
	public void verificarTitulo(String titulopagina) {
		loginPage.AccesoExitoso(titulopagina);
		
	}

}
