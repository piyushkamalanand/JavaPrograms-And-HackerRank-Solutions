package practicetime;
import java.util.*;
public class Deletion_Insertion 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int temp=0;
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
		System.out.print("\n Enter The Position At Which You Want Delete The Number ? ");
		int p=sc.nextInt();
		for(int i=p-1;i<n;i++)
		{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		n=n-1;
		System.out.print("\n Elements After Deletion - ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
