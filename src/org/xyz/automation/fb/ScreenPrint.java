package org.xyz.automation.fb;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenPrint 
{

	
	public static void screenshot(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot) driver;   //print screen as like keyword does
		
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./Results/"+ name + ".png");
		
		
		FileUtils.copyFile(f, fd);
		
	}
	
	
	
}
