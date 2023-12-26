package org.wipro.automation.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.fb.utilitiesClass.ReadPropFiles;

public class LoginPage 
{

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}

	public void enter_username(String UName) throws Exception
	{
		driver.findElement(By.id(ReadPropFiles.readelement("login_username_id"))).sendKeys(UName);
	}
	
	public void enter_password(String Pass) throws Exception
	{
		driver.findElement(By.name(ReadPropFiles.readelement("login_password_name"))).sendKeys(Pass);
	}
	
	public void clickloginbttn() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFiles.readelement("login_loginbtn_css"))).click();
	}
}


