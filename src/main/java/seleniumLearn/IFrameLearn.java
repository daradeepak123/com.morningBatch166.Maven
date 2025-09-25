package seleniumLearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IFrameLearn extends	Constants{

	public static void main(String[] args) throws Exception {


		OpenBroswer o=new OpenBroswer();

		driver=o.openBrowser(driver);
		
		driver.get("https://demoqa.com/frames");
		
		
		driver.switchTo().frame("frame1");
		
		WebElement text=driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
		
		System.out.println(text.getText());
		
		o.quitDriver(driver);
	}
}
