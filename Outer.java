package practicetime;
import java.util.Scanner;
public class Outer
{
	int a,b;
	float f=10.6f;
	Outer(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(" Sum of two Numbers = "+(a+b)+" \n "+f);
	}
	class Inner
	{
		void msg()
		{
			System.out.println(" Difference of two Numbers = "+(a-b));
		}
	}
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println(" ENTER TWO NUMBERS ");
	int c,d;
	c=sc.nextInt();
	d=sc.nextInt();
	Outer o=new Outer(c,d);
	Outer.Inner o1=o.new Inner();
	o1.msg();
	sc.close();
}
}