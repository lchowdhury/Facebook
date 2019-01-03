package regrassionTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import frameWork.WebDriverFactory;
import pageObject.LandingPage;

public class CreateAccount extends WebDriverFactory{
	@Test
	public void createanAccount ()throws InterruptedException {
		getDriver();
		
		
	LandingPage createAc = PageFactory.initElements(driver, LandingPage.class);
		
	createAc.fname("lobid");

	createAc.lname("chowdhury");
	createAc.mobem("dmg.lobid@gmail.com");
	createAc.rpemail("dmg.lobid@gmail.com");
	createAc.pwd("dmg7894561");
	createAc.mnth("mar");
	createAc.date("8");
	createAc.yar("1994");
	createAc.btn();
	createAc.srch();
	}

}
