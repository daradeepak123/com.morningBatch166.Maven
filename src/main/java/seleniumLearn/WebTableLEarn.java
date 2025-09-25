package seleniumLearn;

import org.openqa.selenium.By;

public class WebTableLEarn extends	Constants{

	public static void main(String[] args) throws Exception {
		

		OpenBroswer o=new OpenBroswer();
		
		driver=o.openBrowser(driver);
		
		driver.get("https://the-internet.herokuapp.com/tables");
		
		
		
		int row=driver.findElements(By.xpath("//table[1]/tbody//tr")).size();
		int col=driver.findElements(By.xpath("//table[1]/tbody//tr[1]/td")).size();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				String data=driver.findElement(By.xpath("//table[1]/tbody//tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data+"\t");
			}	
			System.out.println();
			
		}
		
		String person="Doe";
		String doller=driver.findElement(By.xpath("//table[1]//td[text()='"+person+"']/following-sibling::td[3]")).getText();
		System.out.println(person+" need to pay "+doller);
		
		
		
		o.quitDriver(driver);
	}

}
