package practicetime;
import java.util.*;
public class AngryProfessor 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0,c=0;
		for(int i=0;i<n;i++)
		{
			
			int s=sc.nextInt();
			int a[]=new int[s];
			int m=sc.nextInt();
			for(int j=0;j<s;j++)
			{
				a[j]=sc.nextInt();
			}
			for(int j=0;j<s;j++)
			{
				if(a[j]<=0)
				{
					count++;
				}
				if(count>=m)
				{
					System.out.println("No");
					count=0;
					c=1;
					break;
				}
			}
			if(c==0)
			{
				System.out.println("Yes");
			}
			count=0;
			c=0;
		}
	}
}
