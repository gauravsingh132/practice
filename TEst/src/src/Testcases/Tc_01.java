package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import assertionandverify.validation;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;

import basepackage.Base;
import pages.page1;

public class Tc_01 extends Base {
	
	@Test
	public void tc01() throws Exception
	{
		page1 obj=new page1();
		obj.username(driver, rb.getString("username"));
		obj.password(driver, rb.getString("password"));
		obj.submit(driver);
		SoftAssert verify=new SoftAssert();
		validation val=new validation();
		boolean res=val.homepagevisible(driver, "Welcome To Manager's Page of Guru99 Bank");
		verify.assertTrue(res, "result matched");
		verify.assertAll();
		System.out.println("Login successful");
		
		//Verify title
		boolean res_title=val.validatetitle(driver, "Guru99 Bank Manager HomePage");
		Assert.assertTrue(res_title, "title pass");
		
	}
}
