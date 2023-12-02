package testAmazon;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class Testcase1 {

	@Test
	//Run | Debug
	public void testcase1()
	{
		new ChromeDriver();
		//new FirefoxDriver();
		/*EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		EdgeDriver driver=new EdgeDriver();
		*/
		ChromeOptions opt=new ChromeOptions();
		
		
		ChromeDriver driver=new ChromeDriver();
		opt.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyothi.m\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");

		//System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		
		
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.quit();
		
		
	}
}
