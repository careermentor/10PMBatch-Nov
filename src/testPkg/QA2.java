package testPkg;

public class QA2 extends QA1
{
	
	int i = 30;  //global
	
	int j  =500;

	public void printvar()
	{
		final int i = 20;  //local
		//a=50;
		System.out.println(i);  //20//50
		System.out.println(this.i);  //30
		System.out.println(super.i);  //100
		
		System.out.println(super.j);
		
		super.sum(20, 30);
	}
	
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("addition of 2 numbers: " + c);
	}

	public void subs(int a, int b)
	{
		
		int c = a-b;
		System.out.println("substraction of 2 numbers: " + c);
		
	}
	
	public static void main(String[] args)
	{
	
		QA2 q2 = new QA2();
		q2.sum(20, 30);
		q2.subs(40, 30);
		
		q2.printvar();
		
	}

	
	public void QA1IM() {
		System.out.println("this is called Method of QA11");
		
	}
	
}
