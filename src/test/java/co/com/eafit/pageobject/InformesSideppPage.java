package co.com.eafit.pageobject;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import net.serenitybdd.core.annotations.findby.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://tapp.eafit.edu.co/sisdepp/")
public class InformesSideppPage extends PageObject{
	
	public WebElementFacade lbTMenu;
	
	public WebElementFacade lbOpcion;
	
	public WebElementFacade lbTitulo;

	public void abrirMenu(String imgMenu) {
		//lbTMenu.findBy("img[alt='"+imgMenu+"']");
		lbTMenu.find(By.xpath(imgMenu));
		//lbTMenu.findBy(By.xpath(imgMenu));
		//lbTMenu.findBy(imgMenu);
		//lbTMenu.findBy("/html/body/html:html/table[2]/tbody/tr/td/a[5]/img");
		//lbTMenu.click();
	}

	public void abrirOpcion(String linkOpcion) {
		lbOpcion.findElement(By.linkText(linkOpcion));
	}

	public void verificarTitulo(String pageTitulo) {
		lbTitulo.findElement(By.className("titulo"));
		String strMensajeA = lbTitulo.getText();
		assertThat(strMensajeA, containsString(pageTitulo));
	}
	
}
