package practicetime;
import java.util.*;
public class Lisas_Workbook 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n+1];
		a[0]=0;
		for(int i=1;i<n+1;i++)
		{
			a[i]=sc.nextInt();
		}
		int p=0,z=1;
		int r=1,count=0;
		for(int i=1;i<n+1;i++)
		{
			if(a[i]>k && a[i]%k!=0)
			{
				p=p+a[i]/k+1;
				for(int j=r;j<=p;j++)
				{
					for(z=1;z<=a[i];z++)
					{
						if(z==j)
						{
							count++;
						}
						if(z==k)
						{
							z=z+1;
							break;
						}
					}
				}
				r=r+1;
			}
			else if(a[i]<k)
			{
				for(int j=r;j<=p;j++)
				{
					
				}
			}
		}
	}
}
