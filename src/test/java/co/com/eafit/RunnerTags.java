package co.com.eafit;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
<<<<<<< HEAD
@CucumberOptions (features = "src/test/resources/features/Eafit/practica.feature",
=======

@CucumberOptions (features = "src/test/resources/features/Eafit/", 
				 //tags = "@Regresion, @Informes",
>>>>>>> 4cfb2c42ebd3300785404da37312bb940638d91a
				  glue = "co.com.eafit.definitions",
				  snippets = SnippetType.CAMELCASE )
				  
public class RunnerTags {

}
