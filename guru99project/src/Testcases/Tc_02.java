package Testcases;

import org.testng.annotations.Test;

import basepackage.Base;
import pages.page1;

public class Tc_02 extends Base {
	
	@Test
	public void tc02()
	{
		page1 obj2=new page1();
		obj2.username(driver, "abcd");
		obj2.password(driver, rb.getString("password"));
		obj2.submit(driver);
		String alert=driver.switchTo().alert().getText();
		System.out.println(alert);
		if(alert.equalsIgnoreCase("User or Password is not valid"))
		{
			System.out.println("User or Password is not valid");
		}

	}

}
