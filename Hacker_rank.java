package practicetime;
import java.util.*;
public class Hacker_rank 
{
	 public static void main(String[] args) {
	        int r;String s =" ";
	        int count=0,min=0;
	        Scanner in = new Scanner(System.in);
	        System.out.println(" Enter the Number ");
	        int n = in.nextInt();
	        while(n>0)
	        {
	          r=n%2;
	            s=r+s;
	            n=n/2;
	        }
	        System.out.println(s);
	        for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i)=='1')
	            {
	                count++;
	            } 
	            else
	            {
	            	if(count>min)
	            	{
	            		min=count;
	            	}
	            	count=0;
	            }   }
	        System.out.println("Maximum Occurence of Consecutive 1 is - "+min);
	 in.close();  
	 }

}
