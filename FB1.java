package practicetime;
import java.util.*;
public class FB1 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1=" ";
		for(int i=1;i<=26;i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(Character.getNumericValue(s.charAt(j))==i)
				{
					s1=s1+((char)(96+i));
				}
			}
		}
		System.out.println(s1);
	}
}