package practicetime;
import java.util.*;
public class Closest 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		if(n>0 && m>0){
		if(n%m==0)
		{
			System.out.println(n);
		}
		else if((m-(n%m))<n%m)
		{
			System.out.println(n+(m-(n%m)));
		}
		else if((m-(n%m))>n%m)
		{
			System.out.println(n-(n%m));
		}}
		else
		{
			if(n%m==0)
			{
				System.out.println(n);
			}
			else if((m-(n%m))<n%m)
			{
				System.out.println(n-(n%m));
			}
			else if((m-(n%m))>n%m)
			{
				System.out.println(n+(m-(n%m)));
			}
		}
	}
}