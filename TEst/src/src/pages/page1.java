package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class page1 {

	public void username(WebDriver driver,String s)
	{
		driver.findElement(By.name("uid")).sendKeys(s);
	}
	public void password(WebDriver driver,String s)
	{
		driver.findElement(By.name("password")).sendKeys(s);
		
	}
	public void submit(WebDriver driver)
	{
		driver.findElement(By.name("btnLogin")).click();
	}
	
}
