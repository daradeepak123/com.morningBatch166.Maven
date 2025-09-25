package seleniumLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownLearn  extends	Constants{

	public static void main(String[] args) throws Exception {
		

		OpenBroswer o=new OpenBroswer();
		
		driver=o.openBrowser(driver);
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		WebElement dw=driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		Select sel=new Select(dw);
		
		sel.selectByVisibleText("Option 1");
		
		Thread.sleep(3000);
		sel.selectByValue("2");
		
		Thread.sleep(3000);
		
		sel.selectByIndex(1);
		
		Thread.sleep(3000);
			
		
		o.quitDriver(driver);
		
	}

}
