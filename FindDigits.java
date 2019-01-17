package practicetime;
import java.util.*;
public class FindDigits 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int r,s=0,k,count=0;
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			k=a;
			//System.out.println(k+" s "+a);
			while(k>0)
			{
				r=k%10;
				if(r!=0){
				if(a%r==0)
				{
					//System.out.println("aa");
					count++;
				}}
				k=k/10;
			}
			System.out.println(count);
		}
	}
}
