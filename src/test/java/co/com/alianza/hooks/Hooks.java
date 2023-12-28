package co.com.alianza.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import co.com.alianza.navigation.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;


public class Hooks extends BasePage{

//	String chromeDriverPath = PropertyManager.getInstance().getChormeDriverPath();
//	String browserType = PropertyManager.getInstance().getbrowserType();
//	String ieDriverPath = PropertyManager.getInstance().getIEDriverPath();
	    
	public Hooks() {
		super(driver);
	}
	
	@BeforeAll(order = 0) // Cucumber BeforeAll
    public static void beforeAll() {
        System.out.println("BeforeAll - This statement printed before all scenarios from Cucumber");
    }
	 
	@After
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			System.out.println(screenshot.toString());
			scenario.attach(screenshot,"image/png","Screen shot del error");
		}
	}

}
