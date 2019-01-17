package practicetime;
import java.util.Scanner;
public class fibonacci {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println( " Enter the length of the Series ");
		int s=sc.nextInt();
		int a=0,b=1;
		int c=0;
		c=a+b;
		System.out.print("Series is -- "+" "+a+" "+b);
		while(c<s){
			System.out.print(" "+c);
			a=b;
			b=c;
			c=a+b;
			for(int i=1;i<=100;i++)
			{
				if(c==i)
				{
					break;
				}
				else
				{
					System.out.println(" "+c);
				}
			}
		}
sc.close();
	}
}
