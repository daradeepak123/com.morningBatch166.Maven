package seleniumLearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.PropertyUtils;
import utils.SeleniumHelpers;

public class OrangeHRMLogin extends	Constants{

	public static void main(String[] args) throws Exception {

		SeleniumHelpers sh=new SeleniumHelpers();
		OpenBroswer o=new OpenBroswer();

		driver=o.openBrowser(driver);
		
		driver.get(PropertyUtils.readPropertyData("\\src\\main\\resources\\config.properties", "url"));
		String userName=PropertyUtils.readPropertyData("\\src\\main\\resources\\config.properties", "uname");
		String password=PropertyUtils.readPropertyData("\\src\\main\\resources\\config.properties", "pwd");
		
		
		
		WebElement uNameTB=driver.findElement(By.xpath("//input[@name='username']")); 
		WebElement pwdTB=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement loginBTN=driver.findElement(By.xpath("//button[@type='submit']"));
		
		sh.sendDataToTB(driver, uNameTB, userName);
		sh.sendDataToTB(driver, pwdTB, password);
		sh.clickElement(driver, loginBTN);
		Thread.sleep(5000);
		
		
		o.quitDriver(driver);
	}

}
