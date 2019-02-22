package co.com.eafit.steps;

import co.com.eafit.pageobject.PrepracticaPage;
import net.thucydides.core.annotations.Step;



public class PrepracticaStep {

	
	PrepracticaPage prepracticaPage;
	@Step
	public void Abrirpagina() {
		prepracticaPage.open();	
	}
	@Step
	public void IngresarCredenciales(String user, String pass) throws Exception {
		prepracticaPage.login(user, pass);	
	}
	@Step
	public void seleccionarRol() throws Exception {
		prepracticaPage.seleccionarRol();		
	}
	@Step
	public void MostrarMensaje(String msj) {
		
		prepracticaPage.MostrarMensaje(msj);
	}
	@Step
	public void IngresarMenPrep() throws Exception {
		prepracticaPage.IngresarMenPrep();
		
	}
	@Step
	public void SeleccionarCargaEst() throws Exception {
		prepracticaPage.SeleccionarCargaEst();
		
	}
	
	@Step
	public void SeleccionarCargaM() {
		prepracticaPage.SeleccionarCargaM(); 
	}
	@Step
	public void VeMensajeCarga(String MenCargMan) {
		prepracticaPage.VeMensajeCarga(MenCargMan);		
	}
	@Step
	public void IngresarMenAgen() {
		prepracticaPage.IngresarMenAgen();		
	}

	
	@Step
	public void IngresarMenAsesores() {
		prepracticaPage.IngresarMenAsesores();
	}
	@Step
	public void VemensajeAgenda(String MenAgenda) {
		prepracticaPage.VemensajeAgenda(MenAgenda);
	}
	@Step
	public void IngresarMenModAse() {
		prepracticaPage.IngresarMenModAse();
		
	}
	@Step
	public void VemensajeAsesores(String menAsesores) {
		prepracticaPage.VemensajeAsesores(menAsesores);
		
	}
	@Step
	public void VerificarMen(String menBien) {
		prepracticaPage.VerificarMen(menBien) ;
		
	}
	@Step
	public void IngresarMenRegAs() {
		prepracticaPage.IngresarMenRegAs();
		
	}
	@Step
	public void VemensajeRegAsesores(String MenRegAse) {
		prepracticaPage.VemensajeRegAsesores(MenRegAse);
	}


	

}
