package co.com.eafit.steps;

import co.com.eafit.pageobject.ContactenosEafitPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import static org.junit.Assert.assertThat;
import static  org.hamcrest.Matchers.*;

public class ContactenosEafitSteps {

	ContactenosEafitPage contactenosEafitPage;

	@Step
	public void abrirPaginaEafit() {
		contactenosEafitPage.open();
		
	}
	
	@Step
	public void diligenciarComentario(DataTable dtDatos) {
		contactenosEafitPage.nuevoComentario(dtDatos);

		
	}

	public void mensajecomentarioexitoso(String mensajeExitoso) {
		contactenosEafitPage.comentarioenviado(mensajeExitoso);		
	}
}
