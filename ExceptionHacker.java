package practicetime;



	

	 
	import java.util.Scanner;
	
	class MyCalculator 
	
	{

	    int n1,p1;
	
	    int po;
	
	    int power(int n1,int p1)throws Exception
	
	    {
	
	        this.n1=n1;
	
	        this.p1=p1;
	
	        if(n1==0||p1==0)
	
	            throw new Exception("n and p should not be zero.");
	
	        else if(n1<0||p1<0)
	
	            throw new Exception("n or p should not be negative.");
	
	        else
	
	             po=(int)Math.pow(n1,p1);
	
	      return po;
	
	    }
	
	}
	
	public class ExceptionHacker
	{
	
	    public static final MyCalculator my_calculator = new MyCalculator();
	
	    public static final Scanner in = new Scanner(System.in);
	
	    
	
	    public static void main(String[] args) {
	
	        while (in .hasNextInt()) {
	
	            int n = in .nextInt();
	
	            int p = in .nextInt();
		            try {
	
	                System.out.println(my_calculator.power(n, p));
	
	            } catch (Exception e) {
	
	                System.out.println(e);
	
	            }
	      }
	
	    }
	
	}


