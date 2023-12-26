package learnTestNG;

import org.testng.annotations.Test;

public class TestScenario2 
{

	@Test(priority=-4)
	public void first_testcase()
	{
		System.out.println("this is first test case");
	}
	
	@Test(priority=-3)
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
