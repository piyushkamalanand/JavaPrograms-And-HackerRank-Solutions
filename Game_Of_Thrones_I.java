package practicetime;
import java.util.*;
public class Game_Of_Thrones_I 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int a[]=new int[26];
		int z=0;
		int k=0;
		for(char c='a';c<='z';c++)
		{
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==c)
				{
					a[k]=a[k]+1;
				}
			}
			
			k++;
			//z=0;
		}
		int count=0,count1=0;
		//System.out.println(k);
		for(int i=0;i<26;i++)
		{
			if(a[i]>0)
			{
				count1++;
			}
			if(a[i]>0 && a[i]%2==0)
			{
				count++;
				continue;
			}
			else if(a[i]>0 && z==0 && a[i]%2!=0)
			{
				z++;
				count++;
			}
		}
		if(count1==count)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
