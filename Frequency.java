package practicetime;
import java.util.*;
public class Frequency 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print(" Enter The Line - ");
		String s=sc.nextLine();
		String s2[]=new String[10];
		int i,i1=0,j=0;
		String s1=" ";
		do{
		for(i=i1;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				break;
			}
			else
			{
				s1=s1+s.charAt(i);
			}
		}
		s2[j]=s1;
		j++;
		s1=" ";
		i1=i+1;
		}while(i1<=s.length());
		int count=0;
		for(int k=0;k<s2.length;k++)
		{
			for(int j1=k+1;j1<s2.length;j1++)
			{
				if(s2[i].equals(s2[j1]))
				{
					count++;
				}
			}
			System.out.println(" Frequency of s2[i] = "+count);
			count=0;
		}
		sc.close();
	}

}
