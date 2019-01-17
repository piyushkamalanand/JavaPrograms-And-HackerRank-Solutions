package practicetime;
import java.util.*;
public class Assignment
{
	public static void   main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter the Length of the Array - ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.print(" Enter the Elements - ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("\n Elements of Array - ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.print("\n\n Enter the Number to Check the Sum - ");
		int s=sc.nextInt();
		System.out.print(" Pairs Are - ");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]+a[j]==s)
				{
					System.out.print("("+a[i]+","+a[j]+") ");
				}
			}
		}
		System.out.println("\n\n Name - Piyush Kamal Anand \n UID - 16BCS1321 ");
		sc.close();
	}

}
