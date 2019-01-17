package practicetime;
import java.util.*;
public class Balance_Array 
{
	public static void main(String arsg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=1;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		//int r=max-min+1;
		//System.out.println(max);
		int b[]=new int[max+1];
		for(int j=0;j<max+1;j++)
		{
			b[j]=0;
		}
		for(int i=0;i<n;i++)
		{
			b[a[i]]++;
		}
		int min=b[0];
		for(int j=0;j<max+1;j++)
		{
			if(min<b[j])
			{
				min=b[j];
			}
		}
		System.out.println((n-min));
	}
}
