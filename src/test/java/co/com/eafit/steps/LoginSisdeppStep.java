package co.com.eafit.steps;

import co.com.eafit.pageobject.LoginSisdeppPage;
import net.thucydides.core.annotations.Step;



public class LoginSisdeppStep {

	
	LoginSisdeppPage loginSisdeppPage;
	@Step
	public void Abrirpagina() {
		loginSisdeppPage.open();	
	}
	@Step
	public void IngresarCredenciales(String user, String pass) throws Exception {
		loginSisdeppPage.login(user, pass);	
	}
	@Step
	public void seleccionarRol() throws Exception {
		loginSisdeppPage.seleccionarRol();		
	}
	@Step
	public void MostrarMensaje(String msj) {
		
		loginSisdeppPage.MostrarMensaje(msj);
	}
	@Step
	public void IngresarMenPrep() throws Exception {
		loginSisdeppPage.IngresarMenPrep();
		
	}
	@Step
	public void SeleccionarCargaEst() throws Exception {
		loginSisdeppPage.SeleccionarCargaEst();
		
	}
	
	@Step
	public void SeleccionarCargaM() {
		loginSisdeppPage.SeleccionarCargaM(); 
	}
	@Step
	public void VeMensajeCarga(String MenCargMan) {
		loginSisdeppPage.VeMensajeCarga(MenCargMan);		
	}
	@Step
	public void IngresarMenAgen() {
		loginSisdeppPage.IngresarMenAgen();		
	}

	
	@Step
	public void IngresarMenAsesores() {
		loginSisdeppPage.IngresarMenAsesores();
	}
	@Step
	public void VemensajeAgenda(String MenAgenda) {
		loginSisdeppPage.VemensajeAgenda(MenAgenda);
	}
	@Step
	public void IngresarMenModAse() {
		loginSisdeppPage.IngresarMenModAse();
		
	}
	@Step
	public void VemensajeAsesores(String menAsesores) {
		loginSisdeppPage.VemensajeAsesores(menAsesores);
		
	}
	@Step
	public void VerificarMen(String menBien) {
		loginSisdeppPage.VerificarMen(menBien) ;
		
	}


	

}
