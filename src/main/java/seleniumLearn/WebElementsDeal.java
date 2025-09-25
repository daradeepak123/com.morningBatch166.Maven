package seleniumLearn;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class WebElementsDeal extends	Constants{

	public static void main(String[] args) throws Exception {


		OpenBroswer o=new OpenBroswer();

		driver=o.openBrowser(driver);
		String clicklnk = Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.get("https://the-internet.herokuapp.com/");

		List<WebElement> links=driver.findElements(By.xpath("//a"));
		int count=0;
		for(WebElement ele:links)
		{
			//System.out.println(ele.getText() +"\t"+ele.getAttribute("href"));
			if(!(count==0)){
				ele.sendKeys(clicklnk);
//				Thread.sleep(2000);
//				driver.navigate().back();
			}
			count++;
		}

		Set<String> win=driver.getWindowHandles();

		for(String s:win)
		{
			driver.switchTo().window(s);
			System.out.println(driver.getTitle());
		}

		o.quitDriver(driver);

	}

}
