package practicetime;
import java.util.*;
import java.lang.*;
public class Encryption 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1="",s2="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) != ' ')
			{
				s1=s1+s.charAt(i);
			}
			else if(s.charAt(i) == ' ')
			{
				continue;
			}
		}
		int l=s1.length();
		int r=(int)Math.floor(Math.sqrt(l));
		int c=(int)Math.ceil(Math.sqrt(l));
		for(int i=0;i<c;i++)
		{
			for(int j=i;j<l;j=j+c)
			{
				s2=s2+s1.charAt(j);
			}
			s2=s2+" ";
		}
		System.out.println(s2);
	}
}
