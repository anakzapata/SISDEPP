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

	
	@Then("^el ve el mensaje \"([^\"]*)\"$")
	public void elVeElMensaje(String MenBien) throws Exception {
		loginSisdepSteps.VerificarMen(MenBien);
	}

	
	@Then("^el muestra en pantalla el menu \"([^\"]*)\"$")
	public void elMuestraEnPantallaElMenu(String msj) throws Exception {
	   
		loginSisdepSteps.MostrarMensaje(msj);
		
	}

	
	
	
	
@Given("^que un administrador quiere verificar el menu Prepractica$")
public void queUnAdministradorQuiereVerificarElMenuPrepractica() throws Exception {
	loginSisdepSteps.IngresarMenPrep();
  
}

@When("^selecciona la opcion Carga de estudiantes$")
public void seleccionaLaOpcionCargaDeEstudiantes() throws Exception {
	loginSisdepSteps.SeleccionarCargaEst();
  
}
@When("^selecciona la opcion Carga manual$")
public void seleccionaLaOpcionCargaManual() throws Exception {
	loginSisdepSteps.SeleccionarCargaM();
}


@Then("^el ve en pantalla el mensaje \"([^\"]*)\"$")
public void elVeEnPantallaElMensaje(String MenCargMan) throws Exception {
		
		loginSisdepSteps.VeMensajeCarga(MenCargMan);
	}


@Given("^que un administrador quiere verificar el menu Agenda$")
public void queUnAdministradorQuiereVerificarElMenuAgenda() throws Exception {
	loginSisdepSteps.IngresarMenPrep();
}


@When("^el selecciona la opcion Asesores$")
public void elSeleccionaLaOpcionAsesores() throws Exception {
	loginSisdepSteps.IngresarMenAsesores();
}

@When("^selecciona la opcion Agenda$")
public void seleccionaLaOpcionAgenda() throws Exception {
	loginSisdepSteps.IngresarMenAgen();

}

@Then("^el ve en pantalla el mensaje agenda \"([^\"]*)\"$")
public void elVeEnPantallaElMensajeAgenda(String MenAgenda) throws Exception {
	loginSisdepSteps.VemensajeAgenda(MenAgenda);

}


@Given("^que un administrador quiere verificar el menu Modificar Asesor$")
public void queUnAdministradorQuiereVerificarElMenuModificarAsesor() throws Exception {
	loginSisdepSteps.IngresarMenPrep();
}

@When("^selecciona la opcion Asesores$")
public void seleccionaLaOpcionAsesores() throws Exception {
	loginSisdepSteps.IngresarMenAsesores();
}
@When("^selecciona la opcion Modificar Asesor$")
public void seleccionaLaOpcionModificarAsesor() throws Exception {
	loginSisdepSteps.IngresarMenModAse();
}
@Then("^el ve en pantalla el mensaje Asesores \"([^\"]*)\"$")
public void elVeEnPantallaElMensajeAsesores(String MenAsesores) throws Exception {
	loginSisdepSteps.VemensajeAsesores(MenAsesores);

}



}
