package Testcases;

import org.testng.annotations.Test;

import basepackage.Base;
import pages.page1;

public class Tc_04 extends Base {
	
	@Test
	public void tc04()
	{
		page1 obj=new page1();
		obj.username(driver, "gaurav");
		obj.password(driver, "gaurav");
		obj.submit(driver);
		String alert=driver.switchTo().alert().getText();
		if(alert.equalsIgnoreCase("User or Password is not valid"))
		{
			System.out.println("Both: User or Password is not valid");
		}

	}

}
