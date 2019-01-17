package practicetime;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class BadaInteger
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		BigInteger b=sc.nextBigInteger();
		for(int i=2;BigInteger.valueOf(i).compareTo(b)>0;i++)
		{
			if(b.remainder(BigInteger.valueOf(i)).equals(0));
			{
				System.out.println(" Not Prime ");
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println(" Prime ");
		}
	}

}
