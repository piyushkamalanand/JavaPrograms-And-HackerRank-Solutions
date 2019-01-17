package practicetime;
import java.util.Arrays;
import java.util.Scanner;
public class Equality_of_Arrays
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("\n\t\t\t\t Program To Check Equality Of Two Arrays ");
		System.out.print("\n Enter the Length of the 1st Array - ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.print(" Enter the Length of the 2nd Array - ");
		int n1=sc.nextInt();
		int b[]=new int[n1];
		if(n==n1)
		{
		System.out.print("\n Enter the Elements of 1st Array - ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.print(" Enter the Elements of 2nd Array - ");
		for(int i=0;i<n1;i++)
		{
			b[i]=sc.nextInt();
		}
		Arrays.sort(b);
		System.out.print("\n Elements of 1st Array - ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.print("\n Elements of 2nd Array - ");
		for(int i=0;i<n1;i++)
		{
			System.out.print(b[i]+" ");
			
		}
		for(int i=0;i<n;i++)
		{
				if(a[i]==b[i])
				{
					count++;
					
				}
			
		}
		if(count==n)
		{
			System.out.println("\n\n Arrays Are Equal ");
		}
		else
		{
			System.out.println("\n\n Arrays Are Not Equal ");
		}
		}
		else{
			System.out.println("\n\n Arrays Are Not Equal ");
	}
		System.out.println("\n Name - Piyush Kamal Anand \n UID - 16BCS1321 ");
		}

}
