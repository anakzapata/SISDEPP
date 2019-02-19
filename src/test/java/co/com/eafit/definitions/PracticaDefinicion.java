package co.com.eafit.definitions;

import org.junit.Test;

import co.com.eafit.steps.practicaStep;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PracticaDefinicion {
	
	@Steps
	practicaStep practicaSt;
	
	@Given("^que un administrador quiere ingresar a SISDEPP y Probar el Modulo de Practica$")
	public void que_un_administrador_quiere_ingresar_a_SISDEPP_y_Probar_el_Modulo_de_Practica() throws Exception {
	  
		practicaSt.Abrirpagina();
	}

/*
	@When("^el ingresa usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void elIngresaUsuarioYClave(String user, String pass) throws Exception {
		practicaSt.IngresarCredenciales(user, pass);
	
	}
	
	
	@When("^selecciona el rol Administrador$")
	public void seleccionaElRolAdministrador() throws Exception {
		
		practicaSt.seleccionarRol();
	  
	} */
	
		@When("^el selecciona el menú Práctica$")
		public void elSeleccionaElMenúPráctica() throws Exception {
			practicaSt.seleccionarMenuPractica();
		}
		
	
		
	
		@When("^selecciona la opción Actualizacion Datos Basicos$")
		public void seleccionaLaOpciónActualizacionDatosBasicos() throws Exception {
			practicaSt.clickActualizacionBasicos();
		}
		
	
		
	
		@Then("^el ve en la aplicacion el mensaje \"([^\"]*)\"$")
		public void elVeEnLaAplicacionElMensaje(String msjPan) throws Exception {
			practicaSt.muestraMensaje(msjPan);
		}
		
		
		@When("^Escoje Reporte de Vinculacion$")
		public void escoje_Reporte_de_Vinculacion() throws Exception {
			practicaSt.clickReporte();
		}


		@Then("^el visualiza en pantalla el msj \"([^\"]*)\"$")
		public void el_visualiza_en_pantalla_el_msj(String menVi) throws Exception {
			practicaSt.muestraMensaje(menVi);
		}

		@When("^selecciona la opcion Realizar Evaluacion$")
		public void seleccionaLaOpcionRealizarEvaluacion() throws Exception {
			practicaSt.clickRealiEva();
		}

		@Then("^el visualiza en pantalla el mensaje \"([^\"]*)\"$")
		public void elVisualizaEnPantallaElMensaje(String msjEv) throws Exception {
			practicaSt.muestraMensaje(msjEv);
		}
		
		@When("^utiliza la opcion Administracion de Mentores$")
		public void utiliza_la_opcion_Administracion_de_Mentores() throws Exception {
			practicaSt.clickAdminMent();
		}


		@Then("^el visualiza en la app  el mensaje \"([^\"]*)\"$")
		public void el_visualiza_en_la_app_el_mensaje(String msjMento) throws Exception {
			practicaSt.muestraMensaje(msjMento);
		}
		
		@When("^selecciona la opcion crear grupo$")
		public void selecciona_la_opcion_crear_grupo() throws Exception {
			practicaSt.clickCrearGrupo();
		}


		@Then("^el usuario visualiza en pantalla el mensaje \"([^\"]*)\"$")
		public void el_usuario_visualiza_en_pantalla_el_mensaje(String msjGru) throws Exception {
			practicaSt.muestraMensaje(msjGru);
		}
		
		@When("^utiliza la opcion consultar grupo$")
		public void utiliza_la_opcion_consultar_grupo() throws Exception {
			practicaSt.clickConsultarGrupo();
		}


		@Then("^el Administrador visualiza en pantalla el mensaje \"([^\"]*)\"$")
		public void el_Administrador_visualiza_en_pantalla_el_mensaje(String msjConGru) throws Exception {
			practicaSt.muestraMensaje(msjConGru);
		}
		
		
		@When("^selecciona la opcion correspondencia$")
		public void selecciona_la_opcion_correspondencia() throws Exception {
			practicaSt.correspondencia();
		}


		@Then("^visualiza en pantalla el mensaje \"([^\"]*)\"$")
		public void visualiza_en_pantalla_el_mensaje(String msjCorr) throws Exception {
			practicaSt.muestraMensaje(msjCorr);
		}
		
		@When("^selecciona la opcion correspondencia jefes$")
		public void selecciona_la_opcion_correspondencia_jefes() throws Exception {
			practicaSt.correspondenciaJefes();
		}


		@Then("^se verifica en pantalla el mensaje \"([^\"]*)\"$")
		public void se_verifica_en_pantalla_el_mensaje(String msjCorrJefes) throws Exception {
			practicaSt.mostrarMensjeSubt(msjCorrJefes);
		}
		
		
		@When("^selecciona la opcion correspondencia mentores$")
		public void selecciona_la_opcion_correspondencia_mentores() throws Exception {
			practicaSt.consultarCorrespondenciaMentores();
		}


		@Then("^se realiza la verificacaion el mensaje \"([^\"]*)\"$")
		public void se_realiza_la_verificacaion_el_mensaje(String msjCorMento) throws Exception {
			practicaSt.mostrarMensjeSubt(msjCorMento);
		}
		
		
		@When("^click la opcion Consultar Estudiantes$")
		public void click_la_opcion_Consultar_Estudiantes() throws Exception {
			practicaSt.ConsultarEstudiantes();
		}


		@Then("^el verifica en pantalla el mensaje \"([^\"]*)\"$")
		public void el_verifica_en_pantalla_el_mensaje(String msjEstu) throws Exception {
			practicaSt.muestraMensaje(msjEstu);
		}

		
}
