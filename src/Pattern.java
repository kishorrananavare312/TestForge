public class Pattern {

	public static void main(String[] args) {
		/*for(int line=1;line<=5;line++)
		{
		if(line%2!=0)
		{
			for(int num=1;num<=line;num++)
			{
				System.out.print(num+" ");
			}
		}
		else
		{
          char ch='a';
          for(int j=1;j<=line;j++)
          {
        	  System.out.print(ch+" ");
        	  ch++;
          }
   
		}
	   	System.out.println();
	}*/
		
		/*for(int line=1;line<=5;line++)
         {
	        for(int ast=1;ast<=line;ast++)
	        {
	        	System.out.print("*");
	        }
	        System.out.println();
         }
		*/
		
		for(int line=5;line>=1;line--)
		{
		   for(int ast=1;ast<=line;ast++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
		}	
		
	
		
	//Number Pattern
	/*for(int i=1;i<=5;i++)//row
	{
		for(int j=1;j<=5;j++)//column
		{
			if(i==4)
			{
				System.out.print("* ");
			}
			else if(j==2)
			{
				System.out.print("# ");
			}
			else
			{
			System.out.print(i+" ");
			}
		}
		System.out.println();
	}*/
		
	}		
}
