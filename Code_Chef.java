package practicetime;
import java.util.*;
import java.math.BigInteger;
public class Code_Chef 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		BigInteger b=new BigInteger("1");
		System.out.print(" Enter the Numbers you want to the Factorial of ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			System.out.print(" Factorial of "+(i+1)+" Number - ");
			for(int j=1;j<=a[i];j++)
			{
				b=b.multiply(BigInteger.valueOf(j));
			}
			System.out.println(b);
			b=BigInteger.valueOf(1);
		}
		sc.close();
	}

}
