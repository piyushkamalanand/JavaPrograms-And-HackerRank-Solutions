package practicetime;
import java.util.*;
public class JumpingTheClouds 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			if((i+2)<n && a[i+2]!=1)
			{
				i=i+1;
				count++;
			}
			else if(a[i+1]!=1)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
//0 0 1 0 0 1 0