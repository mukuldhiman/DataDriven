package org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Utilities.DataPro;
import org.testng.annotations.Test;

public class TestCase1 extends Base{
	
	
	@Test(dataProvider = "getData", dataProviderClass = DataPro.class)
	public void loginFB(String Email , String Password) throws InterruptedException
	{
		
		System.out.println("Email");
		System.out.println("Password");
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("Page is Maximized");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email' and @id='email']"));
		email.sendKeys(Email);
	    Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password' and @name='pass']"));
		password.sendKeys(Password);
		Thread.sleep(3000);
		
		WebElement logIn = driver.findElement(By.xpath("//input[@value ='Log In']"));
		logIn.click();
		Thread.sleep(3000);
		
		WebElement myProfile = driver.findElement(By.xpath("//div[@aria-label='Account' and @role='button']"));
		myProfile.click();
		Thread.sleep(3000);
		
		WebElement logOut = driver.findElement(By.xpath("//*[contains(text(), 'Log Out')]"));
		logOut.click();
		
		
		
		
	}

}
