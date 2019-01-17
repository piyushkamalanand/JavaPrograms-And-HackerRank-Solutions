package practicetime;
import java.util.*;
public class Merge_Sort 
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
		
		Merge_Sort ms=new Merge_Sort();
		ms.sort(a, 0, n-1);
		
		ms.sorted(a,n);
	}
	public void sort(int a[],int l,int h)
	{
		if(l<h)
		{
			int m=(l+h)/2;
			
			sort(a,l,m);
			sort(a,m+1,h);
			
			merge(a,l,m,h);
		}
	}
	public void merge(int a[],int l,int m,int h)
	{
		int n1=m-l+1;
		int n2=h-m;
		
		int L[]=new int[n1];
		int R[]=new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			L[i]=a[l+i];
		}
		for(int j=0;j<n2;j++)
		{
			R[j]=a[m+1+j];
		}
		
		int i=0,j=0;
		
		int k=l;
		while(i<n1 && j<n2)
		{
			if(L[i]<R[j])
			{
				a[k]=L[i];
				i++;
			}
			else if(L[i]>R[j])
			{
				a[k]=R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1)
		{
			a[k]=L[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a[k]=R[j];
			j++;
			k++;
		}
	}
	public void sorted(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
