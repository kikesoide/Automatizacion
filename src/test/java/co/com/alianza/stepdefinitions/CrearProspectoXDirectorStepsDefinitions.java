package co.com.alianza.stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import co.com.alianza.dtos.ClNegociosDTO;
import co.com.alianza.navigation.BuscarNegocioProspectoPage;
import co.com.alianza.navigation.HomePage;
import co.com.alianza.navigation.NuevoProspectoPage;
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
public class CrearProspectoXDirectorStepsDefinitions {
    
    HomePage homePage = new HomePage();
	
    NuevoProspectoPage nP = new NuevoProspectoPage();
	
	//PestanasNegociosPage pestanasNeg = new PestanasNegociosPage();
	
	//PestanaOperacionPage pestanaOperacion = new PestanaOperacionPage();
    

    
    @When("usuario vaya a opcion CrearProspecto")
    public void irCrearProspecto() {
    	homePage.desplegarOpcionesMenuIzq(HomePage.MENU_PROS);
    	homePage.seleccionarOpcionMenu(HomePage.CREAR_PROSPECTO);
	}
	
    @And("usuario llena los campos {int} <clasComercial> <clasComercialSub> <estadoTipoCom> <nombrePros> <estadoSubTipoCom> <rolCom>  obligatorios")
	public void llenarCamposObligatorios(BigDecimal agenciaValue) {
    	ClNegociosDTO prospecto = new ClNegociosDTO();
    	prospecto.setNCodagencia(agenciaValue);
    	nP.llenarCampos(prospecto);
	}
	
	@Then("usuario crea un nuevo prospecto")
	public void crearProspecto() {
		String a = nP.guardarNuevoProspecto(NuevoProspectoPage.ID_GUARDAR);
		System.out.println(a);
		//assertTrue(a.contains(nCodNegocio.toString()));
	}
}
