package AppHooks;

<<<<<<< HEAD
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.qa.factory.DriverFactory;
import com.qa.util.configReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	private configReader configreader;
	private DriverFactory driverFactory;
	private WebDriver driver;
	Properties prop;
	
	@Before(order=0)
	public void getProperty() {
		configreader=new configReader();
		prop=configreader.initProperties();
	}
	
	@Before(order=1)
	public void launchBrowser() {
		driverFactory=new DriverFactory();
		driver=driverFactory.initDriver(prop.getProperty("browser"));
	}
	
	@After(order=0)
	public void quitDriver() {
		driver.quit();
	}
	
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			String filename=scenario.getName().replaceAll(" ", "_");
			byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", filename);
		}
	}
=======
public class Hooks {
>>>>>>> f09ed57 (folder structure added)

}
