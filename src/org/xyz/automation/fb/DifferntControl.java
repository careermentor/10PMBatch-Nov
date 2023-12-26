package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferntControl 
{

	WebDriver driver;
	
	int i=20;
	
	@Test
	public void handlebrowser() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();  //chrome browser
		
		driver.navigate().to("https://thetestingworld.com/testings/");  //pass the url
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	WebElement a =	driver.findElement(By.name("fld_username"));
	
	a.sendKeys("user1");
	
		driver.findElement(By.name("fld_username")).sendKeys("tester123");
		driver.findElement(By.cssSelector("[value='office']")).click();
		
		System.out.println(driver.findElement(By.name("terms")).isSelected());  //false
		
		driver.findElement(By.name("terms")).click();
		
		boolean ActTermsout = driver.findElement(By.name("terms")).isSelected();    //true
		
		Assert.assertEquals(ActTermsout, true);
		
		//driver.findElement(By.className("displayPopup")).click();
		
		Select gen = new Select(driver.findElement(By.name("sex")));
		
		//gen.selectByIndex(2);  //Female
		//gen.selectByValue("1"); //Male
		gen.selectByVisibleText("Male");
		//gen.selectByVisibleText("Female");
		//gen.deselectByVisibleText("Male");
		//gen.deselectAll();
		
		System.out.println(driver.findElement(By.xpath("//input[@value='Sign up']")).isEnabled());
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "California"));
		
		st.selectByVisibleText("Florida");
			
	}
	
}
