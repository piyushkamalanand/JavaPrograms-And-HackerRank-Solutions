package practicetime;
import java.util.*;
public class Order_Frequency_Geeks 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			String s = sc.next();
			int a[][]=new int[26][2];
			int count=0;
			int z=0;
			for(char c='a';c<='z';c++)
			{
				for(int j=0;j<s.length();j++)
				{
					if(c==s.charAt(j))
					{
						count++;
					}
				}
				if(count>0)
				{
					a[z][0]=count;
					a[z][1]=c;
					z++;
					count=0;
				}
			}
			for(int x=0;x<26;x++)
			{
				System.out.println(a[x][0]+" "+(char)a[x][1]);
			}
			Arrays.sort(a, new Comparator<int[]>() { 
	            
		          @Override              
		          // Compare values according to columns 
		          public int compare(final int[] entry1,  
		                             final int[] entry2) { 
		  
		            // To sort in descending order revert  
		            // the '>' Operator 
		            if (entry1[0] < entry2[0]) 
		                return 1; 
		            else
		                return -1; 
		          } 
		        });
			String s1="";
			for(int x=25;x>=0;x--)
			{
				System.out.println(a[x][0]+" "+(char)a[x][1]);
			}
			for(int k=25;k>=0;k--)
			{
				if(a[k][0]>0)
				{
				s1=s1+(char)(a[k][1]);
				}
			}
			System.out.println(s1);
		}
	}
}
