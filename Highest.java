package practicetime;
import java.util.*;
public class Highest {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println(" Enter the Length of the Array ");
	int n=sc.nextInt();
	int i,j,count=0,min1=0,min,loc,temp=0;
	int a[]=new int[10];
	int b[]=new int[10];
	System.out.println(" Enter the Elements of the Array ");
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(i=0;i<n;i++)
	{
		min=a[i];
		loc=i;
		for(j=i+1;j<n;j++)
		{
			if(a[j]<min)
			{
				min=a[j];
				loc=j;
			}
		}
		temp=a[i];
		a[i]=a[loc];
		a[loc]=temp;
	}
	System.out.println(" Sorted Elements are ----- ");
	for(i=0;i<n;i++)
	{
		System.out.print(" "+a[i]);
	}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if((count+1)>=min1)
			{
				for(int k=0;k<count+1;k++)
				{
				b[k]=a[i];
			}
				}
			else if(min1>(count+1))
			{
				min=count+1;
			}
		}
			for(int k=0;k<n;k++)
			{
			System.out.println(b[k]);
		}count =0;
			
sc.close();
}
}
