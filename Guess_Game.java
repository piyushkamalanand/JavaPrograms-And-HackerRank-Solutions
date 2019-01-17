package practicetime;

import java.util.Scanner;

public class Guess_Game 
{
	public static void main(String args[]) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n   Welcome To Guessing Game \n");
		System.out.print(" Loading ");
		for(int i=1;i<=20;i++)
		{Thread.sleep(50);
		System.out.print(".");
		}
		System.out.println("\n");
		System.out.println("   Think A Number Between 1-100 \n");
		int l=1,m,h=100,x=1;
		while(x<8)
		{
			m=(l+h)/2;	
		System.out.println(" 1. Press 1 If Your Number Is "+m+"\n 2. Press 2 If Your Number Is Less than "+m+"\n 3. Press 3 If Your Number Is Greater Than "+m);
		int n=sc.nextInt();
		if(n==1)
		{
			System.out.println("   Your Number Is - "+m);
			break;
		}
		else if(n==2)
		{
			h=m-1;
		}
		else if(n==3)
		{
			l=m+1; 
		}
		x++;
		}
		if(x==8)
		{
		System.out.println("   Don't Try To Cheat With The Genius ");
		}
	}
}
