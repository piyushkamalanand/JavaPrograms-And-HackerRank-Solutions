package practicetime;
import java.util.*;
public class Non_Divisible_Subset 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=1;
		int z=0;
		int c[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[z]=a[0];
			for(int j=i+1;j<n;j++)
			{
				if((b[i]+a[j])%k != 0)
				{
					z++;
					b[z]=a[j];
					int y=z;
					for(int x=1;x<=y;z++)
					{
						if((b[x]+a[j])%k != 0)
						{
							z++;
							b[z]=a[j];
							count++;
						}
					}
					c[i]=count;
					count=1;
				}
			}
		}
		int max=c[0];
		for(int i=1;i<n;i++)
		{
			if(c[i]>max)
			{
				max=c[i];
			}
		}
		System.out.println(max);
	}
}
