package co.com.eafit.definitions;

import co.com.eafit.steps.PrepracticaStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PrePracticaDefinicion {
	
	@Steps
	PrepracticaStep prepracticaSteps;
	
	@Given("^que un administrador quiere ingresar a SISDEPP$")
	public void queUnAdministradorQuiereIngresarASISDEPP() throws Exception {
	  
		prepracticaSteps.Abrirpagina();
	}


	@When("^el ingresa usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void elIngresaUsuarioYClave(String user, String pass) throws Exception {
		prepracticaSteps.IngresarCredenciales(user, pass);
	
	}

	@When("^selecciona el rol Administrador$")
	public void seleccionaElRolAdministrador() throws Exception {
		
		prepracticaSteps.seleccionarRol();
	  
	}

	
	@Then("^el ve el mensaje \"([^\"]*)\"$")
	public void elVeElMensaje(String MenBien) throws Exception {
		prepracticaSteps.VerificarMen(MenBien);
	}

	
	@Then("^el muestra en pantalla el menu \"([^\"]*)\"$")
	public void elMuestraEnPantallaElMenu(String msj) throws Exception {
	   
		prepracticaSteps.MostrarMensaje(msj);
		
	}

	
	
	
	
@Given("^que un administrador quiere verificar el menu Prepractica$")
public void queUnAdministradorQuiereVerificarElMenuPrepractica() throws Exception {
	prepracticaSteps.IngresarMenPrep();
  
}

@When("^selecciona la opcion Carga de estudiantes$")
public void seleccionaLaOpcionCargaDeEstudiantes() throws Exception {
	prepracticaSteps.SeleccionarCargaEst();
  
}
@When("^selecciona la opcion Carga manual$")
public void seleccionaLaOpcionCargaManual() throws Exception {
	prepracticaSteps.SeleccionarCargaM();
}


@Then("^el ve en pantalla el mensaje \"([^\"]*)\"$")
public void elVeEnPantallaElMensaje(String MenCargMan) throws Exception {
		
		prepracticaSteps.VeMensajeCarga(MenCargMan);
	}


@Given("^que un administrador quiere verificar el menu Agenda$")
public void queUnAdministradorQuiereVerificarElMenuAgenda() throws Exception {
	prepracticaSteps.IngresarMenPrep();
}


@When("^el selecciona la opcion Asesores$")
public void elSeleccionaLaOpcionAsesores() throws Exception {
	prepracticaSteps.IngresarMenAsesores();
}

@When("^selecciona la opcion Agenda$")
public void seleccionaLaOpcionAgenda() throws Exception {
	prepracticaSteps.IngresarMenAgen();

}

@Then("^el ve en pantalla el mensaje agenda \"([^\"]*)\"$")
public void elVeEnPantallaElMensajeAgenda(String MenAgenda) throws Exception {
	prepracticaSteps.VemensajeAgenda(MenAgenda);

}


@Given("^que un administrador quiere verificar el menu Modificar Asesor$")
public void queUnAdministradorQuiereVerificarElMenuModificarAsesor() throws Exception {
	prepracticaSteps.IngresarMenPrep();
}

@When("^selecciona la opcion Asesores$")
public void seleccionaLaOpcionAsesores() throws Exception {
	prepracticaSteps.IngresarMenAsesores();
}
@When("^selecciona la opcion Modificar Asesor$")
public void seleccionaLaOpcionModificarAsesor() throws Exception {
	prepracticaSteps.IngresarMenModAse();
}
@Then("^el ve en pantalla el mensaje Asesores \"([^\"]*)\"$")
public void elVeEnPantallaElMensajeAsesores(String MenAsesores) throws Exception {
	prepracticaSteps.VemensajeAsesores(MenAsesores);

}

@Given("^que un administrador quiere verificar el menu Registrar Asesor$")
public void queUnAdministradorQuiereVerificarElMenúRegistrarAsesor() throws Exception {
	prepracticaSteps.IngresarMenPrep();

}


@When("^selecciona la opcion Registrar Asesor$")
public void seleccionaLaOpcionRegistrarAsesor() throws Exception {
	prepracticaSteps.IngresarMenRegAs();
}

@Then("^el ve en pantalla el mensaje Registrar Asesor \"([^\"]*)\"$")
public void elVeEnPantallaElMensajeRegistrarAsesor(String MenRegAse) throws Exception {
   prepracticaSteps.VemensajeRegAsesores(MenRegAse);
}


}
