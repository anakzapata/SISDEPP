package co.com.eafit.definitions;

import co.com.eafit.steps.LoginSisdeppStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDefinicion {
	
	@Steps
	LoginSisdeppStep loginSisdepSteps;
	
	@Given("^que un administrador quiere ingresar a SISDEPP$")
	public void queUnAdministradorQuiereIngresarASISDEPP() throws Exception {
	  
		loginSisdepSteps.Abrirpagina();
	}


	@When("^el ingresa usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void elIngresaUsuarioYClave(String user, String pass) throws Exception {
		loginSisdepSteps.IngresarCredenciales(user, pass);
	
	}

	@When("^selecciona el rol Administrador$")
	public void seleccionaElRolAdministrador() throws Exception {
		
		loginSisdepSteps.seleccionarRol();
	  
	}

	@Then("^el muestra en pantalla el menú \"([^\"]*)\"$")
	public void elMuestraEnPantallaElMenú(String msj) throws Exception {
	   
		loginSisdepSteps.MostrarMensaje(msj);
		
	}

	
	
	
	
@Given("^que un administrador quiere verificar el menú Prepráctica$")
public void queUnAdministradorQuiereVerificarElMenúPrepráctica() throws Exception {
	loginSisdepSteps.IngresarMenPrep();
  
}

@When("^selecciona la opción Carga de estudiantes$")
public void seleccionaLaOpciónCargaDeEstudiantes() throws Exception {
	loginSisdepSteps.SeleccionarCargaEst();
  
}
@When("^selecciona la opción Carga manual$")
public void seleccionaLaOpciónCargaManual() throws Exception {
	loginSisdepSteps.SeleccionarCargaM();
}


@Then("^el ve en pantalla el mensaje \"([^\"]*)\"$")
public void elVeEnPantallaElMensaje(String MenCargMan) throws Exception {
		
		loginSisdepSteps.VeMensajeCarga(MenCargMan);
	}






@Given("^que un administrador quiere verificar el menú Agenda$")
public void queUnAdministradorQuiereVerificarElMenúAgenda() throws Exception {
	loginSisdepSteps.IngresarMenPrep();
}


@When("^el selecciona la opción Asesores$")
public void elSeleccionaLaOpciónAsesores() throws Exception {
	loginSisdepSteps.IngresarMenAsesores();
}

@When("^selecciona la opción Agenda$")
public void seleccionaLaOpciónAgenda() throws Exception {
	loginSisdepSteps.IngresarMenAgen();

}

@Then("^el ve en pantalla el mensaje agenda \"([^\"]*)\"$")
public void elVeEnPantallaElMensajeAgenda(String MenAgenda) throws Exception {
	loginSisdepSteps.VemensajeAgenda(MenAgenda);

}
}
