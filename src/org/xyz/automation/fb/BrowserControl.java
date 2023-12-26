package org.xyz.automation.fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserControl 
{

	WebDriver driver;
	
	@Test
	public void handlebrowser() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();  //chrome browser
		
		driver.navigate().to("https://www.google.com/");  //pass the url
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		driver.close();//  it will close only one window
		driver.quit();  //multiple window will close
			
	}
	
}
