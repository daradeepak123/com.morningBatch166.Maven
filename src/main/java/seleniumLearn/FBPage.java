package seleniumLearn;

import org.openqa.selenium.WebDriver;



public class FBPage extends OpenBroswer{

		
	public static void main(String[] args) throws Exception {
		
		
		
		OpenBroswer o=new OpenBroswer();
		
		driver=o.openBrowser(driver);
		
		
		driver.get("https://the-internet.herokuapp.com/");

	}

}
