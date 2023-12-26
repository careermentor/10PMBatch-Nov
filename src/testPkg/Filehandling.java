package testPkg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Filehandling 
{

	public static void readprop() throws Exception
	{
		FileReader fr = new FileReader("./TestData/file.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("Automation"));
		System.out.println(prop.get("URL"));
	}
	
	
	public static void writedata() throws Exception
	{
		File f = new File("./TestData/xyz.txt");
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("\nthis is forth program");
		fw.flush();
		fw.close();
		
	}
	
	public static void readdata() throws Exception
	{
		//File f = new File("C:\\Users\\Santosh\\Desktop\\abc.txt");  ///connect file with eclipse
		
		FileReader fr = new FileReader("./TestData/abc.txt");
		
		int i = fr.read();  //116, 104
		
		while(i!=-1)  ///true
		{
			System.out.print((char)i); 

			i = fr.read();  //104

		}
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws Exception 
	{
		Filehandling.readprop();
		Filehandling.writedata();
	}
	
}
