package co.com.eafit.pageobject;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://tapp.eafit.edu.co/sisdepp/")
public class EstudianteSisdeppPage extends PageObject {

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
	
	@FindBy (linkText= "Hojas de Vida")
    public WebElementFacade lbHojasVida;
	
	@FindBy (css= "a[href='javascript:cargarHojaVida()']")
    public WebElementFacade btnDiligenciarHV;
	
	@FindBy (css= "a[href='javascript:actualizar()']")
    public WebElementFacade btnActualizarHV;
	
	@FindBy (xpath= "/html/body/html:html/table[3]/tbody/tr/td[2]/form/table[7]/tbody/tr/td/a/img")
	public WebElementFacade btnActualizarIP;
	
	@FindBy (name= "hojaVidaEstudianteObj.tarjetaMilitar")
	public WebElementFacade txtTarjetaMil;
	@FindBy (className = "titulo")
    public WebElementFacade lbMensCar;
	
	@FindBy (linkText="Asesores")
    public WebElementFacade lbTAsesores;

	@FindBy (linkText= "Información Personal")
	public WebElementFacade linkInfoPersonal;
	
	@FindBy (linkText= "Información Académica")
	public WebElementFacade linkInfoAcademica;
	
	@FindBy (linkText= "Experiencia Laboral")
	public WebElementFacade linkExperLaboral;
	
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

	@FindBy (linkText= "Formación y Habilidades Complementarias")
	public WebElementFacade linkFormacion;
	
	@FindBy (linkText= "Otras Actividades")
	public WebElementFacade linkOtrasActividades;
	
	@FindBy (linkText= "Referencias Personales")
	public WebElementFacade linkReferenciasPersonales;
	
	public void login(String user, String pass) throws Exception {
		getDriver().switchTo().frame(0);
		txtUsuario.sendKeys(user);
		txtPasword.sendKeys(pass);
		btnSingIn.click();
	}

	public void seleccionarHojasdeVida() {
		lbHojasVida.click();
		
	}

	public void DiligenciarHV() {
		// TODO Auto-generated method stub
		btnDiligenciarHV.click();
	}
	
	public void ActualizarHV() throws Exception {
		//btnActualizarHV.click();
		
		txtTarjetaMil.sendKeys("12345");
		
		
		
	}	

	public void VePantallaInformacionPersonal(String arg1) {
		String strMensajeC=lbMensCar.getText();
		assertThat(strMensajeC, containsString(arg1));
		
	}

	public void seleccionarInformacionPersonal() {
		linkInfoPersonal.click();
	}

	public void seleccionarInformacionAcademica() {
		linkInfoAcademica.click();
	}

	public void VePantallaInformacionAcad(String arg1) {
		String strMensajeC=lbMensCar.getText();
		assertThat(strMensajeC, containsString(arg1));
		
	}

	public void seleccionarExperienciaLaboral() {
		linkExperLaboral.click();
	}

	public void seleccionarFormacion() {
		// TODO Auto-generated method stub
		linkFormacion.click();
	}

	public void seleccionarOtrasActividades() {
		linkOtrasActividades.click();
	}

	public void seleccionarReferenciasPersonales() {
		linkReferenciasPersonales.click();
		
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


	public void IngresarMenPrep() throws Exception {
		lbTPrep.click();
		
	}

	
	
	
}
