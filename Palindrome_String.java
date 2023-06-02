
public class Palindrome_String {

	public static void main(String[] args) 
	{
		String m="Madam";
		String rev=" ";
		for(int i=m.length()-1;i>=0;i--)
		{
			rev=rev+m.charAt(i);
		}
		if(rev.trim().equalsIgnoreCase(m))
		{
			System.out.println(m+" Palnidrome");
		}
		else
		{
			System.out.println(m+" Not a Palnidrome");
		}
	}
}
