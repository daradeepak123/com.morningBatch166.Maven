package seleniumLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ScrollToBottom extends	Constants{

	public static void main(String[] args) throws Exception {


		OpenBroswer o=new OpenBroswer();

		driver=o.openBrowser(driver);
		
		driver.get("https://the-internet.herokuapp.com/");
		
		
		Actions action=new Actions(driver);
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));
	
		
		
		action.moveToElement(ele).click(ele).build().perform();
		
		
		Thread.sleep(3000);
		
		
		
		o.quitDriver(driver);

	}

}
