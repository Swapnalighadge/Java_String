// Reverse aString that is programming....
public class Array_into_String {

	public static void main(String[] args) 
	{
		String s= "Programming";
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev.trim());
	}

}
