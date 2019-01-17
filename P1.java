package practicetime;

public class P1 
{
	public static void main(String args[])
	{
		int c=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					if(c==1)
					{
						System.out.print("1");
						c=2;
					}
					else
					{
						System.out.print("2");
						c=1;
					}
				}
				else
				{
					if(c==1)
					{
					System.out.print("1");
					c=2;
					}
					else
					{
						System.out.print("2");
						c=1;
					}
				}
			}
			System.out.println();
		}
	}
}
