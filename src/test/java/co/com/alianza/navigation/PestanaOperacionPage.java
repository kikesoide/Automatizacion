package co.com.alianza.navigation;


/*
 * @autor: Jorge TOrres
 * Pestana dedicada al formulario de operaciones
 */
public class PestanaOperacionPage extends BasePage {
	
	public static String N_CODAGENCIA = "N_CODAGENCIA";
	public static String N_ESTADO2 = "N_ESTADO2";
	public static String CODIDO_SUPER = "CODIDO_SUPER";
	public static String N_CODPER = "N_CODPER";// dto
	public static String CLASIFICACION_SUPER_TIPO = "CLASIFICACION_SUPER_TIPO";// select 
	public static String CLASIFICACION_SUPER_SUBTIPO = "CLASIFICACION_SUPER_SUBTIPO";// select
	public static String labelRolComercial = "labelRolComercial";// select
	public static String C_NOMBRE = "C_NOMBRE";
	public static String N_CLASIFIC_COM_N1 = "N_CLASIFIC_COM_N1";// select
	public static String N_CLASIFIC_COM_N2 = "N_CLASIFIC_COM_N2"; //select
	public static String MODAL_ACEPTAR = "//div[@class='modal fade in']//div[@class='modal-dialog modal-']//div[@class='modal-content']//div[@class='modal-footer']//button[@id='btnAceptarModal']";
	public static String POPUP_OK =  "//div[@id='divSmallBoxes']";
	//public static String POPO_OK
	public PestanaOperacionPage() {
		super(getDriver());
	}

	/**
	 * llenar todos los campos de todos los acordeones de Operacion
	 */
	public void llenarCampos() {
		//construyendo		
	}
	
	/**
	 * evento de actualizar, seleccionar aceptar en el popup y validar el mensaje que contiene
	 * @return mensaje de popups
	 */
	public String guardarFormDirector() {		
		try {
			Thread.sleep(5000);
			clickElementById("conteModal");//wait
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}		
		clickElementByXPath(MODAL_ACEPTAR);
		try {
			Thread.sleep(8000);
			return textFromXpath(POPUP_OK);
		} catch (InterruptedException e) {			
			return "";
		}
		
	}	
}

 