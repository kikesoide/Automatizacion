package co.com.alianza.navigation;

/**
 * Seccion para buscar negocio o propsecto
 * @author jetorrese
 *
 */
public class BuscarNegocioProspectoPage extends BasePage {
	
	public BuscarNegocioProspectoPage() {
		super(getDriver());
	}
	
	/**
	 * Buscar un negocio por el cCodigo/ncodnegocio
	 * @param nCodNegocio
	 */
	public void buscarNegocio(Integer nCodNegocio) {
		setElement("inCodigoNegocio",nCodNegocio.toString());
		clickElementById("btnBuscar2");
		clickElementById("btnEditar");		
	}
	

}
