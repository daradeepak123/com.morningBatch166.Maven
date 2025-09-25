package excep;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExceltionsLearn {

	public static void main(String[] args) {

		int a =100,b=0;
		
		try {
		FileInputStream fis=new FileInputStream(new File(""));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(Exception ee)
		{
			
		}
		
		
		int aa[]=new int[6];
		
		try {
		aa[6]=500;
		}
		catch(IndexOutOfBoundsException e)
		{
			
		}
		System.out.println(a+b);

		System.out.println(a-b);

		
		try {
		System.out.println(a/b);
		}
		catch(NullPointerException n)
		{
			n.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
		System.out.println(a*b);

		System.out.println(a+b-20);

	}

}
