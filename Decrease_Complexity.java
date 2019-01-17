package practicetime;

import java.util.Scanner;

public class Decrease_Complexity 
{
	public static void main(String args[])
	{
		int i,i1=0,s=1;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter The Value Of N - ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println(" Enter The Values - ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(" Enter The Value Of N1 - ");
		int n1=sc.nextInt();
		int b[]=new int[n1];
		System.out.println(" Enter The Values - ");
		for(i=0;i<n1;i++)
		{
			b[i]=sc.nextInt();
		}
		int c;
		c=b[i1];
		for(i=0;i<n;i++)
		{
			if(a[i]==c)
			{
				System.out.println(" Duplicate - "+a[i]);
				s=2;
			}
			if(i==(n-1))
			{
				i1=i1+1;
				if(i1<n1)
				{
					i=-1;
				    c=b[i1];
				}
			}
		}
		if(s==1){
			System.out.println("No Duplicate");
		}
	}
}
