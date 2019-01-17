package practicetime;
import java.util.*;
public class Largest_Permutation 
{
	public static void main(String args[])
	{
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int a[]=new int[n];
		    int in[]=new int[n+1];
		    for(int i=0;i<n;i++)
		    {
		    	a[i]=sc.nextInt();
		    	in[a[i]]=i;
		    }
		    for(int i=0;i<n && k>0;i++)
		    {
		    	if(a[i]==n-i)
		    	{
		    		continue;
		    	}
		    	int tmp=in[n-i];
		    	in[a[i]]=in[n-i];
		    	in[n-i]=i;
		    	int tmp1=a[tmp];
		    	a[tmp]=a[i];
		    	a[i]=tmp1;
		    	--k;
		    }
		    for(int i=0;i<n;i++)
		    {
		    	System.out.print(a[i]+" ");
		    }
	}
}
