package co.com.eafit.steps;

import co.com.eafit.pageobject.InformesSideppPage;

public class InformesSisdeppStep {
	
	InformesSideppPage informesSideppPage;

	public void abrirMenu(String imgMenu) {
		informesSideppPage.abrirMenu(imgMenu);		
	}

	public void abrirOpcion(String linkOpcion) {
		informesSideppPage.abrirOpcion(linkOpcion);		
	}

	public void verificarTitulo(String pageTitulo) {
		informesSideppPage.verificarTitulo(pageTitulo);		
	}

}
