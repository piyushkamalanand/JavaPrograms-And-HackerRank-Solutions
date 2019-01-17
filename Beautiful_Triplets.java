package practicetime;
import java.util.*;
public class Beautiful_Triplets 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int count=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[j]-a[i]==d){
				for(int k=j+1;k<n;k++)
				{
					if(a[k]-a[j]==d)
					{
						System.out.println("("+a[i]+","+a[j]+","+a[k]+")");
						count++;
					}
				}}
			}
		}
		System.out.println(count);
	}
}
