package practicetime;
import java.util.*;
public class Happy_Ladybugs 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int count =0,cc=0,c=0;
		for(int i=0;i<t;i++)
		{
			int zz=sc.nextInt();
			String s=sc.next();
			if(zz==1 && s.charAt(0)!='_')
			{
				System.out.println("NO");
			}
			else{
			c=0;
			//StringBuilder sb=new StringBuilder(s);
			for(int y=0;y<s.length();y++)
			{
				if(s.charAt(y)=='_')
				{
					c=1;
				}
			}
			if(c==1)
			{
				char ta[]=s.toCharArray();
				Arrays.sort(ta);
				//System.out.println(ta);
				for(int j=0;j<ta.length-1;j++)
				{
					for(int k=j+1;k<ta.length;k++)
					{
						if(ta[j]==ta[k])
						{
							count++;
						}
						if(ta[j]!=ta[k])
						{
							j=k-1;
							break;
						}
					}
					//System.out.println(" Count - "+count);
					if(count<1)
					{
						cc=1;
					}
					count=0;
				}
				if(cc==1)
				{
					System.out.println("NO");
				}
				else if(cc==0)
				{
					System.out.println("YES");
				}
				cc=0;
			}
			else
			{
				for(int j=0;j<s.length()-1;j++)
				{
					for(int k=j+1;k<s.length();k++)
					{
						if(s.charAt(j)==s.charAt(k))
						{
							count++;
						}
						if(s.charAt(j)!=s.charAt(k))
						{
							j=k-1;
							break;
						}
					}
					//System.out.println(" Count - "+count);
					if(count<1)
					{
						cc=1;
					}
					count=0;
				}
				if(cc==1)
				{
					System.out.println("NO");
				}
				else if(cc==0)
				{
					System.out.println("YES");
				}
				cc=0;
			}
			}}
	}
}
/*YES
NO
YES
YES
YES*/