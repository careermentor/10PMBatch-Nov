package testPkg;

public class CallSampleClass extends SampleClass 
{

	
	public void meth2()
	{
		System.out.println("this is method2");
		
	}

	public static void main(String[] args) {
		CallSampleClass csc = new CallSampleClass();
		csc.meth1();
		csc.meth2();
	}
	
}
