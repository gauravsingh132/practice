package basepackage;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base {

	public WebDriver driver;
	public ResourceBundle rb=ResourceBundle.getBundle("config");
	
	@BeforeMethod
	public void needs()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//ResourceBundle rb=ResourceBundle.getBundle("config");
		driver.get(rb.getString("url"));
	}
	@AfterMethod
	public void close()
	{
		driver.quit();
	}

}
