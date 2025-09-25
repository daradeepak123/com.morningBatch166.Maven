package seleniumLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;

public class AlertsLearn extends	Constants{

	public static void main(String[] args) throws Exception {


		OpenBroswer o=new OpenBroswer();

		driver=o.openBrowser(driver);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		WebElement alertBTN1=driver.findElement(By.xpath("(//button)[1]"));
		WebElement alertBTN2=driver.findElement(By.xpath("(//button)[2]"));
		WebElement alertBTN3=driver.findElement(By.xpath("(//button)[3]"));
		
		
		//alertBTN1.click();
		try {
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		}
		catch(NoAlertPresentException e)
		{
			e.printStackTrace();
		}
		alertBTN2.click();

		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		

		alertBTN3.click();
		

		driver.switchTo().alert().sendKeys("data sent to alert");

		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		
		o.quitDriver(driver);
		
		
		
		
		

	}

}
