package practicetime;

import java.util.Scanner;

public class Golf_Club 
{
	Scanner sc=new Scanner(System.in);
	int i,g,r,m;
	String s;
	public void choice()
	{
		do
		{
		System.out.println(" 1. Add Golf Club \n 2. Remove \n 3. View Current \n 4. Checkout ");
		System.out.println(" Enter Your Choice ");
		i=sc.nextInt();
		switch(i)
		{
		case 1:
		{
			System.out.println(" You Have Zero. How many to Add? - ");
			g=sc.nextInt();
			System.out.println(" You Now Have "+g);
			break;
		}
		case 2:
		{
			System.out.println(" You Now Have "+g+" How Many To Remove? - ");
			r=sc.nextInt();
			g=g-r;
			System.out.println(" You Now Have "+g);
			break;
		}
		case 3:
		{
			System.out.println(" You Now Have "+g);
			System.out.println(" Cost Rs 4000 ");
			System.out.println(" Total Cost - "+(g*4000));
			break;
		}
		case 4:
		{
			System.out.println(" What is Your Name ?");
			s=sc.next();
			System.out.println(" You Have Purchased "+g);
			System.out.println(" Golf Cost 4000 each");
			System.out.println(" Total Cost - "+(g*4000));
			System.out.println(" Thanks for Your Order "+s);
			break;
		}
		default:
		{
			System.out.println(" Wrong Choice ");
		}
		}
		System.out.println(" Press 1 To Continue Else 2");
		m=sc.nextInt();
		}while(m==1);
		System.out.println(" Done ! ");
	}
	public static void main(String args[])
	{
		Golf_Club c=new Golf_Club();
		c.choice();
	}
}
