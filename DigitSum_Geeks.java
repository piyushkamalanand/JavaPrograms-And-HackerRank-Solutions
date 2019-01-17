package practicetime;
import java.util.*;
public class DigitSum_Geeks 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=Integer.toString(n);
        int s2=0;
        int s1=Character.getNumericValue(s.charAt(0))+Character.getNumericValue(s.charAt(s.length()-1));
        for(int i=1;i<s.length()-1;i++)
        {
            s2=s2+Character.getNumericValue(s.charAt(i));
        }
        //System.out.println(s1+" "+s2);
        if(s1==s2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
	}
}
