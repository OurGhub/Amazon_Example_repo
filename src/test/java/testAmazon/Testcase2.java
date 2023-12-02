package testAmazon;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcase2 {
	WebDriver driver;
	String browser = "edge";

	@Test
	public void amazonpage() throws Throwable 
	{
		SoftAssert st=new SoftAssert();
		if (browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else 
		if (browser.equalsIgnoreCase("Firefox"))
			driver = new FirefoxDriver();
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a")).click();

		driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/main/div/div[3]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/a/div/picture/img")).click();
		driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/main/div[3]/div[1]/section/div/div[3]/ul/li[1]/label/div")).click();
		driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[2]/h3")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[1]/div/div/div/picture/img")).click();
		Thread.sleep(8000);
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	      //switch to new tab
	      driver.switchTo().window(newTb.get(1));
	      Thread.sleep(3000);
	   String Heading_name= driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[2]/div[2]/div[1]/h1[1]")).getText();
		System.out.println("Tab name is:"+Heading_name);
		st.assertEquals(Heading_name, "US polo assn");
		
	   driver.quit(); //relase the memory and close all the tabs
	   st.assertAll();
	}
}
