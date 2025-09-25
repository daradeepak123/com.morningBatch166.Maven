package stepDefinetion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import seleniumLearn.OpenBroswer;
import utils.SeleniumHelpers;

public class LoginTest extends OpenBroswer{
	static OpenBroswer o=new OpenBroswer();
	static SeleniumHelpers sh=new SeleniumHelpers();
	@Given("User opens browser")
	public void user_opens_browser() throws Exception {
	    
		
		driver=o.openBrowser(driver);
	}

	@Then("User Enter URL")
	public void user_enter_url() {
	    
	    sh.loadURL(driver, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User enter username and password and click login")
	public void user_enter_username_and_password() {
	    
	   LoginPage lp=new LoginPage(driver);
	   lp.login("Admin", "admin123");
	}

	
	@When("user validates login success")
	public void user_validates_login_success() {
	    
	    o.quitDriver(driver);
	}


	
	
	
	
	

}
