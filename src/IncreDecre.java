public class IncreDecre {

	public static void main(String[] args)
	{
		
		int a=2;
		int b=6;
		int c= a++ + --b;  //2+5=7
		
		System.out.println(a);//3
		System.out.println(b);//5
		System.out.println(c);//7
		
		
		
		 
	    /*int c=a++ +b;
		    //Left to right
		//Post increment & + operation (first addition)
		//First operation then incre/decre
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);*/
		
		
		/*int c=a++ + ++b + a++;
		//first a++ + ++b  & then addition result + a++
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);*/
		
	
	
		/*int c=a++ + ++b + ++a - --b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);*/
			
		
	 
		
	}
}
