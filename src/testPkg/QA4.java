package testPkg;

public class QA4 extends QA2 implements QA3I
{

	public void printvar()
	{
		int a = 20;
		System.out.println(a);
	}
	
	
	public void div(int a, int b)
	{
		
		int c = a/b;
		System.out.println("division of 2 numbers: " + c);
		
	}
	
	public static void main(String[] args)
	{
	
		QA4 q4 = new QA4();
		q4.sum(20, 30);
		q4.subs(40, 30);
		//q4.mul(20, 30);
		q4.div(20, 10);
		
	}


	
	public void QA3IM() {
		System.out.println("this is QA3I interface method");
		
	}
	
}
