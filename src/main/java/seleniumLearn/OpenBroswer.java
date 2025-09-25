package seleniumLearn;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Scanner;

import org.apache.logging.log4j.util.PropertiesUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import utils.PropertyUtils;

public class OpenBroswer {
	
	public static WebDriver driver;
	
	public WebDriver openBrowser(WebDriver driver) throws Exception
	{
		String browser=PropertyUtils.readPropertyData("\\src\\main\\resources\\config.properties", "browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("ff"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("grid"))
		{
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--headless");
	        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
		}
		else
		{
			driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
	}
	
	
	
	public void quitDriver(WebDriver driver)
	{
		driver.quit();
	}
	
	
	

}
