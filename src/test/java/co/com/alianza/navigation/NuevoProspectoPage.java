package co.com.alianza.navigation;

import co.com.alianza.dtos.ClNegociosDTO;

/**
 * Seccion para buscar negocio o propsecto
 * @author jetorrese
 *
 */
public class NuevoProspectoPage extends BasePage {
	
	public static final String ID_GUARDAR = "conteModal";
	public NuevoProspectoPage() {
		super(getDriver());
	}
	
	/**
	 * llenar formulario de nuevo prospecto
	 * @param nCodNegocio
	 */
	public void llenarCampos(ClNegociosDTO prospecto) {
		selectFromDropDownByValue("select-agencias", prospecto.getNCodagencia().toString()); 
	}
	
	public String guardarNuevoProspecto(String guardar) {
		return "ahi vamos";
	}

}
