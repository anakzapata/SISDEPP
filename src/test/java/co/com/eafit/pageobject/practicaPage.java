package co.com.eafit.pageobject;



import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

@DefaultUrl("http://tapp.eafit.edu.co/sisdepp/")
public class practicaPage extends PageObject {

	@FindBy (name= "login")
	public WebElementFacade txtUsuario;
	
	@FindBy (name= "clave")
	public WebElementFacade txtPasword;
	
	@FindBy (xpath= "//*[@id=\"entrar\"]/td/div/input")
	public WebElementFacade btnSingIn;
	
	
	
	@FindBy (linkText= "ADMINISTRADOR")
	public WebElementFacade linkAdmin;
	
	
	@FindBy (css= "img[alt='Administracion']")
    public WebElementFacade lbtitulo;
	
	@FindBy (xpath= "//a[@href='/sisdepp/practica/index.do']")
    public WebElementFacade lblMenuPractica;
	
	@FindBy  (xpath= "//a[@href='/sisdepp/practica/mentores/mentor-select.do']")
	public WebElementFacade linkActualizacionDatosBasicos;
	
	
	@FindBy (className= "titulo")
	public WebElementFacade mensaje;
	
	@FindBy (className= "subtitulo")
	public WebElementFacade mensajeSubti;
	
	
	@FindBy  (xpath= "//a[@href='/sisdepp/prepractica/vinculacion/cargarPaginaVinculacionesReporte.do']")
	public WebElementFacade linkReporteVinculacion;
	
	@FindBy  (xpath= "//a[@href='/sisdepp/realizarEvaluacion.do']")
	public WebElementFacade linkRealizarEvaluacion;
	
	@FindBy  (xpath= "//a[@href='/sisdepp/practica/mentores/cargarFormularioListaMentores.do']")
	public WebElementFacade linkAdminMentores;
	
	@FindBy (linkText= "Crear grupo")
	public WebElementFacade linkCrearGrupo;
	
	@FindBy (xpath="//a[@href='/sisdepp/practica/grupos/cargarFormularioConsultaGrupos.do']")
	public WebElementFacade linkConsutarGrupo;
	
	@FindBy (linkText= "Correspondencia")
	public WebElementFacade linkCorrespondencia;
	
	@FindBy (linkText= "Correspondencia Jefes")
	public WebElementFacade linkcorrespondenciaJefes;
	
	@FindBy (linkText= "Correspondencia Mentores")
	public WebElementFacade linkcorrespondenciaMentores;
	
	@FindBy (linkText= "Consultar estudiantes")
	public WebElementFacade linkConsultarEstudiante;
	
	public void login(String user, String pass) {
		getDriver().switchTo().frame(0);
		txtUsuario.sendKeys(user);
		txtPasword.sendKeys(pass);
		btnSingIn.click();
	}

	public void seleccionarRol() {	
		
		
		linkAdmin.click();
		
		
	}

	
	

	public void selecionarPractica() throws InterruptedException {
		
		boolean test2=lblMenuPractica.isDisplayed();
		if(test2) {
			lblMenuPractica.click();
		}
		
	}
	
	

	public void selecionaActualizacionesBasicas() throws InterruptedException {
		
		linkActualizacionDatosBasicos.click();
		
	}

	public void mostrarMensaje(String msjP){
		   String strMensajeC=mensaje.getText();
	        assertThat(strMensajeC, containsString(msjP));
		
	}

	public void clickReporteVincu() {
		linkReporteVinculacion.click();
		
	}

	public void clickRealEv() {
		linkRealizarEvaluacion.click();
		
	}

	public void clickAdmMent() {
		linkAdminMentores.click();
		
	}

	public void clickCrearGr() {
		linkCrearGrupo.click();
		
	}

	public void consultarGrupo() {
		linkConsutarGrupo.click();
		
	}

	public void consultarCorrespondecia() {
		linkCorrespondencia.click();
	}

	public void correspondenciaJefes() {
		linkcorrespondenciaJefes.click();
		
	}

	public void mostrarMensajeSubt(String msjCorrJefes) {
		String strMensajeSubt=mensajeSubti.getText();
        assertThat(strMensajeSubt, containsString(msjCorrJefes));
		
	}

	public void consultarCorrespondenciaMentores() {
		linkcorrespondenciaMentores.click();
		
	}

	public void ConsultarEstudiante() {
		linkConsultarEstudiante.click();
		
	}

	

	
	
}
