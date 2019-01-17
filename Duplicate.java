package practicetime;
import java.util.Scanner;
public class Duplicate 
{
	public static void main(String args[])
	{
		int i=0,j=1,s=1,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter The Value Of N - ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println(" Enter The Values - ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int c,c1=0;
		c=a[c1];
	    for(j=0;j<n;j++)
	    {
	    	if(c==a[j])
	    	{
	    		count++;
	    		if(count>=2)
	    			break;
	    	}
	    	if(j==(n-1))
	    	{
	    		c1=c1+1;
	    		if(c1<n)
	    		{
	    			j=-1;
	    		    c=a[c1];
	    		}
	    		count=0;
	    	}
	    }
	    if(count>=2)
	    {
	    	System.out.println("1");
	    }
	    else
	    {
	    	System.out.println("-1");
	    }
	}
}