package testPkg;

public class Calulcations 
{
	
	

	public int sum()
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		
		System.out.println("sum of a&b: " + c);
		return c;
	}
	
	
	public int addition(int a, int b)
	{
		int c = a+b;
		System.out.println("addition of 2 numbers: " + c);
		return c;
	}
	
	
	//30+40+50
	//int x = 30+40;
	//x+50
	
	public static void main(String[] args)
	{
		Calulcations cal1 = new Calulcations();
		
		Calulcations cal = new Calulcations(50,60);  //constcructor will be called automatically
	
		cal.sum();
		cal.addition(100, 200);
		int x = cal.addition(30, 40);
		cal.addition(x, 50);
		
	}
	
	public Calulcations()
	{
		int a = 50;
		int b = 40;
		
		System.out.println("this is a constructor");
		int c = a-b;
		System.out.println("this is difference: " + c);
	}
	
	public Calulcations(int a, int b)
	{
		System.out.println("this is a constructor");
		int c = a-b;
		System.out.println("this is difference: " + c);
	}
	
}
