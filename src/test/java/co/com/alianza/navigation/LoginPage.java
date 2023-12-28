package co.com.alianza.navigation;


public class LoginPage extends BasePage {
	
	public LoginPage(/*WebDriver driver*/) {
		super(getDriver());
	}

	public void navigateToGrifus(String url) {
		navigateTo(url);
	}
	
	/**
	 * ingresar usuario
	 * @param usuario
	 */
	public void enterUserName(String usuario) {
		setElement("inUsuario", usuario);
	}
	
	/**
	 * ingresar contraseña
	 * @param pass
	 */
	public void enterPassword(String pass) {
		setElement("inPassword", pass);
	}
	
	/**
	 * autenticar
	 */
	public void clickLogin() {
		clickElementById("btnLogin");
	}
}
