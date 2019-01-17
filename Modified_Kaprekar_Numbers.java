package practicetime;
import java.util.*;
public class Modified_Kaprekar_Numbers 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int sum=0,sum1=0,sum3=0;
		int i=sc.nextInt();
		int f=sc.nextInt();
		for(int j=i;j<=f;j++)
		{
			int s=j*j;
			System.out.println("sq"+s);
			String ss=String.valueOf(s);
			System.out.println("st"+ss);
			int l=ss.length()/2;
			for(int k=0;k<l;i++)
			{
				sum=sum+((int)ss.charAt(k));
			}
			System.out.println("s"+sum);
			for(int k=l;k<ss.length();k++)
			{
				sum1=sum1+((int)ss.charAt(k));
			}
			System.out.println("ss"+sum1);
			if(sum+sum1 == j)
			{
				System.out.println(j);
			}
			sum=0;sum1=0;
		}
	}
}
