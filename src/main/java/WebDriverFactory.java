package frameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebDriverFactory {
	protected static WebDriver driver = null;
	private String url = "https://www.facebook.com/";

	public static WebDriver getDriver() {
		return driver;
	}

	@BeforeClass
	public void initializeDriver() { //always will remain same for all the projects

		System.setProperty("webdriver.chrome.driver", "/home/lobid/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get(url);
		getDriver().manage().window().maximize();
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {

		if (driver != null) {
			driver.manage().deleteAllCookies();
			Thread.sleep(3000);
			driver.quit();

		}

	}
}