package practicetime;
import java.util.*;
public class Marcs_CupCake 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		long sum=0,j=0;
		for(int i=n-1;i>=0;i--)
		{
			sum=sum+(long)(a[i]*Math.pow(2, j));
			j++;
		}
		System.out.println(sum);
	}
}
