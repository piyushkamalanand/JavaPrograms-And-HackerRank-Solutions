package practicetime;
import java.util.Scanner;
public class Amazon_1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int c=0,count=0,max=0;
		System.out.print(" Enter the Number of Test Cases - ");
		int n=sc.nextInt();
		String s[]=new String[n];
		for(int k=0;k<n;k++)
		{
			System.out.print(" Enter the "+(k+1)+" String - ");
		s[k]=sc.next();
		for(int i=0;i<s[k].length();i++)
		{
			c=(int)s[k].charAt(i);
			for(int j=i+1;j<s[k].length();j++)
			{
			if((c+1)==(int)s[k].charAt(j))
			{
				count++;
				c++;
			}
			else
			{
				break;
			}
			}
			//System.out.println(count);
			if(count>max)
			{
				max=count;
			}
			count=0;
		}
		System.out.println(" Frequency of "+(k+1)+" String is - "+(max+1));
	}
		sc.close();
		}
}
