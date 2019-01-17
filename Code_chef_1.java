package practicetime;
import java.io.*;
import java.util.*;
class Code_chef_1 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i=0,sum=0,index=0,small=0;
		System.out.println(" Enter the repetition ");
		int a=sc.nextInt();
		while(i<a)
		{
			System.out.println(" Enter the length ");
			int b=sc.nextInt();	
			int c[]=new int[b];
			for(int j=0;j<b;j++)
			{
				c[j]=sc.nextInt();
			}
			for(int k=0;k<b;k++)
			{
				sum=c[k];
				for(int k1=k+1;k1<b;k1++)
				{
					sum=sum+c[k1];
				}
				for(int k2=k;k2>=0;k2--)
				{
					sum=sum+c[k2];
				}
				System.out.println(sum);
				if(k==0&&sum>0)
				{
			         small=sum;
			         index=k;
				}
			     if(sum<small)
			     {
			        small=sum;
			        index=k;
			     }
			}
			System.out.println(index+1);
			i++;
		}
		sc.close();
	}
}
