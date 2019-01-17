package practicetime;
import java.util.*;
import java.lang.*;
public class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    String s=sc.next();
		    String s1="";
		    String s2="gfg";
		    int c=0;
		    for(int j=0;j<s.length()-2;j++)
		    {
		        s1=s1+s.charAt(j);
		        for(int k=j+1;k<(j+3);k++)
		        {
		            s1=s1+s.charAt(k);
		        }
		        //System.out.println(s1+" and "+s2);
		        if(s1.equals(s2)==true)
		        {
		        	c++;
		        	//System.out.println(c);
		        }
		            //System.out.println(c);
		            s1="";
		    }
		    if(c>0)
		    {
		        System.out.println(c);
		    }
		    else if(c==0)
		    {
		        System.out.println(-1);
		    }
		}
	}
}