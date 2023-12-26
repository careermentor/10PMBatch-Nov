package testPkg;

public abstract class SampleClass   //abstarct class
{

	int a = 20;
	
	public void meth1()
	{
		System.out.println("this is a cocnrete method");  
		final int i = 30;
		//i=40;
	}
	
	public abstract void meth2();  //abstract method
	
	
	
}
