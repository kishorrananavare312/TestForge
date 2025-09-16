
public class StringDemo {
	public static void main(String[] args) {
		
		String s="HeEllo";
		//System.out.println(s.length());    //length
		
		//System.out.println(s.charAt(0));   //Char index
//-----------------------------------------------------------------------------------------------------------		
		/*for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='e')
			{
				System.out.println(s.charAt(i));
			}
		}*/
	//owel 
	//------------------------------------------------------------------------------------------------------
	for(int i = 0; i < s.length(); i++)
	{
		char ch = s.charAt(i);
		ch = (ch+"").toLowerCase().charAt(0);
		if(ch=='a' || ch=='i' || ch=='o' || ch=='u' || ch=='e')
		{
			System.out.println(s.charAt(i));
		}
	}
	}

}
