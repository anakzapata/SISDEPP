package co.com.eafit;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
<<<<<<< HEAD
@CucumberOptions (features = "src/test/resources/features/Eafit/", 
				 //tags = "@Regresion, @Informes",
=======
@CucumberOptions (features = "src/test/resources/features/Eafit/",
>>>>>>> f2ff6f2424801217f8614209a6206cc4eee39f50
				  glue = "co.com.eafit.definitions",
				  snippets = SnippetType.CAMELCASE )
				  
public class RunnerTags {

}
