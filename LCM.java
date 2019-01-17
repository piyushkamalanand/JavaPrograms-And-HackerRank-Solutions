package practicetime;

import java.util.Scanner;

public class LCM 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a1,b1,c1,a,b,c,j=1,l=1,lcm;
		System.out.print(" Enter Three Numbers - ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		// Store Greatest Of Three Number In lcm
		
		lcm=c;
		 while(true)
	        {
	            if( lcm % a == 0 && lcm % b == 0 && lcm % c == 0)
	            {
	                System.out.printf("The LCM of %d , %d and %d is %d.", a,b,c,lcm);
	                break;
	            }
	            ++lcm;
	        }
	}
}
