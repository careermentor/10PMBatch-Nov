package learnTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario1 
{

	@Test(priority=1)
	public void first_testcase()
	{
		System.out.println("this is first test case");
		
		Assert.assertEquals("Hello", "Hello1");  //assert - hard and soft assertion
		
		System.out.println("this is test case");
		
	}
	
	@Test(priority=2)
	public void second_testcase()
	{
		System.out.println("this is second test case");
	}
	
	@Test(priority=3)
	public void third_testcase()
	{
		System.out.println("this is third test case");
	}
	
	
	@Test(priority=4)
	public void forth_testcase()
	{
		System.out.println("this is forth test case");
	}
	
}
