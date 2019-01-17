package practicetime;

import java.util.Scanner;

public class Hackerrank1 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,s=0,count=0;
		//System.out.println(" Enter The Size Of Array - ");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		//System.out.println(" Enter D - ");
		int d=sc.nextInt();
		//System.out.println(" Enter M - ");
		int m=sc.nextInt();
		int t=m;
		int j,k=1;
		for(i=0;i<n;i++)
		{
			s=a[i];
			for(j=k;j<t;j++)
			{
				s=s+a[j];
			}
					if(s==d)
					{
						//System.out.println(" sum - "+s);
						count++;
						//System.out.println(" C = "+count);
						//13
						//4 5 4 2 4 5 2 3 2 1 1 5 4
						//15 4
					}
			k++;
			t++;
		}
		System.out.println(count);
	}
}
