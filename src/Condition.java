
public class Condition {
	
	public static void main(String args[])
	{
		// Positive & negative number
	    /*int i = -2;
		if(i<=0)
		{
		    System.out.println("It is positive number");
		}
		else
		{
			System.out.println("It is negative number");
	}*/
		
		int a=29; int b=14; int c=40;
		
		if(a<=b && a<=c)
		{
			System.out.println(a+ "This this small number"); 
		}
		else if (b<=a && b<=c)
		{
			System.out.println(b+ "This this Small number");
		}
		else
		{
			System.out.println(c+ "This this small number");
		}
		
	}

}
