package practicetime;
import java.util.*;
public class BitAnd
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
    int n=0,k=0,and,min=0;
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
    n = in.nextInt();
         k = in.nextInt();
    }
    for(int a1=1;a1<=n;a1++)
    {
        for(int i=a1+1;i<=n;i++)
        {
            and=(a1&i);
            if(and>min&&and<k){
            min=and;
        }
    }}
        System.out.println(min);
    in.close();
    }}
   