package practicetime;
import java.util.*;
public class Hallowen_Sale 
{
	public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long p,d,m,s;
        p=sc.nextLong();
        d=sc.nextLong();
        m=sc.nextLong();
        s=sc.nextLong();
        long s1=p;
        long count=0;
        while(s1<=s)
        {
            if(p-d>=m)
            {
                //s1=s1+p;
                p=p-d;
                count++;
                //System.out.print(p+" ");}
            }
            else if(p-d<m)
            {
                p=m;
                count++;
                //System.out.print(p+" ");
            }
            s1=s1+p;
        }
        System.out.println((count));
    }
}
