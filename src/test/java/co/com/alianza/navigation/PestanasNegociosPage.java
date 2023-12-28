package co.com.alianza.navigation;

/**
 * Seccion para buscar negocio o propsecto y la seccion de las pestañas
 * @author jetorrese
 *
 */
public class PestanasNegociosPage extends BasePage {
	public static final String pestanaOperacion = "OperacionTagA";
	public PestanasNegociosPage() {
		super(getDriver());
	}
	
	/**
	 * diligenciar formulario de busqueda con el ccodigo
	 * @param ccodigo
	 */
	public void buscarNegocio(Integer nCodNegocio) {
		setElement("inCodigoNegocio","nCodNegocio");
		clickElementById("btnBuscar2");
		clickElementById("btnEditar");		
	}
	
	/**
	 * evento para cambiar a la pestaña deseada
	 * @param locator
	 */
	public void cambiarPestana(String locator) {
		clickElementById(locator);
	}
}
