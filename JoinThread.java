package practicetime;

public class JoinThread extends Thread 
{
	int i;
	public void run()
	{
		for(i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		System.out.println(i);
		//System.out.println(" Running ...... ");
		}
	}
public static void main(String args[])
{
	JoinThread t=new JoinThread();
	JoinThread t2=new JoinThread();
	JoinThread t3=new JoinThread();
	t.start();
	try
	{
		t.join(2000);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	t2.start();
	t3.start();
}
}
