package practicetime;
import java.math.BigInteger;
import java.util.*;
public class Big_Sorting 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		BigInteger b[]=new BigInteger[n];
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextBigInteger();
		}
		Arrays.sort(b);
		for(int i=0;i<n;i++)
		{
			System.out.println(b[i]+" ");
		}
	}
}
