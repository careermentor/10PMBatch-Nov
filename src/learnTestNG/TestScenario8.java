package learnTestNG;

import org.testng.annotations.Test;

public class TestScenario8 
{

	@Test
	public void first_testcase()
	{
		System.out.println("this is first test case");
	}
	
	@Test(groups="Regression")
	public void second_testcase()
	{
		System.out.println("this is second test case");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("this is third test case");
	}
	
	
	@Test
	public void forth_testcase()
	{
		System.out.println("this is forth test case");
	}
	
}
