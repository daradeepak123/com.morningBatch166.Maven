package pages;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.collections4.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.SeleniumHelpers;

public class PIMPage {
	
	WebDriver cDriver;
	
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement pimTab;
	
	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement addBTN;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement fName;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lName;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement saveBTN;
	
	@FindBy(xpath="//label[text()='Employee Name']/../following-sibling::div//input")
	private WebElement empNameSearchTB;
	
	@FindBy(xpath="//button[text()=' Search ']")
	private WebElement searchBTN;
	
	@FindBy(xpath="//label[text()='Employee Id']/../following-sibling::div/input")
	private WebElement empIDTB;
	
	
	public PIMPage(WebDriver driver)
	{
		driver=cDriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	final String fnameTXT=generateName("firstName");
	final String lnameTXT=generateName("lastName");
	final String empID=generateID();
	
	public String generateID()
	{
		Random r=new Random();
		String id=Integer.toString(r.nextInt(4000)+r.nextInt(3000));
		return id;
	}
	
	public String generateName(String preFix)
	{
		Random r=new Random();
		int l=r.nextInt(4000)+r.nextInt(3000);
		String fname=preFix+l;
		return fname;
	}
	
	
	public void clickPIMTab()
	{
		
	}
	
	public void addUser() throws Exception
	{
				
	}
	
	
	public void searchData() throws Exception
	{
		
	}
	
	

}
