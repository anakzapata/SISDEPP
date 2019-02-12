package co.com.eafit.steps;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import co.com.eafit.pageobject.LoginSisdeppPage;


public class LoginSisdeppStep {

	
	
	LoginSisdeppPage loginSisdeppPage;
	public void Abrirpagina() {
		loginSisdeppPage.open();	
	}

	public void IngresarCredenciales(String user, String pass) {
		loginSisdeppPage.login(user, pass);	
	}

	public void seleccionarRol() {
		loginSisdeppPage.seleccionarRol();		
	}

	public void MostrarMensaje(String msj) {
		
		loginSisdeppPage.MostrarMensaje(msj);
	}

	public void IngresarMenPrep() {
		loginSisdeppPage.IngresarMenPrep();
		
	}

	public void SeleccionarCargaEst() {
		loginSisdeppPage.SeleccionarCargaEst();
		
	}
	

	public void SeleccionarCargaM() {
		loginSisdeppPage.SeleccionarCargaM(); 
	}

	public void VeMensajeCarga(String MenCargMan) {
		loginSisdeppPage.VeMensajeCarga(MenCargMan);		
	}

	



	

	

	



	


	
}
