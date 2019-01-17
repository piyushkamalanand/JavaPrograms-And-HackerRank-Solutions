package practicetime;
import java.util.*;
import java.lang.*;
public class BeautifulDaysAtTheMovies 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long i,f,m,count=0,r,s=0,k;
		i=sc.nextLong();
		f=sc.nextLong();
		m=sc.nextLong();
		for(long j=i;j<=f;j++)
		{
			StringBuilder day=new StringBuilder(String.valueOf(j));
			s=Long.parseLong(day.reverse().toString());
			if((Math.abs(j-s))%m==0)
			{
				count++;
			//	s=0;
			}
		}
		System.out.println(count);
		//System.out.println((49860-6894)/155635764);
	}
}
//49860 205494 155635764