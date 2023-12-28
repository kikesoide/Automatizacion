package co.com.alianza.stepdefinitions;

import static org.junit.Assert.assertEquals;
import co.com.alianza.navigation.HomePage;
import co.com.alianza.navigation.LoginPage;
import co.com.alianza.utils.SessionStorage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
/**
 * Secuencia de pasos para autenticarse
 * @author jetorrese
 *
 */
public class LoginPageStepsDefinitions {
	public static final String ROL_COORDINADOR_APP = "3";
	

	LoginPage loginPage = new LoginPage();
	

	HomePage homePage = new HomePage();
	
    @Given("usuario esta en {string}")
    public void openApp(String url) {
    	loginPage.navigateToGrifus(url);
    }
    
    @When("usuario enter {string} as inUsuario")
    public void setUserName(String userName) {
    	loginPage.enterUserName(userName);
    }
        
	@And("usuario enter {string} as inPassword")
    public void setPassword(String pass) {
    	loginPage.enterPassword(pass);
    } 
	
	@Then("el {string} ha sido autenticado")
	public void usuarioHaSidoAutenticado(String usuario) {
    	loginPage.clickLogin();
		assertEquals(usuario,homePage.consultarUsuarioAutenticado());
	}
	
    @Given("es coordinador")
    public void esCoordinador() {    	
    	assertEquals(ROL_COORDINADOR_APP,SessionStorage.getItemFromLocalStorage("rolId",HomePage.getDriver()));
    }
    
}
