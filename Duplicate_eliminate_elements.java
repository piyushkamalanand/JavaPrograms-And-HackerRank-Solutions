 package practicetime;
import java.util.Scanner;
public class Duplicate_eliminate_elements
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("\n \t\t\t\t ELIMINATE DUPLICATE ELEMENTS ");
		System.out.print("\n\n Enter the Length of the Array - ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.print("\n Enter the Elements - ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("\n Elements Are - ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=a[n-1];
					n--;
					j--;
					
				}
			}
		}
		System.out.print("\n After Removing ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		sc.close();
	}
}