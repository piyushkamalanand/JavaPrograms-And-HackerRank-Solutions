package practicetime;
import java.util.*;
public class Exceptionsssss
{
	 public static void main(String[] args) 
	    {
	        Scanner sc=new Scanner(System.in);
	       int a,b;
	        
	        try
	        {
	        	 a=sc.nextInt();
		           b=sc.nextInt();
	            int c=a/b;
	            System.out.println(c);
	        }
	        catch(ArithmeticException e)
	        {
	            System.out.println(e);
	        }
	        catch(InputMismatchException e)
	        {
	        	System.out.println(e);
	        }
	    }

}
