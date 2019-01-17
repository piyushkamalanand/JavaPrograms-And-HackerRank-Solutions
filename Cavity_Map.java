package practicetime;
import java.util.*;
public class Cavity_Map 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a[]=new String[n];
		StringBuilder b[]=new StringBuilder[n];
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLine();
			b[i]=new StringBuilder(a[i]);	
		}
	    char s;
		for(int i=1;i<n-1;i++)
		{
			for(int j=1;j<a[i].length()-1;j++)
			{
				if(a[i].charAt(j) > a[i].charAt(j-1) && a[i].charAt(j) > a[i].charAt(j+1) && a[i].charAt(j) > a[i-1].charAt(j) && a[i].charAt(j) > a[i+1].charAt(j))
				{
					b[i].setCharAt(j, 'X');
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<a[i].length();j++)
			{
				System.out.print(b[i].charAt(j));
			}
			System.out.println();
		}
	}
}
/*4
1112
1912
1892
1234
63456754
6X335522
254X2X12
5442X4X2
35416147
75X4X666
41633675
82511989*/