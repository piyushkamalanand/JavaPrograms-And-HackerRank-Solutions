package practicetime;
import java.util.*;
public class Linked
{
	 public static void main(String args[]) 
	 {
		   Scanner s=new Scanner(System.in);

	       /* Linked List Declaration */
	       LinkedList<Integer> linkedlist = new LinkedList<Integer>();
	       System.out.println(" Enter the Numbers ");
	       /*add(String Element) is used for adding 
	        * the elements to the linked list*/
	       for(int i=0;i<5;i++)
	       {
	       linkedlist.add(s.nextInt());
	       
	       }
	       /*Display Linked List Content*/
	       System.out.println("Linked List Content: " +linkedlist);
	       linkedlist.addFirst(0);
	       linkedlist.addLast(6);
	       System.out.println("LinkedList Content after addition: " +linkedlist);

	 }

}
