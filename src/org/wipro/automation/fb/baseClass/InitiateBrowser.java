package org.wipro.automation.fb.baseClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.wipro.automation.fb.utilitiesClass.ReadPropFiles;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitiateBrowser 
{

	public WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser() throws Exception
	{
		
		if(ReadPropFiles.readconfig("BrowserName").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver(); 
			
		}
		
		else if(ReadPropFiles.readconfig("BrowserName").equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		else
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver(); 
			
		}
		
		
		
		driver.get(ReadPropFiles.readconfig("ApplicationURL"));  //pass the url
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
	}
	
	@AfterMethod
	public void closeBrowser()
	{
	//	driver.quit();
	}
		
}
