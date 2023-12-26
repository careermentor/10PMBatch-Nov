package testPkg;

public class KeywordsDemo 
{
	
	static int a = 30;  //global

	public static void printvar()
	{
		//final int a = 20;  //local
		//a=50;
		System.out.println(a);  //20//50
		//System.out.println(this.a);  //30
	}
	
	public static void main(String[] args) {
		
		
		KeywordsDemo.printvar();
		
		
	}
	
}
