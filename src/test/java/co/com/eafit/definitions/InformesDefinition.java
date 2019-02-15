package co.com.eafit.definitions;

import co.com.eafit.steps.InformesSisdeppStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class InformesDefinition {
	
	@Steps
	InformesSisdeppStep informesSisdepp;
	
	@When("^hace clic en el menú \"([^\"]*)\"$")
	public void haceClicEnElMenú(String imgMenu) throws Exception {
		informesSisdepp.abrirMenu(imgMenu);
	}

	@When("^hace clic en la opción \"([^\"]*)\"$")
	public void haceClicEnLaOpción(String linkOpcion) throws Exception {
		informesSisdepp.abrirOpcion(linkOpcion);
	}

	@Then("^el usuario visuzaliza el título \"([^\"]*)\"$")
	public void elUsuarioVisuzalizaElTítulo(String pageTitulo) throws Exception {
		informesSisdepp.verificarTitulo(pageTitulo);
	}

}
