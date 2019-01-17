package practicetime;

import java.util.Scanner;

public class Nishaan 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s;
		int count=0;
		System.out.println(" Enter The String - ");
		s=sc.next();
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u')
			{
				count++;
			}
			if(count==3)
			{
				System.out.println(" 3rd Consonant Is - "+s.charAt(i));
				break;
			}
		}
	}
}
