package practicetime;
import java.util.*;
public class Fair_Rations 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		if(n==2)
		{
			System.out.println("NO");
		}
		else{
		int count=0;
		for(int i=1;i<n;i++)
		{
			if(a[i]%2==0)
			{
				continue;
			}
			else
			{
				if(i!=n-1)
				{
					a[i]=a[i]+1;
					a[i+1]=a[i+1]+1;
					count+=2;
				}
				else
				{
					a[i]=a[i]+1;
					a[i-1]=a[i-1]+1;
					count+=2;
				}
			}
		}
		System.out.println(count);}
	}
}
