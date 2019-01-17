package practicetime;
import java.util.*;
public class Hackerrank2 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println();
		int s=0,j=0;
		for(int i=0;i<n-1;i++)
		{
			System.out.println(" i "+i);
			s=a[i]-a[i+1];
			if(s<=1 && s>=-1)
			{
				System.out.println(a[i]);
				j++;
			}
		}
		System.out.println(j);
	}
}
