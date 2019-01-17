package practicetime;
import java.util.*;
public class Hash_Map 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int c;
		HashMap<String,Integer> m=new HashMap<>();
		print (m);
		do
		{
			System.out.print(" Enter Name And Age - ");
			String s=sc.next();
			int a=sc.nextInt();
			m.put(s, a);
			System.out.print(" Want To Add More Press 1- ");
			c=sc.nextInt();
		}while(c==1);
		print(m);
		System.out.println(" Size Of Map - "+m.size());
		System.out.print(" Enter The Key To Check The Value - ");
		String s1=sc.next();
		if(m.containsKey(s1))
		{
			Integer a=m.get(s1);
			System.out.println(" Value Of "+s1+" is - "+a);
		}
		else
		{
			System.out.println(" Key Not Present ");
		}
		
		m.clear();
		print(m);
	}
	public static void print(HashMap<String,Integer> m)
	{
		if(m.size()==0)
		{
			System.out.println(" Empty ");
		}
		else
		{
			System.out.println(m);
			Set<String> gk=m.keySet();
			System.out.print(" Keys - "+gk);
			Collection<Integer> gv=m.values();
			System.out.println(" Values - "+gv);
		}
	}
}
