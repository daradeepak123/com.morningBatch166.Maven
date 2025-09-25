package dashBoardTCs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testNGBasics.BaseClass;

public class DashBoardTestCases2 extends BaseClass{
	
	
	@BeforeMethod
	public void navigateDB()
	{
		WebElement DBTab=driver.findElement(By.xpath("//span[text()='Dashboard']"));
		sh.clickElement(driver, DBTab);
	}
	
	
	
	
	
	@Test
	public void validateMyActions()
	{
		String data=driver.findElement(By.xpath("//p[text()='Employees on Leave Today']")).getText();
		Assert.assertEquals(data, "Employees on Leave Today");
	}
	
	
	
	@AfterMethod
	public void navigateToDB()
	{
		WebElement DBTab=driver.findElement(By.xpath("//span[text()='Dashboard']"));
		sh.clickElement(driver, DBTab);
	}

}
