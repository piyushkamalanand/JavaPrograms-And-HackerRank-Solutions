package practicetime;
import java.util.*;
public class Minimum_Absolute_Difference_In_An_Array 
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
		Arrays.sort(a);
		//System.out.println(a);
		int min=Math.abs(a[0]-a[1]);
		for(int i=1;i<n-1;i++)
		{
			int k=Math.abs(a[i]-a[i+1]);
			if(k<min)
			{
				min=k;
			}
		}
		System.out.println(min);
	}
}