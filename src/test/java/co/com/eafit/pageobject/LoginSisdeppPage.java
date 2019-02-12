package co.com.eafit.pageobject;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://tapp.eafit.edu.co/sisdepp/")
public class LoginSisdeppPage extends PageObject {

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
	
	@FindBy (css= "img[alt='Prepráctica']")
    public WebElementFacade lbTPrep;
	
	@FindBy (linkText= "Carga de Estudiantes")
    public WebElementFacade lbCargaEst;
	
	@FindBy (linkText= "Carga Manual")
    public WebElementFacade lbCargaEstM;
	
	@FindBy (className = "titulo")
    public WebElementFacade lbMensCar;
	
	
	public void login(String user, String pass) {
		getDriver().switchTo().frame(0);
		txtUsuario.sendKeys(user);
		txtPasword.sendKeys(pass);
		btnSingIn.click();
	}

	public void seleccionarRol() {	
		linkAdmin.click();
		}

	public void MostrarMensaje(String msj) {
		
		boolean test= lbtitulo.isDisplayed();
			if(test) { lbtitulo.click(); }
		
	}

	public void IngresarMenPrep() {
		lbTPrep.click();
		
	}

	public void SeleccionarCargaEst() {
		lbCargaEst.click();
		
	}

	public void SeleccionarCargaM() {
		lbCargaEstM.click();
		
	}

	public void VeMensajeCarga(String menCargMan) {
		String strMensajeC=lbMensCar.getText();
		assertThat(strMensajeC, containsString(menCargMan));
		
	}

	
	
	
}
