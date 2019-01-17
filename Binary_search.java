package practicetime;
import java.util.Scanner;
public class Binary_search {
public static void main(String args[])
{
	int a[]=new int[20];
	Scanner sc=new Scanner(System.in);
	int i,temp=0,count=0;;
	System.out.println(" Enter the number of elements you want to input ");
	int n=sc.nextInt();
	System.out.println(" Enter the numbers ");
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.print(" The Elements are ---\n");
	for(i=0;i<n;i++)
	{
		System.out.print(" "+a[i]);
	}
	System.out.print("\n The Sorted Elements are ---\n");
	for(i=0;i<n;i++)
	{
		for(int j=0;j<n-i-1;j++)
		{
if(a[j]>a[j+1])
{
	temp=a[j+1];
	a[j+1]=a[j];
	a[j]=temp;
}}
System.out.print(" Array is - \n");
for(int k=0;k<n;k++)
{
	System.out.print(a[k]+" ");
}
}
	for(i=0;i<n;i++)
	{
		System.out.print(" "+a[i]);
	}
	System.out.println("\n Enter the Number to be Searched ");
	int s=sc.nextInt();
	int beg=1,end=n,mid=0;
	mid=(beg+end)/2;
	while(beg<=end)
	{
		 if(s>a[mid])
		{
			beg=mid+1;
		}
		else if(s<a[mid])
		{
			end=mid-1;
		}
		else if(s==a[mid])
			{
				System.out.println(" Number found at Location - "+mid);
				count++;
				break;
			}mid=(beg+end)/2;
	}
	if(count==0)
		System.out.println(" Sorry Not Found ");
	sc.close();
}
}
