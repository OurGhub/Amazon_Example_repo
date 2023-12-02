package testAmazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testcase3 
{
	WebDriver driver;
	String browser;
	@Test
	public void testcase3()
	{
		
		if(browser.equalsIgnoreCase("Edge"))
			driver=new EdgeDriver();
		else if(browser.equalsIgnoreCase("firefox"))
			driver=new FirefoxDriver();
		
	}

}
