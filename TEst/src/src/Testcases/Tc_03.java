package Testcases;

import org.testng.annotations.Test;

import basepackage.Base;
import pages.page1;

public class Tc_03 extends Base {

	@Test
	public void tc03()
	{
		page1 obj=new page1();
		obj.username(driver, rb.getString("username"));
		obj.password(driver, "sdsd");
		obj.submit(driver);
		String alert=driver.switchTo().alert().getText();
		if(alert.equalsIgnoreCase("User or Password is not valid"))
		{
			System.out.println("password: User or Password is not valid");
		}

	}
}
