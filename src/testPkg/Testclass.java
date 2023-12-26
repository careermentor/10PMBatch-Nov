package testPkg;

public class Testclass 
{
	int a = 20;
	float b=20.5686876878f;
	
	char c = 'X';
	String d = "Java";
	boolean e = true;
	
	public void printVar()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
	
	public static void main(String[] args)
	{
		
		Testclass abc = new Testclass();    //create object of the class
		abc.printVar();
		
		System.out.println(abc.a);
	}
	
	
	
	
	
}
