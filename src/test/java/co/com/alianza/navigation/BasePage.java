package co.com.alianza.navigation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Clase base para las paginas, toda pagina debe extender esta clase para heredar estos comportamientos
 * @author jetorrese
 *
 */

public class BasePage {
	public static WebDriver driver;
	private static WebDriverWait waiter;
	private static Actions action;
	static {
		//System.setProperty("webdriver.chrome.driver", "C:\\GRIFUS\\librerias\\chromedriver-win64\\chromedriver.exe");
		//System.setProperty("java.version","8.0.11");
		ChromeOptions chromeOptions = new ChromeOptions();
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		Duration time = Duration.ofSeconds(10);
		waiter = new WebDriverWait(driver,time);
		
	}
	
	public BasePage(WebDriver driver) {
		BasePage.driver = driver;
		Duration time = Duration.ofSeconds(10);
		BasePage.waiter = new WebDriverWait(driver,time);
		//driver.manage().timeouts().implicitlyWait(time); otra forma de indicar espera 
	}
	
	/**
	 * redireccionar a URL
	 * @param url
	 */
	public static void navigateTo(String url) {
		driver.get(url);		
	}
	
	/**
	 * Cerrar navegador despues de
	 */
	public static void closeBrowser() {
		driver.quit();
	}
	/**
	 * retorna el controlador de la app
	 * @return
	 */
	public static WebDriver getDriver() {
		return driver;
	}
	
	/**
	 * buscar elemento DOM por el ID
	 * @param Locator
	 * @return
	 */
	private WebElement findById(String Locator) {
		return waiter.until(ExpectedConditions.visibilityOfElementLocated(By.id(Locator)));
	}
	
	/**
	 * buscar elemento DOM por el xpath
	 * @param Locator
	 * @return
	 */
	private WebElement findByXPath(String Locator) {
		return waiter.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator)));
	}
	
	/**
	 * buscar elemento DOM por el CSS
	 * @param css
	 * @return
	 */
	private WebElement findByCSS(String css) {
		return waiter.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css)));
	}
	
	/**
	 * setear el valor de un input
	 * @param locator
	 * @param valor del componente
	 */
	public void setElement(String locator, String valor) {
		findById(locator).clear();
		findById(locator).sendKeys(valor);
	}
	
	/**
	 * accion de hacer click en un boton por ID
	 * @param locator
	 */
	public void clickElementById(String locator) {
		findById(locator).click();
	}
	
	/**
	 * accion de hacer click en un boton
	 * @param locator
	 */
	public void clickElementByXPath(String xpath) {
		findByXPath(xpath).click();
	}
	
	/**
	 * accion de hacer click en un boton
	 * @param locator
	 */
	public void clickElementByCSS(String css) {
		findByCSS(css).click();
	}
	
	/**
	 * Seleccionar un valor de una lista desplegable 
	 * @param locator
	 * @param valor
	 */
	public void selectFromDropDownByValue(String locator, String valor) {
		Select dropDown = new Select(findById(locator));
		dropDown.selectByValue(valor);
	}
	
	/**
	 * Seleccionar un valor de una lista desplegable por el indice
	 * @param locator
	 * @param index
	 */
	public void selectFromDropDownByIndex(String locator, int index) {
		Select dropDown = new Select(findById(locator));
		dropDown.selectByIndex(index);
	}
	
	/**
	 * Seleccionar un valor de una lista desplegable por el texto
	 * @param locator
	 * @param text
	 */
	public void selectFromDropDownByText(String locator, String text) {
		Select dropDown = new Select(findById(locator));
		dropDown.selectByVisibleText(text);
	}
	
	public void hoverOverElement(String locator) {
		action.moveToElement(findById(locator));
	}
	
	/**
	 * consultar el texto de un elemento por el id
	 * @param locator
	 * @return
	 */
	public String textFromElement(String locator) {
		return findById(locator).getText();
	}
	
	/**
	 * consultar el texto de un elemento por el xpath
	 * @param locator
	 * @return
	 */
	public String textFromXpath(String locator) {
		return findByXPath(locator).getText();
	}
	
	/**
	 * validar si el elemento esta visualizado x id
	 * @param locator
	 * @return
	 */
	public boolean isDisplayXLocator(String locator) {
		return findById(locator).isDisplayed();
	}
	
	/**
	 * validar si el elemento esta visualizado x xpath
	 * @param xpath 
	 * @return
	 */
	public boolean isDisplayXPath(String xpath) {
		return findByXPath(xpath).isDisplayed();
	}
	
	/**
	 * el elemento esta activo por id
	 * @param locator
	 * @return
	 */
	public boolean isEnabled(String locator) {
		return findById(locator).isEnabled();
	}
	
	/**
	 * el elemento esta activo por xpath
	 * @param locator
	 * @return
	 */
	public boolean isSelected(String locator) {
		return findById(locator).isSelected();
	}
	
}
