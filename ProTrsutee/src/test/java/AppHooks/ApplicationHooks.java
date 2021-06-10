package AppHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigReader configReader;
	private Properties prop;
		
	
	@Before(order = 0)
		public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
		}
	
	@Before(order = 1)
	public void launchBrowser() {
		String browsername = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browsername);
	}
	
	@After(order = 0)
		public void quitBrowser() {
			driver.quit();
		}
	
	@After(order =1)
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			String screenShotname = scenario.getName().replaceAll(" ","_");
			TakesScreenshot scrShot =((TakesScreenshot)driver);
			byte[] sourcePath = scrShot.getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenShotname);
		}
	}
}