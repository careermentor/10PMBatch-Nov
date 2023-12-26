package org.wipro.automation.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.fb.utilitiesClass.ReadPropFiles;

public class UO_SignPage 
{

	WebDriver driver;
	
	public UO_SignPage(WebDriver driver) {
		
		this.driver=driver;
	}

	public void clickMenuOption() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFiles.readelement("UO_MenuOption_menu_css"))).click();
	}
	
	public void clickSigninbttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFiles.readelement("UO_Menu_SignIn_xpath"))).click();
	}
}


