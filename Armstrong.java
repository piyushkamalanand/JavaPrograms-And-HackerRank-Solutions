package practicetime;

import java.util.Scanner;

public class Armstrong {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println(" Enter the Number ");
	int m=sc.nextInt();
	int sum=0,p;
	int main=m;
	while(m>0)
	{
	p=m%10;
		sum=sum+(p*p*p);
		m=m/10;
	}
	if(main==sum)
	{
	System.out.println(" Armstrong Number ");
	}
	else
	{
		System.out.println(" Not Armstrong Number ");
	}
	sc.close();
}
}
