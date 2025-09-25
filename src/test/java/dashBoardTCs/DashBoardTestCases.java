package dashBoardTCs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.DashBoardPage;
import testNGBasics.BaseClass;

public class DashBoardTestCases extends BaseClass{
	
	
	@BeforeMethod
	public void navigateDB()
	{
		dp.clickDashBoardTab();	
	}
	
	
	
	@Test(priority = 1,invocationCount = 1)
	public void validateQuickLaunchLinks()
	{
		dp.clickAllButtons();		
	}
	
	@Test(priority = 2,dependsOnMethods = "validateQuickLaunchLinks",enabled = true,groups = "")
	public void validateMyActions()
	{
		String data=driver.findElement(By.xpath("//p[text()='My Actions']")).getText();
		Assert.assertEquals(data, "My Actions");
		System.out.println("post hard assert");
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(false, false);
		sa.assertEquals(51, 51);
		sa.assertEquals(data, data);
		System.out.println("Post soft assert");
		sa.assertAll();
	}
	
	
	
	@AfterMethod
	public void navigateToDB()
	{
		dp.clickDashBoardTab();	
	}

}
