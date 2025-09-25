package utils;

import java.time.Duration;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHelpers {
	
	
	public void loadURL(WebDriver driver,String url)
	{
		System.out.println(url);
		if(url.contains("http")) {
		driver.get(url);
		}
		else
		{
			System.out.println("Failed in loading URL");
		}
	}
	
	
	public void clickElement(WebDriver driver,WebElement ele)
	{
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		boolean flag=ele.isDisplayed();
		flag&=ele.isEnabled();
		Actions act=new Actions(driver);
		if(flag)
		{
			try {
			ele.click();
			}
			catch(ElementClickInterceptedException e)
			{
				e.printStackTrace();
				act.click(ele);				
			}
		}
		
		
	}
	
	public void sendDataToTB(WebDriver driver,WebElement ele,String data)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(ele));
		boolean flag=ele.isDisplayed();
		flag&=ele.isEnabled();
		Actions act=new Actions(driver);
		if(flag)
		{
			try {
			ele.clear();
			ele.sendKeys(data);
			}
			catch(ElementNotInteractableException e)
			{
				e.printStackTrace();
				act.sendKeys(data).build().perform();				
			}
		}
		
	}
	
	

}
