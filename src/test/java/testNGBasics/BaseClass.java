package testNGBasics;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.DashBoardPage;
import pages.LoginPage;
import seleniumLearn.OpenBroswer;
import utils.ExcelUtils;
import utils.PropertyUtils;
import utils.SeleniumHelpers;

public class BaseClass {
	public static File file;
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static WebDriver driver;
	public static SeleniumHelpers sh;
	public static OpenBroswer o;
	public static DashBoardPage dp;
	
	@BeforeSuite
	public void bSuite() throws Exception
	{
		sh=new SeleniumHelpers();
		o=new OpenBroswer();
		ExcelUtils eu=new ExcelUtils();
		sheet=eu.sheetData("/src/main/resources/employee.xlsx", "Sheet2");
	}
	@BeforeTest
	public void bTest() throws Exception
	{
		
		driver=o.openBrowser(driver);
		sh.loadURL(driver, sheet.getRow(3).getCell(1).toString());
	}
	
	@BeforeClass
	public void loginSetUP() throws Exception
	{
		String userName=PropertyUtils.readPropertyData("\\src\\main\\resources\\config.properties", "uname");
		String password=PropertyUtils.readPropertyData("\\src\\main\\resources\\config.properties", "pwd");
		LoginPage lp=new LoginPage(driver);
		lp.login(userName, password);
		dp=new DashBoardPage(driver);
		dp.validateHeader();
	}
	
	
	
	
	
	@AfterClass
	public void logOut()
	{
		WebElement logMenu=driver.findElement(By.xpath("//header//span[@class='oxd-userdropdown-tab']"));
		sh.clickElement(driver, logMenu);
		WebElement logOut=driver.findElement(By.xpath("//a[text()='Logout']"));
		sh.clickElement(driver, logOut);
	}
	
	
	@AfterTest
	public void aTest()
	{
		o.quitDriver(driver);
	}
	
	@AfterSuite
	public void aSuite() throws Exception
	{
		
		
	}
	
	
	

}
