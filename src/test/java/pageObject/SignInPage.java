package pageObject;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import frameWork.WebDriverFactory;

public class SignInPage extends WebDriverFactory {

	
    @Test
	public void SignInPage() throws InterruptedException {
		getDriver();
		
		
		LandingPage Signin = PageFactory.initElements(driver, LandingPage.class);
		
		Signin.email("lobid.bd@gmail.com");
		Signin.Spwd("lac7894561");
		Signin.logIn();
		
}
}