package pageObject;

import org.openqa.selenium.support.PageFactory;

import frameWork.WebDriverFactory;

public class DeactiveAccount extends WebDriverFactory {
	
	public void DeactiveAccount() throws InterruptedException {
    getDriver();
		
    LandingPage DeleteAc = PageFactory.initElements(driver, LandingPage.class);
		
		DeleteAc.email("lobid.bd@gmail.com");
		DeleteAc.Spwd("lac7894561");
		DeleteAc.logIn();
		DeleteAc.Del();
		DeleteAc.Navi();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}