package org.wipro.automation.fb.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.fb.baseClass.InitiateBrowser;
import org.wipro.automation.fb.pages.LoginPage;
import org.wipro.automation.fb.pages.UO_SignPage;

public class SignInScenario extends InitiateBrowser
{

	@Test
	public void validateSignInPage() throws Exception
	{
		UO_SignPage sign = new UO_SignPage(driver);
		sign.clickMenuOption();
		sign.clickSigninbttn();
		
	}
	
}
