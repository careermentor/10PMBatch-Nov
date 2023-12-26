package testPkg;

public class CallInterface implements SimpleInterface
{

	
	public void meth3() 
	{
	
		System.out.println("this is interface method");
		
	}

	public static void main(String[] args) 
	{
	
		CallInterface ci = new CallInterface();
		ci.meth3();
		
	}

	
	public void meth4() {
	System.out.println("this is method4");
		
	}

	
	public void meth5() {
		System.out.println("this is method5");
		
	}
	
	
}
