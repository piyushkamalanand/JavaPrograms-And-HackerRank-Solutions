package practicetime;
import java.util.*;
public class Hackerrank3 
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int loc,min,temp=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int b[]=new int[m];
		for(int i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=a[n-1];
					n--;
					j--;
					
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			min=a[i];
			loc=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]>min)
				{
					min=a[j];
					loc=j;
				}
			}
			temp=a[i];
			a[i]=a[loc];
			a[loc]=temp;
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=n-1;j>=0;j--)
			{
				if(b[i]<a[j])
				{
					System.out.println(j+2);
					break;
				}
				if(b[i]==a[j])
				{
					System.out.println(j+1);
					break;
				}
				if(i==m-1)
				{
					System.out.println(1);
					break;
				}
			}
		}
	}
}
//5
//100 80 80 50 30
//3
//10 60 100