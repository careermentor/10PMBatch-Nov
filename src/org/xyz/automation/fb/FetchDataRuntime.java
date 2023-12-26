package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchDataRuntime 
{

	WebDriver driver;
	
	@Test
	public void loginpage() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();  //chrome browser
		
		String ExpURL = "https://www.facebook.com/";
		
		driver.get(ExpURL);
		
		String ActURL = driver.getCurrentUrl();  //fetch the URL
		System.out.println(ActURL);
		
		//Assert.assertEquals(ActURL, ExpURL);  //fail   //hard assertion
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActURL, ExpURL);
		
		String ExpTitle="Facebook – log in or sign up";
		
		String ActTitle = driver.getTitle();  //fetch the page title
		System.out.println(ActTitle);
		
		sa.assertEquals(ActTitle, ExpTitle);
		
		String ExpUsername = "Email address or phone number";
		String ActUsernamr = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(ActUsernamr);
		
		sa.assertEquals(ActUsernamr, ExpUsername);
		
		String ExpLoginLink = "Log in";
		String ActLoginLink = driver.findElement(By.name("login")).getText();
		sa.assertEquals(ActLoginLink, ExpLoginLink);
		
		 Point locLogin = driver.findElement(By.name("login")).getLocation();
		 System.out.println(locLogin);
		 
		// System.out.println(driver.getPageSource());
		 
		 sa.assertAll();
		
	}			
	

	
}
