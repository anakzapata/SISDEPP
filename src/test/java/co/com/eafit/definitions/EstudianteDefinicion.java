package co.com.eafit.definitions;

import co.com.eafit.steps.EstudianteSisdeppStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class EstudianteDefinicion {

	@Steps
	EstudianteSisdeppStep estudianteSisdepSteps;

	@Given("^que un estudiante quiere verificar el menu Prepractica$")
	public void queUnEstudianteQuiereVerificarElMenuPrepractica() throws Exception {
		estudianteSisdepSteps.IngresarMenPrep();
	}

	@When("^selecciona la opcion Hojas de Vida$")
	public void seleccionaLaOpcionHojasDeVida() throws Exception {
		estudianteSisdepSteps.IngresarHojasdeVida();
	}

	@When("^selecciona la opcion Diligenciar Hoja de Vida$")
	public void seleccionaLaOpcionDiligenciarHojaDeVida() throws Exception {
		estudianteSisdepSteps.IrDiligenciarHojaVida();
	}

	@Then("^se ve en pantalla el mensaje \"([^\"]*)\"$")
	public void seVeEnPantallaElMensaje(String arg1) throws Exception {
		estudianteSisdepSteps.VePantallaInformacionPersonal(arg1);
	}

	@Given("^que un estudiante quiere actualizar informacion personal de su hoja de vida$")
	public void queUnEstudianteQuiereActualizarInformacionPersonalDeSuHojaDeVida() throws Exception {
		estudianteSisdepSteps.iraAInformacionPersonal();

	}

	@When("^selecciona la opcion Informacion Academica$")
	public void seleccionaLaOpcionInformacionAcademica() throws Exception {
		estudianteSisdepSteps.irDiligenciarInfoAcademica();
	}

	@Then("^se ve en pantalla el mensaje de Info Acad \"([^\"]*)\"$")
	public void seVeEnPantallaElMensajeDeInfoAcad(String arg1) throws Exception {
		estudianteSisdepSteps.VePantallaInformacionAcad(arg1);
	}

	@When("^selecciona la opcion Experiencia Laboral$")
	public void seleccionaLaOpcionExperienciaLaboral() throws Exception {
		estudianteSisdepSteps.irDiligenciarExperLaboral();
	}

	@When("^selecciona la opcion Formacion y Habilidades Complementarias$")
	public void seleccionaLaOpcionFormacionYHabilidadesComplementarias() throws Exception {
		estudianteSisdepSteps.irDiligenciarFormacion();

	}

	@When("^selecciona la opcion Otras Actividades$")
	public void seleccionaLaOpcionOtrasActividades() throws Exception {
		estudianteSisdepSteps.irDiligenciarOtrasActividades();
	}

	@When("^selecciona la opcion Referencias Personales$")
	public void seleccionaLaOpcionReferenciasPersonales() throws Exception {
		estudianteSisdepSteps.irDiligenciarReferenciasPersonales();
	}

}
