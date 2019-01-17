package practicetime;
import java.util.*;
public class Max_Min2 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int k=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int min=a[k-1]-a[0];
		for(int i=1;i<n-(k-1);i++)
		{
			//System.out.println(a[i+(k-1)]+"and"+a[i]+"="+(a[i+(k-1)]-a[i]));
			if((a[i+(k-1)]-a[i])<min)
			{
				//System.out.println(a[i+k]-a[i]);
				min=a[i+(k-1)]-a[i];
			}
		}
		System.out.println(min);
	}
}
