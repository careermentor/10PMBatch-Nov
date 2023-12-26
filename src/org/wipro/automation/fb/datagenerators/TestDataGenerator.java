package org.wipro.automation.fb.datagenerators;

import org.testng.annotations.DataProvider;

public class TestDataGenerator 
{

	@DataProvider(name="staticdata")
	public Object[][] data()
	{
		//Object[] testdata={"user1","pass1"};   //1-D Array
		
		Object[][] testdata={{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};  //2-D array
		
		return testdata;
	}
	
}
