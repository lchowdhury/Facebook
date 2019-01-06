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

	createAc.lname("ahmed");
	createAc.mobem("dmg.orfatt11@gmail.com");
	createAc.rpemail("dmg.orfatt11@gmail.com");
	createAc.pwd("dmg7894561");
	createAc.mnth("jan");
	createAc.date("5");
	createAc.yar("1994");
	//createAc.btn();
	//createAc.srch();
	}

}
