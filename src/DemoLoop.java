public class DemoLoop {

	public static void main(String[] args)
	{
		
//--------While loop---------------------------------------
//Exmp-1	
		/*int i=1; //Intialization
		int x=0;
		while(i<=20)//condition
		{
			
			System.out.println(i+".Hello");
			i++;// increment	
			x++;
		}
		System.out.println("Count is= " +x);*/
	
//Exmp-2		

	/*int i=1;
	while(i<=100)
	{
		if(i%2==0)
		{
			System.out.print(i+",");
		}
		i++;
	}*/
	
//------------------Do while------------------------------------
		
		
	 /*   int i=1;
		do{
			System.out.println("Helllo");
			i++;
		}while(i<=10);
			System.out.println("Hi");*/
		
		
		
//---------------------------For Loop----------------------------
//exmp-1
		/*int x=0;
		for(int i=1;i<=10;i++)
		{
			System.out.println("Hiii");
			 x++;
		}
	    	 System.out.print("Count is = " +x);*/
		
		
		
		/*for(int line=1;line<=1;line++) {
			
			for(int ast=1;ast<=4;ast++) {
				System.out.print(ast+ " ");
			}
			System.out.println();                   /*1234
  			for(int ast=1;ast<=3;ast++) {             123
				System.out.print(ast+ " ");           12
			}                                         1
			System.out.println();
			for(int ast=1;ast<=2;ast++) {
				System.out.print(ast+ " ");
			}
			System.out.println();
			for(int ast=1;ast<=1;ast++) {
				System.out.print(ast+ " ");
			}
			System.out.println();*/
		
		
		/*for(int line=1;line<=1;line++) {
		
		for(int ast=1;ast<=1;ast++) {
			System.out.print("*");
		}
		System.out.println();                   
			for(int ast=1;ast<=2;ast++) {            
			System.out.print("*");           
		}                                         
		System.out.println();
		for(int ast=1;ast<=3;ast++) {
			System.out.print("*");
		}
		System.out.println();
		for(int ast=1;ast<=4;ast++) {
			System.out.print("*");
		}
		System.out.println();*/
		
		
		
		
		for(int line=1;line<=4;line++)
		{
			for(int ast=1;ast<=line;ast--)
			{
			System.out.print("* ");
			}
			System.out.println();
		}
	
		/*int i=5;
		for(int line=0;line<i;line++)
		{
			for(int ast=0;ast<i;ast++)
			{
				if(line==0 || line==i-1 || ast==0 || ast==i-1)
				{
				System.out.print("*");
				}
				else
				{
			    System.out.print("");
				}
				System.out.println();
			}
		
			
		}*/

		     

		       /* for (int i = 0; i  <  5; i++) {
		            for (int j = 0; j  <  5; j++) {
		                // Check if it's a border position
		                if (i == 0 || i == 5 - 1 || j == 0 || j == 5 - 1)
		                    System.out.print("*");
		                else
		                    System.out.print(" ");
		            }
		            System.out.println();
		        }*/
		    
	
			
		
		
		
	

		
	}
}
  