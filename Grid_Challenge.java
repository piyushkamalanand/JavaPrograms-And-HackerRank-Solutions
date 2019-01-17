package practicetime;
import java.util.*;
public class Grid_Challenge 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int t1=0;t1<t;t1++)
		{
			int n=sc.nextInt();
			String s[]=new String[n];
			String s1[]=new String[n];
			for(int i=0;i<n;i++)
			{
				s[i]=sc.next();
			}
			for(int i=0;i<n;i++)
			{
				char tmp[]=s[i].toCharArray();
				Arrays.sort(tmp);
				s1[i]=new String(tmp);
			}
			int ct=1,j;
			for(int i=0;i<n;i++)
			{
				for(j=0;j<n-1;j++)
				{
					if(s1[j].charAt(i)>s1[j+1].charAt(i))
					{
						System.out.println("NO");
						ct=0;
						break;
					}
				}
				if(ct==0)
				{
					break;
				}
			}
			if(ct==1)
			{
				System.out.println("YES");
			}
			ct=1;
		}
	}
}
