package co.com.eafit.steps;

import co.com.eafit.pageobject.practicaPage;
import net.thucydides.core.annotations.Step;


public class practicaStep {

	
	
	practicaPage practica;
	
	@Step
	public void Abrirpagina() {
		practica.open();	
	}
	
	
	public void IngresarCredenciales(String user, String pass) {
		practica.login(user, pass);	
	}
	
	
	public void seleccionarRol() {
		practica.seleccionarRol();		
	}
	
	
	
	public void seleccionarMenuPractica() throws InterruptedException {
		practica.selecionarPractica();
		
	}
	
	
	
	
	public void clickActualizacionBasicos() throws InterruptedException {
		practica.selecionaActualizacionesBasicas();
		
	}
	
	
	public void muestraMensaje(String msjP)  {
		
		practica.mostrarMensaje(msjP);
	}


	public void clickReporte() {
		practica.clickReporteVincu();
		
	}



	public void clickRealiEva() {
		practica.clickRealEv();
		
	}


	public void clickAdminMent() {
		practica.clickAdmMent();
		
	}


	public void clickCrearGrupo() {
		practica.clickCrearGr();
		
	}


	public void clickConsultarGrupo() {
		
		practica.consultarGrupo();
	}


	public void correspondencia() {
		practica.consultarCorrespondecia();
	}


	public void correspondenciaJefes() {
		practica.correspondenciaJefes();
		
	}


	public void mostrarMensjeSubt(String msjCorrJefes) {
		
		practica.mostrarMensajeSubt(msjCorrJefes);
	}


	public void consultarCorrespondenciaMentores() {
		
		practica.consultarCorrespondenciaMentores();
	}


	public void ConsultarEstudiantes() {
		practica.ConsultarEstudiante();
		
	}




	

	

	
	
	


	
}
