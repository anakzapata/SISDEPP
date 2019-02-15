package co.com.eafit.pageobject;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.annotations.findby.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://tapp.eafit.edu.co/sisdepp/")
public class InformesSideppPage extends PageObject{
	
	@FindBy (xpath= "//a[@href='/sisdepp/prepractica/reportes/index.do']")
	public WebElementFacade lbTMenu;
	
	@FindBy (linkText= "Mosaico Asesor")
    public WebElementFacade lbMosaicoA;
	@FindBy (linkText= "Mosaico Mentor")
    public WebElementFacade lbMosaicoM;
	@FindBy (linkText= "Reporte de Vinculación")
    public WebElementFacade lbRepVin;
	@FindBy (linkText= "Candidatos Práctica")
    public WebElementFacade lbCanPra;
	@FindBy (linkText= "Idioma y Promedio")
    public WebElementFacade lbIdiPro;
	@FindBy (linkText= "Solicitudes")
    public WebElementFacade lbSolicitudes;
	@FindBy (linkText= "Entrevistas Estudiantes")
    public WebElementFacade lbEntrevistas;
	@FindBy (linkText= "Procesos")
    public WebElementFacade lbProcesos;
	@FindBy (linkText= "Consultar Evaluaciones DEPP")
    public WebElementFacade lbEvaluaciones;
	
	@FindBy (className = "titulo")
    public WebElementFacade lbTitulo;

	public void abrirMenu(String imgMenu) {
		//lbTMenu.findBy("img[alt='"+imgMenu+"']");
		//lbTMenu.find(By.xpath(imgMenu));
		//lbTMenu.findBy(By.xpath(imgMenu));
		//lbTMenu.findBy(imgMenu);
		//lbTMenu.findBy("/html/body/html:html/table[2]/tbody/tr/td/a[5]/img");
		//lbTMenu.click();
	}

	public void abrirOpcion(String linkOpcion) {
		switch (linkOpcion) {
			case "MA":	lbMosaicoA.click();
						break;
			case "MM":	lbMosaicoM.click();
						break;
			case "RP":	lbRepVin.click();
						break;
			case "CP":	lbCanPra.click();
						break;
			case "IP":	lbIdiPro.click();
						break;
			case "S":	lbSolicitudes.click();
						break;
			case "EE":	lbEntrevistas.click();
						break;
			case "P":	lbProcesos.click();
						break;
			case "CE":	lbEvaluaciones.click();
						break;
		}
	}

	public void verificarTitulo(String pageTitulo) {
		String strTitulo = lbTitulo.getText();
		assertEquals(strTitulo, pageTitulo);
		/*switch (pageTitulo) {
			case "Informe Mosaico":	assertEquals(strTitulo, pageTitulo);	
						break;
			case "Informe Mosaico Mentor":	lbMosaicoM.click();
						break;
			case "CONSULTAR ESTUDIANTES POR VINCULACIÓN":	lbRepVin.click();
						break;
			case "RESUMEN CANDIDATOS A PRÁCTICA POR CARRERA - PREPRÁCTICA":	lbCanPra.click();
						break;
			case "Estudiantes":	lbIdiPro.click();
						break;
			case "Solicitudes":	lbSolicitudes.click();
						break;
			case "ENTREVISTAS POR ESTUDIANTE":	lbEntrevistas.click();
						break;
			case "PROCESOS POR ESTUDIANTE":	lbProcesos.click();
						break;
			case "CE":	lbEvaluaciones.click();
						break;
	}*/
	}

	public void abrirMenuInf() {
		lbTMenu.click();		
	}
	
}
