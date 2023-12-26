package testPkg;

public class QA1
{

	int i  =100;
	
	int j  =200;
	
	public void sum(int a, int b)
	{
		int c = a+b;
		System.out.println("addition of 2 numbers: " + c);
	}
	
	public void sum(int a, float b)  // 10+10.5=20.5
	{
		float c = a+b;
		System.out.println("addition of 2 numbers: " + c);
	}
	
	public void sum(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("addition of 3 numbers: " + d);
	}
	
	
	public static void main(String[] args)
	{
	
		QA1 q1 = new QA1();
		q1.sum(20, 30);
		q1.sum(10, 20.5f);
		q1.sum(10, 20, 40);
		
		
	}
	
}
