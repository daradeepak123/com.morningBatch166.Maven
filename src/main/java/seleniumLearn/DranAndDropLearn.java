package seleniumLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DranAndDropLearn extends	Constants{

	public static void main(String[] args) throws Exception {


		OpenBroswer o=new OpenBroswer();

		driver=o.openBrowser(driver);
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		
		Actions action=new Actions(driver);
		
		WebElement sectionA=driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement sectionB=driver.findElement(By.xpath("//div[@id='column-b']"));
		
		//action.contextClick(sectionA).build().perform();
		
		action.dragAndDrop(sectionA, sectionB).build().perform();
		
		Thread.sleep(3000);
		
		
		
		o.quitDriver(driver);

	}

}
