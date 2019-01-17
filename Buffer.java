package practicetime;
import java.io.*;
public class Buffer
{
	public static void main(String args[])throws Exception
	{
		BufferedReader b=new BufferedReader (new InputStreamReader(System.in));
		System.out.println(" Enter the Number ");
		int n=Integer.parseInt(b.readLine());
		int n1=Integer.parseInt(b.readLine());
		System.out.println(" Sum = "+(n+n1));
		System.out.println(" Enter your Name ");
		String s=b.readLine();
		System.out.println(s);
		System.out.println(" Enter your Group ");
		char c=(char)b.read();
		System.out.println(c);
	}

}
