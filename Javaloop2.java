package practicetime;
import java.util.*;
public class Javaloop2
{
	 public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        int s=0;
	        int n=0,b=0,a=0;
	        int j;
	        for(int i=0;i<t;i++){
	             a = in.nextInt();
	             b = in.nextInt();
	             n = in.nextInt();
	             s=a;
	        for(j=0;j<n;j++)
	            {
	            s=s+((int)Math.pow(2,j))*b;	        
	            System.out.print(s+" ");
	        } System.out.println();
	        s=0;
	        }   in.close();
	    }
	}