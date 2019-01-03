package pageObject;

import org.openqa.selenium.By;

import frameWork.BasePage;

public class LandingPage extends BasePage {

	public By Signinemial = By.xpath("//*[@id=\'email\']");
	
	public By SignInPwd = By.xpath("//*[@id=\'pass\']");
	
	public By Login = By.xpath("//*[@id=\'loginbutton\']");
	
	public By FirstName = By.xpath("//*[@id='u_0_c']");
	
	public By LastName = By.xpath("//*[@id='u_0_e']");
	
	public By MobileEmail = By.xpath("//*[@id='u_0_h']");
	
	public By RepeateEmail = By.xpath("//*[@id=\'u_0_k\']");
	
	public  By Password = By.xpath("//*[@id='u_0_o']");	
		
	public By Month = By.xpath("//*[@id='month']");
	
	public By Day = By.xpath("//*[@id='day']");
	
	public By Year = By.xpath("//*[@id='year']");
	
	public By Button = By.xpath("//*[@id=\'u_0_a\']");
	
	public By Search = By.xpath("//*[@id=\'u_0_u\']");
	
	public By Deactive = By.xpath("//*[@id=\'SettingsPage_Content\']/ul/li[6]/div/div/div/div[2]/div[1]/div[4]/a");
	
	public By Navigation = By.xpath("//*[@id=\'userNavigationLabel\']");
	
	public By Settings = By.xpath("//*[@id='js_37']/div/div/ul/li[20]/a/span/span");
	
	public void fname(String name) {
		enterData(FirstName, name);
	}
			
	public void lname(String name) {
		enterData(LastName, name);
	}
	public void mobem(String name) {
		enterData(MobileEmail,name);
		
	
	}
	public void rpemail (String name) {
		enterData (RepeateEmail, name);
	}


	public void pwd (String name ) {
		enterData (Password ,name );
	}
	public void mnth (String name) {
		enterData (Month ,name);
	}
	public void date (String name) {
		enterData (Day, name);
	}
	public void yar (String name) {
		enterData (Year ,name );
	}
    public void btn(){
    	clickOn(Button);
     
    }
    public void srch () {
    	clickOn(Search);
    }
    public void email(String  name) {
    	enterData(Signinemial, name);
    }
    public void Spwd(String name) {
    	enterData(SignInPwd ,name);
    }

    public void logIn() {
    	clickOn(Login);
    }
    public void Del() {
    	clickOn(Deactive);
    }
    public void Navi() {
    	clickOn(Navigation);
    }

    public void Setting() {
    	clickOn(Settings);
    }




}

