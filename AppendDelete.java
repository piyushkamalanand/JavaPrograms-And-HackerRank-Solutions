package practicetime;
import java.util.*;
public class AppendDelete 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i;
		int j;
		String s=sc.next();
		String s1=sc.next();
		int k=sc.nextInt();
		int sn=s.length();
		int sn1=s1.length();
		int n=(sn<sn1)?sn:sn1;
		int n1=(sn>sn1)?sn:sn1;
		j=n;
		for(i=0;i<n;i++)
		{
			if(s.charAt(i)!=s1.charAt(i))
			{
				j=i;
				break;
			}
		}
		//System.out.println(j);
		if((((sn-j)+(sn1-j))==k) || (((sn-j)+(sn1-j))%k==0) || (((sn-j)+(sn1-j))%k==((sn-j)+(sn1-j))))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
