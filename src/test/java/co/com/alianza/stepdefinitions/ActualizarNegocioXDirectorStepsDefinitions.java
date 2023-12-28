package co.com.alianza.stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import co.com.alianza.navigation.BuscarNegocioProspectoPage;
import co.com.alianza.navigation.HomePage;
import co.com.alianza.navigation.PestanaOperacionPage;
import co.com.alianza.navigation.PestanasNegociosPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Pasos necesarios para actualizar un negocio como director
 * @author jetorrese
 *
 */
public class ActualizarNegocioXDirectorStepsDefinitions {
    
    HomePage homePage = new HomePage();
	
    BuscarNegocioProspectoPage buscarNP = new BuscarNegocioProspectoPage();
	
	PestanasNegociosPage pestanasNeg = new PestanasNegociosPage();
	
	PestanaOperacionPage pestanaOperacion = new PestanaOperacionPage();
    
    @Given("{string} esta en {string} page")
    public void verifyLogin(String userName, String url) {
    	homePage.navigateToGrifus(url);
    	assertEquals(userName,homePage.consultarUsuarioAutenticado());
    }
    
    @When("usuario vaya a opcion negocio")
    public void irBuscarNegocio() {
    	homePage.desplegarOpcionesMenuIzq(HomePage.MENU_NEG);
    	homePage.seleccionarOpcionMenu(HomePage.BUSCAR_NEG);
	}
	
    @And("Busque el {int}")
	public void buscarNegocio(Integer cCodigo) {
    	buscarNP.buscarNegocio(cCodigo);
	}
    
    @And("usuario va a la pestana operacion")
	public void irPestanaOperacion() {
    	pestanasNeg.cambiarPestana(PestanasNegociosPage.pestanaOperacion);
	}
    
	@And("usuario actualice el formulario")
	public void usuarioActualiceFormulario() {
		pestanaOperacion.llenarCampos();
	}
	
	@Then("usuario actualiza el {int} sin otro si")
	public void validarNoOtroSi(Integer nCodNegocio) {
		String a = pestanaOperacion.guardarFormDirector();
		System.out.println(a);
		assertTrue(a.contains(nCodNegocio.toString()));
	}
}
