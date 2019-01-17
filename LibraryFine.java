package practicetime;
import java.util.*;
public class LibraryFine 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int d1,m1,y1,d2,m2,y2;
		d1=sc.nextInt();
		m1=sc.nextInt();
		y1=sc.nextInt();
		d2=sc.nextInt();
		m2=sc.nextInt();
		y2=sc.nextInt();
		int f=0;
		if(y1<=y2 && m1<=m2 && d1<=d2)
		{
			f=0;
		}
		else if(y1>y2)
		{
			f=10000;
		}
		else if(y1==y2 && m1>m2)
		{
			f=500*(m1-m2);
		}
		else if(y1==y2 && m1==m2 && d1>d2)
		{
			f=15*(d1-d2);
		}
		System.out.println(f);
	}
}
