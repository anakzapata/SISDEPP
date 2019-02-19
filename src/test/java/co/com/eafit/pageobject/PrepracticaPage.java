package co.com.eafit.pageobject;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;


import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://tapp.eafit.edu.co/sisdepp/")
public class PrepracticaPage extends PageObject {

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
	
	@FindBy (xpath= "//a[@href='/sisdepp/prepractica/index.do']")
    public WebElementFacade lbTPrep;
	
	@FindBy (linkText= "Carga de Estudiantes")
    public WebElementFacade lbCargaEst;
	
	@FindBy (linkText= "Carga Manual")
    public WebElementFacade lbCargaEstM;
	
	@FindBy (className = "titulo")
    public WebElementFacade lbMensCar;
	
	@FindBy (linkText="Asesores")
    public WebElementFacade lbTAsesores;
	
	@FindBy (linkText= "Agenda")
    public WebElementFacade lbTAgenda;
	
	@FindBy (className = "titulo")
    public WebElementFacade lbMensAgen;
	
	@FindBy (linkText="Modificar Asesor")
    public WebElementFacade lbModAsesor;
	
	@FindBy (className = "titulo")
    public WebElementFacade lbMensModAse;
	
	@FindBy (xpath = "// * [contains (text (), 'Bienvenido(a)')]")
    public WebElementFacade lbMensBien;
	
	@FindBy (linkText="Registrar Asesor")
    public WebElementFacade lbTRegAse;
	
	@FindBy (className = "titulo")
    public WebElementFacade lbMensRAse;
	
	public void login(String user, String pass) throws Exception {
		getDriver().switchTo().frame(0);
		txtUsuario.sendKeys(user);
		txtPasword.sendKeys(pass);
		btnSingIn.click();
	}

	public void seleccionarRol() throws Exception {	
		linkAdmin.click();
		}

	public void MostrarMensaje(String msj) {
		
		boolean test= lbtitulo.isDisplayed();
			if(test) { lbtitulo.click(); }
		
	}

	public void IngresarMenPrep() throws Exception {
		lbTPrep.click();
		
	}

	public void SeleccionarCargaEst() throws Exception {
		lbCargaEst.click();
		
	}

	public void SeleccionarCargaM() {
		lbCargaEstM.click();
		
	}

	public void VeMensajeCarga(String menCargMan) {
		String strMensajeC=lbMensCar.getText();
		assertThat(strMensajeC, containsString(menCargMan));
		
	}
	

	public void IngresarMenAsesores() {
		lbTAsesores.click();
	}

	

	public void IngresarMenAgen() {
		lbTAgenda.click();
		
	}

	public void VemensajeAgenda(String MenAgenda) {
		String strMensajeA=lbMensAgen.getText();
		assertThat(strMensajeA, containsString(MenAgenda));
		
	}

	public void IngresarMenModAse() {
		lbModAsesor.click();
		
	}

	public void VemensajeAsesores(String menAsesores) {
		String strMensajeMA=lbMensModAse.getText();
		assertThat(strMensajeMA, containsString(menAsesores));
		
	}

	public void VerificarMen(String menBien) {
		String strMensajeB=lbMensBien.getText();
		//assertThat(strMensajeB, containsString(menBien));
		assertEquals(strMensajeB, menBien);		
	}

	public void IngresarMenRegAs() {
		lbTRegAse.click();		
	}

	public void VemensajeRegAsesores(String menRegAse) {
		String strMensajeMR=lbMensRAse.getText();
		assertThat(strMensajeMR, containsString(menRegAse));
		
	}




	
	
	
}
