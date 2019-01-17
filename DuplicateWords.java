package practicetime;
import java.util.*;
public class DuplicateWords 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		String s1="";
		String ss2="";
		String s;
		String ss[]=new String[100];
		sc.nextLine();
		for(int y=0;y<n;y++)
		{ 
			
			s=sc.nextLine();
			//s=s.toLowerCase();
			int j=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)!=' ')
				{
					s1=s1+s.charAt(i);
				}
				if(s.charAt(i)==' ' || i==(s.length()-1))
				{
					ss[j]=s1;
					j++;
					//System.out.println(" aa - "+s1);
					s1="";
				}
			}
			for(int i=0;i<j;i++)
			{
				if(i==0)
				{
					ss2=ss2+ss[i]+" ";
				}
				if(i>0 && (ss[i].equalsIgnoreCase(ss[i-1])==false))
				{
					ss2=ss2+ss[i]+" ";
				}
				else
				{
					continue;
				}
			}
			System.out.println(ss2);
			ss2="";
		}
	}
}
