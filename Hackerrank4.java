package practicetime;
import java.util.*;
public class Hackerrank4 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a[]=new String[26];
		for(int i=0;i<26;i++)
		{
			a[i]=sc.next();
		}
		//System.out.println(" Enter A Word Not More Than 10 Albhabets - ");
		String s=sc.next();
		char s1;
		int j=0;
	    for(int i=0;i<s.length();i++)
	    {
	    	j=0;
	    	for(char c='a';c<='z';c++)
	    	{
	    		if(s.charAt(i)==c)
	    		{
		    		s=s.replaceAll(Character.toString(s.charAt(i)), a[j]);
		    		break;
	    		}
	    		j++;
	    	}
	    	//System.out.println(s);
	    }
	    //System.out.println(s);
	    
	     long  n=Long.parseLong(s);
	    		System.out.println("sssss"+n);
		 	    long r,max=0;
		 	    while(n>0)
		 	    {
		 	    	r=n%10;
		 	    	n=n/10;
		 	    	if(r>max)
		 	    	{
		 	    		max=r;
		 	    	}
		 	    }
		 	    //System.out.println(max);
		 	    System.out.println((max*s.length()));
	    	}
	}

//1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
// 6 5 7 3 6 7 3 4 4 2 3 7 1 3 7 4 6 1 2 4 3 3 1 1 3 5
//zbkkfhwplj