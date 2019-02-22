package co.com.eafit.steps;

import co.com.eafit.pageobject.EstudianteSisdeppPage;
import net.thucydides.core.annotations.Step;



public class EstudianteSisdeppStep {

	
	EstudianteSisdeppPage estudianteSisdeppPage;
	
	@Step
	public void Abrirpagina() {
		estudianteSisdeppPage.open();	
	}
	@Step
	public void IngresarCredenciales(String user, String pass) throws Exception {
		estudianteSisdeppPage.login(user, pass);	
	}

	public void IngresarHojasdeVida() {
		// TODO Auto-generated method stub
		estudianteSisdeppPage.seleccionarHojasdeVida();
	}

	public void IrDiligenciarHojaVida() {
		// TODO Auto-generated method stub
		estudianteSisdeppPage.DiligenciarHV();
	}

	public void VePantallaInformacionPersonal(String arg1) {
		// TODO Auto-generated method stub
		estudianteSisdeppPage.VePantallaInformacionPersonal(arg1);
	}

	public void iraAInformacionPersonal() {
		// TODO Auto-generated method stub
		estudianteSisdeppPage.seleccionarInformacionPersonal();
	}

	public void ActualizarInfoPersonal() throws Exception {
		// TODO Auto-generated method stub
		estudianteSisdeppPage.ActualizarHV();
	}

	public void VeRespuesta(String arg1) {
		// TODO Auto-generated method stub
		estudianteSisdeppPage.VePantallaInformacionPersonal(arg1);
	}

	public void irDiligenciarInfoAcademica() {
		// TODO Auto-generated method stub
		estudianteSisdeppPage.seleccionarInformacionAcademica();
	}

	public void VePantallaInformacionAcad(String arg1) {
		// TODO Auto-generated method stub
		estudianteSisdeppPage.VePantallaInformacionAcad(arg1);
	}

	public void irDiligenciarExperLaboral() {
		estudianteSisdeppPage.seleccionarExperienciaLaboral();
		
	}

	public void irDiligenciarFormacion() {
		// TODO Auto-generated method stub
		estudianteSisdeppPage.seleccionarFormacion();
	}

	public void irDiligenciarOtrasActividades() {
		estudianteSisdeppPage.seleccionarOtrasActividades();
		
	}

	public void irDiligenciarReferenciasPersonales() {
		estudianteSisdeppPage.seleccionarReferenciasPersonales();
		
	}	
	
	@Step
	public void IngresarMenPrep() throws Exception {
		estudianteSisdeppPage.IngresarMenPrep();
		
	}	

}