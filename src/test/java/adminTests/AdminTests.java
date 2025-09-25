package adminTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testNGBasics.BaseClass;

public class AdminTests extends BaseClass{
	
	@BeforeMethod
	public void navigateAdmin()
	{
		WebElement DBTab=driver.findElement(By.xpath("//span[text()='Admin']"));
		sh.clickElement(driver, DBTab);
	}
	
	
	@Test
	public void headerValidation()
	{
		String str=driver.findElement(By.xpath("//h6[text()='User Management']")).getText();
		Assert.assertEquals(str, "User Managementt");
	}
	
	
	@AfterMethod
	public void navigateToAdmin()
	{
		WebElement DBTab=driver.findElement(By.xpath("//span[text()='Admin']"));
		sh.clickElement(driver, DBTab);
	}
	

}
