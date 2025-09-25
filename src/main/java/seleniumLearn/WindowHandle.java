package seleniumLearn;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class WindowHandle extends	Constants{

	public static void main(String[] args) throws Exception {


		OpenBroswer o=new OpenBroswer();

		driver=o.openBrowser(driver);
		String clicklnk = Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.get("https://the-internet.herokuapp.com/");
		
		String parentTab=driver.getWindowHandle();
		System.out.println(parentTab);
		WebElement link=driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));
		boolean flag=link.isDisplayed();
		flag&=link.isEnabled();
		if(flag) {	link.click();}
		
		Set<String> win=driver.getWindowHandles();
		
		for(String s:win)
		{
			if(!parentTab.equals(s))
			{
				driver.switchTo().window(s);
			}
		}
		
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[text()='Take me to the tips! ']")).click();
		driver.close();
		Thread.sleep(4000);
		driver.switchTo().window(parentTab);
		
		o.quitDriver(driver);
		
	}
}
