package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.SeleniumHelpers;

public class DashBoardPage {
	
	WebDriver cdriver;
	SeleniumHelpers sh=new SeleniumHelpers();
	public DashBoardPage(WebDriver driver)
	{
		cdriver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement header;
	
	@FindBy(xpath="//span[text()='Dashboard']")
	WebElement dashBoardTab;
	
	 @FindBy(xpath = "//button[@title='Assign Leave']/../..//button")
	 List<WebElement> buttons;
	
	 
	 public void clickDashBoardTab()
	 {
		 sh.clickElement(cdriver, dashBoardTab);
	 }
	
	public void validateHeader()
	{
		String headerText=header.getText();
		Assert.assertEquals(headerText, "Dashboard");
	}
	public void clickAllButtons() {
        for (WebElement ele : buttons) {
            ele.click();
            System.out.println(cdriver.getCurrentUrl());
            cdriver.navigate().back();
        }
    }

}
