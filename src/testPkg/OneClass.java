package testPkg;

public class OneClass 
{

	int a = 100;
	
	int b = 200;
	
	
	
	public void sum()
	{
		final int a = 20;
		
		//a=500;
		
		int b = 30;
		int c = a+b;
		
		
		
		System.out.println(a);  // 20
		System.out.println(b); //30
		
		System.out.println("sum of a and b: " +  c);    //concatenation
		
		
	}
	

	public void printVar()
	{
		System.out.println(a);  //100
	}
	
}
