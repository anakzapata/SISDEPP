package co.com.eafit.pageobject;



import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.junit.Assert.assertThat;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


import static org.hamcrest.Matchers.containsString;

@DefaultUrl ("https://colorlib.com/polygon/metis/login.html")
public class Loginpage extends PageObject {
	@FindBy (xpath= "//*[@id=\"login\"]/form/input[1]")
	public WebElementFacade txtUsuario;
	
	@FindBy (xpath= "//*[@id=\"login\"]/form/input[2]")
	public WebElementFacade txtPasword;
	
	@FindBy (xpath= "//*[@id=\"login\"]/form/button")
	public WebElementFacade btnSingIn;
	
	@FindBy (id= "bootstrap-admin-template")
	public WebElementFacade lbtitulo;
	
	

	public void RealizarLogin(String user, String pass) throws Exception {
		
		txtUsuario.sendKeys(user);
		txtPasword.sendKeys(pass);
		btnSingIn.click();
			
	}



	public void AccesoExitoso(String titulopagina) {
	String strMensaje=lbtitulo.getText();
	assertThat(strMensaje, containsString(titulopagina));
	
	}
	
	 
	
	


}
