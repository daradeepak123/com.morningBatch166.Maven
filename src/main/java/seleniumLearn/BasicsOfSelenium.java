package seleniumLearn;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicsOfSelenium {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://fb.com/");
		
		String cURL=driver.getCurrentUrl();
		System.out.println(cURL);
		
		String title=driver.getTitle();
		System.out.println(title);
		
//		String ps=driver.getPageSource();
//		System.out.println(ps);
	
		driver.quit();

	}

}
