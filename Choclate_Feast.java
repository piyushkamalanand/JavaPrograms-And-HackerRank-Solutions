package practicetime;
import java.util.*;
public class Choclate_Feast 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int count,cc,ccc=0,cccc;
		for(int i=0;i<t;i++)
		{
			int n,c,m;
			n=sc.nextInt();
			c=sc.nextInt();
			m=sc.nextInt();
			count=n/c;
			cc=count;
			while(cc>=m)
			{
				ccc=cc/m;
				count=count+ccc;
				cccc=cc%m;
				cc=ccc+cccc;
			}
			System.out.println(count);
			//count=0;cc=0;
		}
	}
}
/*3
10 2 5
12 4 4
6 2 2*/