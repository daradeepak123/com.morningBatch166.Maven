package seleniumLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class WebElementMethods extends Constants{

	public static void main(String[] args) throws Exception {
		

		OpenBroswer o=new OpenBroswer();
		
		driver=o.openBrowser(driver);
		
		driver.get("https://the-internet.herokuapp.com/forgot_password");
		
		
		WebElement header=driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
		boolean flag=header.isDisplayed();   //true
		flag&=header.isEnabled();            //false
		if(flag)
		{
			System.out.println(header.getText());
			
			Dimension dim=header.getSize();
			System.out.println(dim.height+"\t"+dim.width);
		}
		
		
		WebElement tb=driver.findElement(By.xpath("//input[@id='email']"));
		flag=tb.isDisplayed();
		flag&=tb.isEnabled();
		if(flag)
		{
			tb.clear();
			tb.sendKeys("hello@hello.com");	
		}
		
		
		WebElement button=driver.findElement(By.xpath("//button"));
		
		flag=button.isDisplayed();
		flag&=button.isEnabled();
		if(flag)
		{
			button.click();
		}
		
		WebElement errorText=driver.findElement(By.xpath("//h1[text()='Internal Server Error']"));
		
		String errorTXT= errorText.getText();
		System.out.println(errorTXT);
		
		if(errorTXT.equals("Internal Server Error"))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
		
		
		
		
		Thread.sleep(5000);
		
		o.quitDriver(driver);
	}

}
