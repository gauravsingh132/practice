package assertionandverify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class validation {

	public boolean homepagevisible(WebDriver driver,String s)
	{
		boolean result=false;
		String a = null;
		try {
			a = driver.findElement(By.xpath("//marquee[@class='heading3']")).getText();
			System.out.println("text on web page is " + a);
		} catch (Exception e) {

			System.out.println("missing element on page");
		}
		
		if(a.equalsIgnoreCase(s))
		{
			result= true;
		}
		
		return result;
		
	}
	
	public boolean validatetitle(WebDriver driver,String s)
	{
		boolean result=false;
		String title=driver.getTitle();
		if(title.equalsIgnoreCase(s))
		{
			result=true;
			System.out.println(title);
		}
		return result;
	}
}
