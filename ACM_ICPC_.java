package practicetime;

import java.util.*;
public class ACM_ICPC_
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0,c=0,max=0,max1=0,z=0;
		String a[]=new String[n];
		int s[]=new int[n * (n+1) * (n+2) / 6];
		int b=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		for(int i=0;i<n;i++)
		{
			for(int k=i+1;k<n;k++)
			{
				for(int j=0;j<b;j++)
				{
					if(a[i].charAt(j)== '1' || a[k].charAt(j)=='1')
					{
						count++;
					}
				}
				//System.out.println("ssss"+count);
				s[z]=count;
				z++;
				if(max<count)
				{
					max=count;
				}
				count=0;
			}
		}
		for(int i=0;i<n * (n+1) * (n+2) / 6;i++)
		{
			if(s[i]==max)
			{
				max1++;
			}
		}
		System.out.println(max);
		System.out.println(max1);
	}
}
