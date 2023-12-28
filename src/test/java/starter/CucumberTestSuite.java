package starter;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import co.com.alianza.navigation.BasePage;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
/**
 * Clase principal para lanzar todas las pruebas
 * @author jetorrese
 */

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"co.com.alianza.stepdefinitions","co.com.alianza.hooks"},
    tags = "@ROL_DIRECTOR",
    		
    plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
    		"json:target/cucumber-reports.json" } 
)
public class CucumberTestSuite {
	@AfterClass
	public static void clearDriver(){
		BasePage.closeBrowser();
	}
}
