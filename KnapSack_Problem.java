package practicetime;
import java.util.*;
public class KnapSack_Problem 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter The Value Of N - ");
		int n=sc.nextInt();
		int w[]=new int[n];
		double p[]=new double[n];
		double[] pw=new double[n];
		System.out.println(" Enter Profit And Weight - ");
		for(int i=0;i<n;i++)
		{
			p[i]=sc.nextInt();
			w[i]=sc.nextInt();
			pw[i]=(p[i]/w[i]);
		}
		System.out.print(" Enter The Capacity Of The Bag - ");
		int m=sc.nextInt();
		System.out.println("Profit\tWeightt\tProfit/Weight");
		for(int i=0;i<n;i++)
		{
			System.out.println(p[i]+"\t"+w[i]+"\t"+pw[i]);
		}
		for(int i=0;i<n;i++)
		{
			double max=pw[i],loc=i;
			double tmp=0;
			for(int j=i+1;j<n;j++)
			{
				if(pw[j]>max)
				{
					max=pw[j];
					loc=j;
				}
			}
			tmp=pw[i];
			pw[i]=pw[(int) loc];
			pw[(int) loc]=tmp;
			
			tmp=p[i];
			p[i]=p[(int) loc];
			p[(int) loc]=(int) tmp;
			
			tmp=w[i];
			w[i]=w[(int) loc];
			w[(int) loc]=(int) tmp;
		}
		System.out.println("Profit\tWeightt\tProfit/Weight");
		for(int i=0;i<n;i++)
		{
			System.out.println(p[i]+"\t"+w[i]+"\t"+pw[i]);
		}
		int m1=0;
		double p1=0;
		for(int i=0;i<n;i++)
		{
			if(m>0 && m1<=m)
			{
				m1=m1+w[i];
				p1=p1+p[i];
			}
			if(m1>m)
			{
				p1=p1-p[i];
				m1=(m1-w[i]);
				p1=(p1+(pw[i]*(m-m1)));
				break;
			}
		}
		System.out.println(" Weight = "+m1);
		System.out.print(" Profit = "+p1);
	}
}
