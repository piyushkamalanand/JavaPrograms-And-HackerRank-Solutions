package practicetime;
import java.util.*;
public class Arraylists
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> arr=new ArrayList<String>();
		while(sc.hasNext())
		{
			String str=sc.nextLine();
			arr.add(str);
		}
		System.out.println(arr);
	     sc.close();
	}

}
