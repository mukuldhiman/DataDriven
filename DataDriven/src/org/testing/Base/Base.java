package org.testing.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void browserLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mukul.dhiman\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
/*	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}*/

}
