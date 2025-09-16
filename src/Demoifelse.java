
public class Demoifelse {

	public static void main(String[] args)
	{
		int age=101;
		
		//Only one condition true then exit
		if(age>=1 && age<18)
		{
			System.out.println("Your are kid");
		}
		else if(age>=18 && age<60)
		{
			System.out.println("Your are Adult");
		}
		else if(age>=60 && age<100)
		{
			System.out.println("Your are Senior citizen");
		}
		else
		{
			System.out.println("Invalid age = "  +age);
		}
			
	}
}
