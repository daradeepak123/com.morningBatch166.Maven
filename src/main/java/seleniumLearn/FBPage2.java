package seleniumLearn;

import org.openqa.selenium.WebDriver;

public class FBPage2 {

	static WebDriver driver;
	
	
	public static void main(String[] args) throws Exception {
		
		OpenBroswer o=new OpenBroswer();
		
		driver=o.openBrowser(driver);
		
		driver.get("https://www.selenium.dev/");
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		
		Thread.sleep(5000);

		driver.navigate().forward();

		Thread.sleep(5000);
		o.quitDriver(driver);
		

	}

}
