package org.wipro.automation.fb.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.fb.baseClass.InitiateBrowser;
import org.wipro.automation.fb.datagenerators.TestDataGenerator;
import org.wipro.automation.fb.pages.LoginPage;

public class LoginTestScenario_DDF extends InitiateBrowser
{

	@Test(dataProvider="staticdata",dataProviderClass=TestDataGenerator.class)
	public void validateloginfunc(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username(username);
		login.enter_password(password);
		login.clickloginbttn();
		
	}
	
	
	
	
}
