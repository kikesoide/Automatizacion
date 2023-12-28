package co.com.alianza.navigation;

//import net.thucydides.core.annotations.DefaultUrl;

//@DefaultUrl("http://localhost:4200/#/home")
public class HomePage extends BasePage{// PageObject {
	
	public static String MENU_NEG ="//a[@title='Negocio']";
	public static String MENU_PROS ="	//a[@title='Prospecto']";
	public static String BUSCAR_NEG = "/cl-negocios/base/1";//"//a[@title='Para buscar negocios']";
	public static String CREAR_PROSPECTO = "/cl-negocios/registrarNegocio/2";
	
	public HomePage() {
		super(getDriver());
	}
	
	/**
	 * ir a la pagina principal
	 */
	public void navigateToGrifus(String url) {
		navigateTo(url);
	}
	
	/**
	 * validar usuario autenticado
	 * @return
	 */
	public String consultarUsuarioAutenticado() {
		return textFromElement("UserAutenticado");
	}
	
	/**
	 * accion de desplegar opciones de un item 
	 */
	public void desplegarOpcionesMenuIzq(String opcion) {
		clickElementByXPath(MENU_NEG);
	}
	
	/**
	 * accion de seleccionar la opción dentro del menu desplegado
	 */
	public void seleccionarOpcionMenu(String subopcion) {
		//clickElementByXPath(subopcion);
		clickElementById(subopcion);
	}

	

	

	

}
