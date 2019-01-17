package practicetime;
import java.util.Scanner;
public class Binary {
public static void main (String args[])
{
	Scanner sc=new Scanner(System.in);
	int r;
	String temp=" ";
	System.out.println(" Enter the Number ");
	int n=sc.nextInt();
	while(n>0)
	{
		r=n%2;
		temp=r+temp;
		n=n/2;
	}
	System.out.println(" Binary of the Number is = "+temp);
sc.close();
}
}
