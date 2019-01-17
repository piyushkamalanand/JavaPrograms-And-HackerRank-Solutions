package practicetime;
import java.util.*;
public class Flatland_Space_Stations 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b[]=new int[n];
		int k=sc.nextInt();
		int a[]=new int[k];
		for(int i=0;i<k;i++)
		{
			a[i]=sc.nextInt();
		}
		int j=0,c=0;
		int max;
		for(int i=0;i<n;i++)
		{
			max=((int)(Math.abs(i-a[0])));
			for(int z=0;z<k;z++)
			{
				
				if(i==a[z])
				{
					c=1;
					break;
				}
				else 
				{
					if( max > ((int)(Math.abs(i-a[z]))) )
					{
						max=((int)(Math.abs(i-a[z])));
					}
				}
			}
			if(c==1)
			{
				b[j]=0;
				j++;
				c=0;
			}else{
			b[j]=max;
			j++;}
		}
		int min=b[0];
		for(int i=1;i<n;i++)
		{
			if(min<b[i])
			{
				min=b[i];
			}
		}
		System.out.println(min);
	}
}
