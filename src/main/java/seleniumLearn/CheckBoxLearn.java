package seleniumLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxLearn extends	Constants{

		public static void main(String[] args) throws Exception {
			

			OpenBroswer o=new OpenBroswer();
			
			driver=o.openBrowser(driver);
			
			driver.get("https://the-internet.herokuapp.com/checkboxes");
			
			
			WebElement chk1=driver.findElement(By.xpath("//input[1]"));
			WebElement chk2=driver.findElement(By.xpath("//input[2]"));
			
			boolean flag=!chk1.isSelected();
			if(flag)
			{
				chk1.click();
			}
			flag=!chk2.isSelected();			
			if(flag)
			{
				chk2.click();
			}
			
			Thread.sleep(5000);
			
			
			
			o.quitDriver(driver);
			
			
	}

}
