import java.util.*;
import java.util.Scanner;
public class InputeData {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter Num");
		//int N=sc.nextInt();
		
		/*if (num%3==0 && num%5==0)
		{
			System.out.println("Hello");
		}
		else if(num%3==0 || num%5==0)
		{
			System.out.println("Hi");
		}
		else if(num%3==0 && num%5==0)
		{
			System.out.println("Haaa");
		}
		else
		{
			System.out.println("Nahi ho ga");
		}*/
		
		//-------------------------Hackerrank if-else----------------------------------------------------------
		
		/*if(N % 2 != 0)
	       {
	        System.out.println("Weired");
	       }
	       else if(N%2==0 && N>=2 && N<=5)
	       {
	        System.out.println("Not Weired");
	       }
	       else if(N%2==0 && N>=6 && N<=20)
	       {
	        System.out.println("Weired");
	       }
	       else if(N%2==0 && N>20)
	       {
	        System.out.println("Not Weired");
	       }*/
		
		//---------------------------String-------------------------------------------------------------------------
		
		/*System.out.println("Enter Num");
        int i = sc.nextInt();
        System.out.println("Enter double");
        double d =sc.nextDouble();
        
        sc.nextLine();
        System.out.println("Enter String");
        String s= sc.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);*/
        
	 //----------------------------------input Table----------------------------
        
    	System.out.println("Enter Num");
       int j =sc.nextInt();
		
       for(int i=1;i<=10;i++)
       {
    	   int result=i*j;
    	   System.out.println(j+" x "+i+ " = " +result);
       }

}
}